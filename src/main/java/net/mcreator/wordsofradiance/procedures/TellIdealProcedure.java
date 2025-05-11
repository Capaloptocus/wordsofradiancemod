package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class TellIdealProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).IdealOfDedicationVariable), false);
	}
}
