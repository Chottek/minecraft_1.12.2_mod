package com.fox.foxmods.init;

import com.fox.foxmods.items.ItemBase;
import com.fox.foxmods.items.armor.*;
import com.fox.foxmods.items.food.FoodBase;
import com.fox.foxmods.items.tools.ToolMop;
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

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    //Materials
    public static final ToolMaterial MATERIAL_CONCRETE = EnumHelper.addToolMaterial("material_concrete", 3, 500, 8.0f, 4.0f, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian",
            Reference.MOD_ID + ":obsidian", 14, new int[] {3, 9, 7, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f);

    public static final ToolMaterial MATERIAL_EBONY = EnumHelper.addToolMaterial("material_ebony", 3, 500, 8.0f, 6.0f, 10);
    //Items
    public static final Item CONCRETE_GEM = new ItemBase("concrete_gem");
    public static final Item CONCRETE_INGOT = new ItemBase("concrete_ingot");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");

    //Tools
    public static final ItemSword CONCRETE_SWORD = new ToolSword("concrete_sword", MATERIAL_CONCRETE);
    public static final ItemPickaxe CONCRETE_PICKAXE = new ToolPickAxe("concrete_pickaxe", MATERIAL_CONCRETE);

    public static final ItemSword EBONY_SWORD = new ToolSword("ebony_sword", MATERIAL_EBONY);

    public static final ItemSword MOP = new ToolMop("mop", ToolMaterial.WOOD);

    //Armor
    public static final Item OBSIDIAN_HELMET = new ObsidianHelmet("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item OBSIDIAN_CHEST = new ObsidianChest("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item OBSIDIAN_LEGGINS = new ObsidianLeggings("obsidian_leggins", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item OBSIDIAN_SHOES = new ObsidianBoots("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);

    //Food
    public static final Item MEAT_HEDGEHOG = new FoodBase("meat_hedgehog", 8, false);

}
