
package net.mcreator.wordsofradiance.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.wordsofradiance.procedures.ToggleSurgeTwoProcedure;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record UseSurge2Message(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<UseSurge2Message> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "key_use_surge_2"));
	public static final StreamCodec<RegistryFriendlyByteBuf, UseSurge2Message> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, UseSurge2Message message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new UseSurge2Message(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<UseSurge2Message> type() {
		return TYPE;
	}

	public static void handleData(final UseSurge2Message message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			ToggleSurgeTwoProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(UseSurge2Message.TYPE, UseSurge2Message.STREAM_CODEC, UseSurge2Message::handleData);
	}
}
