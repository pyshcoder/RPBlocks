package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockMarbleBrick extends Block {
	
	public BlockMarbleBrick(int itemID, int textureID, Material material) {
		super(itemID, textureID, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	public int blockIndexInTexture(){
		return 24;
	}

}
