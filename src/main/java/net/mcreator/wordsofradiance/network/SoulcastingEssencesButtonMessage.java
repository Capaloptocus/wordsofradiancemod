
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

import net.mcreator.wordsofradiance.world.inventory.SoulcastingEssencesMenu;
import net.mcreator.wordsofradiance.procedures.SCVaporProcedure;
import net.mcreator.wordsofradiance.procedures.SCTalusProcedure;
import net.mcreator.wordsofradiance.procedures.SCTallowProcedure;
import net.mcreator.wordsofradiance.procedures.SCSparkProcedure;
import net.mcreator.wordsofradiance.procedures.SCSinewProcedure;
import net.mcreator.wordsofradiance.procedures.SCPulpProcedure;
import net.mcreator.wordsofradiance.procedures.SCLucentiaProcedure;
import net.mcreator.wordsofradiance.procedures.SCFoilProcedure;
import net.mcreator.wordsofradiance.procedures.SCBloodProcedure;
import net.mcreator.wordsofradiance.procedures.SCAirProcedure;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record SoulcastingEssencesButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<SoulcastingEssencesButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "soulcasting_essences_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, SoulcastingEssencesButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SoulcastingEssencesButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new SoulcastingEssencesButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<SoulcastingEssencesButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final SoulcastingEssencesButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = SoulcastingEssencesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SCLucentiaProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			SCAirProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			SCVaporProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			SCSparkProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			SCPulpProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			SCBloodProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			SCTallowProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			SCFoilProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			SCTalusProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			SCSinewProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(SoulcastingEssencesButtonMessage.TYPE, SoulcastingEssencesButtonMessage.STREAM_CODEC, SoulcastingEssencesButtonMessage::handleData);
	}
}
