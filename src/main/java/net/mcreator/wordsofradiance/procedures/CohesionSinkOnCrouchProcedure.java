package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

public class CohesionSinkOnCrouchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getDeltaMovement().y() > -0.15 && (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(WordsOfRadianceModMobEffects.COHESION_EFFECT)) == true && entity.isShiftKeyDown()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.05), (entity.getDeltaMovement().z())));
		}
	}
}
