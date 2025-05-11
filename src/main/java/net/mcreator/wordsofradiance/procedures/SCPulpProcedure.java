package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class SCPulpProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
			_vars.SoulcastingBlockSet = (Blocks.OAK_LOG.asItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
			_vars.syncPlayerVariables(entity);
		}
		SCastAirProcedure.execute(world, entity);
	}
}
