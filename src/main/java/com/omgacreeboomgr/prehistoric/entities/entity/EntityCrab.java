package com.omgacreeboomgr.prehistoric.entities.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityCrab extends EntityCreature {

	public EntityCrab(World world) {
		super(world);
	}
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
    }
}
