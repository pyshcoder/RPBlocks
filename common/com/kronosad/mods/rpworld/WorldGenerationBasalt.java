package com.kronosad.mods.rpworld;

import java.util.Random;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerationBasalt implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		//System.out.println(world.provider.worldType);
		switch (world.provider.dimensionId){
		case -1: generateNether(world, random, chunkX*16, chunkZ*16);
		case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}
	
	// Generate blocks in the world
	private void generateSurface(World world, Random random, int blockX, int blockZ) {
		int Xcoord = blockX + random.nextInt(16);
		  int Ycoord = random.nextInt(100);
		  int Zcoord = blockZ + random.nextInt(16);
		  //System.out.println("Basalt At: " + "X: " + Xcoord + " Y: " + Ycoord + " Z: " + Zcoord); - Debug purposes
		  (new WorldGenMinable(RPWorld.basalt.blockID, 100)).generate(world, random, Xcoord, Ycoord, Zcoord);
		
	}

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
}
