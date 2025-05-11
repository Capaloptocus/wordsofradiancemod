package net.mcreator.wordsofradiance.client.model;

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
public class ModelCrypticTwo extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("words_of_radiance", "model_cryptic_two"), "main");
	public final ModelPart cryptic;
	public final ModelPart head;
	public final ModelPart inner_ring;
	public final ModelPart tine1;
	public final ModelPart tine2;
	public final ModelPart tine3;
	public final ModelPart tine4;
	public final ModelPart tine5;
	public final ModelPart tine6;
	public final ModelPart tine7;
	public final ModelPart tine8;
	public final ModelPart front_ring;
	public final ModelPart tine9;
	public final ModelPart tine10;
	public final ModelPart tine11;
	public final ModelPart tine12;
	public final ModelPart tine13;
	public final ModelPart tine14;
	public final ModelPart tine15;
	public final ModelPart rear_ring;
	public final ModelPart tine16;
	public final ModelPart tine17;
	public final ModelPart tine18;
	public final ModelPart tine19;
	public final ModelPart tine20;
	public final ModelPart tine21;
	public final ModelPart tine22;
	public final ModelPart robe;
	public final ModelPart rleg;
	public final ModelPart lleg;
	public final ModelPart larm;
	public final ModelPart rarm;

	public ModelCrypticTwo(ModelPart root) {
		super(root);
		this.cryptic = root.getChild("cryptic");
		this.head = this.cryptic.getChild("head");
		this.inner_ring = this.head.getChild("inner_ring");
		this.tine1 = this.inner_ring.getChild("tine1");
		this.tine2 = this.inner_ring.getChild("tine2");
		this.tine3 = this.inner_ring.getChild("tine3");
		this.tine4 = this.inner_ring.getChild("tine4");
		this.tine5 = this.inner_ring.getChild("tine5");
		this.tine6 = this.inner_ring.getChild("tine6");
		this.tine7 = this.inner_ring.getChild("tine7");
		this.tine8 = this.inner_ring.getChild("tine8");
		this.front_ring = this.head.getChild("front_ring");
		this.tine9 = this.front_ring.getChild("tine9");
		this.tine10 = this.front_ring.getChild("tine10");
		this.tine11 = this.front_ring.getChild("tine11");
		this.tine12 = this.front_ring.getChild("tine12");
		this.tine13 = this.front_ring.getChild("tine13");
		this.tine14 = this.front_ring.getChild("tine14");
		this.tine15 = this.front_ring.getChild("tine15");
		this.rear_ring = this.head.getChild("rear_ring");
		this.tine16 = this.rear_ring.getChild("tine16");
		this.tine17 = this.rear_ring.getChild("tine17");
		this.tine18 = this.rear_ring.getChild("tine18");
		this.tine19 = this.rear_ring.getChild("tine19");
		this.tine20 = this.rear_ring.getChild("tine20");
		this.tine21 = this.rear_ring.getChild("tine21");
		this.tine22 = this.rear_ring.getChild("tine22");
		this.robe = this.cryptic.getChild("robe");
		this.rleg = this.robe.getChild("rleg");
		this.lleg = this.robe.getChild("lleg");
		this.larm = this.robe.getChild("larm");
		this.rarm = this.robe.getChild("rarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition cryptic = partdefinition.addOrReplaceChild("cryptic", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = cryptic.addOrReplaceChild("head", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -33.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 40)
				.addBox(-0.5F, -32.5F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 59).addBox(-0.5F, -32.5F, 1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition inner_ring = head.addOrReplaceChild("inner_ring", CubeListBuilder.create(), PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition tine1 = inner_ring.addOrReplaceChild("tine1", CubeListBuilder.create().texOffs(34, 46).addBox(-0.5F, -36.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 32.0F, 0.0F));
		PartDefinition cube_r1 = tine1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(34, 50).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine2 = inner_ring.addOrReplaceChild("tine2", CubeListBuilder.create().texOffs(24, 52).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = tine2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 52).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine3 = inner_ring.addOrReplaceChild("tine3", CubeListBuilder.create().texOffs(52, 52).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.6144F));
		PartDefinition cube_r3 = tine3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 52).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine4 = inner_ring.addOrReplaceChild("tine4", CubeListBuilder.create().texOffs(54, 32).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 2.3998F));
		PartDefinition cube_r4 = tine4.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(32, 54).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine5 = inner_ring.addOrReplaceChild("tine5", CubeListBuilder.create().texOffs(0, 56).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r5 = tine5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(54, 36).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine6 = inner_ring.addOrReplaceChild("tine6", CubeListBuilder.create().texOffs(4, 56).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -2.3562F));
		PartDefinition cube_r6 = tine6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine7 = inner_ring.addOrReplaceChild("tine7", CubeListBuilder.create().texOffs(8, 56).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r7 = tine7.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(56, 4).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine8 = inner_ring.addOrReplaceChild("tine8", CubeListBuilder.create().texOffs(12, 56).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r8 = tine8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(56, 8).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition front_ring = head.addOrReplaceChild("front_ring", CubeListBuilder.create(), PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition tine9 = front_ring.addOrReplaceChild("tine9", CubeListBuilder.create().texOffs(56, 12).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r9 = tine9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 15).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine10 = front_ring.addOrReplaceChild("tine10", CubeListBuilder.create().texOffs(16, 56).addBox(-1.0F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r10 = tine10.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(56, 18).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine11 = front_ring.addOrReplaceChild("tine11", CubeListBuilder.create().texOffs(20, 56).addBox(-1.0F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, 0.0F, 0.0F, 2.0071F));
		PartDefinition cube_r11 = tine11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(56, 21).addBox(0.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine12 = front_ring.addOrReplaceChild("tine12", CubeListBuilder.create().texOffs(24, 56).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r12 = tine12.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(56, 24).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine13 = front_ring.addOrReplaceChild("tine13", CubeListBuilder.create().texOffs(56, 27).addBox(-1.0F, -1.5F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.0081F, -0.1492F, -0.6425F));
		PartDefinition cube_r13 = tine13.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(28, 56).addBox(-0.5F, -1.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine14 = front_ring.addOrReplaceChild("tine14", CubeListBuilder.create().texOffs(48, 56).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.0738F, -0.13F, -1.2151F));
		PartDefinition cube_r14 = tine14.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 48).addBox(0.0F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine15 = front_ring.addOrReplaceChild("tine15", CubeListBuilder.create().texOffs(56, 51).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.2689F));
		PartDefinition cube_r15 = tine15.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(52, 56).addBox(0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition rear_ring = head.addOrReplaceChild("rear_ring", CubeListBuilder.create(), PartPose.offset(0.0F, -32.0F, 3.0F));
		PartDefinition tine16 = rear_ring.addOrReplaceChild("tine16", CubeListBuilder.create().texOffs(56, 54).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r16 = tine16.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(56, 57).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine17 = rear_ring.addOrReplaceChild("tine17", CubeListBuilder.create().texOffs(58, 30).addBox(-1.0F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.1345F));
		PartDefinition cube_r17 = tine17.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(32, 58).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine18 = rear_ring.addOrReplaceChild("tine18", CubeListBuilder.create().texOffs(58, 33).addBox(-1.0F, -1.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, 0.0F, 0.0F, 2.0071F));
		PartDefinition cube_r18 = tine18.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 58).addBox(0.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine19 = rear_ring.addOrReplaceChild("tine19", CubeListBuilder.create().texOffs(58, 36).addBox(-0.5F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r19 = tine19.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 39).addBox(0.0F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine20 = rear_ring.addOrReplaceChild("tine20", CubeListBuilder.create().texOffs(40, 58).addBox(-1.0F, -1.5F, 0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.0081F, -0.1492F, -0.6425F));
		PartDefinition cube_r20 = tine20.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 58).addBox(-0.5F, -1.0F, 0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine21 = rear_ring.addOrReplaceChild("tine21", CubeListBuilder.create().texOffs(16, 59).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, 0.0738F, -0.13F, -1.2151F));
		PartDefinition cube_r21 = tine21.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(20, 59).addBox(0.0F, -1.5F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition tine22 = rear_ring.addOrReplaceChild("tine22", CubeListBuilder.create().texOffs(24, 59).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 1.0F, -2.0F, 0.0F, 0.0F, -2.2689F));
		PartDefinition cube_r22 = tine22.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 59).addBox(0.5F, 0.0F, 0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition robe = cryptic.addOrReplaceChild("robe",
				CubeListBuilder.create().texOffs(0, 36).addBox(-1.0F, -24.0F, -2.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 52).addBox(4.0F, -28.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 52)
						.addBox(-5.0F, -28.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 42).addBox(-5.0F, -26.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -24.0F, -3.0F, 3.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-4.0F, -24.0F, -3.0F, 3.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 46)
						.addBox(3.0F, -26.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition rleg = robe.addOrReplaceChild("rleg", CubeListBuilder.create().texOffs(36, 16).addBox(1.5F, -1.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
				.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 42).addBox(-2.5F, -1.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -11.0F, 0.0F));
		PartDefinition lleg = robe.addOrReplaceChild("lleg", CubeListBuilder.create().texOffs(12, 36).addBox(-2.5F, -1.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
				.addBox(-1.5F, -1.0F, -3.0F, 3.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 16).addBox(1.5F, -1.0F, -2.0F, 1.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, -11.0F, 0.0F));
		PartDefinition larm = robe.addOrReplaceChild("larm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r23 = larm.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(18, 52).addBox(0.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 52).addBox(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -17.0F, -3.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r24 = larm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(36, 0).addBox(-6.0F, -4.0F, -1.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -17.0F, -5.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r25 = larm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(38, 32).addBox(-1.0F, -1.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -22.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition rarm = robe.addOrReplaceChild("rarm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r26 = rarm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 8).addBox(-1.0F, -3.0F, -3.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -16.0F, -3.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r27 = rarm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(22, 36).addBox(-3.0F, -1.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -22.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}
