package net.mcreator.wordsofradiance.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelhonourspren_female extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("words_of_radiance", "modelhonourspren_female"), "main");
	public final ModelPart honourspren_female;
	public final ModelPart lleg;
	public final ModelPart rleg;
	public final ModelPart body;
	public final ModelPart larm;
	public final ModelPart rarm;
	public final ModelPart head;

	public Modelhonourspren_female(ModelPart root) {
		super(root);
		this.honourspren_female = root.getChild("honourspren_female");
		this.lleg = this.honourspren_female.getChild("lleg");
		this.rleg = this.honourspren_female.getChild("rleg");
		this.body = this.honourspren_female.getChild("body");
		this.larm = this.honourspren_female.getChild("larm");
		this.rarm = this.honourspren_female.getChild("rarm");
		this.head = this.honourspren_female.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition honourspren_female = partdefinition.addOrReplaceChild("honourspren_female", CubeListBuilder.create(), PartPose.offset(-1.0F, 24.0F, 0.0F));
		PartDefinition lleg = honourspren_female.addOrReplaceChild("lleg", CubeListBuilder.create().texOffs(40, 52).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -12.0F, 0.0F));
		PartDefinition rleg = honourspren_female.addOrReplaceChild("rleg", CubeListBuilder.create().texOffs(56, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -12.0F, 0.0F));
		PartDefinition body = honourspren_female.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(32, 36).addBox(-4.0F, -7.0F, -2.0F, 8.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 14).addBox(-4.0F, -2.0F, -3.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, 2.0F, -4.0F, 10.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, 6.0F, -5.0F, 12.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, -17.0F, 0.0F));
		PartDefinition larm = honourspren_female.addOrReplaceChild("larm", CubeListBuilder.create().texOffs(56, 52).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -22.0F, 0.0F));
		PartDefinition rarm = honourspren_female.addOrReplaceChild("rarm", CubeListBuilder.create().texOffs(0, 60).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -22.0F, 0.0F));
		PartDefinition head = honourspren_female.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 25).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 27)
						.addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(35, 29).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 43)
						.addBox(0.0F, -4.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 49).addBox(-1.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 49)
						.addBox(3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 11).addBox(-4.0F, -4.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-4.0F, -5.0F, 4.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 0).addBox(-4.0F, 3.0F, 2.0F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 7)
						.addBox(-3.0F, 8.0F, 3.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43).addBox(-5.0F, -5.0F, -5.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(-4.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 11).addBox(2.0F, -2.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 46)
						.addBox(-5.0F, 3.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 16).addBox(-5.0F, 3.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 52)
						.addBox(4.0F, -5.0F, -5.0F, 1.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(64, 11).addBox(4.0F, 3.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(64, 20)
						.addBox(4.0F, 3.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.0F, -27.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
