// Date: 2017/3/23 16:00:37
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.Jackiecrazi.taoism.client.models.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTieZhen extends ModelBase
{
  //fields
    ModelRenderer zhendi1;
    ModelRenderer zhendi2;
    ModelRenderer zhenti1;
    ModelRenderer zhenti2;
    ModelRenderer zhenjiao1;
    ModelRenderer zhenjiao2;
    ModelRenderer zhenti3;
    ModelRenderer zhenti4;
    ModelRenderer zhenti5;
    ModelRenderer zhenti6;
    ModelRenderer zhenti7;
  
  public ModelTieZhen()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      zhendi1 = new ModelRenderer(this, 0, 112);
      zhendi1.addBox(-8F, 0F, -8F, 16, 3, 12);
      zhendi1.setRotationPoint(0F, 21F, 0F);
      zhendi1.setTextureSize(128, 128);
      zhendi1.mirror = true;
      setRotation(zhendi1, 0F, 0F, 0F);
      zhendi2 = new ModelRenderer(this, 0, 112);
      zhendi2.addBox(-8F, 0F, -4F, 16, 3, 12);
      zhendi2.setRotationPoint(0F, 21F, 16F);
      zhendi2.setTextureSize(128, 128);
      zhendi2.mirror = true;
      setRotation(zhendi2, 0F, 0F, 0F);
      zhenti1 = new ModelRenderer(this, 0, 72);
      zhenti1.addBox(-6F, 0F, -12F, 12, 6, 20);
      zhenti1.setRotationPoint(0F, 10F, 7F);
      zhenti1.setTextureSize(128, 128);
      zhenti1.mirror = true;
      setRotation(zhenti1, 0F, 0F, 0F);
      zhenti2 = new ModelRenderer(this, 71, 79);
      zhenti2.addBox(-5F, 0F, -9F, 10, 1, 18);
      zhenti2.setRotationPoint(0F, 16F, 5F);
      zhenti2.setTextureSize(128, 128);
      zhenti2.mirror = true;
      setRotation(zhenti2, 0F, 0F, 0F);
      zhenjiao1 = new ModelRenderer(this, 0, 100);
      zhenjiao1.addBox(-3F, 0F, -3F, 6, 4, 6);
      zhenjiao1.setRotationPoint(0F, 17F, 0F);
      zhenjiao1.setTextureSize(128, 128);
      zhenjiao1.mirror = true;
      setRotation(zhenjiao1, 0F, 0F, 0F);
      zhenjiao2 = new ModelRenderer(this, 58, 100);
      zhenjiao2.addBox(-3F, 0F, -3F, 6, 11, 6);
      zhenjiao2.setRotationPoint(0F, 12F, 15F);
      zhenjiao2.setTextureSize(128, 128);
      zhenjiao2.mirror = true;
      setRotation(zhenjiao2, 0.3839724F, 0F, 0F);
      zhenti3 = new ModelRenderer(this, 0, 57);
      zhenti3.addBox(-5F, 0F, 0F, 10, 4, 9);
      zhenti3.setRotationPoint(0F, 10.5F, 15F);
      zhenti3.setTextureSize(128, 128);
      zhenti3.mirror = true;
      setRotation(zhenti3, 0F, 0F, 0F);
      zhenti4 = new ModelRenderer(this, 0, 0);
      zhenti4.addBox(-2F, 0F, -3F, 4, 4, 3);
      zhenti4.setRotationPoint(3F, 11F, -5F);
      zhenti4.setTextureSize(128, 128);
      zhenti4.mirror = true;
      setRotation(zhenti4, 0F, 0F, 0F);
      zhenti5 = new ModelRenderer(this, 0, 0);
      zhenti5.addBox(-2F, 0F, -3F, 4, 4, 3);
      zhenti5.setRotationPoint(-3F, 11F, -5F);
      zhenti5.setTextureSize(128, 128);
      zhenti5.mirror = true;
      setRotation(zhenti5, 0F, 0F, 0F);
      zhenti6 = new ModelRenderer(this, 0, 0);
      zhenti6.addBox(0F, 0F, 0F, 1, 4, 18);
      zhenti6.setRotationPoint(6F, 11F, -4F);
      zhenti6.setTextureSize(128, 128);
      zhenti6.mirror = true;
      setRotation(zhenti6, 0F, 0F, 0F);
      zhenti7 = new ModelRenderer(this, 0, 0);
      zhenti7.addBox(-1F, 0F, 0F, 1, 4, 18);
      zhenti7.setRotationPoint(-6F, 11F, -4F);
      zhenti7.setTextureSize(128, 128);
      zhenti7.mirror = true;
      setRotation(zhenti7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    zhendi1.render(f5);
    zhendi2.render(f5);
    zhenti1.render(f5);
    zhenti2.render(f5);
    zhenjiao1.render(f5);
    zhenjiao2.render(f5);
    zhenti3.render(f5);
    zhenti4.render(f5);
    zhenti5.render(f5);
    zhenti6.render(f5);
    zhenti6.render(f5);
  }
  
  public void render(float f5){
	  zhendi1.render(f5);
	    zhendi2.render(f5);
	    zhenti1.render(f5);
	    zhenti2.render(f5);
	    zhenjiao1.render(f5);
	    zhenjiao2.render(f5);
	    zhenti3.render(f5);
	    zhenti4.render(f5);
	    zhenti5.render(f5);
	    zhenti6.render(f5);
	    zhenti6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,e);
  }

}