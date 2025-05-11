package net.mcreator.wordsofradiance.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wordsofradiance.world.inventory.IdealOfDedicationMenu;
import net.mcreator.wordsofradiance.network.IdealOfDedicationButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class IdealOfDedicationScreen extends AbstractContainerScreen<IdealOfDedicationMenu> {
	private final static HashMap<String, Object> guistate = IdealOfDedicationMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_law_of_the_land;
	Button button_law_of_conquest;
	Button button_law_of_inhabitance;
	Button button_laws_beyond_death;

	public IdealOfDedicationScreen(IdealOfDedicationMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("words_of_radiance:textures/screens/ideal_of_dedication.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 36 && mouseX < leftPos + 139 && mouseY > topPos + 54 && mouseY < topPos + 72) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_dedication.tooltip_swear_not_to_kill_any_endermen"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 36 && mouseX < leftPos + 138 && mouseY > topPos + 25 && mouseY < topPos + 44) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_dedication.tooltip_swear_not_to_kill_other_players"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 29 && mouseX < leftPos + 148 && mouseY > topPos + 83 && mouseY < topPos + 103) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_dedication.tooltip_swear_not_to_kill_any_villagers"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 32 && mouseX < leftPos + 144 && mouseY > topPos + 114 && mouseY < topPos + 132) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_dedication.tooltip_swear_not_to_kill_any_zombies_s"), mouseX, mouseY);
		}
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.ideal_of_dedication.label_ideal_of_dedication"), 39, 7, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_law_of_the_land = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_dedication.button_law_of_the_land"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfDedicationButtonMessage(0, x, y, z));
				IdealOfDedicationButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 36, this.topPos + 24, 103, 20).build();
		guistate.put("button:button_law_of_the_land", button_law_of_the_land);
		this.addRenderableWidget(button_law_of_the_land);
		button_law_of_conquest = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_dedication.button_law_of_conquest"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfDedicationButtonMessage(1, x, y, z));
				IdealOfDedicationButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 36, this.topPos + 53, 103, 20).build();
		guistate.put("button:button_law_of_conquest", button_law_of_conquest);
		this.addRenderableWidget(button_law_of_conquest);
		button_law_of_inhabitance = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_dedication.button_law_of_inhabitance"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfDedicationButtonMessage(2, x, y, z));
				IdealOfDedicationButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 28, this.topPos + 83, 119, 20).build();
		guistate.put("button:button_law_of_inhabitance", button_law_of_inhabitance);
		this.addRenderableWidget(button_law_of_inhabitance);
		button_laws_beyond_death = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_dedication.button_laws_beyond_death"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfDedicationButtonMessage(3, x, y, z));
				IdealOfDedicationButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 31, this.topPos + 113, 113, 20).build();
		guistate.put("button:button_laws_beyond_death", button_laws_beyond_death);
		this.addRenderableWidget(button_laws_beyond_death);
	}
}
