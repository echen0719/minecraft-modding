package io.github.echen0719.compressionmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CompressedCobblestone extends BlockBase {
	public CompressedCobblestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(9.0F);
		setHarvestLevel("pickaxe", 0); // just a little harder than cobblestone
		// setLightLevel(1.0F);
	}
}
