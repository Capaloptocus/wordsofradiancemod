
package net.mcreator.wordsofradiance.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluids;

public class BeadsBlock extends LiquidBlock {
	public BeadsBlock(BlockBehaviour.Properties properties) {
		super(WordsOfRadianceModFluids.BEADS.get(), properties.mapColor(MapColor.WATER).strength(200f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
