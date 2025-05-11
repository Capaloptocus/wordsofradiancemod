package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CohesionSinkProcedureProcedure {
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
		boolean loc = false;
		BlockState blockToChange = Blocks.AIR.defaultBlockState();
		BlockState blockToChange2 = Blocks.AIR.defaultBlockState();
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).cohesionSinkery == true && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
			blockToChange = (world.getBlockState(BlockPos.containing(x, y - 1, z)));
			blockToChange2 = BlockCheckProcedure.execute(blockToChange);
			if (blockToChange2.getBlock() instanceof LiquidBlock) {
				if (blockToChange2.getBlock() == (Blocks.AIR.asItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).getBlock()) {
					loc = true;
				} else {
					{
						BlockPos _bp = BlockPos.containing(x, y - 1, z);
						BlockState _bs = blockToChange2;
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
						_vars.xpDrain = (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).xpDrain + 1) % 4;
						_vars.syncPlayerVariables(entity);
					}
					if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).xpDrain == 3) {
						if (entity instanceof Player _player)
							_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 0.1));
					}
				}
			}
		}
	}
}
