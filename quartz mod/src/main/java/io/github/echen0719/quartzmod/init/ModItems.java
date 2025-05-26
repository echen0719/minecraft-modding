package io.github.echen0719.quartzmod.init;

import java.util.List;

import io.github.echen0719.quartzmod.items.ItemBase;
import io.github.echen0719.quartzmod.items.armor.ArmorBase;
import io.github.echen0719.quartzmod.items.tools.ToolAxe;
import io.github.echen0719.quartzmod.items.tools.ToolHoe;
import io.github.echen0719.quartzmod.items.tools.ToolPickaxe;
import io.github.echen0719.quartzmod.items.tools.ToolSpade;
import io.github.echen0719.quartzmod.items.tools.ToolSword;
import io.github.echen0719.quartzmod.util.Reference;

import java.util.ArrayList;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	// obsidian hardness < quartz hardness (mohs scale)
	public static final ToolMaterial MATERIAL_QUARTZ = EnumHelper.addToolMaterial("material_quartz", 3, 870, 7.0F, 2.5F, 12);
	// quartz is better at resisting cuts than blunt force
	public static final ArmorMaterial ARMOR_MATERIAL_QUARTZ = EnumHelper.addArmorMaterial("armor_material_quartz", Reference.MODID + ":quartz", 42, new int[] {4, 6, 7, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// items
	public static final Item QUARTZ_INGOT = new ItemBase("quartz_ingot");
	public static final Item QUARTZ_NUGGET = new ItemBase("quartz_nugget");
	
	// tools
	public static final ItemSword QUARTZ_SWORD = new ToolSword("quartz_sword", MATERIAL_QUARTZ);
	public static final ItemSpade QUARTZ_SHOVEL = new ToolSpade("quartz_shovel", MATERIAL_QUARTZ);
	public static final ItemPickaxe QUARTZ_PICKAXE = new ToolPickaxe("quartz_pickaxe", MATERIAL_QUARTZ);
	public static final ItemAxe QUARTZ_AXE = new ToolAxe("quartz_axe", MATERIAL_QUARTZ, 8.0F, -3.0F);
	public static final ItemHoe QUARTZ_HOE = new ToolHoe("quartz_hoe", MATERIAL_QUARTZ);
	
	// armor
	public static final Item QUARTZ_HELMET = new ArmorBase("quartz_helmet", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.HEAD);
	public static final Item QUARTZ_CHESTPLATE = new ArmorBase("quartz_chestplate", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.CHEST);
	public static final Item QUARTZ_LEGGINGS = new ArmorBase("quartz_leggings", ARMOR_MATERIAL_QUARTZ, 2, EntityEquipmentSlot.LEGS);
	public static final Item QUARTZ_BOOTS = new ArmorBase("quartz_boots", ARMOR_MATERIAL_QUARTZ, 1, EntityEquipmentSlot.FEET);
}
