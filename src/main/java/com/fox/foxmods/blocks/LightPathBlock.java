package com.fox.foxmods.blocks;

import com.fox.foxmods.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LightPathBlock extends BlockBase {


    public LightPathBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL);
        setCreativeTab(Main.foxTab);
        setHardness(2.0f);
        setResistance(15.0f);
        setLightLevel(1);
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entity) {
        if (entity instanceof EntityMob) {
            ((EntityMob) entity).setGlowing(true);
        }
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
        return false;
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entity) {
        if (entity instanceof EntityMob) {
            ((EntityMob) entity).setGlowing(true);
        }
    }
}
