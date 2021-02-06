package com.Nikodemis_.fluffy.client.render;

import com.Nikodemis_.fluffy.Fluffy;
import com.Nikodemis_.fluffy.client.model.ShihTzuModel;
import com.Nikodemis_.fluffy.entities.ShihTzuEntinty;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ShihTzuRender extends MobRenderer<ShihTzuEntinty, ShihTzuModel<ShihTzuEntinty>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Fluffy.MOD_ID, "textures/entity/shihtzu.png");

    public ShihTzuRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ShihTzuModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(ShihTzuEntinty entity) {
        return TEXTURE;
    }
}
