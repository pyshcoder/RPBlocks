package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockBasaltCobbleStone extends Block {
	
	public BlockBasaltCobbleStone(int itemID, int textureID, Material material) {
		super(itemID, textureID, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	// Tell the game where our texture file is
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	// For some reason, the game needs this...
	public int blockIndexInTexture(){
		return 24;
	}
	
	
}
