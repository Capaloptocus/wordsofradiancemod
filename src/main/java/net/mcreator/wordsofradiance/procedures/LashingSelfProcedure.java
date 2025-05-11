package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class LashingSelfProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashingSelf == false) {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashingSelf = true;
				_vars.syncPlayerVariables(entity);
			}
		} else {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashingSelf = false;
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashed = false;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.GRAV_ICON);
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashX = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashY = 0;
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.lashZ = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
