package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class LasheryProcedure {
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
		if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0.1 && entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashingSelf == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.GRAV_ICON, 400, 1));
			entity.setDeltaMovement(new Vec3(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashX, entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashY, entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashZ));
			entity.fallDistance = 0;
			if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).radiantTickCount % 50 == 0) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
			}
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).lashingSelf == true) {
			LashingSelfProcedure.execute(entity);
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 4, false, false));
			if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).radiantTickCount % 25 == 0) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
			}
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && (entity instanceof LivingEntity _livEnt14 && _livEnt14.hasEffect(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.REGENERATION);
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT, 400, 1));
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT);
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.soulcastingBlock = (Blocks.AIR.asItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
				_vars.syncPlayerVariables(entity);
			}
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.COHESION_EFFECT, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 1, false, false));
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT)) == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WATER_BREATHING);
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.cohesionSinkery = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
