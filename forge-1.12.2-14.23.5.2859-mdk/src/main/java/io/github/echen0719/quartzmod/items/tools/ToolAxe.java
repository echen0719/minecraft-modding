package io.github.echen0719.quartzmod.items.tools;

import io.github.echen0719.quartzmod.Main;
import io.github.echen0719.quartzmod.init.ModItems;
import io.github.echen0719.quartzmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {
	public ToolAxe(String name, ToolMaterial material, float dmg, float atkSpd) {
		super(material, dmg, atkSpd);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
