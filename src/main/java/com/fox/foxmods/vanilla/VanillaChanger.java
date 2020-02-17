package com.fox.foxmods.vanilla;

import net.minecraft.init.Blocks;


public class VanillaChanger {

    public VanillaChanger(){
        init();
    }

    public void init(){
        Blocks.CRAFTING_TABLE.setLightLevel(0.4f);
    }



}
