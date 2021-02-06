package com.Nikodemis_.fluffy.client.render;

import com.Nikodemis_.fluffy.Fluffy;
import com.Nikodemis_.fluffy.client.model.GoldenRetreiverModel;
import com.Nikodemis_.fluffy.entities.GoldenRetreiverEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GoldenRetreiverRender extends MobRenderer<GoldenRetreiverEntity, GoldenRetreiverModel<GoldenRetreiverEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(Fluffy.MOD_ID, "textures/entity/goldenretreiver.png");

    public GoldenRetreiverRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GoldenRetreiverModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(GoldenRetreiverEntity entity) {
        return TEXTURE;
    }
}
