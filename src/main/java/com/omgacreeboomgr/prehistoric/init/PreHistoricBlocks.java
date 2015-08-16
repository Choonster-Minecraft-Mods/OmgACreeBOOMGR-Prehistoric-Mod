package com.omgacreeboomgr.prehistoric.init;

import java.util.Random;

import com.omgacreeboomgr.prehistoric.Main;
import com.omgacreeboomgr.prehistoric.blocks.PreHistoricGrass;
import com.omgacreeboomgr.prehistoric.blocks.PreHistoricMarblePolished;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PreHistoricBlocks {

	public PreHistoricBlocks(Material material) {
		super();
	}
	public static Block PreHistoric_Grass;
	public static Block Marble_Polished;

    public static void init() {
    	PreHistoric_Grass = new PreHistoricGrass().setHardness(0.6F).setResistance(0.2F).setStepSound(Block.soundTypeGrass).setUnlocalizedName("prehistoric_grass");
    	Marble_Polished = new PreHistoricMarblePolished(Material.rock).setHardness(3.0F).setResistance(13.0F).setStepSound(Block.soundTypeStone).setUnlocalizedName("marble_polished");
    
    }

    public static void register() {
		GameRegistry.registerBlock(PreHistoric_Grass, PreHistoric_Grass.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Marble_Polished, Marble_Polished.getUnlocalizedName().substring(5));
    	
    }

    public static void registerRenders() {
    	registerRender(PreHistoric_Grass);
    	registerRender(Marble_Polished);
    
    }
    
    public static void registerRender(Block block) {
    	Item item = Item.getItemFromBlock(block);
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID+":"+ item.getUnlocalizedName().substring(5), "inventory"));
    }
}

