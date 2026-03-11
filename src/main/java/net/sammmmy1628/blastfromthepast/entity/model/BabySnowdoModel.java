package net.sammmmy1628.blastfromthepast.entity.model;

import org.joml.Vector3f;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.KeyframeAnimations;
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
import net.minecraft.world.entity.AnimationState;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.animation.BabySnowdoAnimation;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

public class BabySnowdoModel<T extends SnowdoEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "baby_snowdo"), "main");

    private final ModelPart root;
    private final ModelPart baby;
    private final ModelPart body;
    private final ModelPart left_wing;
    private final ModelPart right_wing;
    private final ModelPart left_foot;
    private final ModelPart right_foot;

    public BabySnowdoModel(ModelPart root) {
        this.root = root;
        this.baby = root.getChild("baby");
        this.body = this.baby.getChild("body");
        this.left_wing = this.body.getChild("left_wing");
        this.right_wing = this.body.getChild("right_wing");
        this.left_foot = this.baby.getChild("left_foot");
        this.right_foot = this.baby.getChild("right_foot");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition baby = partdefinition.addOrReplaceChild("baby", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = baby.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 1.5F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(8, 6).addBox(0.0F, -1.5F, 2.5F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(8, 13).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -1.0F));

        PartDefinition Body_r1 = body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(17, 15).addBox(-4.0F, -6.725F, -4.025F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 3.0F, -1.0F, -0.7156F, 0.0F, 0.0F));

        PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(14, 11).addBox(-0.75F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-0.75F, -0.25F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -0.5F, -0.5F));

        PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(14, 11).mirror().addBox(-0.25F, -0.25F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 0).mirror().addBox(0.75F, -0.25F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.5F, -0.5F, -0.5F));

        PartDefinition left_foot = baby.addOrReplaceChild("left_foot", CubeListBuilder.create(), PartPose.offset(1.5F, -0.5F, -0.5F));

        PartDefinition LeftFoot_r1 = left_foot.addOrReplaceChild("LeftFoot_r1", CubeListBuilder.create().texOffs(-1, 10).addBox(0.4F, -0.65F, -3.275F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.5F, 0.0F, 0.2051F, -0.5149F, 0.0F));

        PartDefinition right_foot = baby.addOrReplaceChild("right_foot", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.5F, -0.5F));

        PartDefinition RightFoot_r1 = right_foot.addOrReplaceChild("RightFoot_r1", CubeListBuilder.create().texOffs(-1, 10).mirror().addBox(-3.4F, -0.65F, -3.275F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.5F, 0.0F, 0.2051F, 0.5149F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        if (entity.isTripping()) {
            this.animate(entity.tripState, BabySnowdoAnimation.trip, ageInTicks, 1.0F);
            return;
        }

        float idleWeight = 1.0F - Math.min(1.0F, limbSwingAmount * 4.0F);
        float walkWeight = 1.0F - idleWeight;

        if (idleWeight > 0) {
            float idleSpeed = 0.5F;
            this.animateWithWeight(entity.idleState, BabySnowdoAnimation.idle, ageInTicks, idleSpeed, idleWeight);
        }

        if (walkWeight > 0) {
            float walkSpeed = 1.5F;

            this.animateWalkWithWeight(BabySnowdoAnimation.walk, limbSwing, limbSwingAmount, walkSpeed, 2.5F, walkWeight);
        }
    }


    private static final Vector3f ANIMATION_VECTOR_CACHE = new Vector3f();

    protected void animateWithWeight(AnimationState state, AnimationDefinition definition, float ageInTicks, float speed, float weight) {
        state.updateTime(ageInTicks, speed);
        state.ifStarted(s -> {
            KeyframeAnimations.animate(this, definition, s.getAccumulatedTime(), 1.0F * weight, ANIMATION_VECTOR_CACHE);
        });
    }

    protected void animateWalkWithWeight(AnimationDefinition definition, float limbSwing, float limbSwingAmount, float speed, float intensity, float weight) {
        long time = (long)(limbSwing * 50.0F * speed);
        float finalScale = Math.min(limbSwingAmount * intensity, 1.0F) * weight;
        KeyframeAnimations.animate(this, definition, time, finalScale, ANIMATION_VECTOR_CACHE);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        baby.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return root;
    }
}