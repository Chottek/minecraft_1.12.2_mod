package com.fox.foxmods.items.tools;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial tm){
        super(tm);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.foxToolsTab);
        setMaxStackSize(1);
        ModItems.ITEMS.add(this);
    }

    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, par3EntityLiving);
        par3EntityLiving.setFire(10);
        par3EntityLiving.setPosition(par3EntityLiving.getPosition().getX() - 10, par3EntityLiving.getPosition().getY() - 10, par3EntityLiving.getPosition().getZ() - 10);
        return true;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
