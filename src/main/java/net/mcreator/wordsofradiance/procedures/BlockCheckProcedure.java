package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModBlocks;

public class BlockCheckProcedure {
	public static BlockState execute(BlockState blockstate) {
		BlockState returnValue = Blocks.AIR.defaultBlockState();
		returnValue = Blocks.AIR.defaultBlockState();
		if (blockstate.getBlock() instanceof LiquidBlock) {
			if (blockstate == WordsOfRadianceModBlocks.STONE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.STONE.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.DIRT_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.DIRT.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.SAND_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.SAND.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.COBBLESTONE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.COBBLESTONE.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.NETHERITE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.NETHERRACK.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.END_STONE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.END_STONE.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.ANDESITE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.ANDESITE.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.DIORITE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.DIORITE.defaultBlockState();
			} else if (blockstate == WordsOfRadianceModBlocks.GRANITE_FLUID.get().defaultBlockState()) {
				returnValue = Blocks.GRANITE.defaultBlockState();
			}
		} else {
			if (blockstate == Blocks.STONE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.STONE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.COARSE_DIRT.defaultBlockState() || blockstate == Blocks.DIRT_PATH.defaultBlockState() || blockstate == Blocks.GRASS_BLOCK.defaultBlockState() || blockstate == Blocks.PODZOL.defaultBlockState()
					|| blockstate == Blocks.DIRT.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.DIRT_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.COBBLESTONE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.COBBLESTONE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.SAND.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.SAND_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.NETHERRACK.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.NETHERITE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.END_STONE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.END_STONE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.ANDESITE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.ANDESITE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.DIORITE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.DIORITE_FLUID.get().defaultBlockState();
			} else if (blockstate == Blocks.GRANITE.defaultBlockState()) {
				returnValue = WordsOfRadianceModBlocks.GRANITE_FLUID.get().defaultBlockState();
			}
		}
		return returnValue;
	}
}
