package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlateEffectsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double tempKnockback = 0;
		double tempJump = 0;
		double tempscale = 0;
		if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateSummoned == true) {
			if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateChecked == false
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))) {
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK))
					_livingEntity9.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(
							((entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK) ? _livingEntity8.getAttribute(Attributes.ATTACK_KNOCKBACK).getBaseValue() : 0) + 4));
				if (entity instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
					_livingEntity11.getAttribute(Attributes.JUMP_STRENGTH)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH) ? _livingEntity10.getAttribute(Attributes.JUMP_STRENGTH).getBaseValue() : 0) + 0.6));
				if (entity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity13.getAttribute(Attributes.SCALE)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.SCALE) ? _livingEntity12.getAttribute(Attributes.SCALE).getBaseValue() : 0) + 0.22));
				if (entity instanceof LivingEntity _livingEntity15 && _livingEntity15.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity15.getAttribute(Attributes.ATTACK_DAMAGE)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity14.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0) + 5));
				if (entity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity17.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(
							((entity instanceof LivingEntity _livingEntity16 && _livingEntity16.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity16.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0) + 0.1));
				if (entity instanceof LivingEntity _livingEntity19 && _livingEntity19.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
					_livingEntity19.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(
							((entity instanceof LivingEntity _livingEntity18 && _livingEntity18.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE) ? _livingEntity18.getAttribute(Attributes.SAFE_FALL_DISTANCE).getBaseValue() : 0) + 15));
				if (entity instanceof LivingEntity _livingEntity21 && _livingEntity21.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
					_livingEntity21.getAttribute(Attributes.STEP_HEIGHT)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity20 && _livingEntity20.getAttributes().hasAttribute(Attributes.STEP_HEIGHT) ? _livingEntity20.getAttribute(Attributes.STEP_HEIGHT).getBaseValue() : 0) + 0.1));
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.plateChecked = true;
					_vars.syncPlayerVariables(entity);
				}
			} else if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateChecked == true
					&& !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
							&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
							&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate")))
							&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("neoforge:shardplate"))))) {
				if (entity instanceof LivingEntity _livingEntity31 && _livingEntity31.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK))
					_livingEntity31.getAttribute(Attributes.ATTACK_KNOCKBACK).setBaseValue(
							((entity instanceof LivingEntity _livingEntity30 && _livingEntity30.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK) ? _livingEntity30.getAttribute(Attributes.ATTACK_KNOCKBACK).getBaseValue() : 0) - 4));
				if (entity instanceof LivingEntity _livingEntity33 && _livingEntity33.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
					_livingEntity33.getAttribute(Attributes.JUMP_STRENGTH)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity32 && _livingEntity32.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH) ? _livingEntity32.getAttribute(Attributes.JUMP_STRENGTH).getBaseValue() : 0) - 0.6));
				if (entity instanceof LivingEntity _livingEntity35 && _livingEntity35.getAttributes().hasAttribute(Attributes.SCALE))
					_livingEntity35.getAttribute(Attributes.SCALE)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity34 && _livingEntity34.getAttributes().hasAttribute(Attributes.SCALE) ? _livingEntity34.getAttribute(Attributes.SCALE).getBaseValue() : 0) - 0.2));
				if (entity instanceof LivingEntity _livingEntity37 && _livingEntity37.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity37.getAttribute(Attributes.ATTACK_DAMAGE)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity36 && _livingEntity36.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity36.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0) - 5));
				if (entity instanceof LivingEntity _livingEntity39 && _livingEntity39.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity39.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(
							((entity instanceof LivingEntity _livingEntity38 && _livingEntity38.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity38.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0) - 0.1));
				if (entity instanceof LivingEntity _livingEntity41 && _livingEntity41.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
					_livingEntity41.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(
							((entity instanceof LivingEntity _livingEntity40 && _livingEntity40.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE) ? _livingEntity40.getAttribute(Attributes.SAFE_FALL_DISTANCE).getBaseValue() : 0) - 15));
				if (entity instanceof LivingEntity _livingEntity43 && _livingEntity43.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
					_livingEntity43.getAttribute(Attributes.STEP_HEIGHT)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity42 && _livingEntity42.getAttributes().hasAttribute(Attributes.STEP_HEIGHT) ? _livingEntity42.getAttribute(Attributes.STEP_HEIGHT).getBaseValue() : 0) - 0.1));
				{
					WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
					_vars.plateChecked = false;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else if (entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateSummoned == false && entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).plateChecked == true) {
			if (entity instanceof LivingEntity _livingEntity45 && _livingEntity45.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK))
				_livingEntity45.getAttribute(Attributes.ATTACK_KNOCKBACK)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity44 && _livingEntity44.getAttributes().hasAttribute(Attributes.ATTACK_KNOCKBACK) ? _livingEntity44.getAttribute(Attributes.ATTACK_KNOCKBACK).getBaseValue() : 0) - 4));
			if (entity instanceof LivingEntity _livingEntity47 && _livingEntity47.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH))
				_livingEntity47.getAttribute(Attributes.JUMP_STRENGTH)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity46 && _livingEntity46.getAttributes().hasAttribute(Attributes.JUMP_STRENGTH) ? _livingEntity46.getAttribute(Attributes.JUMP_STRENGTH).getBaseValue() : 0) - 0.6));
			if (entity instanceof LivingEntity _livingEntity49 && _livingEntity49.getAttributes().hasAttribute(Attributes.SCALE))
				_livingEntity49.getAttribute(Attributes.SCALE)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity48 && _livingEntity48.getAttributes().hasAttribute(Attributes.SCALE) ? _livingEntity48.getAttribute(Attributes.SCALE).getBaseValue() : 0) - 0.2));
			if (entity instanceof LivingEntity _livingEntity51 && _livingEntity51.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
				_livingEntity51.getAttribute(Attributes.ATTACK_DAMAGE)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity50 && _livingEntity50.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity50.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0) - 5));
			if (entity instanceof LivingEntity _livingEntity53 && _livingEntity53.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
				_livingEntity53.getAttribute(Attributes.MOVEMENT_SPEED)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity52 && _livingEntity52.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED) ? _livingEntity52.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue() : 0) - 0.1));
			if (entity instanceof LivingEntity _livingEntity55 && _livingEntity55.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE))
				_livingEntity55.getAttribute(Attributes.SAFE_FALL_DISTANCE).setBaseValue(
						((entity instanceof LivingEntity _livingEntity54 && _livingEntity54.getAttributes().hasAttribute(Attributes.SAFE_FALL_DISTANCE) ? _livingEntity54.getAttribute(Attributes.SAFE_FALL_DISTANCE).getBaseValue() : 0) - 15));
			if (entity instanceof LivingEntity _livingEntity57 && _livingEntity57.getAttributes().hasAttribute(Attributes.STEP_HEIGHT))
				_livingEntity57.getAttribute(Attributes.STEP_HEIGHT)
						.setBaseValue(((entity instanceof LivingEntity _livingEntity56 && _livingEntity56.getAttributes().hasAttribute(Attributes.STEP_HEIGHT) ? _livingEntity56.getAttribute(Attributes.STEP_HEIGHT).getBaseValue() : 0) - 0.1));
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.plateChecked = false;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
