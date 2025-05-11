
package net.mcreator.wordsofradiance.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluids;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluidTypes;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModBlocks;

public abstract class BeadsFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> WordsOfRadianceModFluidTypes.BEADS_TYPE.get(), () -> WordsOfRadianceModFluids.BEADS.get(), () -> WordsOfRadianceModFluids.FLOWING_BEADS.get())
			.explosionResistance(200f).levelDecreasePerBlock(2).bucket(() -> WordsOfRadianceModItems.BEADS_BUCKET.get()).block(() -> (LiquidBlock) WordsOfRadianceModBlocks.BEADS.get());

	private BeadsFluid() {
		super(PROPERTIES);
	}

	public static class Source extends BeadsFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BeadsFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
