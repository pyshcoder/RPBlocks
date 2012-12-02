package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockMarble extends Block {
	
	public BlockMarble(int itemID, int textureID, Material material) {
		super(itemID, textureID, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	// Tell the game which texture file to use.
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	// For some reason, we need this...
	public int blockIndexInTexture(){
		return 24;
	}
	
}
