package net.mcreator.wordsofradiance.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.wordsofradiance.world.inventory.SoulcastingEssencesMenu;
import net.mcreator.wordsofradiance.network.WordsOfRadianceModVariables;
import net.mcreator.wordsofradiance.init.WordsOfRadianceModMobEffects;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@EventBusSubscriber
public class BlockTwoCoordsSoulcastProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES).soulcastingBlock == (Blocks.AIR.asItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState())) == false
				&& (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(WordsOfRadianceModMobEffects.TRANSFORMATION_EFFECT)) == true) {
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.soulcastingX2 = x;
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.soulcastingY2 = y;
				_vars.syncPlayerVariables(entity);
			}
			{
				WordsOfRadianceModVariables.PlayerVariables _vars = entity.getData(WordsOfRadianceModVariables.PLAYER_VARIABLES);
				_vars.soulcastingZ2 = z;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				_ent.openMenu(new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("SoulcastingEssences");
					}

					@Override
					public boolean shouldTriggerClientSideContainerClosingOnOpen() {
						return false;
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new SoulcastingEssencesMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
