package com.Jackiecrazi.taoism.common.entity.ai.targetai;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.EntityCreature;
import net.minecraft.util.AxisAlignedBB;

import com.Jackiecrazi.taoism.common.entity.base.EntityTaoisticCreature;

public class EntityAISayo extends EntityAITargetNew {

	boolean entityCallsForHelp;
    private int field_142052_b;
    
    public EntityAISayo(EntityTaoisticCreature p_i1660_1_, boolean p_i1660_2_)
    {
        super(p_i1660_1_, false);
        this.entityCallsForHelp = p_i1660_2_;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        int i = this.taskOwner.func_142015_aE();
        return i != this.field_142052_b && this.isSuitableTarget(this.taskOwner.getAITarget(), false);
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.taskOwner.getAITarget());
        this.field_142052_b = this.taskOwner.func_142015_aE();

        if (this.entityCallsForHelp)
        {
            double d0 = this.getTargetDistance();
            List list = this.taskOwner.worldObj.getEntitiesWithinAABB(this.taskOwner.getClass(), AxisAlignedBB.getBoundingBox(this.taskOwner.posX, this.taskOwner.posY, this.taskOwner.posZ, this.taskOwner.posX + 1.0D, this.taskOwner.posY + 1.0D, this.taskOwner.posZ + 1.0D).expand(d0, 10.0D, d0));
            Iterator iterator = list.iterator();

            while (iterator.hasNext())
            {
                EntityTaoisticCreature entitycreature = (EntityTaoisticCreature)iterator.next();

                if (entitycreature.getAttackTarget() == null && !entitycreature.isOnSameTeam(this.taskOwner.getAITarget()))
                {
                    entitycreature.setAttackTarget(this.taskOwner.getAITarget());
                }
            }
        }

        super.startExecuting();
    }

}
