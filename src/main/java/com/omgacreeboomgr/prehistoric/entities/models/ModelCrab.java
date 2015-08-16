package com.omgacreeboomgr.prehistoric.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrab extends ModelBase {

	   ModelRenderer MainBody;
	   ModelRenderer TopBody;
	   ModelRenderer Arm1;
	   ModelRenderer Arm2;
	   ModelRenderer Leg1;
	   ModelRenderer Leg2;
	   ModelRenderer Leg3;
	   ModelRenderer Leg4;
	   ModelRenderer Hand1;
	   ModelRenderer Hand2;
	   ModelRenderer Eye1;
	   ModelRenderer Eye2;


	   public ModelCrab() {
	      this.textureWidth = 64;
	      this.textureHeight = 64;
	      this.MainBody = new ModelRenderer(this, 0, 10);
	      this.MainBody.addBox(0.0F, 0.0F, 0.0F, 4, 2, 6);
	      this.MainBody.setRotationPoint(-2.0F, 20.0F, -3.0F);
	      this.MainBody.setTextureSize(64, 64);
	      this.MainBody.mirror = true;
	      this.setRotation(this.MainBody, 0.0F, 0.0F, 0.0F);
	      this.TopBody = new ModelRenderer(this, 10, 5);
	      this.TopBody.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4);
	      this.TopBody.setRotationPoint(-1.0F, 19.0F, -2.0F);
	      this.TopBody.setTextureSize(64, 64);
	      this.TopBody.mirror = true;
	      this.setRotation(this.TopBody, 0.0F, 0.0F, 0.0F);
	      this.Arm1 = new ModelRenderer(this, 0, 0);
	      this.Arm1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3);
	      this.Arm1.setRotationPoint(-1.0F, 20.0F, -6.0F);
	      this.Arm1.setTextureSize(64, 64);
	      this.Arm1.mirror = true;
	      this.setRotation(this.Arm1, 0.0F, 0.0F, 0.0F);
	      this.Arm2 = new ModelRenderer(this, 29, 0);
	      this.Arm2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3);
	      this.Arm2.setRotationPoint(-1.0F, 20.0F, 3.0F);
	      this.Arm2.setTextureSize(64, 64);
	      this.Arm2.mirror = true;
	      this.setRotation(this.Arm2, 0.0F, 0.0F, 0.0F);
	      this.Leg1 = new ModelRenderer(this, 0, 0);
	      this.Leg1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
	      this.Leg1.setRotationPoint(-2.0F, 21.0F, -2.0F);
	      this.Leg1.setTextureSize(64, 64);
	      this.Leg1.mirror = true;
	      this.setRotation(this.Leg1, -0.4886922F, 0.0F, 0.0F);
	      this.Leg2 = new ModelRenderer(this, 0, 0);
	      this.Leg2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
	      this.Leg2.setRotationPoint(0.0F, 21.0F, -2.0F);
	      this.Leg2.setTextureSize(64, 64);
	      this.Leg2.mirror = true;
	      this.setRotation(this.Leg2, -0.4886922F, 0.0F, 0.0F);
	      this.Leg3 = new ModelRenderer(this, 0, 0);
	      this.Leg3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
	      this.Leg3.setRotationPoint(0.0F, 21.5F, 1.0F);
	      this.Leg3.setTextureSize(64, 64);
	      this.Leg3.mirror = true;
	      this.setRotation(this.Leg3, 0.4886922F, 0.0F, 0.0F);
	      this.Leg4 = new ModelRenderer(this, 0, 0);
	      this.Leg4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
	      this.Leg4.setRotationPoint(-2.0F, 21.5F, 1.0F);
	      this.Leg4.setTextureSize(64, 64);
	      this.Leg4.mirror = true;
	      this.setRotation(this.Leg4, 0.4886922F, 0.0F, 0.0F);
	      this.Hand1 = new ModelRenderer(this, 0, 0);
	      this.Hand1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
	      this.Hand1.setRotationPoint(-1.0F, 19.0F, -6.0F);
	      this.Hand1.setTextureSize(64, 64);
	      this.Hand1.mirror = true;
	      this.setRotation(this.Hand1, 0.0F, 0.0F, 0.0F);
	      this.Hand2 = new ModelRenderer(this, 0, 0);
	      this.Hand2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
	      this.Hand2.setRotationPoint(-1.0F, 19.0F, 4.0F);
	      this.Hand2.setTextureSize(64, 64);
	      this.Hand2.mirror = true;
	      this.setRotation(this.Hand2, 0.0F, 0.0F, 0.0F);
	      this.Eye1 = new ModelRenderer(this, 0, 18);
	      this.Eye1.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
	      this.Eye1.setRotationPoint(1.0F, 18.0F, 1.0F);
	      this.Eye1.setTextureSize(64, 64);
	      this.Eye1.mirror = true;
	      this.setRotation(this.Eye1, 0.0F, 0.0F, 0.0F);
	      this.Eye2 = new ModelRenderer(this, 0, 20);
	      this.Eye2.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
	      this.Eye2.setRotationPoint(1.0F, 18.0F, -2.0F);
	      this.Eye2.setTextureSize(64, 64);
	      this.Eye2.mirror = true;
	      this.setRotation(this.Eye2, 0.0F, 0.0F, 0.0F);
	   }

	   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	      super.render(entity, f, f1, f2, f3, f4, f5);
	      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	      this.MainBody.render(f5);
	      this.TopBody.render(f5);
	      this.Arm1.render(f5);
	      this.Arm2.render(f5);
	      this.Leg1.render(f5);
	      this.Leg2.render(f5);
	      this.Leg3.render(f5);
	      this.Leg4.render(f5);
	      this.Hand1.render(f5);
	      this.Hand2.render(f5);
	      this.Eye1.render(f5);
	      this.Eye2.render(f5);
	   }

	   /*public void renderModel(float var1) {
	      this.MainBody.a(var1);
	      this.TopBody.a(var1);
	      this.Arm1.a(var1);
	      this.Arm2.a(var1);
	      this.Leg1.a(var1);
	      this.Leg2.a(var1);
	      this.Leg3.a(var1);
	      this.Leg4.a(var1);
	      this.Hand1.a(var1);
	      this.Hand2.a(var1);
	      this.Eye1.a(var1);
	      this.Eye2.a(var1);
	      */

	   private void setRotation(ModelRenderer model, float x, float y, float z) {
	      model.rotateAngleX = x;
	      model.rotateAngleY = y;
	      model.rotateAngleZ = z;
	   }

	   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	   }
	}