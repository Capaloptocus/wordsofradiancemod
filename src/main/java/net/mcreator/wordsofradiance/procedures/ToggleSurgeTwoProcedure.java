package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class ToggleSurgeTwoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).powerTwoActive == false) {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.powerTwoActive = true;
				_vars.syncPlayerVariables(entity);
			}
			if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("edgedancers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("truthwatchers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("vedel") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("pralla")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("lightweavers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("elsecallers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("ash") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("battar")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("willshapers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("stonewards")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("kalak") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("taln")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.COHESION_EFFECT, 60, 1));
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("windrunners") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("jezrien")) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(WordsOfRadianceModMobEffects.ADHESION, 60, 1));
			}
		} else {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.powerTwoActive = false;
				_vars.syncPlayerVariables(entity);
			}
			if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("skybreakers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("dustbringers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("nale") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("channah")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.DIV_ICON);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("edgedancers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("truthwatchers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("vedel") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("pralla")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.PROGRESSION_EFFECT);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("lightweavers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("elsecallers")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("ash") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("battar")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT);
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.soulcastingBlock = (Blocks.AIR.asItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
					_vars.syncPlayerVariables(entity);
				}
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("willshapers")
					|| (entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
							? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
							: "").equals("stonewards")
					|| (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("kalak") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("taln")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.WATER_BREATHING);
			} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
					? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "").equals("windrunners") || (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bondedHonourblade).equals("jezrien")) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(WordsOfRadianceModMobEffects.ADHESION);
			}
		}
	}
}
