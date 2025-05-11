
package net.mcreator.wordsofradiance.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.wordsofradiance.entity.HonoursprenShadesmarEntity;
import net.mcreator.wordsofradiance.client.model.Modelhonourspren_female;

public class HonoursprenShadesmarRenderer extends MobRenderer<HonoursprenShadesmarEntity, LivingEntityRenderState, Modelhonourspren_female> {
	private HonoursprenShadesmarEntity entity = null;

	public HonoursprenShadesmarRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhonourspren_female(context.bakeLayer(Modelhonourspren_female.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(HonoursprenShadesmarEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("words_of_radiance:textures/entities/honourspren_female.png");
	}
}
