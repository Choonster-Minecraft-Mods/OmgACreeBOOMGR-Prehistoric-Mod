package com.omgacreeboomgr.prehistoric.handlers;

import java.util.Random;

import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler {
	public static void registerEntity(Class entityClass, String name) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 16777215;
		int subColor = random.nextInt() * 16777215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 50, 2, 4, EnumCreatureType.WATER_CREATURE, BiomeGenBase.deepOcean, BiomeGenBase.ocean);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Main.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
	}
}
