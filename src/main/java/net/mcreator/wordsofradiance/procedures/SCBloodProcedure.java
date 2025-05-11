package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class SCBloodProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
			_vars.essence = "blood";
			_vars.syncPlayerVariables(entity);
		}
		SCastAirProcedure.execute(world, entity);
		{
			WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
			_vars.essence = "";
			_vars.syncPlayerVariables(entity);
		}
	}
}
