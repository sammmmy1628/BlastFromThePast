package net.sammmmy1628.blastfromthepast.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.AnimationState;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.client.animation.SnowdoAnimation;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;
import org.joml.Vector3f;

public class SnowdoModel<T extends SnowdoEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(BlastFromThePast.MOD_ID, "snowdo"), "main");

    private final ModelPart root;
    private final ModelPart snowdo;
    private final ModelPart body;
    private final ModelPart right_wing;
    private final ModelPart left_wing;
    private final ModelPart tail_knub;
    private final ModelPart tail;
    private final ModelPart neck;
    private final ModelPart head;
    private final ModelPart head_exotic;
    private final ModelPart right_leg;
    private final ModelPart left_leg;

    public SnowdoModel(ModelPart root) {
        this.root = root;
        this.snowdo = root.getChild("snowdo");
        this.body = this.snowdo.getChild("body");
        this.right_wing = this.body.getChild("right_wing");
        this.left_wing = this.body.getChild("left_wing");
        this.tail_knub = this.body.getChild("tail_knub");
        this.tail = this.body.getChild("tail");
        this.neck = this.body.getChild("neck");
        this.head = this.neck.getChild("head");
        this.head_exotic = this.head.getChild("head_exotic");
        this.right_leg = this.snowdo.getChild("right_leg");
        this.left_leg = this.snowdo.getChild("left_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition snowdo = partdefinition.addOrReplaceChild("snowdo", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, 0.0F));

        PartDefinition body = snowdo.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -5.0F, 8.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

        PartDefinition right_wing = body.addOrReplaceChild("right_wing", CubeListBuilder.create(), PartPose.offset(-4.0F, -3.0F, -3.75F));

        PartDefinition right_wing_r1 = right_wing.addOrReplaceChild("right_wing_r1", CubeListBuilder.create().texOffs(22, 20).addBox(1.0F, 0.0F, -1.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.75F, -0.1614F, 0.0F, 0.0611F));

        PartDefinition left_wing = body.addOrReplaceChild("left_wing", CubeListBuilder.create(), PartPose.offset(4.0F, -3.0F, -3.75F));

        PartDefinition left_wing_r1 = left_wing.addOrReplaceChild("left_wing_r1", CubeListBuilder.create().texOffs(22, 20).mirror().addBox(-1.0F, 0.0F, -1.0F, 0.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.0F, 0.75F, -0.1614F, 0.0F, -0.0611F));

        PartDefinition tail_knub = body.addOrReplaceChild("tail_knub", CubeListBuilder.create().texOffs(38, 44).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(46, 44).addBox(-2.0F, -5.0F, 1.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0F, 6.0F, -0.3927F, 0.0F, 0.0F));

        PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -6.0F, -1.0F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(38, -6).addBox(0.0F, -9.0F, -1.0F, 0.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 3.0F));

        PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(35, 41).mirror().addBox(2.5F, -16.0F, 4.0F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 8.75F, -1.5F, -0.1309F, 0.3927F, 0.0F));

        PartDefinition tail_r2 = tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(35, 41).addBox(-2.5F, -16.0F, 4.0F, 0.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8F, 8.75F, -1.5F, -0.1309F, -0.3927F, 0.0F));

        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -4.0F));

        PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(54, 53).addBox(-1.0F, -9.0F, -3.0F, 3.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, -0.3752F, 0.0F, 0.0F));

        PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(22, 36).addBox(-1.0F, -9.0F, -3.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2007F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 33).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(38, 0).addBox(-3.0F, 1.0F, -4.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 42).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 51).addBox(-1.0F, -5.0F, -8.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(38, 36).addBox(-1.5F, -3.0F, -10.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(8, 42).addBox(-1.5F, 1.0F, -10.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 1.0F));

        PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(54, 26).addBox(-3.0F, -23.0F, -7.0F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 15.575F, 0.3F, -0.1833F, 0.0F, 0.0F));

        PartDefinition head_exotic = head.addOrReplaceChild("head_exotic", CubeListBuilder.create().texOffs(5, 45).addBox(-3.0F, -25.4F, -7.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.2F))
                .texOffs(0, 57).addBox(-3.0F, -20.0F, -7.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offset(0.0F, 21.4F, 3.0F));

        PartDefinition right_leg = snowdo.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(40, 19).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(40, 28).addBox(-1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 25).addBox(-0.5F, 3.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(28, 20).addBox(-1.5F, 5.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(38, 22).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 5.0F, 0.5F));

        PartDefinition left_leg = snowdo.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(40, 19).mirror().addBox(-1.5F, 0.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
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

        this.animate(entity.fallState, SnowdoAnimation.fall, ageInTicks, 1f);

        float idleWeight = 1.0F - Math.min(1.0F, limbSwingAmount * 4.0F);

        float sprintWeight = entity.sprintProgress;

        float walkWeight = 1.0F - sprintWeight;

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
