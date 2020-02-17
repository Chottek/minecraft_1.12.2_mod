package com.fox.foxmods.init;

import com.fox.foxmods.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CONCRETE_BLOCK = new ConcreteBlock("concrete_block", Material.ROCK);
    public static final Block LAMP_BLOCK = new LampBlock("lamp_block", Material.GLASS);
    public static final Block LAMP_PAVEMENT_BLOCK = new LightPathBlock("light_path", Material.GROUND);
    public static final Block LIGHT_FENCE = new BlockLightFence("light_fence");






}
