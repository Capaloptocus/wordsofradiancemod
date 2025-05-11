
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.wordsofradiance.WordsOfRadianceMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class WordsOfRadianceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WORDS_OF_RADIANCE = REGISTRY.register("words_of_radiance",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.words_of_radiance.words_of_radiance")).icon(() -> new ItemStack(WordsOfRadianceModItems.WINDRUNNER_BLADE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WordsOfRadianceModItems.KALAKS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.JEZRIENS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.NALES_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.CHANNAHS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.VEDELS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.PRALLAS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.ASHS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.BATTARS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.TALNS_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_BLUE_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_BLACK_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_RED_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_WHITE_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_GREEN_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_PINK_RED_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_ZIRCON_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_PURPLE_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_ORANGE_BLADE.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_BLUE_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_BLACK_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_RED_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_WHITE_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_GREEN_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_PINK_RED_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_ZIRCON_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_PURPLE_BLADE_WITH_GEM.get());
				tabData.accept(WordsOfRadianceModItems.DEAD_STONEWARD_BLADE_WITH_GEM.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(WordsOfRadianceModItems.ILLUSION_PLAYER_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.INK_SPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.CRYPTIC_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.HONOURSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.HIGHSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.ASHSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.CULTIVATIONSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.MISTSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.LIGHTSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.PEAKSPREN_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.HONOURSPREN_SHADESMAR_SPAWN_EGG.get());
			tabData.accept(WordsOfRadianceModItems.CRYPTIC_SHADESMAR_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_CHAINMAIL_ARMOR_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_CHAINMAIL_ARMOR_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_CHAINMAIL_ARMOR_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_CHAINMAIL_ARMOR_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_IRON_ARMOR_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_IRON_ARMOR_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_IRON_ARMOR_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_IRON_ARMOR_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_GOLD_ARMOR_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_GOLD_ARMOR_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_GOLD_ARMOR_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_GOLD_ARMOR_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_DIAMOND_ARMOR_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_DIAMOND_ARMOR_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_DIAMOND_ARMOR_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.TENSION_INFUSED_DIAMOND_ARMOR_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.WINDRUNNER_SHARDPLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.WINDRUNNER_SHARDPLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.WINDRUNNER_SHARDPLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.WINDRUNNER_SHARDPLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.SKYBREAKER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.SKYBREAKER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.SKYBREAKER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.SKYBREAKER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.DUSTBRINGER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.DUSTBRINGER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.DUSTBRINGER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.DUSTBRINGER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.EDGEDANCER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.EDGEDANCER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.EDGEDANCER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.EDGEDANCER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.TRUTHWATCHER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.TRUTHWATCHER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.TRUTHWATCHER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.TRUTHWATCHER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.LIGHTWEAVER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.LIGHTWEAVER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.LIGHTWEAVER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.LIGHTWEAVER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.ELSECALLER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.ELSECALLER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.ELSECALLER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.ELSECALLER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.WILLSHAPER_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.WILLSHAPER_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.WILLSHAPER_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.WILLSHAPER_PLATE_BOOTS.get());
			tabData.accept(WordsOfRadianceModItems.STONEWARD_PLATE_HELMET.get());
			tabData.accept(WordsOfRadianceModItems.STONEWARD_PLATE_CHESTPLATE.get());
			tabData.accept(WordsOfRadianceModItems.STONEWARD_PLATE_LEGGINGS.get());
			tabData.accept(WordsOfRadianceModItems.STONEWARD_PLATE_BOOTS.get());
		}
	}
}
