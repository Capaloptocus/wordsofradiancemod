package net.mcreator.wordsofradiance.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.wordsofradiance.world.inventory.LawsBeyondDeathDedicationMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LawsBeyondDeathDedicationScreen extends AbstractContainerScreen<LawsBeyondDeathDedicationMenu> {
	private final static HashMap<String, Object> guistate = LawsBeyondDeathDedicationMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LawsBeyondDeathDedicationScreen(LawsBeyondDeathDedicationMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("words_of_radiance:textures/screens/laws_beyond_death_dedication.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_skybreaker_dedication"), 26, 7, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_law_of_the_land"), 44, 21, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_the_other_players_have_the_right"), 4, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_to_this_land_by_birth_you_have"), 3, 57, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_sworn_not_to_kill_any_other_play"), 4, 70, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_players_or_their_pets"), 4, 83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_denizens_of_the_end_have_claimed"), 3, 96, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_this_land_by_right_of_conquest"), 4, 109, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_kill_any_zombies_skeletons"), 4, 122, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_drowned_wither_skeletons_or"), 4, 134, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.words_of_radiance.laws_beyond_death_dedication.label_other_undead_including_the_with"), 4, 145, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
