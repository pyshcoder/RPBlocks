package com.kronosad.mods.rpworld;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockBasalt extends Block{

	public BlockBasalt(int itemID, int textureID, Material material) {
		super(itemID, textureID, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	// Tell the game where our texture file is.
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	// For some reaosn, the game needs this..
	public int blockIndexInTexture(){
		return 24;
	}

	// Tell the game to drop Basalt cobblestone when mined instead of plain basalt
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return RPWorld.basaltCobblestone.blockID;
	}
	
	
	

	
}
