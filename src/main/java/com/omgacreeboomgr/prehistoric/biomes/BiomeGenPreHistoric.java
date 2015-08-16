package com.omgacreeboomgr.prehistoric.biomes;

import com.omgacreeboomgr.prehistoric.blocks.CustomBlock;
import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPreHistoric extends BiomeGenBase {
	private WorldGenerator PreHistoricPlains;
	public final Material blockMaterial;
	private int waterColorMultiplier;
	private float minHeight;
	private float maxHeight;
	private Object spawnableMonsterList;
	private Object spawnableCreatureList;
	private CustomBlock topBlock;
	private CustomBlock fillerBlock;
	
	public BiomeGenPreHistoric(int par1)
	{
	super(par1);
	this.blockMaterial = Material.water;
	this.minHeight = 0.1F;
	this.maxHeight = 0.6F;
	this.topBlock = Main.PreHistoric_Dirt;
	this.fillerBlock = Main.Limestone;
	this.setBiomeName("PreHistoric_Plains");

	/** this changes the water colour, its set to red now but ggole the java colours **/
	this.waterColorMultiplier = 0xE42D17;
	}
}
