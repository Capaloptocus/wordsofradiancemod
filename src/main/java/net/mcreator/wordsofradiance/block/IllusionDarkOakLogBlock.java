
package net.mcreator.wordsofradiance.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class IllusionDarkOakLogBlock extends Block {
	public IllusionDarkOakLogBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).noCollission());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
