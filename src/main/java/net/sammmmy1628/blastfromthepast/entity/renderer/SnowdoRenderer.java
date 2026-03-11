package net.sammmmy1628.blastfromthepast.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.entity.model.BabySnowdoModel;
import net.sammmmy1628.blastfromthepast.entity.model.SnowdoModel;

public class SnowdoRenderer extends MobRenderer<SnowdoEntity, EntityModel<SnowdoEntity>> {

    private static final ResourceLocation SNOWDO_LOCATION = ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "textures/entity/snowdo.png");
    private static final ResourceLocation SNOWDO_SHEARED_LOCATION = ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "textures/entity/snowdo_shaved.png");
    private static final ResourceLocation SNOWDO_BABY_LOCATION = ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "textures/entity/snowdo_baby.png");

    private final EntityModel<SnowdoEntity> adultModel;
    private final EntityModel<SnowdoEntity> babyModel;

    public SnowdoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SnowdoModel<>(pContext.bakeLayer(SnowdoModel.LAYER_LOCATION)), 0.5f);

        // Guardamos las referencias a ambos modelos
        this.adultModel = this.model;
        this.babyModel = new BabySnowdoModel<>(pContext.bakeLayer(BabySnowdoModel.LAYER_LOCATION));
    }

    @Override
    public void render(SnowdoEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

        if (pEntity.isBaby()) {
            this.model = this.babyModel;
        } else {
            this.model = this.adultModel;
            pMatrixStack.scale(1.0F, 1.0F, 1.0F);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(SnowdoEntity pEntity) {
        if (pEntity.isBaby()) {
            return SNOWDO_BABY_LOCATION;
        }
        if (pEntity.isSheared()) {
            return SNOWDO_SHEARED_LOCATION;
        }
        return SNOWDO_LOCATION;
    }
}