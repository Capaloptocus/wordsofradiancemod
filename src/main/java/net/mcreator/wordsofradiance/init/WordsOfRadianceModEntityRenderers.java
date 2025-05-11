
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.wordsofradiance.client.renderer.PeaksprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.MistsprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.LightsprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.InkSprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.IllusionPlayerRenderer;
import net.mcreator.wordsofradiance.client.renderer.HonoursprenShadesmarRenderer;
import net.mcreator.wordsofradiance.client.renderer.HonoursprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.HighsprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.CultivationsprenRenderer;
import net.mcreator.wordsofradiance.client.renderer.CrypticShadesmarRenderer;
import net.mcreator.wordsofradiance.client.renderer.CrypticRenderer;
import net.mcreator.wordsofradiance.client.renderer.AshsprenRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WordsOfRadianceModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WordsOfRadianceModEntities.ILLUSION_PLAYER.get(), IllusionPlayerRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.INK_SPREN.get(), InkSprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.CRYPTIC.get(), CrypticRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.HONOURSPREN.get(), HonoursprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.HIGHSPREN.get(), HighsprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.ASHSPREN.get(), AshsprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.CULTIVATIONSPREN.get(), CultivationsprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.MISTSPREN.get(), MistsprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.LIGHTSPREN.get(), LightsprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.PEAKSPREN.get(), PeaksprenRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.HONOURSPREN_SHADESMAR.get(), HonoursprenShadesmarRenderer::new);
		event.registerEntityRenderer(WordsOfRadianceModEntities.CRYPTIC_SHADESMAR.get(), CrypticShadesmarRenderer::new);
	}
}
