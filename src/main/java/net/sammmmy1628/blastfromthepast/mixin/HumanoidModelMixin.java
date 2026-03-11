package net.sammmmy1628.blastfromthepast.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

@Mixin(HumanoidModel.class)
public abstract class HumanoidModelMixin {

    @Inject(method = "setupAnim*", at = @At("TAIL"))
    private void blastFromThePast$renderRaisedArms(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, CallbackInfo ci) {
        if (entity instanceof Player player) {
            if (player.getFirstPassenger() instanceof SnowdoEntity) {
                HumanoidModel<LivingEntity> model = (HumanoidModel<LivingEntity>) (Object) this;
                blastFromThePast$raiseArms(model);
            }
        }
    }

    @Unique
    private void blastFromThePast$raiseArms(HumanoidModel<?> model) {
        model.rightArm.xRot = -3.1f;
        model.leftArm.xRot = model.rightArm.xRot;
    }
}
