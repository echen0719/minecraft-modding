package com.echen0719.testingmod.items;

import com.echen0719.testingmod.Main;
import com.echen0719.testingmod.init.ModItems;
import com.echen0719.testingmod.util.IHasModel;
import com.echen0719.testingmod.util.Reference;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
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
