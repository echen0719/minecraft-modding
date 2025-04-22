package io.github.echen0719.compressionmod.init;

import java.util.List;

import io.github.echen0719.compressionmod.blocks.CompressedCobblestone;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block COMPRESSED_COBBLESTONE = new CompressedCobblestone("compressed_cobblestone", Material.ROCK);
	public static final Block EXTRA_COMPRESSED_COBBLESTONE = new CompressedCobblestone("extra_compressed_cobblestone", Material.ROCK);
	public static final Block SUPER_COMPRESSED_COBBLESTONE = new CompressedCobblestone("super_compressed_cobblestone", Material.ROCK);
	public static final Block HYPER_COMPRESSED_COBBLESTONE = new CompressedCobblestone("hyper_compressed_cobblestone", Material.ROCK);
	public static final Block ULTRA_COMPRESSED_COBBLESTONE = new CompressedCobblestone("ultra_compressed_cobblestone", Material.ROCK);
	public static final Block MEGA_COMPRESSED_COBBLESTONE = new CompressedCobblestone("mega_compressed_cobblestone", Material.ROCK);
}
