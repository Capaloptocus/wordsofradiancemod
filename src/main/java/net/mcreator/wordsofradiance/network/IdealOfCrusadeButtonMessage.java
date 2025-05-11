
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
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.world.inventory.IdealOfCrusadeMenu;
import net.mcreator.wordsofradiance.procedures.RestoreOrderProcedure;
import net.mcreator.wordsofradiance.procedures.KillTyrantProcedure;
import net.mcreator.wordsofradiance.procedures.HuntProcedure;
import net.mcreator.wordsofradiance.procedures.DestroyMonstrosityProcedure;
import net.mcreator.wordsofradiance.procedures.DefendInnocentsProcedure;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record IdealOfCrusadeButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<IdealOfCrusadeButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "ideal_of_crusade_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, IdealOfCrusadeButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, IdealOfCrusadeButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new IdealOfCrusadeButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<IdealOfCrusadeButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final IdealOfCrusadeButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = IdealOfCrusadeMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RestoreOrderProcedure.execute(entity);
		}
		if (buttonID == 1) {

			KillTyrantProcedure.execute(entity);
		}
		if (buttonID == 2) {

			DestroyMonstrosityProcedure.execute(entity);
		}
		if (buttonID == 3) {

			DefendInnocentsProcedure.execute(entity);
		}
		if (buttonID == 4) {

			HuntProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(IdealOfCrusadeButtonMessage.TYPE, IdealOfCrusadeButtonMessage.STREAM_CODEC, IdealOfCrusadeButtonMessage::handleData);
	}
}
