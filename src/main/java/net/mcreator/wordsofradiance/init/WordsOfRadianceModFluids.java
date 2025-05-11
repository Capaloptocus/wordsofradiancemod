
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.wordsofradiance.fluid.StoneFluidFluid;
import net.mcreator.wordsofradiance.fluid.SandstoneFluidFluid;
import net.mcreator.wordsofradiance.fluid.SandFluidFluid;
import net.mcreator.wordsofradiance.fluid.NetheriteFluidFluid;
import net.mcreator.wordsofradiance.fluid.GraniteFluidFluid;
import net.mcreator.wordsofradiance.fluid.EndStoneFluidFluid;
import net.mcreator.wordsofradiance.fluid.DirtFluidFluid;
import net.mcreator.wordsofradiance.fluid.DioriteFluidFluid;
import net.mcreator.wordsofradiance.fluid.CobblestoneFluidFluid;
import net.mcreator.wordsofradiance.fluid.BeadsFluid;
import net.mcreator.wordsofradiance.fluid.AndesiteFluidFluid;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

public class WordsOfRadianceModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> STONE_FLUID = REGISTRY.register("stone_fluid", () -> new StoneFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STONE_FLUID = REGISTRY.register("flowing_stone_fluid", () -> new StoneFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> DIRT_FLUID = REGISTRY.register("dirt_fluid", () -> new DirtFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DIRT_FLUID = REGISTRY.register("flowing_dirt_fluid", () -> new DirtFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> COBBLESTONE_FLUID = REGISTRY.register("cobblestone_fluid", () -> new CobblestoneFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_COBBLESTONE_FLUID = REGISTRY.register("flowing_cobblestone_fluid", () -> new CobblestoneFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> SAND_FLUID = REGISTRY.register("sand_fluid", () -> new SandFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SAND_FLUID = REGISTRY.register("flowing_sand_fluid", () -> new SandFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> NETHERITE_FLUID = REGISTRY.register("netherite_fluid", () -> new NetheriteFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_NETHERITE_FLUID = REGISTRY.register("flowing_netherite_fluid", () -> new NetheriteFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> END_STONE_FLUID = REGISTRY.register("end_stone_fluid", () -> new EndStoneFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_END_STONE_FLUID = REGISTRY.register("flowing_end_stone_fluid", () -> new EndStoneFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> ANDESITE_FLUID = REGISTRY.register("andesite_fluid", () -> new AndesiteFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ANDESITE_FLUID = REGISTRY.register("flowing_andesite_fluid", () -> new AndesiteFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> DIORITE_FLUID = REGISTRY.register("diorite_fluid", () -> new DioriteFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DIORITE_FLUID = REGISTRY.register("flowing_diorite_fluid", () -> new DioriteFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> GRANITE_FLUID = REGISTRY.register("granite_fluid", () -> new GraniteFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GRANITE_FLUID = REGISTRY.register("flowing_granite_fluid", () -> new GraniteFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> SANDSTONE_FLUID = REGISTRY.register("sandstone_fluid", () -> new SandstoneFluidFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_SANDSTONE_FLUID = REGISTRY.register("flowing_sandstone_fluid", () -> new SandstoneFluidFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> BEADS = REGISTRY.register("beads", () -> new BeadsFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BEADS = REGISTRY.register("flowing_beads", () -> new BeadsFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(STONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_STONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DIRT_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DIRT_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(COBBLESTONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_COBBLESTONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SAND_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SAND_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NETHERITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NETHERITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(END_STONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_END_STONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ANDESITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ANDESITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(DIORITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_DIORITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GRANITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GRANITE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SANDSTONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SANDSTONE_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BEADS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BEADS.get(), RenderType.translucent());
		}
	}
}
