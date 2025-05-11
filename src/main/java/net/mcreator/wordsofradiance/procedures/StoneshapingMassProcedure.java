package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class StoneshapingMassProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState currentBlock = Blocks.AIR.defaultBlockState();
		BlockState blockSet = Blocks.AIR.defaultBlockState();
		double tempX = 0;
		double tempZ = 0;
		double tempy = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT) && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
			tempy = -2;
			tempX = -4;
			tempZ = -4;
			while (tempy <= 0) {
				while (tempX <= 4) {
					while (tempZ <= 4) {
						if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
							currentBlock = (world.getBlockState(BlockPos.containing(x + tempX, y + tempy, z + tempZ)));
							blockSet = BlockCheckProcedure.execute(currentBlock);
							if (blockSet.getBlock() instanceof LiquidBlock) {
								{
									BlockPos _bp = BlockPos.containing(x + tempX, y + tempy, z + tempZ);
									BlockState _bs = blockSet;
									BlockState _bso = world.getBlockState(_bp);
									for (Property<?> _propertyOld : _bso.getProperties()) {
										Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
										if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
											try {
												_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								{
									WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
									_vars.xpDrain = ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 1) % 8;
									_vars.syncPlayerVariables(entity);
								}
								if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 7) {
									if (entity instanceof Player _player)
										_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
								}
							}
						}
						tempZ = tempZ + 1;
					}
					tempZ = -4;
					tempX = tempX + 1;
				}
				tempX = -4;
				tempy = tempy + 1;
			}
		}
	}
}
