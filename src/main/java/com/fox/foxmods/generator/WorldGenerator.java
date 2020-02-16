//package com.fox.foxmods.generator;
//
//import net.minecraft.block.Block;
//import net.minecraft.world.World;
//import net.minecraft.world.chunk.IChunkProvider;
//import net.minecraft.world.gen.IChunkGenerator;
//import net.minecraft.world.gen.feature.WorldGenMinable;
//import net.minecraftforge.fml.common.IWorldGenerator;
//
//import java.util.Random;
//
//public class WorldGenerator implements IWorldGenerator {
//
//    private Block block;
//    private int veinSize;
//
//
//    @Override
//    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//        if (world.provider.dimensionId == 0) {
//            this.runGenerator(new WorldGenMinable(block, veinSize), world, random, chunkX, chunkZ, 20, 0, 64);
//        }
//    }
//}
