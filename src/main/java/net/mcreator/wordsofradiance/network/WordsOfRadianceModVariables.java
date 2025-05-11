package net.mcreator.wordsofradiance.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.INBTSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.HolderLookup;

import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import java.util.function.Supplier;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WordsOfRadianceModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, WordsOfRadianceMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		WordsOfRadianceMod.addNetworkMessage(SavedDataSyncMessage.TYPE, SavedDataSyncMessage.STREAM_CODEC, SavedDataSyncMessage::handleData);
		WordsOfRadianceMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player)
				player.getData(PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
			PlayerVariables clone = new PlayerVariables();
			clone.IdealOfDedicationVariable = original.IdealOfDedicationVariable;
			clone.IdealOfCrusadeVariable = original.IdealOfCrusadeVariable;
			clone.radiantTickCount = original.radiantTickCount;
			clone.bondedHonourblade = original.bondedHonourblade;
			clone.bondedDeadBlade = original.bondedDeadBlade;
			if (!event.isWasDeath()) {
				clone.powerOneActive = original.powerOneActive;
				clone.lashingSelf = original.lashingSelf;
				clone.lashX = original.lashX;
				clone.lashY = original.lashY;
				clone.lashZ = original.lashZ;
				clone.lashed = original.lashed;
				clone.powerTwoActive = original.powerTwoActive;
				clone.xpDrain = original.xpDrain;
				clone.soulcastingX = original.soulcastingX;
				clone.soulcastingY = original.soulcastingY;
				clone.soulcastingZ = original.soulcastingZ;
				clone.soulcastingX2 = original.soulcastingX2;
				clone.soulcastingY2 = original.soulcastingY2;
				clone.soulcastingZ2 = original.soulcastingZ2;
				clone.soulcastingBlock = original.soulcastingBlock;
				clone.SoulcastingBlockSet = original.SoulcastingBlockSet;
				clone.vapor = original.vapor;
				clone.essence = original.essence;
				clone.cohesionSinkery = original.cohesionSinkery;
				clone.bladeSummoned = original.bladeSummoned;
				clone.plateSummoned = original.plateSummoned;
				clone.plateChecked = original.plateChecked;
			}
			event.getEntity().setData(PLAYER_VARIABLES, clone);
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (event.getEntity() instanceof ServerPlayer player) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					PacketDistributor.sendToPlayer(player, new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "words_of_radiance_worldvars";

		public static WorldVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			WorldVariables data = new WorldVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof ServerLevel level)
				PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(new SavedData.Factory<>(WorldVariables::new, WorldVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "words_of_radiance_mapvars";
		public boolean ordersSetup = false;

		public static MapVariables load(CompoundTag tag, HolderLookup.Provider lookupProvider) {
			MapVariables data = new MapVariables();
			data.read(tag, lookupProvider);
			return data;
		}

		public void read(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			ordersSetup = nbt.getBoolean("ordersSetup");
		}

		@Override
		public CompoundTag save(CompoundTag nbt, HolderLookup.Provider lookupProvider) {
			nbt.putBoolean("ordersSetup", ordersSetup);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(new SavedData.Factory<>(MapVariables::new, MapVariables::load), DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public record SavedDataSyncMessage(int dataType, SavedData data) implements CustomPacketPayload {
		public static final Type<SavedDataSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "saved_data_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, SavedDataSyncMessage message) -> {
			buffer.writeInt(message.dataType);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag(), buffer.registryAccess()));
		}, (RegistryFriendlyByteBuf buffer) -> {
			int dataType = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			SavedData data = null;
			if (nbt != null) {
				data = dataType == 0 ? new MapVariables() : new WorldVariables();
				if (data instanceof MapVariables mapVariables)
					mapVariables.read(nbt, buffer.registryAccess());
				else if (data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt, buffer.registryAccess());
			}
			return new SavedDataSyncMessage(dataType, data);
		});

		@Override
		public Type<SavedDataSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final SavedDataSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					if (message.dataType == 0)
						MapVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
					else
						WorldVariables.clientSide.read(message.data.save(new CompoundTag(), context.player().registryAccess()), context.player().registryAccess());
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	public static class PlayerVariables implements INBTSerializable<CompoundTag> {
		public boolean powerOneActive = false;
		public boolean lashingSelf = false;
		public double lashX = 0;
		public double lashY = 0;
		public double lashZ = 0;
		public boolean lashed = false;
		public boolean powerTwoActive = false;
		public String IdealOfDedicationVariable = "\"\"";
		public double xpDrain = 0;
		public String IdealOfCrusadeVariable = "\"\"";
		public double soulcastingX = 0;
		public double soulcastingY = 0;
		public double soulcastingZ = 0;
		public double soulcastingX2 = 0;
		public double soulcastingY2 = 0;
		public double soulcastingZ2 = 0;
		public BlockState soulcastingBlock = Blocks.AIR.defaultBlockState();
		public BlockState SoulcastingBlockSet = Blocks.AIR.defaultBlockState();
		public boolean vapor = false;
		public String essence = "\"\"";
		public boolean cohesionSinkery = false;
		public double radiantTickCount = 0;
		public boolean bladeSummoned = false;
		public boolean plateSummoned = false;
		public boolean plateChecked = false;
		public String bondedHonourblade = "";
		public String bondedDeadBlade = "";

		@Override
		public CompoundTag serializeNBT(HolderLookup.Provider lookupProvider) {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("powerOneActive", powerOneActive);
			nbt.putBoolean("lashingSelf", lashingSelf);
			nbt.putDouble("lashX", lashX);
			nbt.putDouble("lashY", lashY);
			nbt.putDouble("lashZ", lashZ);
			nbt.putBoolean("lashed", lashed);
			nbt.putBoolean("powerTwoActive", powerTwoActive);
			nbt.putString("IdealOfDedicationVariable", IdealOfDedicationVariable);
			nbt.putDouble("xpDrain", xpDrain);
			nbt.putString("IdealOfCrusadeVariable", IdealOfCrusadeVariable);
			nbt.putDouble("soulcastingX", soulcastingX);
			nbt.putDouble("soulcastingY", soulcastingY);
			nbt.putDouble("soulcastingZ", soulcastingZ);
			nbt.putDouble("soulcastingX2", soulcastingX2);
			nbt.putDouble("soulcastingY2", soulcastingY2);
			nbt.putDouble("soulcastingZ2", soulcastingZ2);
			nbt.put("soulcastingBlock", NbtUtils.writeBlockState(soulcastingBlock));
			nbt.put("SoulcastingBlockSet", NbtUtils.writeBlockState(SoulcastingBlockSet));
			nbt.putBoolean("vapor", vapor);
			nbt.putString("essence", essence);
			nbt.putBoolean("cohesionSinkery", cohesionSinkery);
			nbt.putDouble("radiantTickCount", radiantTickCount);
			nbt.putBoolean("bladeSummoned", bladeSummoned);
			nbt.putBoolean("plateSummoned", plateSummoned);
			nbt.putBoolean("plateChecked", plateChecked);
			nbt.putString("bondedHonourblade", bondedHonourblade);
			nbt.putString("bondedDeadBlade", bondedDeadBlade);
			return nbt;
		}

		@Override
		public void deserializeNBT(HolderLookup.Provider lookupProvider, CompoundTag nbt) {
			powerOneActive = nbt.getBoolean("powerOneActive");
			lashingSelf = nbt.getBoolean("lashingSelf");
			lashX = nbt.getDouble("lashX");
			lashY = nbt.getDouble("lashY");
			lashZ = nbt.getDouble("lashZ");
			lashed = nbt.getBoolean("lashed");
			powerTwoActive = nbt.getBoolean("powerTwoActive");
			IdealOfDedicationVariable = nbt.getString("IdealOfDedicationVariable");
			xpDrain = nbt.getDouble("xpDrain");
			IdealOfCrusadeVariable = nbt.getString("IdealOfCrusadeVariable");
			soulcastingX = nbt.getDouble("soulcastingX");
			soulcastingY = nbt.getDouble("soulcastingY");
			soulcastingZ = nbt.getDouble("soulcastingZ");
			soulcastingX2 = nbt.getDouble("soulcastingX2");
			soulcastingY2 = nbt.getDouble("soulcastingY2");
			soulcastingZ2 = nbt.getDouble("soulcastingZ2");
			soulcastingBlock = NbtUtils.readBlockState(lookupProvider.lookupOrThrow(BuiltInRegistries.BLOCK.key()), nbt.getCompound("soulcastingBlock"));
			SoulcastingBlockSet = NbtUtils.readBlockState(lookupProvider.lookupOrThrow(BuiltInRegistries.BLOCK.key()), nbt.getCompound("SoulcastingBlockSet"));
			vapor = nbt.getBoolean("vapor");
			essence = nbt.getString("essence");
			cohesionSinkery = nbt.getBoolean("cohesionSinkery");
			radiantTickCount = nbt.getDouble("radiantTickCount");
			bladeSummoned = nbt.getBoolean("bladeSummoned");
			plateSummoned = nbt.getBoolean("plateSummoned");
			plateChecked = nbt.getBoolean("plateChecked");
			bondedHonourblade = nbt.getString("bondedHonourblade");
			bondedDeadBlade = nbt.getString("bondedDeadBlade");
		}

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec
				.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> buffer.writeNbt(message.data().serializeNBT(buffer.registryAccess())), (RegistryFriendlyByteBuf buffer) -> {
					PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
					message.data.deserializeNBT(buffer.registryAccess(), buffer.readNbt());
					return message;
				});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> context.player().getData(PLAYER_VARIABLES).deserializeNBT(context.player().registryAccess(), message.data.serializeNBT(context.player().registryAccess()))).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}
