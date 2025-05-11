
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.CultivationsprenEntity;
import net.mcreator.wordsofradiance.client.model.Modelcultivationsprn;

import com.mojang.blaze3d.vertex.PoseStack;

public class CultivationsprenRenderer extends MobRenderer<CultivationsprenEntity, LivingEntityRenderState, Modelcultivationsprn> {
	private CultivationsprenEntity entity = null;

	public CultivationsprenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcultivationsprn(context.bakeLayer(Modelcultivationsprn.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CultivationsprenEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/csprentexture.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}
}
