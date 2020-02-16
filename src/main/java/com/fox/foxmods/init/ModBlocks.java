package com.fox.foxmods.init;

import com.fox.foxmods.blocks.BlockBase;
import com.fox.foxmods.blocks.ConcreteBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CONCRETE_BLOCK = new ConcreteBlock("concrete_block", Material.ROCK);

}
