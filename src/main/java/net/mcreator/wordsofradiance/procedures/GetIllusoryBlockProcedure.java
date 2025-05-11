package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModBlocks;

public class GetIllusoryBlockProcedure {
	public static ItemStack execute(BlockState blockstate) {
		ItemStack returnBlock = ItemStack.EMPTY;
		if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.DIRT.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_DIRT.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.COBBLESTONE.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_COBBLESTONE.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.SPRUCE_LOG.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_SPRUCE_LOG.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.SPRUCE_PLANKS.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_SPRUCE_PLANK.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.DARK_OAK_LOG.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_DARK_OAK_LOG.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.DARK_OAK_PLANKS.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_DARK_OAK_PLANK.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.BIRCH_LOG.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_BIRCH_LOG.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.BIRCH_PLANKS.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_BIRCH_PLANK.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.OAK_LOG.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_OAK_LOG.get())).copy();
		} else if ((new ItemStack(blockstate.getBlock())).getItem() == Blocks.OAK_PLANKS.asItem()) {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_OAK_PLANK.get())).copy();
		} else {
			returnBlock = (new ItemStack(WordsOfRadianceModBlocks.ILLUSION_STONE.get())).copy();
		}
		return returnBlock;
	}
}
