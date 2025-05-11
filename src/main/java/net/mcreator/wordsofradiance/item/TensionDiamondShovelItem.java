
package net.mcreator.wordsofradiance.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.procedures.TensionDiamondShovelItemInHandTickProcedure;

public class TensionDiamondShovelItem extends Item {
	public TensionDiamondShovelItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).durability(2031).fireResistant());
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 8f;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			TensionDiamondShovelItemInHandTickProcedure.execute(entity);
	}
}
