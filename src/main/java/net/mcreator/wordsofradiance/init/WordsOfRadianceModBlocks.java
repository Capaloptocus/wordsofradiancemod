
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.wordsofradiance.block.StoneFluidBlock;
import net.mcreator.wordsofradiance.block.StoneBladeVedBlock;
import net.mcreator.wordsofradiance.block.StoneBladeTalnBlock;
import net.mcreator.wordsofradiance.block.StoneBladePaiBlock;
import net.mcreator.wordsofradiance.block.StoneBladeNalBlock;
import net.mcreator.wordsofradiance.block.StoneBladeKalBlock;
import net.mcreator.wordsofradiance.block.StoneBladeJesBlock;
import net.mcreator.wordsofradiance.block.StoneBladeChanBlock;
import net.mcreator.wordsofradiance.block.StoneBladeBatBlock;
import net.mcreator.wordsofradiance.block.StoneBladeAshBlock;
import net.mcreator.wordsofradiance.block.ShadesmarDimensionPortalBlock;
import net.mcreator.wordsofradiance.block.SandstoneFluidBlock;
import net.mcreator.wordsofradiance.block.SandFluidBlock;
import net.mcreator.wordsofradiance.block.OathgateStoneBlock;
import net.mcreator.wordsofradiance.block.NetheriteFluidBlock;
import net.mcreator.wordsofradiance.block.InfusedStonesBlock;
import net.mcreator.wordsofradiance.block.IllusionStoneBlock;
import net.mcreator.wordsofradiance.block.IllusionSprucePlankBlock;
import net.mcreator.wordsofradiance.block.IllusionSpruceLogBlock;
import net.mcreator.wordsofradiance.block.IllusionOakPlankBlock;
import net.mcreator.wordsofradiance.block.IllusionOakLogBlock;
import net.mcreator.wordsofradiance.block.IllusionDirtBlock;
import net.mcreator.wordsofradiance.block.IllusionDarkOakPlankBlock;
import net.mcreator.wordsofradiance.block.IllusionDarkOakLogBlock;
import net.mcreator.wordsofradiance.block.IllusionCobblestoneBlock;
import net.mcreator.wordsofradiance.block.IllusionBirchPlankBlock;
import net.mcreator.wordsofradiance.block.IllusionBirchLogBlock;
import net.mcreator.wordsofradiance.block.GraniteFluidBlock;
import net.mcreator.wordsofradiance.block.EndStoneFluidBlock;
import net.mcreator.wordsofradiance.block.DirtFluidBlock;
import net.mcreator.wordsofradiance.block.DioriteFluidBlock;
import net.mcreator.wordsofradiance.block.CobblestoneFluidBlock;
import net.mcreator.wordsofradiance.block.BeadsBlock;
import net.mcreator.wordsofradiance.block.AndesiteFluidBlock;
import net.mcreator.wordsofradiance.block.AdhesiveBlock;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

import java.util.function.Function;

public class WordsOfRadianceModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(WordsOfRadianceMod.MODID);
	public static final DeferredBlock<Block> ILLUSION_STONE = register("illusion_stone", IllusionStoneBlock::new);
	public static final DeferredBlock<Block> ILLUSION_DIRT = register("illusion_dirt", IllusionDirtBlock::new);
	public static final DeferredBlock<Block> ILLUSION_OAK_PLANK = register("illusion_oak_plank", IllusionOakPlankBlock::new);
	public static final DeferredBlock<Block> ILLUSION_BIRCH_PLANK = register("illusion_birch_plank", IllusionBirchPlankBlock::new);
	public static final DeferredBlock<Block> ILLUSION_DARK_OAK_PLANK = register("illusion_dark_oak_plank", IllusionDarkOakPlankBlock::new);
	public static final DeferredBlock<Block> ILLUSION_SPRUCE_PLANK = register("illusion_spruce_plank", IllusionSprucePlankBlock::new);
	public static final DeferredBlock<Block> ILLUSION_OAK_LOG = register("illusion_oak_log", IllusionOakLogBlock::new);
	public static final DeferredBlock<Block> ILLUSION_BIRCH_LOG = register("illusion_birch_log", IllusionBirchLogBlock::new);
	public static final DeferredBlock<Block> ILLUSION_DARK_OAK_LOG = register("illusion_dark_oak_log", IllusionDarkOakLogBlock::new);
	public static final DeferredBlock<Block> ILLUSION_SPRUCE_LOG = register("illusion_spruce_log", IllusionSpruceLogBlock::new);
	public static final DeferredBlock<Block> ILLUSION_COBBLESTONE = register("illusion_cobblestone", IllusionCobblestoneBlock::new);
	public static final DeferredBlock<Block> STONE_FLUID = register("stone_fluid", StoneFluidBlock::new);
	public static final DeferredBlock<Block> DIRT_FLUID = register("dirt_fluid", DirtFluidBlock::new);
	public static final DeferredBlock<Block> COBBLESTONE_FLUID = register("cobblestone_fluid", CobblestoneFluidBlock::new);
	public static final DeferredBlock<Block> SAND_FLUID = register("sand_fluid", SandFluidBlock::new);
	public static final DeferredBlock<Block> ADHESIVE = register("adhesive", AdhesiveBlock::new);
	public static final DeferredBlock<Block> INFUSED_STONES = register("infused_stones", InfusedStonesBlock::new);
	public static final DeferredBlock<Block> NETHERITE_FLUID = register("netherite_fluid", NetheriteFluidBlock::new);
	public static final DeferredBlock<Block> END_STONE_FLUID = register("end_stone_fluid", EndStoneFluidBlock::new);
	public static final DeferredBlock<Block> ANDESITE_FLUID = register("andesite_fluid", AndesiteFluidBlock::new);
	public static final DeferredBlock<Block> DIORITE_FLUID = register("diorite_fluid", DioriteFluidBlock::new);
	public static final DeferredBlock<Block> GRANITE_FLUID = register("granite_fluid", GraniteFluidBlock::new);
	public static final DeferredBlock<Block> SANDSTONE_FLUID = register("sandstone_fluid", SandstoneFluidBlock::new);
	public static final DeferredBlock<Block> BEADS = register("beads", BeadsBlock::new);
	public static final DeferredBlock<Block> SHADESMAR_DIMENSION_PORTAL = register("shadesmar_dimension_portal", ShadesmarDimensionPortalBlock::new);
	public static final DeferredBlock<Block> OATHGATE_STONE = register("oathgate_stone", OathgateStoneBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_JES = register("stone_blade_jes", StoneBladeJesBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_NAL = register("stone_blade_nal", StoneBladeNalBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_CHAN = register("stone_blade_chan", StoneBladeChanBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_VED = register("stone_blade_ved", StoneBladeVedBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_PAI = register("stone_blade_pai", StoneBladePaiBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_ASH = register("stone_blade_ash", StoneBladeAshBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_BAT = register("stone_blade_bat", StoneBladeBatBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_KAL = register("stone_blade_kal", StoneBladeKalBlock::new);
	public static final DeferredBlock<Block> STONE_BLADE_TALN = register("stone_blade_taln", StoneBladeTalnBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
