package com.fox.foxmods.blocks;

import com.fox.foxmods.Main;
import com.fox.foxmods.init.ModBlocks;
import com.fox.foxmods.init.ModItems;
import com.fox.foxmods.util.IHasModel;
import net.minecraft.block.BlockFence;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLightFence extends BlockFence implements IHasModel {

    public BlockLightFence(String name) {
        super(Material.WOOD, MapColor.BROWN);

        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Main.foxTab);
        setSoundType(SoundType.WOOD);
        setLightLevel(1f);
        setHardness(5);
        setResistance(25f);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn) {
        return true;
    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return false;
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entity) {
        if (entity instanceof EntityMob) {
            ((EntityMob) entity).addPotionEffect(new PotionEffect(Potion.getPotionById(2), 200, 1)); //Slowness
            ((EntityMob) entity).setFire(10);
            ((EntityMob) entity).setGlowing(true);
        }
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
