// Date: 2017/3/23 14:50:15
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.Jackiecrazi.taoism.client.models.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLianQiLu extends ModelBase
{
  //fields
    ModelRenderer lujia1;
    ModelRenderer lujia2;
    ModelRenderer ludi;
    ModelRenderer luti1;
    ModelRenderer luti2;
    ModelRenderer luti3;
    ModelRenderer luti4;
    ModelRenderer luzhu1;
    ModelRenderer luzhu2;
    ModelRenderer luzhu3;
    ModelRenderer luzhu4;
    ModelRenderer lujiao1;
    ModelRenderer lujiao2;
    ModelRenderer lujiao3;
    ModelRenderer lujiao4;
    ModelRenderer tongfengkou;
    ModelRenderer chuliaokou;
    ModelRenderer huozhong;
    ModelRenderer zhuangshi1;
    ModelRenderer zhuangshi2;
  
  public ModelLianQiLu()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      lujia1 = new ModelRenderer(this, 0, 220);
      lujia1.addBox(0F, 0F, -16F, 14, 3, 32);
      lujia1.setRotationPoint(-6F, 21F, 8F);
      lujia1.setTextureSize(256, 256);
      lujia1.mirror = true;
      setRotation(lujia1, 0F, 0F, 0F);
      lujia2 = new ModelRenderer(this, 0, 220);
      lujia2.addBox(-9F, 0F, -16F, 14, 3, 32);
      lujia2.setRotationPoint(-15F, 21F, 8F);
      lujia2.setTextureSize(256, 256);
      lujia2.mirror = true;
      setRotation(lujia2, 0F, 0F, 0F);
      ludi = new ModelRenderer(this, 0, 168);
      ludi.addBox(-13F, 0F, -13F, 26, 3, 26);
      ludi.setRotationPoint(-8F, 13F, 8F);
      ludi.setTextureSize(256, 256);
      ludi.mirror = true;
      setRotation(ludi, 0F, 0F, 0F);
      luti1 = new ModelRenderer(this, 0, 0);
      luti1.addBox(0F, 0F, -8F, 4, 10, 16);
      luti1.setRotationPoint(0F, 3F, 8F);
      luti1.setTextureSize(256, 256);
      luti1.mirror = true;
      setRotation(luti1, 0F, 0F, 0F);
      luti2 = new ModelRenderer(this, 0, 0);
      luti2.addBox(-4F, 0F, -8F, 4, 10, 16);
      luti2.setRotationPoint(-16F, 3F, 8F);
      luti2.setTextureSize(256, 256);
      luti2.mirror = true;
      setRotation(luti2, 0F, 0F, 0F);
      luti3 = new ModelRenderer(this, 0, 40);
      luti3.addBox(-8F, 0F, 0F, 16, 10, 4);
      luti3.setRotationPoint(-8F, 3F, -4F);
      luti3.setTextureSize(256, 256);
      luti3.mirror = true;
      setRotation(luti3, 0F, 0F, 0F);
      luti4 = new ModelRenderer(this, 0, 40);
      luti4.addBox(-8F, 0F, -4F, 16, 10, 4);
      luti4.setRotationPoint(-8F, 3F, 20F);
      luti4.setTextureSize(256, 256);
      luti4.mirror = true;
      setRotation(luti4, 0F, 0F, 0F);
      luzhu1 = new ModelRenderer(this, 0, 120);
      luzhu1.addBox(-2F, 0F, -2F, 4, 10, 4);
      luzhu1.setRotationPoint(0F, 3F, 0F);
      luzhu1.setTextureSize(256, 256);
      luzhu1.mirror = true;
      setRotation(luzhu1, 0F, 0F, 0F);
      luzhu2 = new ModelRenderer(this, 0, 120);
      luzhu2.addBox(-2F, 0F, -2F, 4, 10, 4);
      luzhu2.setRotationPoint(-16F, 3F, 0F);
      luzhu2.setTextureSize(256, 256);
      luzhu2.mirror = true;
      setRotation(luzhu2, 0F, 0F, 0F);
      luzhu3 = new ModelRenderer(this, 0, 120);
      luzhu3.addBox(-2F, 0F, -2F, 4, 10, 4);
      luzhu3.setRotationPoint(0F, 3F, 16F);
      luzhu3.setTextureSize(256, 256);
      luzhu3.mirror = true;
      setRotation(luzhu3, 0F, 0F, 0F);
      luzhu4 = new ModelRenderer(this, 0, 120);
      luzhu4.addBox(-2F, 0F, -2F, 4, 10, 4);
      luzhu4.setRotationPoint(-16F, 3F, 16F);
      luzhu4.setTextureSize(256, 256);
      luzhu4.mirror = true;
      setRotation(luzhu4, 0F, 0F, 0F);
      lujiao1 = new ModelRenderer(this, 0, 200);
      lujiao1.addBox(-3F, 0F, -3F, 6, 10, 6);
      lujiao1.setRotationPoint(0F, 11F, 0F);
      lujiao1.setTextureSize(256, 256);
      lujiao1.mirror = true;
      setRotation(lujiao1, 0F, 0F, 0F);
      lujiao2 = new ModelRenderer(this, 0, 200);
      lujiao2.addBox(-3F, 0F, -3F, 6, 10, 6);
      lujiao2.setRotationPoint(-16F, 11F, 0F);
      lujiao2.setTextureSize(256, 256);
      lujiao2.mirror = true;
      setRotation(lujiao2, 0F, 0F, 0F);
      lujiao3 = new ModelRenderer(this, 0, 200);
      lujiao3.addBox(-3F, 0F, -3F, 6, 10, 6);
      lujiao3.setRotationPoint(0F, 11F, 16F);
      lujiao3.setTextureSize(256, 256);
      lujiao3.mirror = true;
      setRotation(lujiao3, 0F, 0F, 0F);
      lujiao4 = new ModelRenderer(this, 0, 200);
      lujiao4.addBox(-3F, 0F, -3F, 6, 10, 6);
      lujiao4.setRotationPoint(-16F, 11F, 16F);
      lujiao4.setTextureSize(256, 256);
      lujiao4.mirror = true;
      setRotation(lujiao4, 0F, 0F, 0F);
      tongfengkou = new ModelRenderer(this, 0, 140);
      tongfengkou.addBox(0F, -3F, -3F, 6, 6, 6);
      tongfengkou.setRotationPoint(2F, 10F, 8F);
      tongfengkou.setTextureSize(256, 256);
      tongfengkou.mirror = true;
      setRotation(tongfengkou, 0F, 0F, 0F);
      chuliaokou = new ModelRenderer(this, 0, 140);
      chuliaokou.addBox(0F, -3F, -3F, 6, 6, 6);
      chuliaokou.setRotationPoint(-24F, 10F, 8F);
      chuliaokou.setTextureSize(256, 256);
      chuliaokou.mirror = true;
      setRotation(chuliaokou, 0F, 0F, 0F);
      huozhong = new ModelRenderer(this, 0, 103);
      huozhong.addBox(-3F, 0F, -3F, 6, 4, 6);
      huozhong.setRotationPoint(-8F, 9F, 8F);
      huozhong.setTextureSize(256, 256);
      huozhong.mirror = true;
      setRotation(huozhong, 0F, 0F, 0F);
      zhuangshi1 = new ModelRenderer(this, 0, 156);
      zhuangshi1.addBox(-7F, -4F, 0F, 14, 8, 1);
      zhuangshi1.setRotationPoint(-8F, 8F, -5F);
      zhuangshi1.setTextureSize(256, 256);
      zhuangshi1.mirror = true;
      setRotation(zhuangshi1, 0F, 0F, 0F);
      zhuangshi2 = new ModelRenderer(this, 0, 156);
      zhuangshi2.addBox(-7F, -4F, -1F, 14, 8, 1);
      zhuangshi2.setRotationPoint(-8F, 8F, 21F);
      zhuangshi2.setTextureSize(256, 256);
      zhuangshi2.mirror = true;
      setRotation(zhuangshi2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    lujiao1.render(f5);
    lujiao2.render(f5);
    ludi.render(f5);
    luti1.render(f5);
    luti2.render(f5);
    luti3.render(f5);
    luti4.render(f5);
    luzhu1.render(f5);
    luzhu2.render(f5);
    luzhu3.render(f5);
    luzhu4.render(f5);
    lujiao1.render(f5);
    lujiao2.render(f5);
    lujiao3.render(f5);
    lujiao4.render(f5);
    tongfengkou.render(f5);
    chuliaokou.render(f5);
    huozhong.render(f5);
    zhuangshi1.render(f5);
    zhuangshi2.render(f5);
  }
  
  public void render(float f){
	  render(null,0f,0f,0f,0f,0f,f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

}
