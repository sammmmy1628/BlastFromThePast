package net.sammmmy1628.blastfromthepast.entity.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class BabyFrostomperAnimation 
{
	public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(2.0F).looping()
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.9021F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(-1.618F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(1.618F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(1.9021F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.618F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(-1.1756F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-59.6468F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(-60.0729F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(-62.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(-64.9271F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-65.3532F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-63.4271F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(-60.7366F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.2361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(-3.8042F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(-1.2361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(2.3511F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(2.3511F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(-1.2361F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.809F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(0.9511F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(0.309F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(-0.5878F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(-0.5878F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(0.309F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, 
			new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.2F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.posVec(0.0F, 0.1176F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.posVec(0.0F, -0.0618F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.posVec(0.0F, -0.1902F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.posVec(0.0F, -0.1618F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.posVec(0.0F, 0.1618F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.3F, KeyframeAnimations.degreeVec(-0.5878F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.6F, KeyframeAnimations.degreeVec(0.309F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(0.9F, KeyframeAnimations.degreeVec(0.9511F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.809F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
			new Keyframe(1.8F, KeyframeAnimations.degreeVec(-0.809F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(1.5F).looping()
			.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.0F, 0.0F, -1.3383F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-1.7321F, 0.0F, -1.9021F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, -1.9563F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.4863F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(1.0F, 0.0F, -0.618F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(1.7321F, 0.0F, 0.4158F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(2.0F, 0.0F, 1.3383F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(1.7321F, 0.0F, 1.9021F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(1.0F, 0.0F, 1.9563F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 1.4863F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-1.0F, 0.0F, 0.618F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-1.7321F, 0.0F, -0.4158F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-2.0F, 0.0F, -1.3383F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-3.6542F, 0.0F, -1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-3.9781F, 0.0F, -2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-3.2361F, 0.0F, -3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(-1.6269F, 0.0F, -3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.4181F, 0.0F, -2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(2.3511F, 0.0F, -0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(3.6542F, 0.0F, 1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(3.9781F, 0.0F, 2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(3.2361F, 0.0F, 3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(1.6269F, 0.0F, 3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-0.4181F, 0.0F, 2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-2.3511F, 0.0F, 0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-3.6542F, 0.0F, -1.2361F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(1.3383F, 0.0F, 2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(1.9021F, 0.0F, 1.7321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(1.9563F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(1.4863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.618F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(-0.4158F, 0.0F, -1.7321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(-1.3383F, 0.0F, -2.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(-1.9021F, 0.0F, -1.7321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-1.9563F, 0.0F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-1.4863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-0.618F, 0.0F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(0.4158F, 0.0F, 1.7321F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(1.3383F, 0.0F, 2.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.433F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -0.433F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, -0.433F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 0.433F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-58.4852F, 0.0F, -1.2543F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-56.6311F, 0.0F, 9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-60.6459F, 0.0F, 10.9625F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(-66.5148F, 0.0F, 1.2543F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-68.3689F, 0.0F, -9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(-64.3541F, 0.0F, -10.9625F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(-58.4852F, 0.0F, -1.2543F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(-56.6311F, 0.0F, 9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-60.6459F, 0.0F, 10.9625F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-66.5148F, 0.0F, 1.2543F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-68.3689F, 0.0F, -9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-64.3541F, 0.0F, -10.9625F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-58.4852F, 0.0F, -1.2543F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("trunk_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.6765F, 0.0F, 0.4181F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-3.8042F, 0.0F, -1.6269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-3.9126F, 0.0F, -3.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(-2.9726F, 0.0F, -3.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-1.2361F, 0.0F, -3.6542F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.8316F, 0.0F, -2.3511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(2.6765F, 0.0F, -0.4181F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(3.8042F, 0.0F, 1.6269F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(3.9126F, 0.0F, 3.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(2.9726F, 0.0F, 3.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(1.2361F, 0.0F, 3.6542F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-0.8316F, 0.0F, 2.3511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-2.6765F, 0.0F, 0.4181F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_1", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-21.6506F, 0.0F, 3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(21.6506F, 0.0F, -0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(25.0F, 0.0F, -2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(21.6506F, 0.0F, -3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, -1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-21.6506F, 0.0F, 0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 2.6765F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_1", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.3309F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0489F, -0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0219F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.2569F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.691F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 1.2079F, 0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 1.6691F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.9511F, 0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.9781F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 1.7431F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 1.309F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 0.7921F, -0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.3309F, -1.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_4", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(21.6506F, 0.0F, 3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(12.5F, 0.0F, 3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, 1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(-21.6506F, 0.0F, -0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, -2.6765F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(-21.6506F, 0.0F, -3.8042F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-12.5F, 0.0F, -3.9126F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -2.9726F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(12.5F, 0.0F, -1.2361F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(21.6506F, 0.0F, 0.8316F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 2.6765F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_4", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.6691F, 1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 1.9511F, 0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.9781F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 1.7431F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.309F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.7921F, -0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.3309F, -1.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0489F, -0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0219F, -0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.2569F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.691F, 0.5F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 1.2079F, 0.866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 1.6691F, 1.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_2", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(24.863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(20.2254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(10.1684F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(-2.6132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(-14.6946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(-22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(-24.863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(-20.2254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(-10.1684F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(2.6132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(14.6946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_2", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 1.6691F, 0.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 1.9511F, 0.9511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.9781F, 0.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 1.7431F, 0.7431F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 1.309F, 0.309F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 0.7921F, -0.2079F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.3309F, -0.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 0.0489F, -0.9511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0219F, -0.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.2569F, -0.7431F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.691F, -0.309F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 1.2079F, 0.2079F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 1.6691F, 0.6691F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_3", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(-22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(-24.863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(-20.2254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(-10.1684F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(2.6132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(14.6946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(24.863F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(20.2254F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.degreeVec(10.1684F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.degreeVec(-2.6132F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.degreeVec(-14.6946F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.degreeVec(-22.8386F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("leg_3", new AnimationChannel(AnimationChannel.Targets.POSITION, 
				new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.3309F, -0.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, 0.0489F, -0.9511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0219F, -0.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.2569F, -0.7431F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 0.691F, -0.309F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, 1.2079F, 0.2079F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 1.6691F, 0.6691F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, 1.9511F, 0.9511F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 1.9781F, 0.9781F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 1.7431F, 0.7431F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 1.309F, 0.309F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, 0.7921F, -0.2079F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.3309F, -0.6691F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AnimationDefinition TAIL = AnimationDefinition.Builder.withLength(1.25F)
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-45.3954F, 23.891F, -47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.5F, KeyframeAnimations.degreeVec(-45.3954F, -23.891F, 47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.75F, KeyframeAnimations.degreeVec(-45.3954F, 23.891F, -47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.0F, KeyframeAnimations.degreeVec(-45.3954F, -23.891F, 47.5254F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(1.25F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AnimationDefinition NOISE = AnimationDefinition.Builder.withLength(0.4167F)
		.addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-46.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("trunk", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.25F, KeyframeAnimations.degreeVec(-46.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(-75.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("trunk_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
			new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.2083F, KeyframeAnimations.degreeVec(-46.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
			new Keyframe(0.4167F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
		))
		.build();
	
	public static final AnimationDefinition DANCE = AnimationDefinition.Builder.withLength(1.0F).looping()
			.addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -1.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -1.9447F, -1.5675F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -1.9754F, -0.4693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -1.7053F, 0.7003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -1.1756F, 1.7634F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -0.4669F, 2.5579F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, 0.3129F, 2.9631F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, 1.045F, 2.9171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 1.618F, 2.4271F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 1.9447F, 1.5675F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 1.9754F, 0.4693F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 1.7053F, -0.7003F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 1.1756F, -1.7634F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 0.4669F, -2.5579F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, -0.3129F, -2.9631F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, -1.045F, -2.9171F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, -1.618F, -2.4271F), AnimationChannel.Interpolations.LINEAR)
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
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 1.8541F, -9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, -0.4708F, -6.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, -2.7239F, -1.8772F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -4.5624F, 2.8013F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -5.7063F, 7.0534F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -5.9815F, 10.2317F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -5.346F, 11.8523F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -3.8967F, 11.6684F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -1.8541F, 9.7082F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, 0.4708F, 6.27F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 2.7239F, 1.8772F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 4.5624F, -2.8013F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 5.7063F, -7.0534F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 5.9815F, -10.2317F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 5.346F, -11.8523F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 3.8967F, -11.6684F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 1.8541F, -9.7082F), AnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("trunk_tip", new AnimationChannel(AnimationChannel.Targets.ROTATION, 
				new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 4.8541F, -12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.0625F, KeyframeAnimations.degreeVec(0.0F, 3.135F, -11.0866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.125F, KeyframeAnimations.degreeVec(0.0F, 0.9386F, -8.4853F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.1875F, KeyframeAnimations.degreeVec(0.0F, -1.4007F, -4.5922F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, -3.5267F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.3125F, KeyframeAnimations.degreeVec(0.0F, -5.1158F, 4.5922F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.375F, KeyframeAnimations.degreeVec(0.0F, -5.9261F, 8.4853F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.4375F, KeyframeAnimations.degreeVec(0.0F, -5.8342F, 11.0866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -4.8541F, 12.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.5625F, KeyframeAnimations.degreeVec(0.0F, -3.135F, 11.0866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, -0.9386F, 8.4853F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.6875F, KeyframeAnimations.degreeVec(0.0F, 1.4007F, 4.5922F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 3.5267F, 0.0F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.8125F, KeyframeAnimations.degreeVec(0.0F, 5.1158F, -4.5922F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.875F, KeyframeAnimations.degreeVec(0.0F, 5.9261F, -8.4853F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(0.9375F, KeyframeAnimations.degreeVec(0.0F, 5.8342F, -11.0866F), AnimationChannel.Interpolations.LINEAR),
				new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 4.8541F, -12.0F), AnimationChannel.Interpolations.LINEAR)
			))
			.build();
}