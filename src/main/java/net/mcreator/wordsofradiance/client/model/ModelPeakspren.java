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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPeakspren extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("words_of_radiance", "model_peakspren"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart arml;
	public final ModelPart legl;
	public final ModelPart armr;
	public final ModelPart legr;

	public ModelPeakspren(ModelPart root) {
		super(root);
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.arml = root.getChild("arml");
		this.legl = root.getChild("legl");
		this.armr = root.getChild("armr");
		this.legr = root.getChild("legr");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(26, 55).addBox(1.0F, 1.0F, -1.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(0.0F, -4.0F, -1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 34)
						.addBox(7.0F, -3.0F, -6.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 16).addBox(-1.0F, 4.0F, -6.0F, 8.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 59)
						.addBox(3.0F, -3.0F, -6.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 5.0F, 3.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -12.0F, -4.0F, 4.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 7.0F, -3.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 52).addBox(-9.0F, -4.0F, 4.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-10.0F, -10.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-11.0F, -9.0F, 4.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 48).addBox(-11.0F, -9.0F, -1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 46)
						.addBox(-7.0F, -11.0F, -2.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 36).addBox(-2.0F, -10.0F, -1.0F, 1.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 53)
						.addBox(-10.0F, -7.0F, -4.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 48).addBox(-11.0F, -5.0F, 0.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 2.0F, -1.0F));
		PartDefinition arml = partdefinition.addOrReplaceChild("arml",
				CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 24).addBox(-1.0F, 8.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(56, 34)
						.addBox(2.0F, 1.0F, -1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(56, 41).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 1.0F, 0.0F));
		PartDefinition legl = partdefinition.addOrReplaceChild("legl", CubeListBuilder.create().texOffs(32, 0).addBox(4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 57)
				.addBox(4.0F, 4.0F, -3.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(6.0F, 3.0F, 0.0F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.0F, 0.0F));
		PartDefinition armr = partdefinition.addOrReplaceChild("armr",
				CubeListBuilder.create().texOffs(24, 32).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 59).addBox(0.0F, 4.0F, 2.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 53)
						.addBox(-3.0F, 4.0F, 0.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 4).addBox(-2.0F, -2.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 2.0F, 0.0F));
		PartDefinition legr = partdefinition.addOrReplaceChild("legr",
				CubeListBuilder.create().texOffs(24, 16).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 55).addBox(-2.0F, 9.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(0.0F, 4.0F, 2.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 58).addBox(-1.0F, 2.0F, -3.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(1.0F, 5.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.legr.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.armr.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.legl.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arml.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
