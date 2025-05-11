package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModEntities;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import javax.annotation.Nullable;

@EventBusSubscriber(value = {Dist.CLIENT})
public class SummonIllusorySelfProcedure {
	@SubscribeEvent
	public static void onLeftClick(PlayerInteractEvent.LeftClickEmpty event) {
		PacketDistributor.sendToServer(new SummonIllusorySelfMessage());
		execute(event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
	public record SummonIllusorySelfMessage() implements CustomPacketPayload {
		public static final Type<SummonIllusorySelfMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "procedure_summon_illusory_self"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SummonIllusorySelfMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SummonIllusorySelfMessage message) -> {
		}, (RegistryFriendlyByteBuf buffer) -> new SummonIllusorySelfMessage());

		@Override
		public Type<SummonIllusorySelfMessage> type() {
			return TYPE;
		}

		public static void handleData(final SummonIllusorySelfMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.SERVERBOUND) {
				context.enqueueWork(() -> {
					if (!context.player().level().hasChunkAt(context.player().blockPosition()))
						return;
					execute(context.player().level(), context.player().getX(), context.player().getY(), context.player().getZ(), context.player());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}

		@SubscribeEvent
		public static void registerMessage(FMLCommonSetupEvent event) {
			WordsOfRadianceMod.addNetworkMessage(SummonIllusorySelfMessage.TYPE, SummonIllusorySelfMessage.STREAM_CODEC, SummonIllusorySelfMessage::handleData);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT)) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = WordsOfRadianceModEntities.ILLUSION_PLAYER.get().spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.2));
		}
	}
}
