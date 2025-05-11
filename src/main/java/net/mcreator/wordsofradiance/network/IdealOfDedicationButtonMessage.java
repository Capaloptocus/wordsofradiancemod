
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

import net.mcreator.wordsofradiance.world.inventory.IdealOfDedicationMenu;
import net.mcreator.wordsofradiance.procedures.LawOfTheLandProcedure;
import net.mcreator.wordsofradiance.procedures.LawOfOccupationProcedure;
import net.mcreator.wordsofradiance.procedures.LawOfConquestProcedure;
import net.mcreator.wordsofradiance.procedures.LawBeyondDeathProcedure;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record IdealOfDedicationButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<IdealOfDedicationButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "ideal_of_dedication_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, IdealOfDedicationButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, IdealOfDedicationButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new IdealOfDedicationButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<IdealOfDedicationButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final IdealOfDedicationButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = IdealOfDedicationMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			LawOfTheLandProcedure.execute(entity);
		}
		if (buttonID == 1) {

			LawOfConquestProcedure.execute(entity);
		}
		if (buttonID == 2) {

			LawOfOccupationProcedure.execute(entity);
		}
		if (buttonID == 3) {

			LawBeyondDeathProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(IdealOfDedicationButtonMessage.TYPE, IdealOfDedicationButtonMessage.STREAM_CODEC, IdealOfDedicationButtonMessage::handleData);
	}
}
