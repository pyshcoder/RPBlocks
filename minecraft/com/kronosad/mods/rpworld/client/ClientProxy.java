package com.kronosad.mods.rpworld.client;

import net.minecraftforge.client.MinecraftForgeClient;

import com.kronosad.mods.rpworld.CommonProxy;
import com.kronosad.mods.rpworld.RPWorld;

import cpw.mods.fml.common.registry.LanguageRegistry;


public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}

}
