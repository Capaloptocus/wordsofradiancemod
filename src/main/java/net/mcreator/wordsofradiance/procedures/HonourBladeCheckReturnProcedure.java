package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;

public class HonourBladeCheckReturnProcedure {
	public static ItemStack execute(Entity entity) {
		if (entity == null)
			return ItemStack.EMPTY;
		ItemStack returnBlade = ItemStack.EMPTY;
		if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("")) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.JEZRIENS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.JEZRIENS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.NALES_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.NALES_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.CHANNAHS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.CHANNAHS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.VEDELS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.VEDELS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.PRALLAS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.PRALLAS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.ASHS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.ASHS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BATTARS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.BATTARS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.KALAKS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.KALAKS_BLADE_BONDED.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.TALNS_BLADE.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.TALNS_BLADE_BONDED.get()).copy();
			}
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.JEZRIENS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.JEZRIENS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.NALES_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.NALES_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.CHANNAHS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.CHANNAHS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.VEDELS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.VEDELS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.PRALLAS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.PRALLAS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.ASHS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.ASHS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BATTARS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.BATTARS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.KALAKS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.KALAKS_BLADE.get()).copy();
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.TALNS_BLADE_BONDED.get()) {
				returnBlade = new ItemStack(WordsOfRadianceModItems.TALNS_BLADE.get()).copy();
			}
		}
		return returnBlade;
	}
}
