package com.fox.foxmods.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init(){
        GameRegistry.addSmelting(ModItems.CONCRETE_GEM, new ItemStack(ModItems.CONCRETE_INGOT), 500);
        GameRegistry.addSmelting(Item.getItemFromBlock(Blocks.OBSIDIAN), new ItemStack(ModItems.OBSIDIAN_INGOT), 500);
    }

}
