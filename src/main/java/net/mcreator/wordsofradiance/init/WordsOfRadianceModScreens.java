
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.wordsofradiance.client.gui.SoulcastingEssencesScreen;
import net.mcreator.wordsofradiance.client.gui.RestoreOrderCrusadeScreen;
import net.mcreator.wordsofradiance.client.gui.LawsBeyondDeathDedicationScreen;
import net.mcreator.wordsofradiance.client.gui.LawOfTheLandDedicationScreen;
import net.mcreator.wordsofradiance.client.gui.LawOfOccupationDedicationScreen;
import net.mcreator.wordsofradiance.client.gui.LawOfConquestDedicationScreen;
import net.mcreator.wordsofradiance.client.gui.KillTyrantCrusadeScreen;
import net.mcreator.wordsofradiance.client.gui.IdealOfDedicationScreen;
import net.mcreator.wordsofradiance.client.gui.IdealOfCrusadeScreen;
import net.mcreator.wordsofradiance.client.gui.HuntCrusadeScreen;
import net.mcreator.wordsofradiance.client.gui.DestroyMonstrosityCrusadeScreen;
import net.mcreator.wordsofradiance.client.gui.DefendInnocentsCrusadeScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WordsOfRadianceModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(WordsOfRadianceModMenus.IDEAL_OF_DEDICATION.get(), IdealOfDedicationScreen::new);
		event.register(WordsOfRadianceModMenus.IDEAL_OF_CRUSADE.get(), IdealOfCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.LAW_OF_THE_LAND_DEDICATION.get(), LawOfTheLandDedicationScreen::new);
		event.register(WordsOfRadianceModMenus.LAW_OF_CONQUEST_DEDICATION.get(), LawOfConquestDedicationScreen::new);
		event.register(WordsOfRadianceModMenus.LAW_OF_OCCUPATION_DEDICATION.get(), LawOfOccupationDedicationScreen::new);
		event.register(WordsOfRadianceModMenus.LAWS_BEYOND_DEATH_DEDICATION.get(), LawsBeyondDeathDedicationScreen::new);
		event.register(WordsOfRadianceModMenus.KILL_TYRANT_CRUSADE.get(), KillTyrantCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.DESTROY_MONSTROSITY_CRUSADE.get(), DestroyMonstrosityCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.DEFEND_INNOCENTS_CRUSADE.get(), DefendInnocentsCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.RESTORE_ORDER_CRUSADE.get(), RestoreOrderCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.HUNT_CRUSADE.get(), HuntCrusadeScreen::new);
		event.register(WordsOfRadianceModMenus.SOULCASTING_ESSENCES.get(), SoulcastingEssencesScreen::new);
	}
}
