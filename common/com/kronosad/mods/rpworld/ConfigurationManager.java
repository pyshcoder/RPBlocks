package com.kronosad.mods.rpworld;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationManager {
	
	
	
	public ConfigurationManager(){
		
	}
	
	public void defaultConfig(File configPath){
		
		Configuration cfg = new Configuration(configPath);
		
		cfg.load();
		
		
		RPWorld.basaltID = cfg.getBlock("basalt", 500).getInt();
		RPWorld.basaltBrickID = cfg.getBlock("basaltbrick", 501).getInt();
		RPWorld.basaltCobbleID = cfg.getBlock("basaltcobble", 502).getInt();
		
		RPWorld.marbleID = cfg.getBlock("marble", 503).getInt();
		RPWorld.marbleBrickID = cfg.getBlock("marblebrick", 504).getInt();
		
		

		
		cfg.save();
		
		
	}
}
