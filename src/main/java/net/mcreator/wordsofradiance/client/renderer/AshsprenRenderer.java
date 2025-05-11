
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.AshsprenEntity;
import net.mcreator.wordsofradiance.client.model.Modelashspren;

import com.mojang.blaze3d.vertex.PoseStack;

public class AshsprenRenderer extends MobRenderer<AshsprenEntity, LivingEntityRenderState, Modelashspren> {
	private AshsprenEntity entity = null;

	public AshsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelashspren(context.bakeLayer(Modelashspren.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(AshsprenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/ashsprentexture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.6f, 0.6f, 0.6f);
	}
}
