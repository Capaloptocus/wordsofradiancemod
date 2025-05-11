package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class ToggleSurgeOneProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).powerOneActive == true) {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.powerOneActive = false;
				_vars.syncPlayerVariables(entity);
			}
			if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("windrunners")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("skybreakers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("jezrien") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("nale")) {
				LashingSelfProcedure.execute(entity);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("dustbringers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("edgedancers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("channah") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("vedel")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.ABRASION_GLYPH);
				if (entity instanceof LivingEntity _entity) {
					AttributeInstance _attrInst = _entity.getAttribute(Attributes.STEP_HEIGHT);
					if (_attrInst != null)
						_attrInst.setBaseValue((float) 0.6);
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("truthwatchers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("lightweavers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("ash") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("pralla")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("elsecallers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("willshapers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("kalak") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("battar")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("stonewards") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("taln")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.TENSION_SURGE);
			}
		} else {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.powerOneActive = true;
				_vars.syncPlayerVariables(entity);
			}
			if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("dustbringers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("edgedancers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("channah") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("vedel")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.ABRASION_GLYPH, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("windrunners")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("skybreakers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("jezrien") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("nale")) {
				LashingSelfProcedure.execute(entity);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("truthwatchers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("lightweavers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("ash") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("pralla")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("elsecallers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("willshapers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("kalak") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("battar")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TRANSPORTATION_EFFECT, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("stonewards") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("taln")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TENSION_SURGE, 60, 1));
			}
		}
	}
}
