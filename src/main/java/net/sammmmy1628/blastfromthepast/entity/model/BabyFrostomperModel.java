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
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.animation.BabyFrostomperAnimation;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.misc.SmoothAnimationState;
import net.sammmmy1628.blastfromthepast.util.BFTPClientUtil;

public class BabyFrostomperModel extends HierarchicalModel<FrostomperEntity>
{
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "baby_frostomper"), "main");
	private final ModelPart root;
	private final ModelPart frostyomper;
	private final ModelPart body;
	private final ModelPart head;

	public BabyFrostomperModel(ModelPart root) 
	{
		this.root = root.getChild("root");
		this.frostyomper = this.root.getChild("frostyomper");
		this.body = this.frostyomper.getChild("body");
		this.head = this.body.getChild("head");
	}

	public static LayerDefinition createBodyLayer() 
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition frostyomper = root.addOrReplaceChild("frostyomper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = frostyomper.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 31).addBox(-6.5F, 6.0F, -11.0F, 13.0F, 3.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.5F, -8.0F, -11.0F, 13.0F, 14.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 0.5F));

		body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 68).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 29).addBox(-2.5F, -3.0F, 2.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 6.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(14, 66).addBox(-3.5F, -9.5F, -4.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(60, 0).addBox(-4.0F, -0.5F, -7.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(42, 51).addBox(-4.5F, 0.5F, -7.0F, 9.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 97).addBox(-6.0F, -9.5F, -10.0F, 12.0F, 19.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-5.5F, -5.5F, -9.0F, 11.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.5F, -11.0F));

		head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(14, 66).addBox(-3.5F, -4.0F, 0.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5F, -4.0F, 0.0F, 1.5708F, 0.0F));

		head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(14, 71).addBox(-4.0F, 0.0F, 1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 70).addBox(-5.5F, 0.0F, 1.25F, 5.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -2.5F, -3.0F));

		head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(14, 71).mirror().addBox(0.0F, 0.0F, 1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 70).mirror().addBox(0.5F, 0.0F, 1.25F, 5.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.5F, -2.5F, -3.0F));

		PartDefinition trunk = head.addOrReplaceChild("trunk", CubeListBuilder.create().texOffs(42, 63).addBox(-2.5F, -2.0F, -2.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.5F, -6.0F));

		trunk.addOrReplaceChild("trunk_tip", CubeListBuilder.create().texOffs(60, 63).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition left_tusk2 = head.addOrReplaceChild("left_tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 4.0F, -5.25F, 0.0F, -0.7854F, 0.0F));

		left_tusk2.addOrReplaceChild("left_tusk3_r1", CubeListBuilder.create().texOffs(24, 71).addBox(2.0F, -5.0F, 4.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5337F, 6.0F, -7.4288F, 0.0F, -0.7854F, 0.0F));

		left_tusk2.addOrReplaceChild("left_tusk3_r2", CubeListBuilder.create().texOffs(0, 66).addBox(3.0F, -6.0F, 1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.2837F, 6.25F, -0.6788F, 0.2313F, 0.7854F, 0.0F));

		PartDefinition right_tusk2 = head.addOrReplaceChild("right_tusk2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 4.0F, -5.25F, 0.0F, 0.7854F, 0.0F));

		right_tusk2.addOrReplaceChild("right_tusk4_r1", CubeListBuilder.create().texOffs(24, 71).mirror().addBox(-4.0F, -5.0F, 4.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5337F, 6.0F, -7.4288F, 0.0F, 0.7854F, 0.0F));

		right_tusk2.addOrReplaceChild("right_tusk4_r2", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-5.0F, -6.0F, 1.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.2837F, 6.25F, -0.6788F, 0.2313F, -0.7854F, 0.0F));

		frostyomper.addOrReplaceChild("leg_1", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(-2.25F, 0.25F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 8).mirror().addBox(-2.75F, 6.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offset(2.5F, -8.0F, -6.5F));

		frostyomper.addOrReplaceChild("leg_2", CubeListBuilder.create().texOffs(60, 17).mirror().addBox(-2.25F, 0.25F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 8).mirror().addBox(-2.75F, 6.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.09F)).mirror(false), PartPose.offset(2.5F, -8.0F, 2.5F));

		frostyomper.addOrReplaceChild("leg_3", CubeListBuilder.create().texOffs(60, 17).addBox(-3.75F, 0.25F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(60, 8).addBox(-4.25F, 6.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.09F)), PartPose.offset(-2.5F, -8.0F, 2.5F));

		frostyomper.addOrReplaceChild("leg_4", CubeListBuilder.create().texOffs(60, 17).addBox(-3.75F, 0.25F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(60, 8).addBox(-4.25F, 6.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(-0.09F)), PartPose.offset(-2.5F, -8.0F, -6.5F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(FrostomperEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		this.root().getAllParts().forEach(ModelPart::resetPose);
		BFTPClientUtil.animateHead(this.head, netHeadYaw, headPitch);
		entity.idleAnimationState.animateIdle(this, BabyFrostomperAnimation.IDLE, ageInTicks, limbSwingAmount, 1.5F);
		entity.tailAnimationState.animate(this, BabyFrostomperAnimation.TAIL, ageInTicks);
		entity.trumpetAnimationState.animate(this, BabyFrostomperAnimation.NOISE, ageInTicks);
		entity.danceAnimationState.animate(this, BabyFrostomperAnimation.DANCE, ageInTicks);
		
		SmoothAnimationState.animateWalk(this, BabyFrostomperAnimation.WALK, limbSwing, limbSwingAmount, 1.5F, 1.5F);
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