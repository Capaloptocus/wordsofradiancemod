
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.wordsofradiance.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.wordsofradiance.network.UseSurge2Message;
import net.mcreator.wordsofradiance.network.UseSurge1Message;
import net.mcreator.wordsofradiance.network.SummonPlateKeyMessage;
import net.mcreator.wordsofradiance.network.SummonBladeMessage;
import net.mcreator.wordsofradiance.network.StoneshapingMassKeyMessage;
import net.mcreator.wordsofradiance.network.LashMessage;
import net.mcreator.wordsofradiance.network.HarmlessDivisionKeyMessage;
import net.mcreator.wordsofradiance.network.ElseKeyMessage;
import net.mcreator.wordsofradiance.network.CohesionSinkMessage;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WordsOfRadianceModKeyMappings {
	public static final KeyMapping USE_SURGE_1 = new KeyMapping("key.words_of_radiance.use_surge_1", GLFW.GLFW_KEY_X, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new UseSurge1Message(0, 0));
				UseSurge1Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LASH = new KeyMapping("key.words_of_radiance.lash", GLFW.GLFW_KEY_Q, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new LashMessage(0, 0));
				LashMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping HARMLESS_DIVISION_KEY = new KeyMapping("key.words_of_radiance.harmless_division_key", GLFW.GLFW_KEY_TAB, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new HarmlessDivisionKeyMessage(0, 0));
				HarmlessDivisionKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping USE_SURGE_2 = new KeyMapping("key.words_of_radiance.use_surge_2", GLFW.GLFW_KEY_C, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new UseSurge2Message(0, 0));
				UseSurge2Message.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELSE_KEY = new KeyMapping("key.words_of_radiance.else_key", GLFW.GLFW_KEY_B, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ElseKeyMessage(0, 0));
				ElseKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping COHESION_SINK = new KeyMapping("key.words_of_radiance.cohesion_sink", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new CohesionSinkMessage(0, 0));
				CohesionSinkMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				COHESION_SINK_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - COHESION_SINK_LASTPRESS);
				PacketDistributor.sendToServer(new CohesionSinkMessage(1, dt));
				CohesionSinkMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STONESHAPING_MASS_KEY = new KeyMapping("key.words_of_radiance.stoneshaping_mass_key", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new StoneshapingMassKeyMessage(0, 0));
				StoneshapingMassKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SUMMON_BLADE = new KeyMapping("key.words_of_radiance.summon_blade", GLFW.GLFW_KEY_Z, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SummonBladeMessage(0, 0));
				SummonBladeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SUMMON_PLATE_KEY = new KeyMapping("key.words_of_radiance.summon_plate_key", GLFW.GLFW_KEY_G, "key.categories.wor") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SummonPlateKeyMessage(0, 0));
				SummonPlateKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long COHESION_SINK_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(USE_SURGE_1);
		event.register(LASH);
		event.register(HARMLESS_DIVISION_KEY);
		event.register(USE_SURGE_2);
		event.register(ELSE_KEY);
		event.register(COHESION_SINK);
		event.register(STONESHAPING_MASS_KEY);
		event.register(SUMMON_BLADE);
		event.register(SUMMON_PLATE_KEY);
	}

	@EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				USE_SURGE_1.consumeClick();
				LASH.consumeClick();
				HARMLESS_DIVISION_KEY.consumeClick();
				USE_SURGE_2.consumeClick();
				ELSE_KEY.consumeClick();
				COHESION_SINK.consumeClick();
				STONESHAPING_MASS_KEY.consumeClick();
				SUMMON_BLADE.consumeClick();
				SUMMON_PLATE_KEY.consumeClick();
			}
		}
	}
}
