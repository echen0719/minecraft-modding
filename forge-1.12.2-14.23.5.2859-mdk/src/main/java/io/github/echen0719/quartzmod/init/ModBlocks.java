package io.github.echen0719.quartzmod.init;

import java.util.List;

// import io.github.echen0719.quartzmod.blocks.BlockBase;
import io.github.echen0719.quartzmod.blocks.QuartzIngotBlock;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block QUARTZ_INGOT_BLOCK = new QuartzIngotBlock("quartz_ingot_block", Material.IRON);
}
