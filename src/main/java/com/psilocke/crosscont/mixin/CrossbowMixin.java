package com.psilocke.crosscont.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@Mixin(CrossbowItem.class)
public abstract class CrossbowMixin {
	/*
	@Override
	public InteractionResultHolder<ItemStack> use(Level p_40920_, Player p_40921_, InteractionHand p_40922_) {
	      ItemStack itemstack = p_40921_.getItemInHand(p_40922_);
	      if (isCharged(itemstack)) {
	         performShooting(p_40920_, p_40921_, p_40922_, itemstack, getShootingPower(itemstack), 1.0F);
	         setCharged(itemstack, false);
	         return InteractionResultHolder.consume(itemstack);
	      } else if (!p_40921_.getProjectile(itemstack).isEmpty()) {
	         if (!isCharged(itemstack)) {
	            this.startSoundPlayed = false;
	            this.midLoadSoundPlayed = false;
	            p_40921_.startUsingItem(p_40922_);
	         }

	         return InteractionResultHolder.consume(itemstack);
	      } else {
	         return InteractionResultHolder.fail(itemstack);
	      }
	   }
	  */
}
