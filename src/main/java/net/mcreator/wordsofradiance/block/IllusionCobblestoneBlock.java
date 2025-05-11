
package net.mcreator.wordsofradiance.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class IllusionCobblestoneBlock extends Block {
	public IllusionCobblestoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(0.1f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops().noCollission());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
