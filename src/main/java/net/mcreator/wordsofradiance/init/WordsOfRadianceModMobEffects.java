
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.wordsofradiance.potion.TransportationEffectMobEffect;
import net.mcreator.wordsofradiance.potion.TransportationCooldownMobEffect;
import net.mcreator.wordsofradiance.potion.TransformationEffectMobEffect;
import net.mcreator.wordsofradiance.potion.TensionSurgeMobEffect;
import net.mcreator.wordsofradiance.potion.ProgressionEffectMobEffect;
import net.mcreator.wordsofradiance.potion.LashedByOtherMobEffect;
import net.mcreator.wordsofradiance.potion.IlluminationEffectMobEffect;
import net.mcreator.wordsofradiance.potion.GravIconMobEffect;
import net.mcreator.wordsofradiance.potion.DivIconMobEffect;
import net.mcreator.wordsofradiance.potion.CohesionEffectMobEffect;
import net.mcreator.wordsofradiance.potion.AdhesionMobEffect;
import net.mcreator.wordsofradiance.potion.AbrasionGlyphMobEffect;
import net.mcreator.wordsofradiance.WordsOfRadianceMod;

public class WordsOfRadianceModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, WordsOfRadianceMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> GRAV_ICON = REGISTRY.register("grav_icon", () -> new GravIconMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DIV_ICON = REGISTRY.register("div_icon", () -> new DivIconMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LASHED_BY_OTHER = REGISTRY.register("lashed_by_other", () -> new LashedByOtherMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ABRASION_GLYPH = REGISTRY.register("abrasion_glyph", () -> new AbrasionGlyphMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> PROGRESSION_EFFECT = REGISTRY.register("progression_effect", () -> new ProgressionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ILLUMINATION_EFFECT = REGISTRY.register("illumination_effect", () -> new IlluminationEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSFORMATION_EFFECT = REGISTRY.register("transformation_effect", () -> new TransformationEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSPORTATION_EFFECT = REGISTRY.register("transportation_effect", () -> new TransportationEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> COHESION_EFFECT = REGISTRY.register("cohesion_effect", () -> new CohesionEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TENSION_SURGE = REGISTRY.register("tension_surge", () -> new TensionSurgeMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ADHESION = REGISTRY.register("adhesion", () -> new AdhesionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TRANSPORTATION_COOLDOWN = REGISTRY.register("transportation_cooldown", () -> new TransportationCooldownMobEffect());
}
