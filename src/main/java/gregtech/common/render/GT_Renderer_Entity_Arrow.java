package gregtech.common.render;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import cpw.mods.fml.client.registry.RenderingRegistry;
import gregtech.common.entities.GT_Entity_Arrow;

public class GT_Renderer_Entity_Arrow extends RenderArrow {

    private final ResourceLocation mTexture;

    public GT_Renderer_Entity_Arrow(Class<? extends GT_Entity_Arrow> aArrowClass, String aTextureName) {
        this.mTexture = new ResourceLocation("gregtech:textures/entity/" + aTextureName + ".png");
        RenderingRegistry.registerEntityRenderingHandler(aArrowClass, this);
    }

    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return this.mTexture;
    }
}
