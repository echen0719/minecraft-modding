package com.echen0719.testingmod.init;

import java.util.List;
import java.util.ArrayList;

import com.echen0719.testingmod.blocks.BlockBase;
import com.echen0719.testingmod.blocks.QuartzBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block QUARTZ_BLOCK = new QuartzBlock("quartz_block", Material.IRON);
}
