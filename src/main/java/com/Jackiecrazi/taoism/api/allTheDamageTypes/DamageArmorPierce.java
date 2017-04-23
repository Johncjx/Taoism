package com.Jackiecrazi.taoism.api.allTheDamageTypes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;

public class DamageArmorPierce extends EntityDamageSourceIndirect {
	public DamageArmorPierce(String name, Entity proxy,
			Entity seme) {
		super(name, proxy, seme);
		this.setDamageBypassesArmor();
		this.setDamageIsAbsolute();
	}
	@Override
	public IChatComponent func_151519_b(EntityLivingBase target)
    {
		String howtodie = "death.attack." + this.damageType;
		ItemStack stack=null;
	    IChatComponent source = getEntity() == null ? getSourceOfDamage().func_145748_c_() : this.getEntity().func_145748_c_();
	    if(getEntity() != null && getEntity() instanceof EntityLivingBase){
	    stack =  ((EntityLivingBase)getEntity()).getHeldItem();
	    }
	    else if(getSourceOfDamage() instanceof EntityLivingBase){
	    	stack=((EntityLivingBase)getSourceOfDamage()).getHeldItem();
	    }
	    String deathname = howtodie + ".item";

	    return stack != null && stack.hasDisplayName() && StatCollector.canTranslate(deathname) ? 
	            new ChatComponentTranslation(deathname, target.func_145748_c_(), source, stack.getDisplayName()) :
	            new ChatComponentTranslation(howtodie, target.func_145748_c_(), source);
		
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