// Date: 2017/2/6 23:33:29
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.Jackiecrazi.taoism.client.models.items.weapons;

import org.lwjgl.opengl.GL11;

import com.Jackiecrazi.taoism.api.NeedyLittleThings;
import com.Jackiecrazi.taoism.client.RenderHalper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModelWhipNew extends ModelBase
{
  //fields
    ModelRenderer biansheng;
    ModelRenderer bianjie11;
    ModelRenderer bianjie12;
    ModelRenderer bianjie21;
    ModelRenderer bianjie22;
    ModelRenderer bianjie31;
    ModelRenderer bianjie32;
    ModelRenderer bianjie41;
    ModelRenderer bianjie42;
    ModelRenderer bianjie51;
    ModelRenderer bianjie52;
    ModelRenderer bianjie61;
    ModelRenderer bianjie62;
    ModelRenderer bianjie71;
    ModelRenderer bianjie72;
    ModelRenderer bianduan;
    ModelRenderer bianbingg;
    ModelRenderer biange;
  
  public ModelWhipNew()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      biansheng = new ModelRenderer(this, 23, 0);
      biansheng.addBox(-1.5F, 0F, -1.5F, 3, 51, 3);
      biansheng.setRotationPoint(0F, -32F, 0F);
      biansheng.setTextureSize(128, 64);
      biansheng.mirror = true;
      setRotation(biansheng, 0F, 0F, 0F);
      bianjie11 = new ModelRenderer(this, 0, 17);
      bianjie11.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie11.setRotationPoint(0F, -28F, 0F);
      bianjie11.setTextureSize(128, 64);
      bianjie11.mirror = true;
      setRotation(bianjie11, 0F, 0F, 1.570796F);
      bianjie12 = new ModelRenderer(this, 0, 17);
      bianjie12.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie12.setRotationPoint(0F, -28F, 0F);
      bianjie12.setTextureSize(128, 64);
      bianjie12.mirror = true;
      setRotation(bianjie12, 0F, 1.570796F, 1.570796F);
      bianjie21 = new ModelRenderer(this, 0, 17);
      bianjie21.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie21.setRotationPoint(0F, -21F, 0F);
      bianjie21.setTextureSize(128, 64);
      bianjie21.mirror = true;
      setRotation(bianjie21, 0F, 1.570796F, 1.570796F);
      bianjie22 = new ModelRenderer(this, 0, 17);
      bianjie22.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie22.setRotationPoint(0F, -21F, 0F);
      bianjie22.setTextureSize(128, 64);
      bianjie22.mirror = true;
      setRotation(bianjie22, 0F, 0F, 1.570796F);
      bianjie31 = new ModelRenderer(this, 0, 17);
      bianjie31.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie31.setRotationPoint(0F, -14F, 0F);
      bianjie31.setTextureSize(128, 64);
      bianjie31.mirror = true;
      setRotation(bianjie31, 0F, 1.570796F, 1.570796F);
      bianjie32 = new ModelRenderer(this, 0, 17);
      bianjie32.addBox(0F, -2F, -3F, 4, 4, 6);
      bianjie32.setRotationPoint(0F, -14F, 0F);
      bianjie32.setTextureSize(128, 64);
      bianjie32.mirror = true;
      setRotation(bianjie32, 0F, 0F, 1.570796F);
      bianjie41 = new ModelRenderer(this, 0, 0);
      bianjie41.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie41.setRotationPoint(0F, -7F, 0F);
      bianjie41.setTextureSize(128, 64);
      bianjie41.mirror = true;
      setRotation(bianjie41, 0F, 1.570796F, 1.570796F);
      bianjie42 = new ModelRenderer(this, 0, 0);
      bianjie42.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie42.setRotationPoint(0F, -7F, 0F);
      bianjie42.setTextureSize(128, 64);
      bianjie42.mirror = true;
      setRotation(bianjie42, 0F, 0F, 1.570796F);
      bianjie51 = new ModelRenderer(this, 0, 0);
      bianjie51.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie51.setRotationPoint(0F, 0F, 0F);
      bianjie51.setTextureSize(128, 64);
      bianjie51.mirror = true;
      setRotation(bianjie51, 0F, 1.570796F, 1.570796F);
      bianjie52 = new ModelRenderer(this, 0, 0);
      bianjie52.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie52.setRotationPoint(0F, 0F, 0F);
      bianjie52.setTextureSize(128, 64);
      bianjie52.mirror = true;
      setRotation(bianjie52, 0F, 0F, 1.570796F);
      bianjie61 = new ModelRenderer(this, 0, 0);
      bianjie61.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie61.setRotationPoint(0F, 7F, 0F);
      bianjie61.setTextureSize(128, 64);
      bianjie61.mirror = true;
      setRotation(bianjie61, 0F, 1.570796F, 1.570796F);
      bianjie62 = new ModelRenderer(this, 0, 0);
      bianjie62.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie62.setRotationPoint(0F, 7F, 0F);
      bianjie62.setTextureSize(128, 64);
      bianjie62.mirror = true;
      setRotation(bianjie62, 0F, 0F, 1.570796F);
      bianjie71 = new ModelRenderer(this, 0, 0);
      bianjie71.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie71.setRotationPoint(0F, 14F, 0F);
      bianjie71.setTextureSize(128, 64);
      bianjie71.mirror = true;
      setRotation(bianjie71, 0F, 0F, 1.570796F);
      bianjie72 = new ModelRenderer(this, 0, 0);
      bianjie72.addBox(0F, -2F, -2.5F, 4, 4, 5);
      bianjie72.setRotationPoint(0F, 14F, 0F);
      bianjie72.setTextureSize(128, 64);
      bianjie72.mirror = true;
      setRotation(bianjie72, 0F, 1.570796F, 1.570796F);
      bianduan = new ModelRenderer(this, 50, 0);
      bianduan.addBox(-2F, 0F, -2F, 4, 4, 4);
      bianduan.setRotationPoint(0F, -52F, 0F);
      bianduan.setTextureSize(128, 64);
      bianduan.mirror = true;
      setRotation(bianduan, 0F, 0F, 0F);
      bianbingg = new ModelRenderer(this, 40, 0);
      bianbingg.addBox(-1F, 0F, -1F, 2, 11, 2);
      bianbingg.setRotationPoint(0F, -48F, 0F);
      bianbingg.setTextureSize(128, 64);
      bianbingg.mirror = true;
      setRotation(bianbingg, 0F, 0F, 0F);
      biange = new ModelRenderer(this, 38, 16);
      biange.addBox(-3.5F, 0F, -3.5F, 7, 5, 7);
      biange.setRotationPoint(0F, -37F, 0F);
      biange.setTextureSize(128, 64);
      biange.mirror = true;
      setRotation(biange, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    biansheng.render(f5);
    bianjie11.render(f5);
    bianjie12.render(f5);
    bianjie21.render(f5);
    bianjie22.render(f5);
    bianjie31.render(f5);
    bianjie32.render(f5);
    bianjie41.render(f5);
    bianjie42.render(f5);
    bianjie51.render(f5);
    bianjie52.render(f5);
    bianjie61.render(f5);
    bianjie62.render(f5);
    bianjie71.render(f5);
    bianjie72.render(f5);
    bianduan.render(f5);
    bianbingg.render(f5);
    biange.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void render(ItemStack is,String body,String knot,String pommel,String handle,String guard)
  {
	  //RenderHalper.bindMatTex("taoism:textures/items/weapons/whip.png");
  	if (RenderManager.instance.renderEngine == null) return;
      Item wand = is.getItem();
      EntityPlayer player = Minecraft.getMinecraft().thePlayer;
      GL11.glScaled(0.6, 0.6, 0.6);
      GL11.glRotated(30, 0, 0, 1);
      GL11.glTranslated(1.2, 2.8d, 0);
      float f5=0.0625f;
      RenderHalper.bindMatTex(body);
      biansheng.render(f5);
      //knot
      RenderHalper.bindMatTex(knot);
      bianjie11.render(f5);
      bianjie12.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie12.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie12.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie12.render(f5);
      bianjie21.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie21.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie21.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie21.render(f5);
      bianjie22.render(f5);
      bianjie31.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie31.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie31.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie31.render(f5);
      bianjie32.render(f5);
      bianjie41.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie41.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie41.rotateAngleZ=NeedyLittleThings.rad(90f);
   bianjie41.render(f5);
      bianjie42.render(f5);
      bianjie51.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie51.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie51.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie51.render(f5);
      bianjie52.render(f5);
      bianjie61.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie61.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie61.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie61.render(f5);
      bianjie62.render(f5);
      bianjie71.render(f5);
      bianjie72.rotateAngleY=NeedyLittleThings.rad(0f);
      bianjie72.rotateAngleX=NeedyLittleThings.rad(90f);
      bianjie72.rotateAngleZ=NeedyLittleThings.rad(90f);
      bianjie72.render(f5);
      //pommel
      RenderHalper.bindMatTex(pommel);
      bianduan.render(f5);
      //handle
      RenderHalper.bindMatTex(handle);
      bianbingg.render(f5);
      //guard
      RenderHalper.bindMatTex(guard);
      biange.render(f5);
  }
}
