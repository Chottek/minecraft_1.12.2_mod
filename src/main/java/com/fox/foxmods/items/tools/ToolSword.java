package com.fox.foxmods.items.tools;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumHand;

public class ToolSword extends ItemSword implements IHasModel {

    public ToolSword(String name, ToolMaterial tm){
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

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
        target.setGlowing(true);
        target.setFire(10);

        return true;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.setGlowing(true);
        target.setFire(10);

        return true;
    }
}
