package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;

public class BondHonourbladeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack newBlade = ItemStack.EMPTY;
		if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("")) {
			newBlade = HonourBladeCheckReturnProcedure.execute(entity).copy();
			(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = newBlade.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.JEZRIENS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "jezrien";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.NALES_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "nale";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.CHANNAHS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "channah";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.VEDELS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "vedel";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.PRALLAS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "pralla";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.ASHS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "ash";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.BATTARS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "battar";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.KALAKS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "kalak";
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WordsOfRadianceModItems.TALNS_BLADE_BONDED.get()) {
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.bondedHonourblade = "taln";
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
