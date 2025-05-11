package net.mcreator.wordsofradiance.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.Minecraft;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModItems;
import net.mcreator.wordsofradiance.client.gui.RestoreOrderCrusadeScreen;

import javax.annotation.Nonnull;

@EventBusSubscriber(Dist.CLIENT)
public class RestoreOrderCrusadeBookInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == WordsOfRadianceModItems.RESTORE_ORDER_CRUSADE_BOOK.get()) {
			if (Minecraft.getInstance().screen instanceof RestoreOrderCrusadeScreen) {
				Minecraft.getInstance().player.closeContainer();
			}
		}
	}

	public RestoreOrderCrusadeBookInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 0);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 1;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != WordsOfRadianceModItems.RESTORE_ORDER_CRUSADE_BOOK.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}
