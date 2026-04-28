package net.sammmmy1628.blastfromthepast.entity.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class FrostomperAnimation
{
	public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(2.0F).looping()
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.5F, 0.1902F, 0.2939F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(0.2939F, 0.1618F, 0.5F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(-0.1545F, 0.0F, 0.2939F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(-0.4755F, -0.1618F, -0.1545F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-0.4045F, -0.1902F, -0.4755F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -0.0618F, -0.4045F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(0.4045F, 0.1176F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(1.1756F, 0.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(-0.618F, 0.0F, 1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(-1.9021F, 0.0F, -0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-1.618F, 0.0F, -1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(1.618F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.1756F, 0.0F, -0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(1.1756F, 0.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(-0.618F, 0.0F, 1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-1.9021F, 0.0F, -0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-1.618F, 0.0F, -1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.618F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-0.9271F, 0.0F, -2.8532F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(1.7634F, 0.0F, -0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(3.0F, 0.0F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(1.7634F, 0.0F, 3.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-0.9271F, 0.0F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-2.8532F, 0.0F, -0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(-2.4271F, 0.0F, -2.8532F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition eat = AnimationDefinition.Builder.withLength(1.0F)
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-23.9063F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-23.9063F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-23.9063F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("mouth", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition ears = AnimationDefinition.Builder.withLength(1.0833F)
		.addAnimation("left_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -20.75F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 69.25F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0833F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition tail = AnimationDefinition.Builder.withLength(1.25F)
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-45.3954F, 23.891F, -47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-45.3954F, -23.891F, 47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-45.3954F, 23.891F, -47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-45.3954F, -23.891F, 47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-20.5639F, 35.8085F, -24.6156F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.5639F, -35.8085F, 24.6156F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-20.5639F, 35.8085F, -24.6156F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.5639F, -35.8085F, 24.6156F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-18.1672F, 46.038F, -13.2898F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-18.1672F, -46.038F, 13.2898F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-18.1672F, 46.038F, -13.2898F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-18.1672F, -46.038F, 13.2898F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition trumpet = AnimationDefinition.Builder.withLength(1.5F)
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.75F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.75F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-135.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-135.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(2.0F).looping()
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.9021F, 0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.9861F, 1.4659F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 1.9938F, 1.9483F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.9249F, 2.356F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.782F, 2.673F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 1.5706F, 2.8874F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 1.2989F, 2.9908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 0.9772F, 2.9792F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.618F, 2.8532F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.2351F, 2.6175F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.1569F, 2.2812F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -0.5429F, 1.8573F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -0.908F, 1.362F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -1.2382F, 0.8143F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -1.5208F, 0.2354F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.745F, -0.3526F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -1.9021F, -0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, -1.9861F, -1.4659F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -1.9938F, -1.9483F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, -1.9249F, -2.356F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -1.782F, -2.673F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, -1.5706F, -2.8874F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -1.2989F, -2.9908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, -0.9772F, -2.9792F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -0.618F, -2.8532F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, -0.2351F, -2.6175F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 0.1569F, -2.2812F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, 0.5429F, -1.8573F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.908F, -1.362F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, 1.2382F, -0.8143F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 1.5208F, -0.2354F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 1.745F, 0.3526F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 1.9021F, 0.9271F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-50.0F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-50.048F, -1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(-50.1903F, 1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(-50.4213F, 4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-50.7322F, 6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(-51.1111F, 9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-51.5433F, 11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-52.0123F, 13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-52.5F, 14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(-52.9877F, 14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-53.4567F, 14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(-53.8889F, 14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-54.2678F, 13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(-54.5787F, 11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(-54.8097F, 9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(-54.952F, 7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-55.0F, 4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(-54.952F, 1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(-54.8097F, -1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(-54.5787F, -4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-54.2678F, -6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(-53.8889F, -9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(-53.4567F, -11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(-52.9877F, -13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-52.5F, -14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(-52.0123F, -14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(-51.5433F, -14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(-51.1111F, -14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(-50.7322F, -13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(-50.4213F, -11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(-50.1903F, -9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(-50.048F, -7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(-50.0F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(27.9665F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(23.3361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(18.4815F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(13.5891F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(8.8471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(4.4375F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(-5.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-6.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(-7.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-7.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(-5.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(-3.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(-0.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(7.0335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(11.6639F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(16.5185F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(21.4109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(26.1529F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(30.5625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(34.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(37.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(40.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(41.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(42.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(42.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(40.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(38.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(35.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.5878F, -0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 0.7343F, -0.2351F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.8526F, 0.1569F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 0.9382F, 0.5429F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.9877F, 0.908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.9992F, 1.2382F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.9724F, 1.5208F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 0.9081F, 1.745F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.809F, 1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.6788F, 1.9861F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.5225F, 1.9938F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 0.3461F, 1.9249F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.1564F, 1.782F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.0393F, 1.5706F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -0.2334F, 1.2989F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -0.4187F, 0.9772F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -0.5878F, 0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, -0.7343F, 0.2351F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -0.8526F, -0.1569F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, -0.9382F, -0.5429F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -0.9877F, -0.908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, -0.9992F, -1.2382F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -0.9724F, -1.5208F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, -0.9081F, -1.745F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -0.809F, -1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, -0.6788F, -1.9861F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, -0.5225F, -1.9938F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, -0.3461F, -1.9249F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -0.1564F, -1.782F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, 0.0393F, -1.5706F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.2334F, -1.2989F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 0.4187F, -0.9772F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.5878F, -0.618F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.9511F, 1.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 0.9931F, 1.8163F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.9969F, 1.9447F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 0.9625F, 1.9985F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.891F, 1.9754F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.7853F, 1.8764F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.6494F, 1.7053F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 0.4886F, 1.4686F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.309F, 1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.1175F, 0.8373F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.0785F, 0.4669F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -0.2714F, 0.0785F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -0.454F, -0.3129F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.6191F, -0.6922F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -0.7604F, -1.045F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -0.8725F, -1.3576F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -0.9511F, -1.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, -0.9931F, -1.8163F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -0.9969F, -1.9447F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, -0.9625F, -1.9985F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -0.891F, -1.9754F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, -0.7853F, -1.8764F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -0.6494F, -1.7053F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, -0.4886F, -1.4686F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -0.309F, -1.1756F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, -0.1175F, -0.8373F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 0.0785F, -0.4669F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, 0.2714F, -0.0785F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.454F, 0.3129F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, 0.6191F, 0.6922F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 0.7604F, 1.045F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 0.8725F, 1.3576F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.9511F, 1.618F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, 1.2361F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.8163F, 1.9545F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 1.9447F, 2.5978F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.9985F, 3.1413F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.9754F, 3.564F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 1.8764F, 3.8498F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 1.7053F, 3.9877F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 1.4686F, 3.9723F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 1.1756F, 3.8042F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.8373F, 3.49F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.4669F, 3.0416F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 0.0785F, 2.4764F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -0.3129F, 1.816F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.6922F, 1.0858F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -1.045F, 0.3138F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.3576F, -0.4701F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -1.618F, -1.2361F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, -1.8163F, -1.9545F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -1.9447F, -2.5978F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, -1.9985F, -3.1413F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -1.9754F, -3.564F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, -1.8764F, -3.8498F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -1.7053F, -3.9877F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, -1.4686F, -3.9723F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -1.1756F, -3.8042F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, -0.8373F, -3.49F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, -0.4669F, -3.0416F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, -0.0785F, -2.4764F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, 0.3129F, -1.816F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, 0.6922F, -1.0858F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, 1.045F, -0.3138F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 1.3576F, 0.4701F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, 1.2361F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.2361F, -1.8541F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.9545F, -0.7052F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 2.5978F, 0.4708F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 3.1413F, 1.6286F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 3.564F, 2.7239F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 3.8498F, 3.7146F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 3.9877F, 4.5624F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 3.9723F, 5.235F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 3.8042F, 5.7063F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 3.49F, 5.9584F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 3.0416F, 5.9815F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 2.4764F, 5.7747F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 1.816F, 5.346F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 1.0858F, 4.7119F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.3138F, 3.8967F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -0.4701F, 2.9317F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -1.2361F, 1.8541F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, -1.9545F, 0.7052F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -2.5978F, -0.4708F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, -3.1413F, -1.6286F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -3.564F, -2.7239F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, -3.8498F, -3.7146F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -3.9877F, -4.5624F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, -3.9723F, -5.235F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -3.8042F, -5.7063F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, -3.49F, -5.9584F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, -3.0416F, -5.9815F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, -2.4764F, -5.7747F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -1.816F, -5.346F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, -1.0858F, -4.7119F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, -0.3138F, -3.8967F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, 0.4701F, -2.9317F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 1.2361F, -1.8541F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(27.9665F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(23.3361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(18.4815F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(13.5891F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(8.8471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(4.4375F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(-5.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-6.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(-7.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-7.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(-5.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(-3.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(-0.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(7.0335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(11.6639F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(16.5185F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(21.4109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(26.1529F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(30.5625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(34.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(37.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(40.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(41.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(42.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(42.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(40.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(38.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(35.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(7.0335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(11.6639F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(16.5185F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(21.4109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(26.1529F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(30.5625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(34.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(37.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(40.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(41.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(42.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(42.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(40.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(38.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(35.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(27.9665F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(23.3361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(18.4815F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(13.5891F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(8.8471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(4.4375F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-2.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(-5.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(-6.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(-7.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(-7.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(-5.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(-3.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(-0.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(7.0335F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(11.6639F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(16.5185F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(21.4109F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(26.1529F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(30.5625F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(34.47F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(37.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(40.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(41.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(42.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(42.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(40.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(38.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(35.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(32.1946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(27.9665F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(23.3361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(18.4815F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(13.5891F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(8.8471F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(4.4375F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.53F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-2.7254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(-5.2036F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(-6.8092F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(-7.4807F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(-7.1922F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(-5.9548F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(-3.816F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(-0.8581F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(2.8054F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.5F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(2.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -3.2361F, -2.1631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -3.6326F, -3.4203F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -3.8895F, -4.5461F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -3.9969F, -5.4972F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -3.9508F, -6.237F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -3.7528F, -6.7372F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -3.4106F, -6.9784F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -2.9373F, -6.9515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -2.3511F, -6.6574F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -1.6746F, -6.1075F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.9338F, -5.3228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -0.157F, -4.3337F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.6257F, -3.1779F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 1.3845F, -1.9001F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 2.09F, -0.5492F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 2.7152F, 0.8228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 3.2361F, 2.1631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, 3.6326F, 3.4203F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 3.8895F, 4.5461F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, 3.9969F, 5.4972F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 3.9508F, 6.237F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, 3.7528F, 6.7372F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 3.4106F, 6.9784F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, 2.9373F, 6.9515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 2.3511F, 6.6574F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, 1.6746F, 6.1075F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 0.9338F, 5.3228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, 0.157F, 4.3337F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -0.6257F, 3.1779F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, -1.3845F, 1.9001F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, -2.09F, 0.5492F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, -2.7152F, -0.8228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -3.2361F, -2.1631F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -3.2361F, -2.1631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -3.6326F, -3.4203F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -3.8895F, -4.5461F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -3.9969F, -5.4972F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -3.9508F, -6.237F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -3.7528F, -6.7372F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -3.4106F, -6.9784F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -2.9373F, -6.9515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -2.3511F, -6.6574F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -1.6746F, -6.1075F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.9338F, -5.3228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -0.157F, -4.3337F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.6257F, -3.1779F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 1.3845F, -1.9001F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 2.09F, -0.5492F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 2.7152F, 0.8228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 3.2361F, 2.1631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(0.0F, 3.6326F, 3.4203F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 3.8895F, 4.5461F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(0.0F, 3.9969F, 5.4972F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 3.9508F, 6.237F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(0.0F, 3.7528F, 6.7372F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, 3.4106F, 6.9784F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(0.0F, 2.9373F, 6.9515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 2.3511F, 6.6574F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(0.0F, 1.6746F, 6.1075F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, 0.9338F, 5.3228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(0.0F, 0.157F, 4.3337F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -0.6257F, 3.1779F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(0.0F, -1.3845F, 1.9001F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, -2.09F, 0.5492F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(0.0F, -2.7152F, -0.8228F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -3.2361F, -2.1631F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-27.5F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-27.548F, -1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(-27.6903F, 1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(-27.9213F, 4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-28.2322F, 6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(-28.6111F, 9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-29.0433F, 11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-29.5123F, 13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.0F, 14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(-30.4877F, 14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-30.9567F, 14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(-31.3889F, 14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-31.7678F, 13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(-32.0787F, 11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(-32.3097F, 9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(-32.452F, 7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-32.5F, 4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(-32.452F, 1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(-32.3097F, -1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(-32.0787F, -4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-31.7678F, -6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(-31.3889F, -9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(-30.9567F, -11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(-30.4877F, -13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-30.0F, -14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(-29.5123F, -14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(-29.0433F, -14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(-28.6111F, -14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(-28.2322F, -13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(-27.9213F, -11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(-27.6903F, -9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(-27.548F, -7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(-27.5F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-10.0F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-10.048F, -1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(-10.1903F, 1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(-10.4213F, 4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-10.7322F, 6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(-11.1111F, 9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-11.5433F, 11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-12.0123F, 13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(-12.9877F, 14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-13.4567F, 14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(-13.8889F, 14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-14.2678F, 13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(-14.5787F, 11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(-14.8097F, 9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(-14.952F, 7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-15.0F, 4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0625F, KeyframeAnimations.degreeVec(-14.952F, 1.7631F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(-14.8097F, -1.1769F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.1875F, KeyframeAnimations.degreeVec(-14.5787F, -4.0716F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-14.2678F, -6.8099F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.3125F, KeyframeAnimations.degreeVec(-13.8889F, -9.2864F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(-13.4567F, -11.4061F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.4375F, KeyframeAnimations.degreeVec(-12.9877F, -13.0874F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-12.5F, -14.2658F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5625F, KeyframeAnimations.degreeVec(-12.0123F, -14.896F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(-11.5433F, -14.9538F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.6875F, KeyframeAnimations.degreeVec(-11.1111F, -14.4368F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(-10.7322F, -13.3651F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8125F, KeyframeAnimations.degreeVec(-10.4213F, -11.7798F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(-10.1903F, -9.7417F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.9375F, KeyframeAnimations.degreeVec(-10.048F, -7.3293F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(-10.0F, -4.6353F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition charge = AnimationDefinition.Builder.withLength(0.5F).looping()
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(3.141F, 0.6586F, -1.2934F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(4.4462F, 1.8226F, -2.0564F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.9346F, 1.9427F, -2.5535F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(6.7344F, 0.9486F, -2.4934F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(6.3771F, -0.5774F, -1.9114F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(5.0719F, -1.7414F, -1.1484F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(3.5835F, -1.8615F, -0.6513F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(2.7837F, -0.8674F, -0.7114F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(3.141F, 0.6586F, -1.2934F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.posVec(0.0F, 0.7071F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.posVec(0.0F, -0.7071F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.posVec(0.0F, -0.7071F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.posVec(0.0F, 0.7071F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-26.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(10.4604F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(61.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(53.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(24.5396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.809F, 0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -0.9877F, 1.782F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -0.5878F, 1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 0.1564F, 0.908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.809F, -0.618F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.9877F, -1.782F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.5878F, -1.9021F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -0.1564F, -0.908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -0.809F, 0.618F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -13.0F, -4.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(61.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(53.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(24.5396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(-26.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-18.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(10.4604F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-26.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(-18.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(10.4604F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(61.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(53.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(24.5396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg2", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(61.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(53.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(24.5396F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-8.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(-26.946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-18.9058F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(10.4604F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(43.9503F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.2361F, -6.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 3.564F, -1.2515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 3.8042F, 4.7023F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.816F, 7.9015F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -1.2361F, 6.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -3.564F, 1.2515F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -3.8042F, -4.7023F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -1.816F, -7.9015F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 1.2361F, -6.4721F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(22.5F, -3.2361F, 2.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(22.5F, -0.6257F, -3.6319F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(22.5F, 2.3511F, -7.6085F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(22.5F, 3.9508F, -7.1281F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(22.5F, 3.2361F, -2.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(22.5F, 0.6257F, 3.6319F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(22.5F, -2.3511F, 7.6085F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(22.5F, -3.9508F, 7.1281F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.5F, -3.2361F, 2.4721F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(22.5F, 1.2361F, 2.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(22.5F, -1.816F, 7.1281F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(22.5F, -3.8042F, 7.6085F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(22.5F, -3.564F, 3.6319F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(22.5F, -1.2361F, -2.4721F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(22.5F, 1.816F, -7.1281F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(22.5F, 3.8042F, -7.6085F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(22.5F, 3.564F, -3.6319F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(22.5F, 1.2361F, 2.4721F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-1.5643F, 8.9101F, -19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.8779F, 9.5106F, -11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(9.8769F, 4.5399F, 3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(8.0902F, -3.0902F, 16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(1.5643F, -8.9101F, 19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-5.8779F, -9.5106F, 11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-9.8769F, -4.5399F, -3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("left_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.6631F, -4.3262F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.095F, 6.3559F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -4.1145F, 13.3148F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -6.9138F, 12.4741F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -5.6631F, 4.3262F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -1.095F, -6.3559F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 4.1145F, -13.3148F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 6.9138F, -12.4741F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 5.6631F, -4.3262F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.6631F, -4.3262F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.095F, 6.3559F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -4.1145F, 13.3148F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -6.9138F, 12.4741F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -5.6631F, 4.3262F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -1.095F, -6.3559F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 4.1145F, -13.3148F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 6.9138F, -12.4741F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 5.6631F, -4.3262F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-1.5643F, 8.9101F, -19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.8779F, 9.5106F, -11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(9.8769F, 4.5399F, 3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(8.0902F, -3.0902F, 16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(1.5643F, -8.9101F, 19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-5.8779F, -9.5106F, 11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-9.8769F, -4.5399F, -3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(-1.5643F, 8.9101F, -19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(5.8779F, 9.5106F, -11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(9.8769F, 4.5399F, 3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(8.0902F, -3.0902F, 16.1803F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(1.5643F, -8.9101F, 19.7538F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(-5.8779F, -9.5106F, 11.7557F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(-9.8769F, -4.5399F, -3.1287F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-8.0902F, 3.0902F, -16.1803F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition stomp = AnimationDefinition.Builder.withLength(1.0F)
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.2509F, -0.738F, 6.6335F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-1.0527F, 0.4993F, -6.393F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-1.0527F, 0.4993F, -6.393F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-48.159F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-48.159F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-48.159F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(-4.0F, 12.0F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.posVec(-4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.posVec(-4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.501F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.5F, 25.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(14.5362F, 18.2345F, -1.9341F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(26.057F, -22.8402F, -24.7007F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, 1.6826F, 7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-6.9174F, 3.8787F, 17.0779F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.6819F, 1.5511F, -13.3559F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, 1.6826F, 7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-6.9174F, 3.8787F, 17.0779F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.4483F, 2.0181F, -5.8668F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, 1.6826F, 7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-7.5374F, -2.4584F, -30.0256F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.6819F, 1.5511F, -13.3559F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-30.0F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.0F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-30.0F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.5F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-12.5F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition stomp_flipped = AnimationDefinition.Builder.withLength(1.0F)
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.2509F, 0.738F, -6.6335F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-1.0527F, -0.4993F, 6.393F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(-1.0527F, -0.4993F, 6.393F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-48.159F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-48.159F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-48.159F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(4.0F, 12.0F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.posVec(4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.posVec(4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.501F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-7.5F, -25.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(14.5362F, -18.2345F, 1.9341F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(26.057F, 22.8402F, 24.7007F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, -1.6826F, -7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-6.9174F, -3.8787F, -17.0779F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.6819F, -1.5511F, 13.3559F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, -1.6826F, -7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-6.9174F, -3.8787F, -17.0779F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.4483F, -2.0181F, 5.8668F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-14.8925F, -1.6826F, -7.3099F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(-7.5374F, 2.4584F, 30.0256F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.8333F, KeyframeAnimations.degreeVec(-3.6819F, -1.5511F, 13.3559F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-30.0F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.0F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-30.0F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.5F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, -36.1198F, -11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7083F, KeyframeAnimations.degreeVec(-12.5F, 36.1198F, 11.1629F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition crush = AnimationDefinition.Builder.withLength(1.0F)
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-22.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(12.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 2.9F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -3.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-70.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(-4.0F, 17.0F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.posVec(-4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.posVec(-4.0F, -2.25F, -4.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.501F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, -17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(4.0F, 17.0F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.posVec(4.0F, -2.25F, -8.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.posVec(4.0F, -2.25F, -4.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.SCALE, 
			new Keyframe(0.5F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.501F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.7917F, KeyframeAnimations.scaleVec(1.2F, 0.9F, 1.2F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.scaleVec(1.0F, 1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5417F, KeyframeAnimations.degreeVec(22.5193F, -2.3096F, 24.0428F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -72.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_ear", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5417F, KeyframeAnimations.degreeVec(22.5193F, 2.3096F, -24.0428F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.6667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 72.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -25.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-122.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-150.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-40.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5417F, KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition fling = AnimationDefinition.Builder.withLength(0.75F)
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(26.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-38.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, -19.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-147.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-15.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg0", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("leg1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_extinct", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail_exotic", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition dance = AnimationDefinition.Builder.withLength(1.0F).looping()
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.9447F, -1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 1.9754F, -0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.7053F, 0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.1756F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.4669F, 2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -0.3129F, 2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -1.045F, 2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -1.618F, 2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -1.9447F, 1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -1.9754F, 0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -1.7053F, -0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -1.1756F, -1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.4669F, -2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.3129F, -2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 1.045F, -2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, -0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 1.9447F, 0.2354F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 1.9754F, 1.362F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.7053F, 2.2812F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.1756F, 2.8532F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.4669F, 2.9908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -0.3129F, 2.673F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -1.045F, 1.9483F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -1.618F, 0.9271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -1.9447F, -0.2354F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -1.9754F, -1.362F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -1.7053F, -2.2812F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -1.1756F, -2.8532F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.4669F, -2.9908F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 0.3129F, -2.673F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 1.045F, -1.9483F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 1.618F, -0.9271F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.309F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.posVec(0.0F, 0.891F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.9511F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.posVec(0.0F, 0.454F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.309F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.posVec(0.0F, -0.891F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, -0.9511F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.posVec(0.0F, -0.454F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.309F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.posVec(0.0F, 0.891F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.9511F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.posVec(0.0F, 0.454F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -0.309F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.posVec(0.0F, -0.891F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, -0.9511F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.posVec(0.0F, -0.454F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.309F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -0.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 0.1569F, -1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.908F, -0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 1.5208F, 0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.9021F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 1.9938F, 2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 1.782F, 2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 1.2989F, 2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.618F, 2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -0.1569F, 1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.908F, 0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -1.5208F, -0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -1.9021F, -1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -1.9938F, -2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -1.782F, -2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.2989F, -2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -0.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -1.618F, -3.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -1.045F, -2.7716F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -0.3129F, -2.1213F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, 0.4669F, -1.1481F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 1.1756F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 1.7053F, 1.1481F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 1.9754F, 2.1213F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 1.9447F, 2.7716F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 1.618F, 3.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 1.045F, 2.7716F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.3129F, 2.1213F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, -0.4669F, 1.1481F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -1.1756F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -1.7053F, -1.1481F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -1.9754F, -2.1213F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.9447F, -2.7716F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -1.618F, -3.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -2.0F, -2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -1.8478F, -2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -1.4142F, -2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -0.7654F, -2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, 0.7654F, -0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 1.4142F, 0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 1.8478F, 1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 2.0F, 2.4271F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 1.8478F, 2.9171F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 1.4142F, 2.9631F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 0.7654F, 2.5579F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, -0.7654F, 0.7003F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -1.4142F, -0.4693F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.8478F, -1.5675F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -2.0F, -2.4271F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition spin = AnimationDefinition.Builder.withLength(4.0F)
		.addAnimation("frostomper", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -11.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -22.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -33.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -45.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -56.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, -67.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -78.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -90.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, -101.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, -112.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.0F, -123.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, -135.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.625F, KeyframeAnimations.degreeVec(0.0F, -146.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.75F, KeyframeAnimations.degreeVec(0.0F, -157.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.875F, KeyframeAnimations.degreeVec(0.0F, -168.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.125F, KeyframeAnimations.degreeVec(0.0F, -191.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.25F, KeyframeAnimations.degreeVec(0.0F, -202.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.375F, KeyframeAnimations.degreeVec(0.0F, -213.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, -225.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.625F, KeyframeAnimations.degreeVec(0.0F, -236.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, -247.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(2.875F, KeyframeAnimations.degreeVec(0.0F, -258.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.0F, KeyframeAnimations.degreeVec(0.0F, -270.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.125F, KeyframeAnimations.degreeVec(0.0F, -281.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.25F, KeyframeAnimations.degreeVec(0.0F, -292.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.375F, KeyframeAnimations.degreeVec(0.0F, -303.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.5F, KeyframeAnimations.degreeVec(0.0F, -315.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.625F, KeyframeAnimations.degreeVec(0.0F, -326.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.75F, KeyframeAnimations.degreeVec(0.0F, -337.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(3.875F, KeyframeAnimations.degreeVec(0.0F, -348.75F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(4.0F, KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();
}