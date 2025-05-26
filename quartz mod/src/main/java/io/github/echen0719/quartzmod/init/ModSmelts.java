package io.github.echen0719.quartzmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmelts {
	public static void init() {
		GameRegistry.addSmelting(Items.QUARTZ, new ItemStack(ModItems.QUARTZ_INGOT), 0.7F);
		GameRegistry.addSmelting(Blocks.QUARTZ_BLOCK, new ItemStack(ModBlocks.QUARTZ_INGOT_BLOCK), 1.0F);
		GameRegistry.addSmelting(ModItems.QUARTZ_SWORD, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_AXE, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_PICKAXE, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_SHOVEL, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_HOE, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_HELMET, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_CHESTPLATE, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_LEGGINGS, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
		GameRegistry.addSmelting(ModItems.QUARTZ_BOOTS, new ItemStack(ModItems.QUARTZ_NUGGET), 0.1F);
	}
}
