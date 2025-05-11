
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.CrypticEntity;
import net.mcreator.wordsofradiance.client.model.ModelCryptic;

import com.mojang.blaze3d.vertex.PoseStack;

public class CrypticRenderer extends MobRenderer<CrypticEntity, LivingEntityRenderState, ModelCryptic> {
	private CrypticEntity entity = null;

	public CrypticRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCryptic(context.bakeLayer(ModelCryptic.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrypticEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/cryptic_texture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.25f, 0.25f, 0.25f);
	}
}
