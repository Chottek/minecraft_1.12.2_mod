package com.fox.foxmods.items.tools;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial tm){
        super(tm);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.foxToolsTab);
        setMaxStackSize(1);
//        setDamage(DamageSource.causeArrowDamage());
//        setDamage(new DamageSource(DamageSource.causeExplosionDamage()));

        ModItems.ITEMS.add(this);
    }

    public void setEffectOnHit(){

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
