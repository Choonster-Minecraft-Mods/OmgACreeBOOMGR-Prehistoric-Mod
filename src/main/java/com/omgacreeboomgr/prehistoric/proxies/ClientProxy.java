package com.omgacreeboomgr.prehistoric.proxies;

import com.omgacreeboomgr.prehistoric.Main;
import com.omgacreeboomgr.prehistoric.blocks.PreHistoricGrass;
import com.omgacreeboomgr.prehistoric.entities.entity.EntityCrab;
import com.omgacreeboomgr.prehistoric.entities.models.ModelCrab;
import com.omgacreeboomgr.prehistoric.entities.render.RenderCrab;
import com.omgacreeboomgr.prehistoric.init.PreHistoricBlocks;
import com.omgacreeboomgr.prehistoric.items.CustomFood;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy 
{	
	@Override
    public void registerRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderCrab(new ModelCrab(), 0.4f));
        PreHistoricBlocks.registerRenders();
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e)
	{
		super.init(e);		
		
		Main.Limestone.RegisterRenderer("limestone");
		Main.Carbon_Ore.RegisterRenderer("carbon_ore");
		Main.Pyrite_Ore.RegisterRenderer("pyrite_ore");
		Main.Carbon_Block.RegisterRenderer("carbon_block");
		Main.Pyrite_Block.RegisterRenderer("pyrite_block");
		Main.Blueberry_Bush.RegisterRenderer("blueberry_bush");
		Main.PreHistoric_Dirt.RegisterRenderer("prehistoric_dirt");
		Main.Marble.RegisterRenderer("marble");
		
		Main.Fang.RegisterRenderer("fang");		
		Main.Carbon.RegisterRenderer("carbon");
		Main.Pyrite.RegisterRenderer("pyrite");
				
		Main.Pyrite_Enhanced_Bars.RegisterRenderer("pyrite_enhanced_bars");
		
		CustomFood.registerRenders();
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent e)
	{
		super.postInit(e);
	}
}