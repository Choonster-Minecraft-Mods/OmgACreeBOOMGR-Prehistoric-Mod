package com.omgacreeboomgr.prehistoric.blocks;

import java.util.Random;

import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PreHistoricGrass extends BlockGrass {
	
	public Item getItemDropped(int par1, Random random, int par2)
    {
    	 return Item.getItemFromBlock(Main.PreHistoric_Dirt);
    }
}
