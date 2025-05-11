
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.wordsofradiance.client.model.Modelmodel;
import net.mcreator.wordsofradiance.client.model.Modelhonourspren_female;
import net.mcreator.wordsofradiance.client.model.Modelcultivationsprn;
import net.mcreator.wordsofradiance.client.model.Modelashspren;
import net.mcreator.wordsofradiance.client.model.ModelSeon;
import net.mcreator.wordsofradiance.client.model.ModelPeakspren;
import net.mcreator.wordsofradiance.client.model.ModelMastered_Sand_Projectile;
import net.mcreator.wordsofradiance.client.model.ModelHighspren;
import net.mcreator.wordsofradiance.client.model.ModelCrypticTwo;
import net.mcreator.wordsofradiance.client.model.ModelCryptic;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WordsOfRadianceModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCrypticTwo.LAYER_LOCATION, ModelCrypticTwo::createBodyLayer);
		event.registerLayerDefinition(ModelMastered_Sand_Projectile.LAYER_LOCATION, ModelMastered_Sand_Projectile::createBodyLayer);
		event.registerLayerDefinition(ModelHighspren.LAYER_LOCATION, ModelHighspren::createBodyLayer);
		event.registerLayerDefinition(Modelashspren.LAYER_LOCATION, Modelashspren::createBodyLayer);
		event.registerLayerDefinition(Modelmodel.LAYER_LOCATION, Modelmodel::createBodyLayer);
		event.registerLayerDefinition(ModelPeakspren.LAYER_LOCATION, ModelPeakspren::createBodyLayer);
		event.registerLayerDefinition(ModelCryptic.LAYER_LOCATION, ModelCryptic::createBodyLayer);
		event.registerLayerDefinition(Modelhonourspren_female.LAYER_LOCATION, Modelhonourspren_female::createBodyLayer);
		event.registerLayerDefinition(Modelcultivationsprn.LAYER_LOCATION, Modelcultivationsprn::createBodyLayer);
		event.registerLayerDefinition(ModelSeon.LAYER_LOCATION, ModelSeon::createBodyLayer);
	}
}
