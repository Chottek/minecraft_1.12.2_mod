package com.fox.foxmods.items;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
//import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.foxTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
