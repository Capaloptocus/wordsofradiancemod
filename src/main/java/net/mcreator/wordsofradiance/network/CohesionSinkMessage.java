
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

import net.mcreator.wordsofradiance.procedures.CohesionSinkOnKeyReleasedProcedure;
import net.mcreator.wordsofradiance.procedures.CohesionSinkOnKeyPressedProcedure;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record CohesionSinkMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<CohesionSinkMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "key_cohesion_sink"));
	public static final StreamCodec<RegistryFriendlyByteBuf, CohesionSinkMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, CohesionSinkMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new CohesionSinkMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<CohesionSinkMessage> type() {
		return TYPE;
	}

	public static void handleData(final CohesionSinkMessage message, final IPayloadContext context) {
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

			CohesionSinkOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			CohesionSinkOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(CohesionSinkMessage.TYPE, CohesionSinkMessage.STREAM_CODEC, CohesionSinkMessage::handleData);
	}
}
