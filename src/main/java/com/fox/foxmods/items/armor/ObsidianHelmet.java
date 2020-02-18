package com.fox.foxmods.items.armor;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ObsidianHelmet extends ItemArmor implements IHasModel {


    public ObsidianHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.foxToolsTab);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(13), 1, 1));
        super.onArmorTick(world, player, itemStack);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

