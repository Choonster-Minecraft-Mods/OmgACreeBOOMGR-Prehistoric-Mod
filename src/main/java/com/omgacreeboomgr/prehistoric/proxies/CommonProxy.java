package com.omgacreeboomgr.prehistoric.proxies;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import net.minecraft.block.Block;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.init.Items;

import com.omgacreeboomgr.prehistoric.blocks.CustomBlock;
import com.omgacreeboomgr.prehistoric.blocks.CustomPane;
import com.omgacreeboomgr.prehistoric.Main;
import com.omgacreeboomgr.prehistoric.items.CustomFood;
import com.omgacreeboomgr.prehistoric.items.CustomItem;

public class CommonProxy
{
	public void preInit(FMLPreInitializationEvent e)
	{
		
	}

	public void init(FMLInitializationEvent e) 
	{	
		Main.Fang = new CustomItem("fang", CreativeTabs.tabMaterials, 64);
		Main.Carbon = new CustomItem("carbon", CreativeTabs.tabMaterials, 64);
		Main.Pyrite = new CustomItem("pyrite", CreativeTabs.tabMaterials, 64);
		
		Main.Limestone = new CustomBlock(Material.rock, "limestone", 0.9F, 4.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.WOOD, 1, 8, 24, 15, 60, 128, true, false, false);
		Main.Carbon_Ore = new CustomBlock(Material.rock, "carbon_ore", 3.5F, 15.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.STONE, 1, 3, 8, 10, 0, 120, true, false, false);
		Main.Pyrite_Ore = new CustomBlock(Material.rock, "pyrite_ore", 4.0F, 17.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, 1, 4, 6, 5, 0, 55, true, false, false);
		Main.Carbon_Block = new CustomBlock(Material.rock, "carbon_block", 4.5F, 19.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.STONE, 1, 0, 0, 0, 0, 0, false, false, false);
		Main.Pyrite_Block = new CustomBlock(Material.rock, "pyrite_block", 5F, 20.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.IRON, 1, 0, 0, 0, 0, 0, false, false, false);
		Main.Blueberry_Bush = new CustomBlock(Material.leaves, "blueberry_bush", 0.4F, 0.1F, 2, 2, 5, 90, 60, 120,new Block[]{Blocks.grass}, 0, true, false, false);
		Main.PreHistoric_Dirt = new CustomBlock(Material.ground, "prehistoric_dirt", 0.5F, 0.1F, 1, 0, 0, 0, 0, 0, false, false, false);
		Main.Marble = new CustomBlock(Material.rock, "marble", 2.0F, 13.0F, CustomBlock.HarvestToolEnum.PICKAXE, CustomBlock.HarvestLevelEnum.STONE, 1, 8, 24, 9, 20, 90, true, false, false);

		Main.Pyrite_Ore.setDrops(Main.Pyrite);
		Main.Limestone.setDrops(Main.Limestone);
		Main.Carbon_Ore.setDrops(Main.Carbon);
		Main.Carbon_Block.setDrops(Main.Carbon_Block);
		Main.Pyrite_Block.setDrops(Main.Pyrite_Block);
		Main.Blueberry_Bush.setDrops(CustomFood.Blueberry);
		Main.PreHistoric_Dirt.setDrops(Main.PreHistoric_Dirt);
		Main.Marble.setDrops(Main.Marble);
		
		GameRegistry.addSmelting(Main.Carbon_Ore, new ItemStack(Main.Carbon), 2.0F);
		GameRegistry.addSmelting(Main.Pyrite_Ore, new ItemStack(Main.Pyrite), 5.0F);

        GameRegistry.addRecipe((ItemStack)new ItemStack(Main.Carbon_Block), (Object[])new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), Main.Carbon});
        GameRegistry.addRecipe((ItemStack)new ItemStack(Main.Pyrite_Block), (Object[])new Object[]{"xxx", "xxx", "xxx", Character.valueOf('x'), Main.Pyrite});
        GameRegistry.addRecipe((ItemStack)new ItemStack(Main.Pyrite_Enhanced_Bars), (Object[])new Object[]{"xxx", "xxx", "   ", Character.valueOf('x'), Main.Pyrite});
        GameRegistry.addRecipe((ItemStack)new ItemStack(Main.Pyrite_Enhanced_Bars), (Object[])new Object[]{"   ", "xxx", "xxx", Character.valueOf('x'), Main.Pyrite});

		//Example shapeless recipe.
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.gunpowder, 2), new Object[]{Main.Potassium, Main.Sulfur, Items.coal});
        
		Main.Pyrite_Enhanced_Bars = new CustomPane(Material.iron, "pyrite_enhanced_bars", 4.0F, 10.0F, CreativeTabs.tabDecorations, CustomPane.HarvestToolEnum.PICKAXE, CustomPane.HarvestLevelEnum.STONE);
		
	}

	public void postInit(FMLPostInitializationEvent e) 
	{

	}
}
