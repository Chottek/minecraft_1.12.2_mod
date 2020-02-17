package com.fox.foxmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LightPathBlock extends BlockBase {


    public LightPathBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(2.0f);
        setResistance(15.0f);
        setLightLevel(1);
    }

}
