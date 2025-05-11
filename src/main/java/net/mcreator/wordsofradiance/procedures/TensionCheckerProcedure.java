package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TensionCheckerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WordsOfRadianceModMobEffects.TENSION_SURGE) && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TENSION_SURGE, 400, 1));
		} else if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(WordsOfRadianceModMobEffects.TENSION_SURGE) && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.TENSION_SURGE);
		}
	}
}
