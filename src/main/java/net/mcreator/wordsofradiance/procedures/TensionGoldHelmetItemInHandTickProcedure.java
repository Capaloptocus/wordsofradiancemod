package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class TensionGoldHelmetItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double damage = 0;
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 || !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WordsOfRadianceModMobEffects.TENSION_SURGE))) {
			damage = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getDamageValue();
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(Items.GOLDEN_HELMET));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.GOLDEN_HELMET));
				}
			}
			(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).setDamageValue((int) damage);
		} else {
			if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).radiantTickCount % 50 == 0) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + -0.1));
			}
		}
	}
}
