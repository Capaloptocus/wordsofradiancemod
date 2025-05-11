
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.wordsofradiance.entity.PeaksprenEntity;
import net.mcreator.wordsofradiance.entity.MistsprenEntity;
import net.mcreator.wordsofradiance.entity.LightsprenEntity;
import net.mcreator.wordsofradiance.entity.InkSprenEntity;
import net.mcreator.wordsofradiance.entity.IllusionPlayerEntity;
import net.mcreator.wordsofradiance.entity.HonoursprenShadesmarEntity;
import net.mcreator.wordsofradiance.entity.HonoursprenEntity;
import net.mcreator.wordsofradiance.entity.HighsprenEntity;
import net.mcreator.wordsofradiance.entity.CultivationsprenEntity;
import net.mcreator.wordsofradiance.entity.CrypticShadesmarEntity;
import net.mcreator.wordsofradiance.entity.CrypticEntity;
import net.mcreator.wordsofradiance.entity.AshsprenEntity;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WordsOfRadianceModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<IllusionPlayerEntity>> ILLUSION_PLAYER = register("illusion_player",
			EntityType.Builder.<IllusionPlayerEntity>of(IllusionPlayerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<InkSprenEntity>> INK_SPREN = register("ink_spren",
			EntityType.Builder.<InkSprenEntity>of(InkSprenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.2f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrypticEntity>> CRYPTIC = register("cryptic",
			EntityType.Builder.<CrypticEntity>of(CrypticEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<HonoursprenEntity>> HONOURSPREN = register("honourspren",
			EntityType.Builder.<HonoursprenEntity>of(HonoursprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<HighsprenEntity>> HIGHSPREN = register("highspren",
			EntityType.Builder.<HighsprenEntity>of(HighsprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.2f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<AshsprenEntity>> ASHSPREN = register("ashspren",
			EntityType.Builder.<AshsprenEntity>of(AshsprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CultivationsprenEntity>> CULTIVATIONSPREN = register("cultivationspren",
			EntityType.Builder.<CultivationsprenEntity>of(CultivationsprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MistsprenEntity>> MISTSPREN = register("mistspren",
			EntityType.Builder.<MistsprenEntity>of(MistsprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.2f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<LightsprenEntity>> LIGHTSPREN = register("lightspren",
			EntityType.Builder.<LightsprenEntity>of(LightsprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.3f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<PeaksprenEntity>> PEAKSPREN = register("peakspren",
			EntityType.Builder.<PeaksprenEntity>of(PeaksprenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HonoursprenShadesmarEntity>> HONOURSPREN_SHADESMAR = register("honourspren_shadesmar",
			EntityType.Builder.<HonoursprenShadesmarEntity>of(HonoursprenShadesmarEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<CrypticShadesmarEntity>> CRYPTIC_SHADESMAR = register("cryptic_shadesmar",
			EntityType.Builder.<CrypticShadesmarEntity>of(CrypticShadesmarEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(WordsOfRadianceMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		IllusionPlayerEntity.init(event);
		InkSprenEntity.init(event);
		CrypticEntity.init(event);
		HonoursprenEntity.init(event);
		HighsprenEntity.init(event);
		AshsprenEntity.init(event);
		CultivationsprenEntity.init(event);
		MistsprenEntity.init(event);
		LightsprenEntity.init(event);
		PeaksprenEntity.init(event);
		HonoursprenShadesmarEntity.init(event);
		CrypticShadesmarEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ILLUSION_PLAYER.get(), IllusionPlayerEntity.createAttributes().build());
		event.put(INK_SPREN.get(), InkSprenEntity.createAttributes().build());
		event.put(CRYPTIC.get(), CrypticEntity.createAttributes().build());
		event.put(HONOURSPREN.get(), HonoursprenEntity.createAttributes().build());
		event.put(HIGHSPREN.get(), HighsprenEntity.createAttributes().build());
		event.put(ASHSPREN.get(), AshsprenEntity.createAttributes().build());
		event.put(CULTIVATIONSPREN.get(), CultivationsprenEntity.createAttributes().build());
		event.put(MISTSPREN.get(), MistsprenEntity.createAttributes().build());
		event.put(LIGHTSPREN.get(), LightsprenEntity.createAttributes().build());
		event.put(PEAKSPREN.get(), PeaksprenEntity.createAttributes().build());
		event.put(HONOURSPREN_SHADESMAR.get(), HonoursprenShadesmarEntity.createAttributes().build());
		event.put(CRYPTIC_SHADESMAR.get(), CrypticShadesmarEntity.createAttributes().build());
	}
}
