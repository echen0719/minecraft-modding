package io.github.echen0719.compressionmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SuperCompressedCobblestone extends BlockBase {
	public SuperCompressedCobblestone(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1); // somewhat hard block
		// setLightLevel(1.0F);
	}
}
