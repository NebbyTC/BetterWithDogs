package com.Nikodemis_.fluffy.client.model;

import com.Nikodemis_.fluffy.entities.ShihTzuEntinty;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ShihTzuModel<T extends ShihTzuEntinty> extends EntityModel<T> {

        private final ModelRenderer head;
        private final ModelRenderer body;
        private final ModelRenderer body_rotation;
        private final ModelRenderer body_sub_1;
        private final ModelRenderer leg1;
        private final ModelRenderer leg2;
        private final ModelRenderer leg3;
        private final ModelRenderer leg4;
        private final ModelRenderer tail;

        public ShihTzuModel() {
            textureWidth = 32;
            textureHeight = 32;

            head = new ModelRenderer(this);
            head.setRotationPoint(1.0F, 15.5F, -6.0F);
            head.setTextureOffset(14, 14).addBox(-3.0F, -3.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);
            head.setTextureOffset(0, 16).addBox(2.0F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
            head.setTextureOffset(0, 16).addBox(-4.0F, -2.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
            head.setTextureOffset(18, 10).addBox(2.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            head.setTextureOffset(18, 10).addBox(-4.0F, -3.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
            head.setTextureOffset(6, 16).addBox(-2.0F, -1.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
            head.setTextureOffset(14, 0).addBox(-3.0F, 0.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 14.0F, 2.0F);


            body_rotation = new ModelRenderer(this);
            body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
            body.addChild(body_rotation);
            //setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);


            body_sub_1 = new ModelRenderer(this);
            body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
            body_rotation.addChild(body_sub_1);
            body_sub_1.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -6.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);

            leg1 = new ModelRenderer(this);
            leg1.setRotationPoint(2.5F, 16.0F, 7.0F);
            leg1.setTextureOffset(10, 22).addBox(-1.0F, 3.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            leg2 = new ModelRenderer(this);
            leg2.setRotationPoint(-0.5F, 16.0F, 7.0F);
            leg2.setTextureOffset(10, 22).addBox(-2.0F, 3.0F, -4.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            leg3 = new ModelRenderer(this);
            leg3.setRotationPoint(2.5F, 16.0F, -4.0F);
            leg3.setTextureOffset(10, 22).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            leg4 = new ModelRenderer(this);
            leg4.setRotationPoint(-0.5F, 16.0F, -4.0F);
            leg4.setTextureOffset(10, 22).addBox(-2.0F, 3.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

            tail = new ModelRenderer(this);
            tail.setRotationPoint(1.0F, 14.0F, 10.0F);
            tail.setTextureOffset(18, 2).addBox(-2.0F, -3.0F, -5.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
            tail.setTextureOffset(0, 0).addBox(0.0F, -3.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            tail.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            tail.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            tail.setTextureOffset(0, 2).addBox(-2.0F, -4.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            tail.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        }

        @Override
        public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
            this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            this.body.rotateAngleX = ((float)Math.PI / 2F);
            this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            body.render(matrixStack, buffer, packedLight, packedOverlay);
            leg1.render(matrixStack, buffer, packedLight, packedOverlay);
            leg2.render(matrixStack, buffer, packedLight, packedOverlay);
            leg3.render(matrixStack, buffer, packedLight, packedOverlay);
            leg4.render(matrixStack, buffer, packedLight, packedOverlay);
            tail.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}

