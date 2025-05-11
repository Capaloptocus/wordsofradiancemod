package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AbrasionSelfProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WordsOfRadianceModMobEffects.ABRASION_GLYPH)) {
			if (entity instanceof LivingEntity _entity) {
				AttributeInstance _attrInst = _entity.getAttribute(Attributes.STEP_HEIGHT);
				if (_attrInst != null)
					_attrInst.setBaseValue((float) 1.1);
			}
			if (entity.onGround()) {
				entity.setDeltaMovement(new Vec3((Math.abs(entity.getDeltaMovement().x()) < 3 ? entity.getDeltaMovement().x() * 1.8 : entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()),
						(Math.abs(entity.getDeltaMovement().z()) < 3 ? entity.getDeltaMovement().z() * 1.8 : entity.getDeltaMovement().z())));
			}
			if (entity instanceof Player) {
				if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
						? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "").equals("dustbringers")
						|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "").equals("edgedancers")) {
					if (0 == entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).radiantTickCount % 50) {
						if (entity instanceof Player _player)
							_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
					}
				}
			}
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT, 400, 1));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 40, 1, false, false));
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT, 400, 1));
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT);
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(WordsOfRadianceModMobEffects.ADHESION)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.ADHESION, 400, 1));
		} else if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 0 && entity instanceof LivingEntity _livEnt34 && _livEnt34.hasEffect(WordsOfRadianceModMobEffects.ADHESION)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WordsOfRadianceModMobEffects.ADHESION);
		}
	}
}
