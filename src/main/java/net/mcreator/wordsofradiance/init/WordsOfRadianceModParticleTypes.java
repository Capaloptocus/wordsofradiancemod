
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.wordsofradiance.WordsOfRadianceMod;

public class WordsOfRadianceModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BINDSPREN = REGISTRY.register("bindspren", () -> new SimpleParticleType(false));
}
