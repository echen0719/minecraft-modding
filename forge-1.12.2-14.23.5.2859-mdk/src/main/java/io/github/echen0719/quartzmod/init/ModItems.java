package io.github.echen0719.quartzmod.init;

import java.util.List;

import io.github.echen0719.quartzmod.items.ItemBase;
import io.github.echen0719.quartzmod.items.tools.ToolSword;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	// obsidian hardness < quartz hardness (mohs scale)
	public static final ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_quartz", 3, 870, 7.0F, 2.5F, 12);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// items
	public static final Item QUARTZ_INGOT = new ItemBase("quartz_ingot");
	
	// tools
	public static final ItemSword QUARTZ_SWORD = new ToolSword("quartz_sword", MATERIAL_QUARTZ);
	
	/* public static final Item QUARTZ_AXE = new ItemBase("quartz_axe");
	public static final Item QUARTZ_PICKAXE = new ItemBase("quartz_pickaxe");
	public static final Item QUARTZ_SHOVEL = new ItemBase("quartz_shovel");
	public static final Item QUARTZ_HOE = new ItemBase("quartz_hoe"); */
	
	// armor
	public static final Item QUARTZ_HELMET = new ItemBase("quartz_helmet");
	public static final Item QUARTZ_CHESTPLATE = new ItemBase("quartz_chestplate");
	public static final Item QUARTZ_LEGGINGS = new ItemBase("quartz_leggings");
	public static final Item QUARTZ_BOOTS = new ItemBase("quartz_boots");
}
