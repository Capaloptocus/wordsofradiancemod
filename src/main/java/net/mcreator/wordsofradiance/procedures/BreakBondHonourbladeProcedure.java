package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class BreakBondHonourbladeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("")) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = HonourBladeCheckReturnProcedure.execute(entity).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.bondedHonourblade = "";
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.bladeSummoned = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
