package com.psilocke.crosscont.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

@Mixin(EnchantmentCategory.class)
public abstract class EnchantmentCategoryMixin {
	@Inject(method = "canEchant", at = @At("LBOW"))
	public boolean canEnchant(Item item) {
		return item instanceof CrossbowItem || item instanceof BowItem;
	}
}
