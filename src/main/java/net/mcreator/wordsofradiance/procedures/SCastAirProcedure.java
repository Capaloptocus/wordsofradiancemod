package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class SCastAirProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double localX = 0;
		double localY = 0;
		double LocalZ = 0;
		double diffX = 0;
		double diffY = 0;
		double diffZ = 0;
		double stepX = 0;
		double stepY = 0;
		double stepZ = 0;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingX <= entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingX2) {
			stepX = 1;
		} else {
			stepX = -1;
		}
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY <= entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY2) {
			stepY = 1;
		} else {
			stepY = -1;
		}
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ <= entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ2) {
			stepZ = 1;
		} else {
			stepZ = -1;
		}
		localX = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingX;
		localY = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY;
		LocalZ = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ;
		diffX = Math.abs(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingX2 - entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingX);
		diffY = Math.abs(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY2 - entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY);
		diffZ = Math.abs(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ2 - entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ);
		while (diffX >= 0) {
			while (diffY >= 0) {
				while (diffZ >= 0) {
					if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0
							&& (world.getBlockState(BlockPos.containing(localX, localY, LocalZ))).getBlock() == entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingBlock.getBlock()) {
						if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).essence).equals("spark")) {
							world.setBlock(BlockPos.containing(localX, localY, LocalZ), Blocks.FIRE.defaultBlockState(), 3);
						} else if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).essence).equals("blood")) {
							world.setBlock(BlockPos.containing(localX, localY, LocalZ), Blocks.WATER.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(localX, localY, LocalZ), entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).SoulcastingBlockSet, 3);
						}
						if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).essence).equals("vapor")) {
							world.addParticle(ParticleTypes.LARGE_SMOKE, localX, localY, LocalZ, 0, 1, 0);
							world.addParticle(ParticleTypes.LARGE_SMOKE, localX, localY, LocalZ, 0, 0.8, 0);
						}
					}
					LocalZ = LocalZ + stepZ;
					diffZ = diffZ - 1;
				}
				localY = localY + stepY;
				diffY = diffY - 1;
				LocalZ = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ;
				diffZ = Math.abs(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ2 - entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingZ);
			}
			localX = localX + stepX;
			diffX = diffX - 1;
			localY = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY;
			diffY = Math.abs(entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY2 - entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingY);
		}
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
	}
}
