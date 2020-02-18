package com.fox.foxmods.items.tools;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class ToolMop extends ItemSword implements IHasModel {

    private boolean isWet;
    private int wetCounter;
    private List<EntityLivingBase> wetMobs;
    private List<Integer> wetMobsTicks;
    private EntityLivingBase player;


    public ToolMop(String name, ToolMaterial material) {
        super(material);

        wetMobs = new ArrayList<>();
        wetMobsTicks = new ArrayList<>();

        setDamage(new ItemStack(this, 1), 0);
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxDamage(0);
        setCreativeTab(Main.foxToolsTab);
        ModItems.ITEMS.add(this);
        setMaxStackSize(1);


        isWet = true;
        wetCounter = 30;
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }



    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if(wetCounter > 0)
            wetCounter--;

        if(wetCounter <= 0)
            isWet = false;

        if(wetMobs.size() > 0){
            for(int i = 0; i < wetMobs.size(); i++){
                if(target.equals(wetMobs.get(i)))
                    wetMobsTicks.set(i, 600);
            }
        }

        if(player == null)
            player = attacker;

        wetMobs.add(target);
        wetMobsTicks.add(600);

        target.setGlowing(true);
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 200, 1));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 1));
        target.addPotionEffect(new PotionEffect(Potion.getPotionById(27), 200, 1));

        if(isWet)
            target.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 200, 1));

        return true;
    }


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("Wet uses left: " + wetCounter);
        tooltip.add("Impacted: " + wetMobs.size());

        if(wetMobsTicks.size() != 0)
            tooltip.add("First Mob ticks: "+ wetMobsTicks.get(0));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private void tickWetMobs(){
        if(wetMobs.size() <= 0)
            return;

        for(int i = 0; i < wetMobs.size(); i++){
            wetMobsTicks.set(i, wetMobsTicks.get(i) - 1);

            if(wetMobsTicks.get(i) <= 0 || wetMobs.get(i).isDead){
                wetMobs.get(i).setGlowing(false);
                wetMobs.remove(i);
                wetMobsTicks.remove(i);
            }
        }
    }

    //TODO: Get ticks from game to set mobs glowing to false

}
