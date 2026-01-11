package net.sammmmy1628.blastfromthepast.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.client.model.SnowdoModel;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;

public class SnowdoRenderer extends MobRenderer<SnowdoEntity, SnowdoModel<SnowdoEntity>> {

    private static final ResourceLocation SNOWDO_LOCATION = new ResourceLocation(BlastFromThePast.MOD_ID, "textures/entity/snowdo.png");
    private static final ResourceLocation SNOWDO_SHEARED_LOCATION = new ResourceLocation(BlastFromThePast.MOD_ID, "textures/entity/snowdo_shaved.png");

    public SnowdoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SnowdoModel<>(pContext.bakeLayer(SnowdoModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SnowdoEntity pEntity) {
        if (pEntity.isSheared()) {
            return SNOWDO_SHEARED_LOCATION;
        }
        return SNOWDO_LOCATION;
    }
}