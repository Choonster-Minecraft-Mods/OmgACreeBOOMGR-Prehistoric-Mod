package com.omgacreeboomgr.prehistoric.blocks;

import java.util.Random;

import com.omgacreeboomgr.prehistoric.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CustomPane extends BlockPane {
	
	private Item dropsOnHarvest;
	private int dropamountmax = 1;
	private int maxharvestEXP = 0;
	
	public CustomPane(Material material, String name, float hardness, float resistance, CreativeTabs creativetab, HarvestToolEnum harvesttool, HarvestLevelEnum harvestlevel)
	{
		super(material, false);
		
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(creativetab);		
		this.setHarvestLevel(harvesttool, harvestlevel);

		GameRegistry.registerBlock(this, name);	
		
		this.dropsOnHarvest = Item.getItemFromBlock(this);

	}
	
	public void RegisterRenderer(String modelName)
	{
		System.out.println("REGISTERING BLOCK PANE RENDERER: " + modelName);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Main.MODID+":"+modelName, "inventory"));
	}		
	
	public void setHarvestLevel(HarvestToolEnum harvesttool, HarvestLevelEnum harvestlevel)
    {
		int level;
		String tool;
		
		switch(harvesttool)
		{
			case PICKAXE:
				tool = "pickaxe";
				break;
			case SHOVEL:
				tool = "shovel";
				break;
			case AXE:
				tool = "axe";
				break;
			default:
				tool = "pickaxe";
		}
		switch(harvestlevel)
		{
			case WOOD:
				level = 0;
				break;
			case STONE:
				level = 1;
				break;
			case IRON:
				level = 2;
				break;
			case DIAMOND:
				level = 3;
				break;
			case GOLD:
				level = 0;
				break;
			default:
				level = 0;
		}
		super.setHarvestLevel(tool, level);
    }	
	
	public static enum HarvestToolEnum
	{
		PICKAXE,
		SHOVEL,
		AXE;		
	}	
	public static enum HarvestLevelEnum
	{
		WOOD,
		STONE,
		IRON,
		DIAMOND,
		GOLD;
	}
	
	
	public void setMaxHarvestEXP(int expAmount)
	{
		maxharvestEXP = expAmount;
	}
	
	public void setDrops(Item drops)
	{
		this.dropsOnHarvest = drops;
	}
	public void setDrops(Block drops)
	{
		this.dropsOnHarvest = Item.getItemFromBlock(drops);
	}
	
	public void setDropMaxAmount(int dropamount)
	{
		this.dropamountmax = dropamount;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		 return this.dropsOnHarvest;
    }
	
	public int quantityDropped(Random random)
    {		
		int amount = random.nextInt(this.dropamountmax)+1;
        return amount;
    }
	
	public int getExpDrop(IBlockAccess world, BlockPos pos, int fortune)
    {
        IBlockState state = world.getBlockState(pos);
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this))
        {
        	return MathHelper.getRandomIntegerInRange(rand, 0, maxharvestEXP);
        }
        return 0;
    }
}

