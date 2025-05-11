
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.PeaksprenEntity;
import net.mcreator.wordsofradiance.client.model.ModelPeakspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class PeaksprenRenderer extends MobRenderer<PeaksprenEntity, LivingEntityRenderState, ModelPeakspren> {
	private PeaksprenEntity entity = null;

	public PeaksprenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPeakspren(context.bakeLayer(ModelPeakspren.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(PeaksprenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/peaksprentexture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.2f, 0.2f, 0.2f);
	}
}
