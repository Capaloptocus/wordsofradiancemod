
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.CrypticShadesmarEntity;
import net.mcreator.wordsofradiance.client.model.ModelCrypticTwo;

public class CrypticShadesmarRenderer extends MobRenderer<CrypticShadesmarEntity, LivingEntityRenderState, ModelCrypticTwo> {
	private CrypticShadesmarEntity entity = null;

	public CrypticShadesmarRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrypticTwo(context.bakeLayer(ModelCrypticTwo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrypticShadesmarEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/cryptictwo.png");
	}
}
