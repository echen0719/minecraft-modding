package io.github.echen0719.compressionmod.items;

import io.github.echen0719.compressionmod.Main;
import io.github.echen0719.compressionmod.init.ModItems;
import io.github.echen0719.compressionmod.util.IHasModel;
import io.github.echen0719.compressionmod.util.Reference;

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
