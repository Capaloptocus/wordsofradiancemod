package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.ScoreHolder;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class ModInfoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("blade summoned: " + entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bladeSummoned)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("plate summoned: " + entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateSummoned)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("honourblade" + entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Shardblade" + entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedDeadBlade)), false);
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal(("Oath" + getEntityScore("Oath", entity))), false);
	}

	private static int getEntityScore(String score, Entity entity) {
		Scoreboard scoreboard = entity.level().getScoreboard();
		Objective scoreboardObjective = scoreboard.getObjective(score);
		if (scoreboardObjective != null)
			return scoreboard.getOrCreatePlayerScore(ScoreHolder.forNameOnly(entity.getScoreboardName()), scoreboardObjective).get();
		return 0;
	}
}
