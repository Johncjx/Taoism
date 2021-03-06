package com.Jackiecrazi.taoism.api.allTheDamageTypes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class DamageArmorPierce extends EntityDamageSourceIndirect {
	public DamageArmorPierce(String name, Entity proxy,
			Entity seme) {
		super(name, proxy, seme);
		this.setDamageBypassesArmor();
		this.setDamageIsAbsolute();
	}
	public ITextComponent getDeathMessage(EntityLivingBase target)
    {
		String howtodie = "death.attack." + this.damageType;
		ItemStack stack=null;
	    ITextComponent source = getEntity() == null ? getSourceOfDamage().getDisplayName() : this.getEntity().getDisplayName();
	    if(getEntity() != null && getEntity() instanceof EntityLivingBase){
	    stack =  ((EntityLivingBase)getEntity()).getHeldItemMainhand();
	    }
	    else if(getSourceOfDamage() instanceof EntityLivingBase){
	    	stack=((EntityLivingBase)getSourceOfDamage()).getHeldItemMainhand();
	    }
	    String deathname = howtodie + ".item";

	    return stack != null && stack.hasDisplayName() ? 
	            new TextComponentTranslation(deathname, target.getDisplayName(), source, stack.getDisplayName()) :
	            new TextComponentTranslation(howtodie, target.getDisplayName(), source);
		
    }
	public static DamageSource punctureIndirectly(Entity source, Entity transmitter) {
		if(!(source instanceof EntityPlayer))return new DamageArmorPierce("pierce.indirect", source, transmitter);
	    else
	    return DamageSource.causePlayerDamage((EntityPlayer)source).setDamageBypassesArmor().setDamageIsAbsolute();
	}
	public static DamageSource punctureDirectly(Entity source) {
	    if(!(source instanceof EntityPlayer))return new DamageArmorPierce("pierce.direct", source, null);
	    else
	    return DamageSource.causePlayerDamage((EntityPlayer)source).setDamageBypassesArmor().setDamageIsAbsolute();
	}
}
