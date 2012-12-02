package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// Lets define our mod, shall we? :)
@Mod(name="RP World", version="1.1a", modid = "rpworld")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class RPWorld {
	
	// Define our instance
	@Instance("RPWorld")
	public static RPWorld instance;
	
	// Define our proxy
	@SidedProxy(clientSide="com.kronosad.mods.rpworld.client.ClientProxy", serverSide="com.kronosad.mods.rpworld.CommonProxy")
	public static CommonProxy proxy;
	
	
	// Define blocks
	
	
	
	public final static Block basalt = new BlockBasalt(501, 17, Material.rock)
	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("Basalt");
	
	public final static Block basaltBrick = new BlockBasaltBrick(500, 20, Material.rock)
	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("Basalt Brick");
	
	public final static Block basaltCobblestone = new BlockBasaltCobbleStone(504, 19, Material.rock)
	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("Basalt Cobblestone");
	
	public final static Block marble = new BlockMarble(502, 16, Material.rock)
	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("Marble");
	
	public final static Block marbleBrick = new BlockMarbleBrick(503, 18, Material.rock)
	.setHardness(0.5F).setStepSound(Block.soundStoneFootstep)
	.setBlockName("Marble Brick");
	// End block definition
	
	// | The following code is called when the mod is loaded.
	// V
	
	
	@Init
	public void load(FMLInitializationEvent event){
		
		
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
