package com.omgacreeboomgr.prehistoric.entities.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTrilobite extends EntityCreature {

	public EntityTrilobite(World world) {
		super(world);
	}
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.40D);
    }
}
