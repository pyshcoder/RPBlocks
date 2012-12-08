package com.kronosad.mods.rpworld;

import java.io.File;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Lets define our mod, shall we? :)
@Mod(name="RP World", version="1.2a", modid = "rpworld")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class RPWorld {
	
	// Define our instance
	@Instance("RPWorld")
	public static RPWorld instance;
	
	// Define our proxy
	@SidedProxy(clientSide="com.kronosad.mods.rpworld.client.ClientProxy", serverSide="com.kronosad.mods.rpworld.CommonProxy")
	public static CommonProxy proxy;
	

	// Define some more stuff
	protected static File configPath;
	protected static int basaltID, basaltBrickID, basaltCobbleID, marbleID, marbleBrickID;
	
	public static Block basalt, basaltBrick, basaltCobblestone, marble, marbleBrick;
	
	
	// Pre-Init stuff
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		// Process config stuff and get Block IDs
		
		configPath = event.getSuggestedConfigurationFile();
		ConfigurationManager config = new ConfigurationManager();
		config.defaultConfig(configPath);
		
		
	}
	
	
	// | The following code is called when the mod is loaded.
	// V
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		
		// Assign blocks
		
		
		
		basalt = new BlockBasalt(basaltID, 17, Material.rock)
		.setHardness(1.5F).setStepSound(Block.soundStoneFootstep)
		.setBlockName("Basalt");
		
		basaltBrick = new BlockBasaltBrick(basaltBrickID, 20, Material.rock)
		.setHardness(1.5F).setStepSound(Block.soundStoneFootstep)
		.setBlockName("Basalt Brick");
		
		basaltCobblestone = new BlockBasaltCobbleStone(basaltCobbleID, 19, Material.rock)
		.setHardness(1.5F).setStepSound(Block.soundStoneFootstep)
		.setBlockName("Basalt Cobblestone");
		
		marble = new BlockMarble(marbleID, 16, Material.rock)
		.setHardness(1.5F).setStepSound(Block.soundStoneFootstep)
		.setBlockName("Marble");
		
		marbleBrick = new BlockMarbleBrick(marbleBrickID, 18, Material.rock)
		.setHardness(1.5F).setStepSound(Block.soundStoneFootstep)
		.setBlockName("Marble Brick");
		// End block Assignments
		
		
		// Inform Forge to pre-render our texture.
		proxy.registerRenders();
		
		 // Actually put blocks into the game
		GameRegistry.registerBlock(basalt);
		GameRegistry.registerBlock(basaltBrick);
		GameRegistry.registerBlock(basaltCobblestone);
		GameRegistry.registerBlock(marble);
		GameRegistry.registerBlock(marbleBrick);
		
		
		// Define world generation
		GameRegistry.registerWorldGenerator(new WorldGenerationBasalt());
		GameRegistry.registerWorldGenerator(new WorldGenerationMarble());
		
		// Smelting recipe
		GameRegistry.addSmelting(basaltCobblestone.blockID, new ItemStack(basalt), 2.0F);
		
		// Start spam of recipes (Basalt)!
		
		GameRegistry.addRecipe(new ItemStack(basaltBrick, 4), new Object[]{
            "CC ", "CC ", "   ", 'C', basalt
		});
		
		GameRegistry.addRecipe(new ItemStack(basaltBrick, 4), new Object[]{
            " CC", " CC", "   ", 'C', basalt
		});
		
		GameRegistry.addRecipe(new ItemStack(basaltBrick, 4), new Object[]{
            "   ", " CC", " CC", 'C', basalt
		});
		
		GameRegistry.addRecipe(new ItemStack(basaltBrick, 4), new Object[]{
            "   ", "CC ", "CC ", 'C', basalt
		});
		
		// Start spam of recipes (MARBLE!)
		
		GameRegistry.addRecipe(new ItemStack(marbleBrick, 4), new Object[]{
            "CC ", "CC ", "   ", 'C', marble
		});
		
		GameRegistry.addRecipe(new ItemStack(marbleBrick, 4), new Object[]{
            " CC", " CC", "   ", 'C', marble
		});
		
		GameRegistry.addRecipe(new ItemStack(marbleBrick, 4), new Object[]{
            "   ", " CC", " CC", 'C', marble
		});
		
		GameRegistry.addRecipe(new ItemStack(marbleBrick, 4), new Object[]{
            "   ", "CC ", "CC ", 'C', marble
		});
		// End of recipes
		
		// Add names to the blocks
		
		LanguageRegistry.addName(basalt, "Basalt");
		LanguageRegistry.addName(basaltBrick, "Basalt Brick");
		LanguageRegistry.addName(basaltCobblestone, "Basalt Cobblestone");
		LanguageRegistry.addName(marble, "Marble");
		LanguageRegistry.addName(marbleBrick, "Marble Brick");
		
		

	}
	
}
