// Date: 2017/2/8 13:26:33
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.Jackiecrazi.taoism.client.models.items.weapons;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModelChui extends ModelBase
{
  //fields
    ModelRenderer chuige;
    ModelRenderer chuiduan;
    ModelRenderer chuibing;
    ModelRenderer chuitou1;
    ModelRenderer chuitou3;
    ModelRenderer chuitou2;
    ModelRenderer chuitou4;
  
  public ModelChui()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      chuige = new ModelRenderer(this, 18, 71);
      chuige.addBox(-2.5F, 0F, -2.5F, 5, 3, 5);
      chuige.setRotationPoint(0F, -39F, 0F);
      chuige.setTextureSize(64, 128);
      chuige.mirror = true;
      setRotation(chuige, 0F, 0F, 0F);
      chuiduan = new ModelRenderer(this, 0, 72);
      chuiduan.addBox(-2F, 0F, -2F, 4, 3, 4);
      chuiduan.setRotationPoint(0F, 9F, 0F);
      chuiduan.setTextureSize(64, 128);
      chuiduan.mirror = true;
      setRotation(chuiduan, 0F, 0F, 0F);
      chuibing = new ModelRenderer(this, 0, 80);
      chuibing.addBox(-1.5F, 0F, -1.5F, 3, 45, 3);
      chuibing.setRotationPoint(0F, -36F, 0F);
      chuibing.setTextureSize(64, 128);
      chuibing.mirror = true;
      setRotation(chuibing, 0F, 0F, 0F);
      chuitou1 = new ModelRenderer(this, 0, 14);
      chuitou1.addBox(-6F, 0F, -8F, 12, 12, 16);
      chuitou1.setRotationPoint(0F, -53F, 0F);
      chuitou1.setTextureSize(64, 128);
      chuitou1.mirror = true;
      setRotation(chuitou1, 0F, 0F, 0F);
      chuitou3 = new ModelRenderer(this, 0, 0);
      chuitou3.addBox(-6F, 0F, -6F, 12, 2, 12);
      chuitou3.setRotationPoint(0F, -41F, 0F);
      chuitou3.setTextureSize(64, 128);
      chuitou3.mirror = true;
      setRotation(chuitou3, 0F, 0F, 0F);
      chuitou2 = new ModelRenderer(this, 0, 45);
      chuitou2.addBox(-8F, 0F, -6F, 16, 12, 12);
      chuitou2.setRotationPoint(0F, -53F, 0F);
      chuitou2.setTextureSize(64, 128);
      chuitou2.mirror = true;
      setRotation(chuitou2, 0F, 0F, 0F);
      chuitou4 = new ModelRenderer(this, 0, 0);
      chuitou4.addBox(-6F, 0F, -6F, 12, 2, 12);
      chuitou4.setRotationPoint(0F, -55F, 0F);
      chuitou4.setTextureSize(64, 128);
      chuitou4.mirror = true;
      setRotation(chuitou4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    chuige.render(f5);
    chuiduan.render(f5);
    chuibing.render(f5);
    chuitou1.render(f5);
    chuitou3.render(f5);
    chuitou2.render(f5);
    chuitou4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void render(ItemStack is)
  {
  	if (RenderManager.instance.renderEngine == null) return;
      Item wand = is.getItem();
      EntityPlayer player = Minecraft.getMinecraft().thePlayer;
      GL11.glScaled(0.6, 0.6, 0.6);
      GL11.glRotated(30, 0, 0, 1);
      GL11.glTranslated(1.2, 2.8d, 0);
      float f5=0.0625f;
      chuige.render(f5);
      chuiduan.render(f5);
      chuibing.render(f5);
      chuitou1.render(f5);
      chuitou3.render(f5);
      chuitou2.render(f5);
      chuitou4.render(f5);
  }
}