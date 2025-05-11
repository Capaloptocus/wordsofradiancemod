
package net.mcreator.wordsofradiance.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluids;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluidTypes;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModBlocks;

public abstract class NetheriteFluidFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> WordsOfRadianceModFluidTypes.NETHERITE_FLUID_TYPE.get(), () -> WordsOfRadianceModFluids.NETHERITE_FLUID.get(),
			() -> WordsOfRadianceModFluids.FLOWING_NETHERITE_FLUID.get()).explosionResistance(100f).tickRate(24005).block(() -> (LiquidBlock) WordsOfRadianceModBlocks.NETHERITE_FLUID.get());

	private NetheriteFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NetheriteFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NetheriteFluidFluid {
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
