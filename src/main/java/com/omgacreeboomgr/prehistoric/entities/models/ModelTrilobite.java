package com.omgacreeboomgr.prehistoric.entities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTrilobite extends ModelBase
{
	private ModelRenderer[] trilobiteBodyParts = new ModelRenderer[23];
	
  //fields
    ModelRenderer MainBody;
    ModelRenderer MainBody1;
    ModelRenderer MainBody2;
    ModelRenderer Tail;
    ModelRenderer Tail1;
    ModelRenderer ExtraBody;
    ModelRenderer Face;
    ModelRenderer FaceExtra;
    ModelRenderer Extra1;
    ModelRenderer Extra2;
    ModelRenderer Extra3;
    ModelRenderer Extra4;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer TopExtra1;
    ModelRenderer TopExtra2;
    ModelRenderer TopExtra3;
    ModelRenderer TopExtra4;
    ModelRenderer TopExtra5;
    ModelRenderer HeadAndTail1BlockyBlock;
    ModelRenderer TopExtra6;
    ModelRenderer TopExtra7;
    ModelRenderer TopExtra8;
  
  public ModelTrilobite()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      MainBody = new ModelRenderer(this, 0, 13);
      MainBody.addBox(0F, 0F, 0F, 5, 3, 9);
      MainBody.setRotationPoint(-3F, 21F, -4F);
      MainBody.setTextureSize(128, 128);
      MainBody.mirror = true;
      setRotation(MainBody, 0F, 0F, 0F);
      MainBody1 = new ModelRenderer(this, 0, 26);
      MainBody1.addBox(0F, 0F, 0F, 1, 2, 7);
      MainBody1.setRotationPoint(2F, 22F, -3F);
      MainBody1.setTextureSize(128, 128);
      MainBody1.mirror = true;
      setRotation(MainBody1, 0F, 0F, 0F);
      MainBody2 = new ModelRenderer(this, 0, 26);
      MainBody2.addBox(0F, 0F, 0F, 1, 2, 7);
      MainBody2.setRotationPoint(-4F, 22F, -3F);
      MainBody2.setTextureSize(128, 128);
      MainBody2.mirror = true;
      setRotation(MainBody2, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 47);
      Tail.addBox(0F, 0F, 0F, 3, 2, 2);
      Tail.setRotationPoint(-2F, 22F, 5F);
      Tail.setTextureSize(128, 128);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 0, 53);
      Tail1.addBox(0F, 0F, 0F, 1, 1, 1);
      Tail1.setRotationPoint(-1F, 23F, 7F);
      Tail1.setTextureSize(128, 128);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      ExtraBody = new ModelRenderer(this, 0, 57);
      ExtraBody.addBox(0F, 0F, 0F, 7, 1, 9);
      ExtraBody.setRotationPoint(-4F, 23F, -4F);
      ExtraBody.setTextureSize(128, 128);
      ExtraBody.mirror = true;
      setRotation(ExtraBody, 0F, 0F, 0F);
      Face = new ModelRenderer(this, 0, 68);
      Face.addBox(0F, 0F, 0F, 3, 2, 1);
      Face.setRotationPoint(-2F, 22F, -5F);
      Face.setTextureSize(128, 128);
      Face.mirror = true;
      setRotation(Face, 0F, 0F, 0F);
      FaceExtra = new ModelRenderer(this, 0, 72);
      FaceExtra.addBox(0F, 0F, 0F, 5, 2, 1);
      FaceExtra.setRotationPoint(-3F, 22F, -5F);
      FaceExtra.setTextureSize(128, 128);
      FaceExtra.mirror = true;
      setRotation(FaceExtra, 0F, 0F, 0F);
      Extra1 = new ModelRenderer(this, 0, 76);
      Extra1.addBox(0F, 0F, 0F, 9, 2, 1);
      Extra1.setRotationPoint(-5F, 22F, -2F);
      Extra1.setTextureSize(128, 128);
      Extra1.mirror = true;
      setRotation(Extra1, 0F, 0F, 0F);
      Extra2 = new ModelRenderer(this, 0, 76);
      Extra2.addBox(0F, 0F, 0F, 9, 2, 1);
      Extra2.setRotationPoint(-5F, 22F, 0F);
      Extra2.setTextureSize(128, 128);
      Extra2.mirror = true;
      setRotation(Extra2, 0F, 0F, 0F);
      Extra3 = new ModelRenderer(this, 0, 76);
      Extra3.addBox(0F, 0F, 0F, 9, 2, 1);
      Extra3.setRotationPoint(-5F, 22F, 2F);
      Extra3.setTextureSize(128, 128);
      Extra3.mirror = true;
      setRotation(Extra3, 0F, 0F, 0F);
      Extra4 = new ModelRenderer(this, 0, 88);
      Extra4.addBox(0F, 0F, 0F, 9, 1, 7);
      Extra4.setRotationPoint(-5F, 23F, -3F);
      Extra4.setTextureSize(128, 128);
      Extra4.mirror = true;
      setRotation(Extra4, 0F, 0F, 0F);
      Top1 = new ModelRenderer(this, 0, 0);
      Top1.addBox(0F, 0F, 0F, 1, 1, 9);
      Top1.setRotationPoint(-2F, 20F, -4F);
      Top1.setTextureSize(128, 128);
      Top1.mirror = true;
      setRotation(Top1, 0F, 0F, 0F);
      Top2 = new ModelRenderer(this, 0, 0);
      Top2.addBox(0F, 0F, 0F, 1, 1, 9);
      Top2.setRotationPoint(0F, 20F, -4F);
      Top2.setTextureSize(128, 128);
      Top2.mirror = true;
      setRotation(Top2, 0F, 0F, 0F);
      TopExtra1 = new ModelRenderer(this, 32, 0);
      TopExtra1.addBox(0F, 0F, 0F, 1, 1, 11);
      TopExtra1.setRotationPoint(-2F, 21F, -5F);
      TopExtra1.setTextureSize(128, 128);
      TopExtra1.mirror = true;
      setRotation(TopExtra1, 0F, 0F, 0F);
      TopExtra2 = new ModelRenderer(this, 32, 0);
      TopExtra2.addBox(0F, 0F, 0F, 1, 1, 11);
      TopExtra2.setRotationPoint(0F, 21F, -5F);
      TopExtra2.setTextureSize(128, 128);
      TopExtra2.mirror = true;
      setRotation(TopExtra2, 0F, 0F, 0F);
      TopExtra3 = new ModelRenderer(this, 31, 50);
      TopExtra3.addBox(0F, 0F, 0F, 7, 1, 1);
      TopExtra3.setRotationPoint(-4F, 21F, -2F);
      TopExtra3.setTextureSize(128, 128);
      TopExtra3.mirror = true;
      setRotation(TopExtra3, 0F, 0F, 0F);
      TopExtra4 = new ModelRenderer(this, 31, 50);
      TopExtra4.addBox(0F, 0F, 0F, 7, 1, 1);
      TopExtra4.setRotationPoint(-4F, 21F, 0F);
      TopExtra4.setTextureSize(128, 128);
      TopExtra4.mirror = true;
      setRotation(TopExtra4, 0F, 0F, 0F);
      TopExtra5 = new ModelRenderer(this, 31, 50);
      TopExtra5.addBox(0F, 0F, 0F, 7, 1, 1);
      TopExtra5.setRotationPoint(-4F, 21F, 2F);
      TopExtra5.setTextureSize(128, 128);
      TopExtra5.mirror = true;
      setRotation(TopExtra5, 0F, 0F, 0F);
      HeadAndTail1BlockyBlock = new ModelRenderer(this, 33, 61);
      HeadAndTail1BlockyBlock.addBox(0F, 0F, 0F, 1, 1, 11);
      HeadAndTail1BlockyBlock.setRotationPoint(-1F, 21F, -5F);
      HeadAndTail1BlockyBlock.setTextureSize(128, 128);
      HeadAndTail1BlockyBlock.mirror = true;
      setRotation(HeadAndTail1BlockyBlock, 0F, 0F, 0F);
      TopExtra6 = new ModelRenderer(this, 33, 74);
      TopExtra6.addBox(0F, 0F, 0F, 5, 1, 1);
      TopExtra6.setRotationPoint(-3F, 20F, 0F);
      TopExtra6.setTextureSize(128, 128);
      TopExtra6.mirror = true;
      setRotation(TopExtra6, 0F, 0F, 0F);
      TopExtra7 = new ModelRenderer(this, 33, 74);
      TopExtra7.addBox(0F, 0F, 0F, 5, 1, 1);
      TopExtra7.setRotationPoint(-3F, 20F, -2F);
      TopExtra7.setTextureSize(128, 128);
      TopExtra7.mirror = true;
      setRotation(TopExtra7, 0F, 0F, 0F);
      TopExtra8 = new ModelRenderer(this, 33, 74);
      TopExtra8.addBox(0F, 0F, 0F, 5, 1, 1);
      TopExtra8.setRotationPoint(-3F, 20F, 2F);
      TopExtra8.setTextureSize(128, 128);
      TopExtra8.mirror = true;
      setRotation(TopExtra8, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    MainBody.render(f5);
    MainBody1.render(f5);
    MainBody2.render(f5);
    Tail.render(f5);
    Tail1.render(f5);
    ExtraBody.render(f5);
    Face.render(f5);
    FaceExtra.render(f5);
    Extra1.render(f5);
    Extra2.render(f5);
    Extra3.render(f5);
    Extra4.render(f5);
    Top1.render(f5);
    Top2.render(f5);
    TopExtra1.render(f5);
    TopExtra2.render(f5);
    TopExtra3.render(f5);
    TopExtra4.render(f5);
    TopExtra5.render(f5);
    HeadAndTail1BlockyBlock.render(f5);
    TopExtra6.render(f5);
    TopExtra7.render(f5);
    TopExtra8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    for (int i = 0; i < this.trilobiteBodyParts.length; ++i)
    {
        this.trilobiteBodyParts[i].rotateAngleY = MathHelper.cos(f * 0.9F + (float)i * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs(i - 2));
        this.trilobiteBodyParts[i].rotationPointX = MathHelper.sin(f * 0.9F + (float)i * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs(i - 2);
    
    }
  }
}