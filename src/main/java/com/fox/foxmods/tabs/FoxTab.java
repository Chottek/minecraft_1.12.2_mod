package com.fox.foxmods.tabs;

import com.fox.foxmods.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class FoxTab extends CreativeTabs {

    public FoxTab(String label) {
        super("foxmods");
        this.setBackgroundImageName("foxmods.png");
//        this.mc.getTextureManager().bindTexture(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + creativetabs.getBackgroundImageName()));

    }

    @Override
    public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(ModBlocks.CONCRETE_BLOCK));}
}
