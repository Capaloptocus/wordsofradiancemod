
package net.mcreator.wordsofradiance.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.wordsofradiance.init.WordsOfRadianceModFluids;

public class BeadsItem extends BucketItem {
	public BeadsItem(Item.Properties properties) {
		super(WordsOfRadianceModFluids.BEADS.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
