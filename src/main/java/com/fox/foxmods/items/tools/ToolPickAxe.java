package com.fox.foxmods.items.tools;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;

public class ToolPickAxe extends ItemPickaxe implements IHasModel {

    public ToolPickAxe(String name, ToolMaterial tm){
        super(tm);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.foxToolsTab);
        setMaxStackSize(1);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
