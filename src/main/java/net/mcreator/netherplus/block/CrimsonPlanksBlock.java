
package net.mcreator.netherplus.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.netherplus.NetherplusModElements;

import java.util.List;
import java.util.Collections;

@NetherplusModElements.ModElement.Tag
public class CrimsonPlanksBlock extends NetherplusModElements.ModElement {
	@ObjectHolder("netherplus:crimson_planks")
	public static final Block block = null;
	public CrimsonPlanksBlock(NetherplusModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.9999999999999998f, 3f).lightValue(0)
					.harvestLevel(0).harvestTool(ToolType.AXE));
			setRegistryName("crimson_planks");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
