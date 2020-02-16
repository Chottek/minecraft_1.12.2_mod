package com.fox.foxmods.init;

import com.fox.foxmods.items.ItemBase;
import com.fox.foxmods.items.armor.ArmorBase;
import com.fox.foxmods.items.tools.ToolPickAxe;
import com.fox.foxmods.items.tools.ToolSword;
import com.fox.foxmods.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial MATERIAL_CONCRETE = EnumHelper.addToolMaterial("material_concrete", 3, 500, 8.0f, 4.0f, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian",
            Reference.MOD_ID + ":obsidian", 14, new int[] {3, 9, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);


    //Items
    public static final Item CONCRETE_GEM = new ItemBase("concrete_gem");
    public static final Item CONCRETE_INGOT = new ItemBase("concrete_ingot");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

    //Tools
    public static final ItemSword CONCRETE_SWORD = new ToolSword("concrete_sword", MATERIAL_CONCRETE);
    public static final ItemPickaxe CONCRETE_PICKAXE = new ToolPickAxe("concrete_pickaxe", MATERIAL_CONCRETE);

    //Armor
    public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item OBSIDIAN_CHEST = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item OBSIDIAN_LEGGINS = new ArmorBase("obsidian_leggins", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item OBSIDIAN_SHOES = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);



}
