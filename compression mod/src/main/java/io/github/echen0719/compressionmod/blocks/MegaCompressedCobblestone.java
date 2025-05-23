package io.github.echen0719.compressionmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MegaCompressedCobblestone extends BlockBase {
	public MegaCompressedCobblestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(8.0F);
		setResistance(24.0F);
		setHarvestLevel("pickaxe", 3); // very hard block
		// setLightLevel(1.0F);
	}
}
