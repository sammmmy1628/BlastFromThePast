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
import net.minecraft.util.Mth;
import net.minecraft.world.entity.AnimationState;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.animation.SnowdoAnimation;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

public class SnowdoModel<T extends SnowdoEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "snowdo"), "main");

    private float fallSmoothness = 0.0F;

    private final ModelPart root;
    private final ModelPart snowdo;

    public SnowdoModel(ModelPart root) {
        this.root = root;
        this.snowdo = root.getChild("snowdo");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition snowdo = partdefinition.addOrReplaceChild("snowdo", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

        PartDefinition body = snowdo.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

        PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offset(-4.0F, -3.0F, -3.75F));

        right_wing.addOrReplaceChild("right_wing_r1", CubeListBuilder.create().texOffs(22, 20).addBox(1.0F, 0.0F, -1.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.75F, -0.1614F, 0.0F, 0.0611F));

        PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offset(4.0F, -3.0F, -3.75F));

        left_wing.addOrReplaceChild("left_wing_r1", CubeListBuilder.create().texOffs(22, 20).mirror().addBox(-1.0F, 0.0F, -1.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.75F, -0.1614F, 0.0F, -0.0611F));

        body.addOrReplaceChild("tail_knub", CubeListBuilder.create().texOffs(38, 44).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(46, 44).addBox(-2.0F, -5.0F, 1.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 6.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -6.0F, -1.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(38, -6).addBox(0.0F, -9.0F, -1.0F, 0.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 3.0F));

        tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(35, 41).mirror().addBox(2.5F, -16.0F, 4.0F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 8.75F, -1.5F, -0.1309F, 0.3927F, 0.0F));

        tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(35, 41).addBox(-2.5F, -16.0F, 4.0F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 8.75F, -1.5F, -0.1309F, -0.3927F, 0.0F));

        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -4.0F));

        neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(54, 53).addBox(-1.0F, -9.0F, -3.0F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.3752F, 0.0F, 0.0F));

        neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(22, 36).addBox(-1.0F, -9.0F, -3.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2007F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 33).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(38, 0).addBox(-3.0F, 1.0F, -4.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 42).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 51).addBox(-1.0F, -5.0F, -8.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(38, 36).addBox(-1.5F, -3.0F, -10.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(8, 42).addBox(-1.5F, 1.0F, -10.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 1.0F));

        head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(54, 26).addBox(-3.0F, -23.0F, -7.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 15.575F, 0.3F, -0.1833F, 0.0F, 0.0F));

        head.addOrReplaceChild("head_exotic", CubeListBuilder.create().texOffs(5, 45).addBox(-3.0F, -25.4F, -7.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.2F))
                .texOffs(0, 57).addBox(-3.0F, -20.0F, -7.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 21.4F, 3.0F));

        snowdo.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(40, 28).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 25).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(28, 20).addBox(-1.5F, 5.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 5.0F, 0.5F));

        snowdo.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(40, 19).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(40, 28).mirror().addBox(-1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 25).mirror().addBox(-0.5F, 3.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(38, 22).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(28, 20).mirror().addBox(-1.5F, 5.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.5F, 5.0F, 0.5F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(SnowdoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);

        if (entity.isTripping()) {
            this.animate(entity.tripState, SnowdoAnimation.trip, ageInTicks, 1.0F);
            return;
        }

        if (entity.isDancing()) {
            this.animate(entity.danceState, SnowdoAnimation.dance, ageInTicks, 1.0F);
            return;
        }

        float targetFall = entity.isGliding() ? 1.0F : 0.0F;
        this.fallSmoothness = Mth.lerp(0.03F, this.fallSmoothness, targetFall);

        float fallWeight = Math.min(1.0F, this.fallSmoothness * 10.0F);
        this.animateWithWeight(entity.fallState, SnowdoAnimation.fall, ageInTicks, fallWeight);

        float groundRaw = 1.0F - this.fallSmoothness;
        float groundWeight = groundRaw * groundRaw;

        if (groundWeight > 0.01F) {
            float idleWeight = (1.0F - Math.min(1.0F, limbSwingAmount * 4.0F)) * groundWeight;
            float sprintWeight = entity.sprintProgress * groundWeight;
            float walkWeight = (1.0F - entity.sprintProgress) * groundWeight;

            if (idleWeight > 0) {
                this.animateWithWeight(entity.idleState, SnowdoAnimation.idle, ageInTicks, idleWeight);
            }
            if (walkWeight > 0) {
                this.animateWalkWithWeight(SnowdoAnimation.walk, limbSwing, limbSwingAmount, 3.0F, 2.5F, walkWeight);
            }
            if (sprintWeight > 0) {
                this.animateWalkWithWeight(SnowdoAnimation.run, limbSwing, limbSwingAmount, 2.5F, 2.5F, sprintWeight);
            }
        }

        this.animate(entity.sitStartState, SnowdoAnimation.sit_start, ageInTicks, 1.0F);
        this.animate(entity.sitLoopState, SnowdoAnimation.sit, ageInTicks, 1.0F);
        this.animate(entity.sitEndState, SnowdoAnimation.sit_end, ageInTicks, 1.0F);

        this.animate(entity.tailState, SnowdoAnimation.tail, ageInTicks, 1.0F);

        if (entity.isBreaking()) {
            this.animate(entity.breakingState, SnowdoAnimation.breaking, ageInTicks, 1.0F);
        }

        if (entity.isEatingSlice()) {
            this.animate(entity.eatingState, SnowdoAnimation.eat, ageInTicks, 1.0F);
        }
    }

    protected void animateWithWeight(AnimationState state, AnimationDefinition definition, float ageInTicks, float weight) {
        state.updateTime(ageInTicks, 1.0F);
        state.ifStarted(s -> {
            KeyframeAnimations.animate(this, definition, s.getAccumulatedTime(), 1.0F * weight, ANIMATION_VECTOR_CACHE);
        });
    }

    private static final Vector3f ANIMATION_VECTOR_CACHE = new Vector3f();

    protected void animateWalkWithWeight(AnimationDefinition definition, float limbSwing, float limbSwingAmount, float speed, float intensity, float weight) {
        long time = (long)(limbSwing * 50.0F * speed);
        float finalScale = Math.min(limbSwingAmount * intensity, 1.0F) * weight;
        KeyframeAnimations.animate(this, definition, time, finalScale, ANIMATION_VECTOR_CACHE);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        snowdo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return this.root;
    }
}
