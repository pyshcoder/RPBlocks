package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockBasaltBrick extends Block {
	
	
	public BlockBasaltBrick(int id, int textureId, Material material) {
		super(id, textureId, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	// Tell the game which texture file to use
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	// For some reason, we need this method.. :O
	public int blockIndexInTexture(){
		return 24;
	}

}
