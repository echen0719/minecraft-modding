package io.github.echen0719.quartzmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class QuartzIngotBlock extends BlockBase {
	public QuartzIngotBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 1); // quartz block is more compact than quartz ingots
		// setLightLevel(1.0F);
	}
}
