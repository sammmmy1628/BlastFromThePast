package net.sammmmy1628.blastfromthepast.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.animation.FrostomperAnimation;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.misc.SmoothAnimationState;
import net.sammmmy1628.blastfromthepast.util.BFTPClientUtil;

public class FrostomperModel extends HierarchicalModel<FrostomperEntity>
{
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "frostomper"), "main");
	private final ModelPart root;
	private final ModelPart frostomper;
	private final ModelPart body;
	private final ModelPart head;

	public FrostomperModel(ModelPart root)
	{
		this.root = root.getChild("root");
		this.frostomper = this.root.getChild("frostomper");
		this.body = this.frostomper.getChild("body");
		this.head = this.body.getChild("head");
	}

	public static LayerDefinition createBodyLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition frostomper = root.addOrReplaceChild("frostomper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = frostomper.addOrReplaceChild("body", CubeListBuilder.create().texOffs(130, 58).addBox(-17.0F, -23.0F, 4.0F, 34.0F, 44.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(136, 216).addBox(0.0F, -30.0F, 4.0F, 0.0F, 7.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-17.0F, 21.0F, -27.0F, 34.0F, 3.0F, 55.0F, new CubeDeformation(0.0F))
		.texOffs(0, 58).addBox(-17.0F, -30.0F, -27.0F, 34.0F, 51.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(130, 101).addBox(0.0F, -33.0F, -27.0F, 0.0F, 3.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -40.0F, 0.0F));

		PartDefinition volcanoes = body.addOrReplaceChild("volcanoes", CubeListBuilder.create().texOffs(272, 53).addBox(-14.0F, 44.9F, 7.0F, 22.0F, 16.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(324, 61).addBox(-12.0F, 35.0F, 14.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(346, 77).addBox(-12.0F, 32.0F, 14.0F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(272, 53).addBox(-11.0F, 30.9F, -13.0F, 22.0F, 16.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(324, 61).addBox(-4.0F, 21.0F, -6.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(346, 77).addBox(-4.0F, 18.0F, -6.0F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -76.9F, -6.0F));

		volcanoes.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(349, 102).addBox(0.0F, -18.0F, -7.0F, 0.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 25.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		volcanoes.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(349, 102).addBox(0.0F, -18.0F, -7.0F, 0.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 21.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		volcanoes.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(349, 102).addBox(0.0F, -18.0F, -7.0F, 0.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 39.0F, 21.0F, 0.0F, 0.7854F, 0.0F));

		volcanoes.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(349, 102).addBox(0.0F, -18.0F, -7.0F, 0.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 35.0F, 21.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 140).addBox(-11.0F, -9.0F, -20.0F, 22.0F, 21.0F, 25.0F, new CubeDeformation(0.0F))
		.texOffs(0, 349).addBox(-11.0F, 12.0F, -20.0F, 22.0F, 11.0F, 25.0F, new CubeDeformation(0.0F))
		.texOffs(179, 45).addBox(-11.0F, -9.0F, -22.0F, 22.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 188).addBox(-9.0F, -13.0F, -19.0F, 18.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(94, 175).addBox(-10.5F, -18.9F, -20.5F, 21.0F, 6.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(48, 267).addBox(-2.0F, -22.9F, -12.5F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(69, 262).addBox(-2.0F, -23.9F, -7.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(42, 291).addBox(-2.0F, -27.9F, -12.5F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(178, 20).addBox(-10.5F, -12.9F, -20.5F, 21.0F, 2.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(94, 176).addBox(-5.0F, -27.75F, -9.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, -27.0F));

		head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(94, 176).addBox(-5.0F, -9.0F, 0.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -18.75F, -9.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition trunk = head.addOrReplaceChild("trunk", CubeListBuilder.create().texOffs(236, 215).addBox(-7.0F, -2.9651F, -7.0006F, 14.0F, 15.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(277, 224).addBox(7.0F, -1.9651F, -2.0006F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(277, 224).mirror().addBox(-13.0F, -1.9651F, -2.0006F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(219, 264).addBox(-7.0F, -2.9651F, -7.2506F, 14.0F, 10.0F, 13.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -20.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition trunk2 = trunk.addOrReplaceChild("trunk2", CubeListBuilder.create().texOffs(241, 174).addBox(-6.0F, -0.9994F, -4.9651F, 12.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0343F, -1.2855F));

		PartDefinition trunk3 = trunk2.addOrReplaceChild("trunk3", CubeListBuilder.create().texOffs(0, 243).addBox(-5.5F, -0.9994F, -4.9651F, 11.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.5F));

		trunk3.addOrReplaceChild("trunk4", CubeListBuilder.create().texOffs(56, 234).addBox(-5.0F, -4.9994F, -1.9651F, 10.0F, 9.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -2.0F));

		head.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(61, 287).mirror().addBox(-7.0F, -3.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(48, 279).addBox(-4.0F, -1.5F, -1.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(61, 287).addBox(4.0F, -3.5F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.4F, -9.0F, 0.3927F, 0.0F, 0.0F));

		head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(56, 211).addBox(-0.3007F, -4.9537F, 0.0F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 221).addBox(6.6993F, -4.9537F, 0.0F, 4.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(94, 173).addBox(-0.3007F, 4.0463F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(112, 214).addBox(-0.3007F, -7.9537F, 0.0F, 13.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(130, 157).addBox(12.6993F, -7.9537F, 0.0F, 3.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(110, 169).addBox(-0.3007F, 4.0463F, 0.0F, 16.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -7.0F, -6.0F, 0.0F, 0.0F, 0.3054F));

		head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(56, 211).mirror().addBox(-6.6993F, -4.9537F, 0.0F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 221).mirror().addBox(-10.6993F, -4.9537F, 0.0F, 4.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(94, 173).mirror().addBox(-6.6993F, 4.0463F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(112, 214).mirror().addBox(-12.6993F, -7.9537F, 0.0F, 13.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(130, 157).mirror().addBox(-15.6993F, -7.9537F, 0.0F, 3.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(110, 169).mirror().addBox(-15.6993F, 4.0463F, 0.0F, 16.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.0F, -7.0F, -6.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition left_big_tusk = head.addOrReplaceChild("left_big_tusk", CubeListBuilder.create().texOffs(130, 299).mirror().addBox(-3.25F, -0.9664F, -3.4403F, 7.0F, 37.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(76, 260).mirror().addBox(-3.25F, -0.9664F, -3.4403F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(127, 312).mirror().addBox(-3.25F, 29.0336F, -34.4403F, 7.0F, 7.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(184, 243).mirror().addBox(-3.25F, 11.0336F, -34.4403F, 7.0F, 18.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(156, 256).mirror().addBox(-3.25F, 11.0336F, -27.4403F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(136, 260).mirror().addBox(-3.25F, 16.0336F, -23.4403F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.5F, 4.0F, -11.5F, 0.1309F, -0.2618F, -0.2618F));

		left_big_tusk.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(180, 175).mirror().addBox(1.9914F, -1.9982F, -2.9403F, 0.0F, 11.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 37.0F, -31.5F, 0.0F, 0.0F, 0.2618F));

		left_big_tusk.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 429).mirror().addBox(1.25F, -27.9664F, -5.9403F, 0.0F, 54.0F, 29.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5F, 2.0F, 2.5F, 0.0887F, 0.0325F, 0.2496F));

		left_big_tusk.addOrReplaceChild("left_big_extinct_tusk", CubeListBuilder.create().texOffs(137, 272).mirror().addBox(-7.5F, 21.0336F, -23.4403F, 7.0F, 7.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(101, 270).mirror().addBox(-7.5F, 3.0336F, -23.4403F, 7.0F, 18.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(129, 278).mirror().addBox(-7.5F, 3.0336F, -16.4403F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(129, 270).mirror().addBox(-7.5F, 8.0336F, -12.4403F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.225F, 0.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition right_big_tusk = head.addOrReplaceChild("right_big_tusk", CubeListBuilder.create().texOffs(130, 299).addBox(-3.75F, -0.9664F, -3.4403F, 7.0F, 37.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(76, 260).addBox(-3.75F, -0.9664F, -3.4403F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.3F))
		.texOffs(127, 312).addBox(-3.75F, 29.0336F, -34.4403F, 7.0F, 7.0F, 31.0F, new CubeDeformation(0.0F))
		.texOffs(184, 243).addBox(-3.75F, 11.0336F, -34.4403F, 7.0F, 18.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(136, 260).addBox(-3.75F, 16.0336F, -23.4403F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(156, 256).addBox(-3.75F, 11.0336F, -27.4403F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.5F, 4.0F, -11.5F, 0.1309F, 0.2618F, 0.2618F));

		right_big_tusk.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(180, 175).addBox(-1.9914F, -1.9982F, -2.9403F, 0.0F, 11.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 37.0F, -31.5F, 0.0F, 0.0F, -0.2618F));

		right_big_tusk.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 429).addBox(-1.25F, -27.9664F, -5.9403F, 0.0F, 54.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 2.0F, 2.5F, 0.0887F, -0.0325F, -0.2496F));

		right_big_tusk.addOrReplaceChild("right_big_extinct_tusk", CubeListBuilder.create().texOffs(137, 272).addBox(0.5F, 21.0336F, -23.4403F, 7.0F, 7.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(101, 270).addBox(0.5F, 3.0336F, -23.4403F, 7.0F, 18.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(129, 278).addBox(0.5F, 3.0336F, -16.4403F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(129, 270).addBox(0.5F, 8.0336F, -12.4403F, 7.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.225F, 0.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

		head.addOrReplaceChild("left_big_exotic_tusk", CubeListBuilder.create().texOffs(64, 284).mirror().addBox(-5.75F, -2.9664F, -17.9403F, 7.0F, 8.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(77, 311).mirror().addBox(-5.75F, -2.9664F, -7.9403F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.3F)).mirror(false)
		.texOffs(97, 283).mirror().addBox(-2.25F, -10.9664F, -17.9403F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(49, 313).mirror().addBox(-5.75F, 5.0336F, -17.9403F, 7.0F, 29.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(77, 335).mirror().addBox(-5.75F, 27.0336F, -10.9403F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(69, 289).mirror().addBox(-2.25F, 17.0336F, -10.9403F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.0F, 6.0F, -14.0F, 0.0856F, -0.4896F, -0.0472F));

		head.addOrReplaceChild("right_big_exotic_tusk", CubeListBuilder.create().texOffs(64, 284).addBox(-1.25F, -2.9664F, -17.9403F, 7.0F, 8.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(77, 311).addBox(-1.25F, -2.9664F, -7.9403F, 7.0F, 8.0F, 9.0F, new CubeDeformation(0.3F))
		.texOffs(97, 283).addBox(2.25F, -10.9664F, -17.9403F, 0.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(49, 313).addBox(-1.25F, 5.0336F, -17.9403F, 7.0F, 29.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(77, 335).addBox(-1.25F, 27.0336F, -10.9403F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(69, 289).addBox(2.25F, 17.0336F, -10.9403F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 6.0F, -14.0F, 0.0856F, 0.4896F, 0.0472F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(136, 203).addBox(-8.0F, -0.9863F, -2.835F, 14.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(94, 158).addBox(-8.0F, -0.9863F, -6.835F, 14.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 10.25F, -8.55F, 0.1658F, 0.0F, 0.0F));

		mouth.addOrReplaceChild("left_small_exotic_tusk", CubeListBuilder.create().texOffs(198, 182).addBox(-0.9687F, 3.0396F, -20.7232F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(158, 162).addBox(-0.9687F, -1.9604F, -20.7232F, 5.0F, 5.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -0.25F, -5.45F, 0.0877F, -0.1307F, -0.0038F));

		mouth.addOrReplaceChild("right_small_exotic_tusk", CubeListBuilder.create().texOffs(198, 182).mirror().addBox(-4.0313F, 3.0396F, -20.7232F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(158, 162).mirror().addBox(-4.0313F, -1.9604F, -20.7232F, 5.0F, 5.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -0.25F, -5.45F, 0.0877F, 0.1307F, 0.0038F));

		mouth.addOrReplaceChild("left_small_tusk", CubeListBuilder.create().texOffs(94, 140).addBox(-2.4687F, -3.3604F, -12.7232F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(74, 188).addBox(-2.4687F, -11.3604F, -12.7232F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 0.9F, -4.45F, 0.1155F, -0.3504F, 0.0273F));

		mouth.addOrReplaceChild("right_small_tusk", CubeListBuilder.create().texOffs(94, 140).mirror().addBox(-2.5313F, -3.3604F, -12.7232F, 5.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(74, 188).mirror().addBox(-2.5313F, -11.3604F, -12.7232F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.5F, 0.9F, -4.45F, 0.1155F, 0.3504F, -0.0273F));

		body.addOrReplaceChild("tail_extinct", CubeListBuilder.create().texOffs(171, 247).addBox(0.0F, -1.5F, 0.0F, 0.0F, 21.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.5F, 28.0F));

		PartDefinition tail_exotic = body.addOrReplaceChild("tail_exotic", CubeListBuilder.create().texOffs(260, 247).addBox(-5.0F, -9.0F, -1.0F, 10.0F, 17.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(306, 247).addBox(0.0F, -5.0F, 5.0F, 0.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -16.0F, 29.0F));

		tail_exotic.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(306, 231).mirror().addBox(-5.0F, -7.0F, -1.0F, 0.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 2.0F, 3.25F, -0.1745F, 0.5672F, 0.0F));

		tail_exotic.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(306, 231).addBox(5.0F, -7.0F, -1.0F, 0.0F, 15.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, 3.25F, -0.1745F, -0.5672F, 0.0F));

		body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(184, 217).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 10.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -19.0F, 28.0F));

		PartDefinition saddle = body.addOrReplaceChild("saddle", CubeListBuilder.create().texOffs(265, 0).addBox(-17.5F, -63.5F, -22.0F, 35.0F, 24.0F, 25.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 33.0F, -2.0F));

		saddle.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(178, 0).addBox(-18.0F, -10.0F, -1.0F, 36.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -59.0F, 4.0F, 0.3927F, 0.0F, 0.0F));

		frostomper.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 211).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 18.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 289).addBox(-7.0F, 0.2F, -7.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.25F))
		.texOffs(2, 270).addBox(-7.5F, 18.0F, -7.5F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -22.0F, -18.0F));

		frostomper.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 211).mirror().addBox(-7.0F, 0.0F, -7.0F, 14.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 289).mirror().addBox(-7.0F, 0.2F, -7.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(2, 270).mirror().addBox(-7.5F, 18.0F, -7.5F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(9.0F, -22.0F, -18.0F));

		frostomper.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 211).mirror().addBox(-7.0F, 0.0F, -7.0F, 14.0F, 18.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 289).mirror().addBox(-7.0F, 0.2F, -7.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.25F)).mirror(false)
		.texOffs(2, 270).mirror().addBox(-7.5F, 18.0F, -7.5F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(9.0F, -22.0F, 19.0F));

		frostomper.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 211).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 18.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 289).addBox(-7.0F, 0.2F, -7.0F, 14.0F, 15.0F, 14.0F, new CubeDeformation(0.25F))
		.texOffs(2, 270).addBox(-7.5F, 18.0F, -7.5F, 15.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -22.0F, 19.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(FrostomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		this.root().getAllParts().forEach(ModelPart::resetPose);
		BFTPClientUtil.animateHead(this.head, Mth.clamp(netHeadYaw, -15, 15), Mth.clamp(headPitch, -15, 15));
		entity.idleAnimationState.animateIdle(this, FrostomperAnimation.idle, ageInTicks, limbSwingAmount, 2.5F);
		entity.stompAnimationState.animate(this, FrostomperAnimation.stomp, ageInTicks);
		entity.stomp2AnimationState.animate(this, FrostomperAnimation.stomp_flipped, ageInTicks);
		entity.flingAnimationState.animate(this, FrostomperAnimation.fling, ageInTicks);
		entity.earsAnimationState.animate(this, FrostomperAnimation.ears, ageInTicks);
		entity.tailAnimationState.animate(this, FrostomperAnimation.tail, ageInTicks);
		entity.trumpetAnimationState.animate(this, FrostomperAnimation.trumpet, ageInTicks);
		entity.chargeAnimationState.animate(this, FrostomperAnimation.charge, ageInTicks);
		entity.crushAnimationState.animate(this, FrostomperAnimation.crush, ageInTicks);
		entity.danceAnimationState.animate(this, FrostomperAnimation.dance, ageInTicks);
		
		SmoothAnimationState.animateWalk(this, FrostomperAnimation.walk, limbSwing, limbSwingAmount, 2.5F, 2.5F);
	}
	
	@Override
	public ModelPart root() 
	{
		return this.root;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) 
	{
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}