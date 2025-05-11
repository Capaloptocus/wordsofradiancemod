
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.wordsofradiance.world.inventory.SoulcastingEssencesMenu;
import net.mcreator.wordsofradiance.world.inventory.RestoreOrderCrusadeMenu;
import net.mcreator.wordsofradiance.world.inventory.LawsBeyondDeathDedicationMenu;
import net.mcreator.wordsofradiance.world.inventory.LawOfTheLandDedicationMenu;
import net.mcreator.wordsofradiance.world.inventory.LawOfOccupationDedicationMenu;
import net.mcreator.wordsofradiance.world.inventory.LawOfConquestDedicationMenu;
import net.mcreator.wordsofradiance.world.inventory.KillTyrantCrusadeMenu;
import net.mcreator.wordsofradiance.world.inventory.IdealOfDedicationMenu;
import net.mcreator.wordsofradiance.world.inventory.IdealOfCrusadeMenu;
import net.mcreator.wordsofradiance.world.inventory.HuntCrusadeMenu;
import net.mcreator.wordsofradiance.world.inventory.DestroyMonstrosityCrusadeMenu;
import net.mcreator.wordsofradiance.world.inventory.DefendInnocentsCrusadeMenu;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

public class WordsOfRadianceModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<IdealOfDedicationMenu>> IDEAL_OF_DEDICATION = REGISTRY.register("ideal_of_dedication", () -> IMenuTypeExtension.create(IdealOfDedicationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<IdealOfCrusadeMenu>> IDEAL_OF_CRUSADE = REGISTRY.register("ideal_of_crusade", () -> IMenuTypeExtension.create(IdealOfCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LawOfTheLandDedicationMenu>> LAW_OF_THE_LAND_DEDICATION = REGISTRY.register("law_of_the_land_dedication", () -> IMenuTypeExtension.create(LawOfTheLandDedicationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LawOfConquestDedicationMenu>> LAW_OF_CONQUEST_DEDICATION = REGISTRY.register("law_of_conquest_dedication", () -> IMenuTypeExtension.create(LawOfConquestDedicationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LawOfOccupationDedicationMenu>> LAW_OF_OCCUPATION_DEDICATION = REGISTRY.register("law_of_occupation_dedication", () -> IMenuTypeExtension.create(LawOfOccupationDedicationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<LawsBeyondDeathDedicationMenu>> LAWS_BEYOND_DEATH_DEDICATION = REGISTRY.register("laws_beyond_death_dedication", () -> IMenuTypeExtension.create(LawsBeyondDeathDedicationMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<KillTyrantCrusadeMenu>> KILL_TYRANT_CRUSADE = REGISTRY.register("kill_tyrant_crusade", () -> IMenuTypeExtension.create(KillTyrantCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DestroyMonstrosityCrusadeMenu>> DESTROY_MONSTROSITY_CRUSADE = REGISTRY.register("destroy_monstrosity_crusade", () -> IMenuTypeExtension.create(DestroyMonstrosityCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DefendInnocentsCrusadeMenu>> DEFEND_INNOCENTS_CRUSADE = REGISTRY.register("defend_innocents_crusade", () -> IMenuTypeExtension.create(DefendInnocentsCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RestoreOrderCrusadeMenu>> RESTORE_ORDER_CRUSADE = REGISTRY.register("restore_order_crusade", () -> IMenuTypeExtension.create(RestoreOrderCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<HuntCrusadeMenu>> HUNT_CRUSADE = REGISTRY.register("hunt_crusade", () -> IMenuTypeExtension.create(HuntCrusadeMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SoulcastingEssencesMenu>> SOULCASTING_ESSENCES = REGISTRY.register("soulcasting_essences", () -> IMenuTypeExtension.create(SoulcastingEssencesMenu::new));
}
