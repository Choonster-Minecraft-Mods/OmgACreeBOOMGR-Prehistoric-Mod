package com.omgacreeboomgr.prehistoric.blocks;

import java.util.Random;

import com.omgacreeboomgr.prehistoric.Main;
import com.omgacreeboomgr.prehistoric.init.PreHistoricBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PreHistoricMarblePolished extends Block {

	public PreHistoricMarblePolished(Material material) {
		super(material);
	}
	
    public Item getItemDropped(int par1, Random random, int par2)
    {
    	 return Item.getItemFromBlock(PreHistoricBlocks.Marble_Polished);
    }
    
    public void setHarvestLevel(String tool, int level) {
		this.setHarvestLevel("pickaxe", 1);
	}
}
