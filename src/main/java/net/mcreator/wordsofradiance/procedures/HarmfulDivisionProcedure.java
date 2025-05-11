package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HarmfulDivisionProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double tempX = 0;
		double tempY = 0;
		double tempZ = 0;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WordsOfRadianceModMobEffects.DIV_ICON)) {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0 && entity.isShiftKeyDown()) {
				tempX = -1;
				tempY = 0;
				tempZ = -1;
				while (tempX <= 1) {
					while (tempY <= 2) {
						while (tempZ <= 1) {
							{
								BlockPos _pos = BlockPos.containing(x + tempX, y + tempY, z + tempZ);
								Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + tempX, y + tempY, z + tempZ), null);
								world.destroyBlock(_pos, false);
							}
							tempZ = tempZ + 1;
						}
						tempY = tempY + 1;
						tempZ = -1;
					}
					tempY = 0;
					tempX = tempX + 1;
				}
				world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 1, 0, 0);
				world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (-1), 0, 0);
				world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, 1);
				world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, 0, 0, (-1));
				if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).radiantTickCount % 25 == 0) {
					if (entity instanceof Player _player)
						_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
				}
			}
		}
	}
}
