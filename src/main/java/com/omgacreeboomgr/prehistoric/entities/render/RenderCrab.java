package com.omgacreeboomgr.prehistoric.entities.render;

import com.omgacreeboomgr.prehistoric.entities.models.ModelCrab;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderCrab extends RenderLiving
{
	protected ModelCrab Model;
    private static final ResourceLocation crabTexture = new ResourceLocation("preh:textures/models/crab.png");

    public RenderCrab(ModelCrab par1ModelBase, float parShadowSize) {
        super(Minecraft.getMinecraft().getRenderManager(), (ModelBase)par1ModelBase, parShadowSize);
     }

    public void rendercrab(Entity entityLiving, double x, double y, double z, float v, float u)
    {
        super.doRender(entityLiving, x, y, z, v, u);       
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return crabTexture;
    }
}