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

import net.mcreator.wordsofradiance.world.inventory.SoulcastingEssencesMenu;
import net.mcreator.wordsofradiance.network.SoulcastingEssencesButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class SoulcastingEssencesScreen extends AbstractContainerScreen<SoulcastingEssencesMenu> {
	private final static HashMap<String, Object> guistate = SoulcastingEssencesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_lucentia;
	Button button_lucentia1;
	Button button_lucentia2;
	Button button_lucentia3;
	Button button_lucentia4;
	Button button_lucentia5;
	Button button_lucentia6;
	Button button_lucentia7;
	Button button_lucentia8;
	Button button_lucentia9;

	public SoulcastingEssencesScreen(SoulcastingEssencesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("words_of_radiance:textures/screens/soulcasting_essences.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 16 && mouseX < leftPos + 80 && mouseY > topPos + 28 && mouseY < topPos + 44) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_air"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 15 && mouseX < leftPos + 80 && mouseY > topPos + 51 && mouseY < topPos + 69) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_smoke"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 16 && mouseX < leftPos + 80 && mouseY > topPos + 75 && mouseY < topPos + 91) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_fire"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 15 && mouseX < leftPos + 80 && mouseY > topPos + 98 && mouseY < topPos + 116) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_quartz"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 15 && mouseX < leftPos + 80 && mouseY > topPos + 122 && mouseY < topPos + 139) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_wood"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 92 && mouseX < leftPos + 157 && mouseY > topPos + 27 && mouseY < topPos + 46) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_water"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 93 && mouseX < leftPos + 157 && mouseY > topPos + 52 && mouseY < topPos + 69) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_oil_coal"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 92 && mouseX < leftPos + 157 && mouseY > topPos + 74 && mouseY < topPos + 92) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_metal"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 93 && mouseX < leftPos + 157 && mouseY > topPos + 99 && mouseY < topPos + 116) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_stone"), mouseX, mouseY);
		}
		if (mouseX > leftPos + 92 && mouseX < leftPos + 157 && mouseY > topPos + 123 && mouseY < topPos + 140) {
			guiGraphics.renderTooltip(font, Component.translatable("gui.words_of_radiance.soulcasting_essences.tooltip_flesh_bone"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.soulcasting_essences.label_choose_soulcasting_essence"), 17, 7, -13434880, false);
	}

	@Override
	public void init() {
		super.init();
		button_lucentia = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(0, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 97, 67, 20).build();
		guistate.put("button:button_lucentia", button_lucentia);
		this.addRenderableWidget(button_lucentia);
		button_lucentia1 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia1"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(1, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 26, 67, 20).build();
		guistate.put("button:button_lucentia1", button_lucentia1);
		this.addRenderableWidget(button_lucentia1);
		button_lucentia2 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia2"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(2, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 50, 67, 20).build();
		guistate.put("button:button_lucentia2", button_lucentia2);
		this.addRenderableWidget(button_lucentia2);
		button_lucentia3 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia3"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(3, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 73, 67, 20).build();
		guistate.put("button:button_lucentia3", button_lucentia3);
		this.addRenderableWidget(button_lucentia3);
		button_lucentia4 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia4"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(4, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 121, 67, 20).build();
		guistate.put("button:button_lucentia4", button_lucentia4);
		this.addRenderableWidget(button_lucentia4);
		button_lucentia5 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia5"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(5, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 26, 67, 20).build();
		guistate.put("button:button_lucentia5", button_lucentia5);
		this.addRenderableWidget(button_lucentia5);
		button_lucentia6 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia6"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(6, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 50, 67, 20).build();
		guistate.put("button:button_lucentia6", button_lucentia6);
		this.addRenderableWidget(button_lucentia6);
		button_lucentia7 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia7"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(7, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 73, 67, 20).build();
		guistate.put("button:button_lucentia7", button_lucentia7);
		this.addRenderableWidget(button_lucentia7);
		button_lucentia8 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia8"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(8, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 97, 67, 20).build();
		guistate.put("button:button_lucentia8", button_lucentia8);
		this.addRenderableWidget(button_lucentia8);
		button_lucentia9 = Button.builder(Component.translatable("gui.words_of_radiance.soulcasting_essences.button_lucentia9"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new SoulcastingEssencesButtonMessage(9, x, y, z));
				SoulcastingEssencesButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 91, this.topPos + 121, 67, 20).build();
		guistate.put("button:button_lucentia9", button_lucentia9);
		this.addRenderableWidget(button_lucentia9);
	}
}
