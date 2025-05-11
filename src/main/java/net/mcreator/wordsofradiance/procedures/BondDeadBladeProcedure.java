package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;

public class BondDeadBladeProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack newBlade = ItemStack.EMPTY;
		if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedDeadBlade).equals("\"\"") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedDeadBlade).equals("")) {
			newBlade = DeadBladeCheckReturnProcedure.execute(itemstack).copy();
			itemstack.shrink(1);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = newBlade.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLUE_BLADE.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "blue";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_BLACK.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "black";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_RED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "red";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_WHITE.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "white";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_GREEN.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "green";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_PINK_RED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "pinkRed";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_ZIRCON.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "zircon";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_PURPLE.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "purple";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BONDED_DEAD_BLADE_ORANGE.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedDeadBlade = "orange";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
