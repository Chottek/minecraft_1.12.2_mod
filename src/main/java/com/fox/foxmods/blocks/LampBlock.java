package com.fox.foxmods.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LampBlock extends BlockBase {


    public LampBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.GLASS);
        setHardness(2.0f);
        setResistance(15.0f);
        setLightLevel(1);
    }

}
