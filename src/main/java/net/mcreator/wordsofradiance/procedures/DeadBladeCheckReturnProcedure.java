package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;

public class DeadBladeCheckReturnProcedure {
	public static ItemStack execute(ItemStack itemstack) {
		ItemStack returnBlade = ItemStack.EMPTY;
		if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_BLUE_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLUE_BLADE.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_BLACK_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_BLACK.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_RED_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_RED.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_WHITE_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_WHITE.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_GREEN_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_GREEN.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_PINK_RED_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_PINK_RED.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_ZIRCON_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_ZIRCON.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_PURPLE_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_PURPLE.get()).copy();
		} else if (itemstack.getItem() == WordsOfRadianceModItems.DEAD_STONEWARD_BLADE_WITH_GEM.get()) {
			returnBlade = new ItemStack(WordsOfRadianceModItems.BONDED_DEAD_BLADE_ORANGE.get()).copy();
		} else {
			if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLUE_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_BLUE_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_BLACK.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_BLACK_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_RED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_RED_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_WHITE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_WHITE_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_GREEN.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_GREEN_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_PINK_RED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_PINK_RED_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_ZIRCON.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_ZIRCON_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_PURPLE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_PURPLE_BLADE_WITH_GEM.get()).copy();
			} else if (itemstack.getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_ORANGE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.DEAD_STONEWARD_BLADE_WITH_GEM.get()).copy();
			}
		}
		return returnBlade;
	}
}
