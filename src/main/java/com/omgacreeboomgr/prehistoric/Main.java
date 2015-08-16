package com.omgacreeboomgr.prehistoric;

import java.util.List;

import com.omgacreeboomgr.prehistoric.biomes.BiomeGenPreHistoric;
import com.omgacreeboomgr.prehistoric.blocks.CustomBlock;
import com.omgacreeboomgr.prehistoric.blocks.CustomPane;
import com.omgacreeboomgr.prehistoric.blocks.PreHistoricGrass;
import com.omgacreeboomgr.prehistoric.entities.entity.EntityCrab;
import com.omgacreeboomgr.prehistoric.entities.entity.EntityTrilobite;
import com.omgacreeboomgr.prehistoric.handlers.EntityHandler;
import com.omgacreeboomgr.prehistoric.handlers.FuelHandler;
import com.omgacreeboomgr.prehistoric.init.PreHistoricBlocks;
import com.omgacreeboomgr.prehistoric.items.CustomFood;
import com.omgacreeboomgr.prehistoric.items.CustomItem;
import com.omgacreeboomgr.prehistoric.proxies.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = "required-after:FML")
public class Main 
{
	public static final String MODID = "preh";
	public static final String MODNAME = "PreHistoric Mod";
	public static final String VERSION = "0.1";
		
	@Instance(value = MODID)
	public static Main instance;
	
	@SidedProxy(modId=MODID, clientSide="com.omgacreeboomgr.prehistoric.proxies.ClientProxy", serverSide="com.omgacreeboomgr.prehistoric.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	public static CustomBlock Limestone;
	public static CustomBlock Carbon_Ore;
	public static CustomBlock Pyrite_Ore;
	public static CustomBlock Carbon_Block;
	public static CustomBlock Pyrite_Block;
	public static CustomBlock Blueberry_Bush;
	public static CustomBlock PreHistoric_Dirt;
	public static CustomBlock Marble;
	
	public static CustomItem Pyrite;
	public static CustomItem Fang;
	public static CustomItem Carbon;
	
	public static CustomPane Pyrite_Enhanced_Bars;
	
	public static final BiomeGenPreHistoric PreHistoric_Plains = new BiomeGenPreHistoric(25);
		
	public static CreativeTabs tabExpansionBlocks = new CreativeTabs("PreHistoricBlocks") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Main.Limestone);
		}
		 @SideOnly(Side.CLIENT)
		    public void displayAllReleventItems(List itemList) {
			 itemList.add(new ItemStack(Main.Limestone));
			 itemList.add(new ItemStack(Main.Carbon_Ore));
			 itemList.add(new ItemStack(Main.Pyrite_Ore));
			 itemList.add(new ItemStack(Main.Pyrite_Enhanced_Bars));
			 itemList.add(new ItemStack(Main.Carbon_Block));
			 itemList.add(new ItemStack(Main.Pyrite_Block));
			 itemList.add(new ItemStack(Main.PreHistoric_Dirt));
			 itemList.add(new ItemStack(PreHistoricBlocks.PreHistoric_Grass));
		 }
	};
	
	public static CreativeTabs tabExpansionItems = new CreativeTabs("PreHistoricItems") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Main.Fang;
		}
		 @SideOnly(Side.CLIENT)
		    public void displayAllReleventItems(List itemList) {
			 itemList.add(new ItemStack(Main.Fang));
			 itemList.add(new ItemStack(Main.Carbon));
			 itemList.add(new ItemStack(Main.Pyrite));
		 }
	};
	
	public static CreativeTabs tabExpansionFood = new CreativeTabs("PreHistoricFood") {
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return CustomFood.Blueberry;
		}
		 @SideOnly(Side.CLIENT)
		    public void displayAllReleventItems(List itemList) {
			 itemList.add(new ItemStack(CustomFood.Blueberry));
			 itemList.add(new ItemStack(Main.Blueberry_Bush));
		 }
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
		CustomFood.init();
		CustomFood.register();
		PreHistoricBlocks.init();
		PreHistoricBlocks.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) 
	{
		proxy.init(e);
		//Fuel Handler
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		//Entities
		EntityHandler.registerEntity(EntityTrilobite.class, "Trilobite");	
		EntityHandler.registerEntity(EntityCrab.class, "Crab");
		
		//Recipies
	    GameRegistry.addRecipe((ItemStack)new ItemStack(PreHistoricBlocks.Marble_Polished), (Object[])new Object[]{"xx ", "xx ", "   ", Character.valueOf('x'), Main.Marble});
	    GameRegistry.addRecipe((ItemStack)new ItemStack(PreHistoricBlocks.Marble_Polished), (Object[])new Object[]{" xx", " xx", "   ", Character.valueOf('x'), Main.Marble});
	    GameRegistry.addRecipe((ItemStack)new ItemStack(PreHistoricBlocks.Marble_Polished), (Object[])new Object[]{"   ", "xx ", "xx ", Character.valueOf('x'), Main.Marble});
	    GameRegistry.addRecipe((ItemStack)new ItemStack(PreHistoricBlocks.Marble_Polished), (Object[])new Object[]{"   ", " xx", " xx", Character.valueOf('x'), Main.Marble});
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) 
	{
		proxy.postInit(e);
	}
}
