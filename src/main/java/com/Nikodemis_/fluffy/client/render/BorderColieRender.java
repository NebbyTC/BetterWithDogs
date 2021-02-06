package com.Nikodemis_.fluffy.client.render;

import com.Nikodemis_.fluffy.Fluffy;
import com.Nikodemis_.fluffy.client.model.BorderColieModel;
import com.Nikodemis_.fluffy.client.model.ShihTzuModel;
import com.Nikodemis_.fluffy.entities.BorderColieEntity;
import com.Nikodemis_.fluffy.entities.ShihTzuEntinty;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BorderColieRender extends MobRenderer<BorderColieEntity, BorderColieModel<BorderColieEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Fluffy.MOD_ID, "textures/entity/bordercolie.png");

    public BorderColieRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BorderColieModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(BorderColieEntity entity) {
        return TEXTURE;
    }
}
