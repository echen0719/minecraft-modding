package io.github.echen0719.quartzmod.items.armor;

import io.github.echen0719.quartzmod.Main;
import io.github.echen0719.quartzmod.init.ModItems;
import io.github.echen0719.quartzmod.util.IHasModel;

import net.minecraft.item.ItemArmor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ArmorBase extends ItemArmor implements IHasModel {
	public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot) {
		super(material, renderIndex, slot);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}