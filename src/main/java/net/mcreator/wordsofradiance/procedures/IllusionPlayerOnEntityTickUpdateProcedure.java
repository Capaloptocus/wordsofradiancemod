package net.mcreator.wordsofradiance.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import java.util.Comparator;

public class IllusionPlayerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean keepAlve = false;
		keepAlve = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WordsOfRadianceModMobEffects.ILLUMINATION_EFFECT)) {
					keepAlve = true;
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.JUMP)) == false) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if (keepAlve) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1));
		}
	}
}
