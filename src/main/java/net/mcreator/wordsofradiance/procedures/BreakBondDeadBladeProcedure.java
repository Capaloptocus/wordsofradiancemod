package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class BreakBondDeadBladeProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack tempItem = ItemStack.EMPTY;
		if (!(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedDeadBlade).equals("")) {
			tempItem = DeadBladeCheckReturnProcedure.execute(itemstack).copy();
			itemstack.shrink(1);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("" + tempItem)), false);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = tempItem.copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.bondedDeadBlade = "";
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
