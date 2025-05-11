
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.HighsprenEntity;
import net.mcreator.wordsofradiance.client.model.ModelHighspren;

public class HighsprenRenderer extends MobRenderer<HighsprenEntity, LivingEntityRenderState, ModelHighspren> {
	private HighsprenEntity entity = null;

	public HighsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelHighspren(context.bakeLayer(ModelHighspren.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HighsprenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/highspren_texture.png");
	}
}
