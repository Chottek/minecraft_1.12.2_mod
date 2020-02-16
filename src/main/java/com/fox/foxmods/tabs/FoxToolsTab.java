package com.fox.foxmods.tabs;

import com.fox.foxmods.init.ModBlocks;
import com.fox.foxmods.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

public class FoxToolsTab extends CreativeTabs {

    public FoxToolsTab(String label) {
        super("foxtoolstab");
        this.setBackgroundImageName("foxmods.png");
//        this.mc.getTextureManager().bindTexture(new ResourceLocation("textures/gui/container/creative_inventory/tab_" + creativetabs.getBackgroundImageName()));

    }

    @Override
    public ItemStack getTabIconItem() { return new ItemStack(ModItems.CONCRETE_PICKAXE);}
}
