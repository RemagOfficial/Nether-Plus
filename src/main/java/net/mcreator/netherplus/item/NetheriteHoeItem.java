
package net.mcreator.netherplus.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.netherplus.NetherplusModElements;

@NetherplusModElements.ModElement.Tag
public class NetheriteHoeItem extends NetherplusModElements.ModElement {
	@ObjectHolder("netherplus:netherite_hoe")
	public static final Item block = null;
	public NetheriteHoeItem(NetherplusModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("netherite_hoe"));
	}
}
