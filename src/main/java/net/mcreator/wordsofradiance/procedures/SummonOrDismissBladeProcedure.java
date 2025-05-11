package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

public class SummonOrDismissBladeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).bladeSummoned) {
			SummonShardbladeOnKeyPressProcedure.execute(world, entity);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:dismissable_shardblade")))) {
			ManuallyDismissShardbladeProcedure.execute(world, x, y, z, entity, entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		}
	}
}
