package com.fox.foxmods.items.food;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {


    public FoodBase(String name, int amount, boolean isWolfFood) {
        super(amount, isWolfFood);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.FOOD);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
