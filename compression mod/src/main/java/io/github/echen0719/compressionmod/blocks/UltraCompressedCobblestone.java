package io.github.echen0719.compressionmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class UltraCompressedCobblestone extends BlockBase {
	public UltraCompressedCobblestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(7.0F);
		setResistance(21.0F);
		setHarvestLevel("pickaxe", 2); // hard block
		// setLightLevel(1.0F);
	}
}
