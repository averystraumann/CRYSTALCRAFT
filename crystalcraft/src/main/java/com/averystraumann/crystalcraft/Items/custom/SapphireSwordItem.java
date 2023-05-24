package com.averystraumann.crystalcraft.Items.custom;

import com.averystraumann.crystalcraft.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.fml.common.Mod;

public class SapphireSwordItem extends SwordItem {
    public SapphireSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        p_43279_.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200), p_43280_);
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
