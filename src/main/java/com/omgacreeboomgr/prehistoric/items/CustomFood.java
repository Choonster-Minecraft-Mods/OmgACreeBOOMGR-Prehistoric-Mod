package com.omgacreeboomgr.prehistoric.items;

import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomFood {

	public static Item Blueberry;
	
	public static void init() {
		Blueberry = (new ItemFood(2, 0.2F, false)).setUnlocalizedName("blueberry");
	}
	
	public static void register() {
		GameRegistry.registerItem(Blueberry, Blueberry.getUnlocalizedName().substring(5));
	}
	public static void registerRenders() {
		registerRender(Blueberry);
	}

	private static void registerRender(Item modelName) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(modelName, 0, new ModelResourceLocation(Main.MODID+":"+modelName.getUnlocalizedName().substring(5), "inventory"));

		
	}
}
