package com.omgacreeboomgr.prehistoric.handlers;

import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
   
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == Main.Carbon) return 2000;

		return 0;
	}
	   
		public int getBurnTime(Block fuel) {
			if (fuel.equals(Main.Carbon_Block)) return 20000;
			
			return 0;
		}
}

