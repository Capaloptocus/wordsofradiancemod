
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.wordsofradiance.fluid.types.StoneFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.SandstoneFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.SandFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.NetheriteFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.GraniteFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.EndStoneFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.DirtFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.DioriteFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.CobblestoneFluidFluidType;
import net.mcreator.wordsofradiance.fluid.types.BeadsFluidType;
import net.mcreator.wordsofradiance.fluid.types.AndesiteFluidFluidType;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

public class WordsOfRadianceModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> STONE_FLUID_TYPE = REGISTRY.register("stone_fluid", () -> new StoneFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> DIRT_FLUID_TYPE = REGISTRY.register("dirt_fluid", () -> new DirtFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> COBBLESTONE_FLUID_TYPE = REGISTRY.register("cobblestone_fluid", () -> new CobblestoneFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> SAND_FLUID_TYPE = REGISTRY.register("sand_fluid", () -> new SandFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> NETHERITE_FLUID_TYPE = REGISTRY.register("netherite_fluid", () -> new NetheriteFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> END_STONE_FLUID_TYPE = REGISTRY.register("end_stone_fluid", () -> new EndStoneFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> ANDESITE_FLUID_TYPE = REGISTRY.register("andesite_fluid", () -> new AndesiteFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> DIORITE_FLUID_TYPE = REGISTRY.register("diorite_fluid", () -> new DioriteFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> GRANITE_FLUID_TYPE = REGISTRY.register("granite_fluid", () -> new GraniteFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> SANDSTONE_FLUID_TYPE = REGISTRY.register("sandstone_fluid", () -> new SandstoneFluidFluidType());
	public static final DeferredHolder<FluidType, FluidType> BEADS_TYPE = REGISTRY.register("beads", () -> new BeadsFluidType());
}
