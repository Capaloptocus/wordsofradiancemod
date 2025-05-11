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

import net.mcreator.wordsofradiance.world.inventory.IdealOfCrusadeMenu;
import net.mcreator.wordsofradiance.network.IdealOfCrusadeButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class IdealOfCrusadeScreen extends AbstractContainerScreen<IdealOfCrusadeMenu> {
	private final static HashMap<String, Object> guistate = IdealOfCrusadeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_restore_order;
	Button button_defeat_a_tyrant;
	Button button_destroy_a_monstrosity;
	Button button_defend_the_innocent;
	Button button_hunt;

	public IdealOfCrusadeScreen(IdealOfCrusadeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("words_of_radiance:textures/screens/ideal_of_crusade.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 44 && mouseX < leftPos + 137 && mouseY > topPos + 109 && mouseY < topPos + 128) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.tooltip_respawn_the_ender_dragon"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 40 && mouseX < leftPos + 141 && mouseY > topPos + 26 && mouseY < topPos + 44) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.tooltip_kill_the_ender_dragon"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 22 && mouseX < leftPos + 155 && mouseY > topPos + 54 && mouseY < topPos + 72) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.tooltip_kill_the_wither"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 26 && mouseX < leftPos + 149 && mouseY > topPos + 83 && mouseY < topPos + 101) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.tooltip_win_a_raid"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 67 && mouseX < leftPos + 113 && mouseY > topPos + 136 && mouseY < topPos + 154) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.tooltip_kill_one_of_every_hostile_mob"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.ideal_of_crusade.label_choose_a_crusade"), 45, 6, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_restore_order = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_crusade.button_restore_order"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfCrusadeButtonMessage(0, x, y, z));
				IdealOfCrusadeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 44, this.topPos + 108, 93, 20).build();
		guistate.put("button:button_restore_order", button_restore_order);
		this.addRenderableWidget(button_restore_order);
		button_defeat_a_tyrant = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_crusade.button_defeat_a_tyrant"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfCrusadeButtonMessage(1, x, y, z));
				IdealOfCrusadeButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 39, this.topPos + 25, 103, 20).build();
		guistate.put("button:button_defeat_a_tyrant", button_defeat_a_tyrant);
		this.addRenderableWidget(button_defeat_a_tyrant);
		button_destroy_a_monstrosity = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_crusade.button_destroy_a_monstrosity"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfCrusadeButtonMessage(2, x, y, z));
				IdealOfCrusadeButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 21, this.topPos + 53, 134, 20).build();
		guistate.put("button:button_destroy_a_monstrosity", button_destroy_a_monstrosity);
		this.addRenderableWidget(button_destroy_a_monstrosity);
		button_defend_the_innocent = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_crusade.button_defend_the_innocent"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfCrusadeButtonMessage(3, x, y, z));
				IdealOfCrusadeButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 25, this.topPos + 81, 124, 20).build();
		guistate.put("button:button_defend_the_innocent", button_defend_the_innocent);
		this.addRenderableWidget(button_defend_the_innocent);
		button_hunt = Button.builder(Component.translatable("gui.words_of_radiance.ideal_of_crusade.button_hunt"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new IdealOfCrusadeButtonMessage(4, x, y, z));
				IdealOfCrusadeButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 67, this.topPos + 135, 46, 20).build();
		guistate.put("button:button_hunt", button_hunt);
		this.addRenderableWidget(button_hunt);
	}
}
