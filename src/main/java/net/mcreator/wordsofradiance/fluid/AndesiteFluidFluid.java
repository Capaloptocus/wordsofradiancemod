
package net.mcreator.wordsofradiance.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluids;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluidTypes;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModBlocks;

public abstract class AndesiteFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> WordsOfRadianceModFluidTypes.ANDESITE_FLUID_TYPE.get(), () -> WordsOfRadianceModFluids.ANDESITE_FLUID.get(),
			() -> WordsOfRadianceModFluids.FLOWING_ANDESITE_FLUID.get()).explosionResistance(100f).tickRate(2400).block(() -> (LiquidBlock) WordsOfRadianceModBlocks.ANDESITE_FLUID.get());

	private AndesiteFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AndesiteFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AndesiteFluidFluid {
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
