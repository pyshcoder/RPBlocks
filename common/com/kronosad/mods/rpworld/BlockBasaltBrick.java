package com.kronosad.mods.rpworld;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockBasaltBrick extends Block {
	
	public BlockBasaltBrick(int id, int textureId, Material material) {
		super(id, textureId, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	public String getTextureFile(){
		return CommonProxy.BLOCK_PNG;
	}
	
	public int blockIndexInTexture(){
		return 24;
	}

}
