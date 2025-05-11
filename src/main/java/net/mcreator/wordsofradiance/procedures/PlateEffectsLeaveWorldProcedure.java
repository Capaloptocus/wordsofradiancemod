package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlateEffectsLeaveWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double tempKnockback = 0;
		double tempJump = 0;
		double tempscale = 0;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateSummoned == true) {
			SummonPlateProcedure.execute(world, entity);
			PlateEffectsProcedure.execute(entity);
		}
	}
}
