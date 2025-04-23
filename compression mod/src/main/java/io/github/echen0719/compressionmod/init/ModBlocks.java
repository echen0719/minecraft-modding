package io.github.echen0719.compressionmod.init;

import java.util.List;
import java.util.ArrayList;

import io.github.echen0719.compressionmod.blocks.CompressedCobblestone;
import io.github.echen0719.compressionmod.blocks.ExtraCompressedCobblestone;
import io.github.echen0719.compressionmod.blocks.SuperCompressedCobblestone;
import io.github.echen0719.compressionmod.blocks.HyperCompressedCobblestone;
import io.github.echen0719.compressionmod.blocks.UltraCompressedCobblestone;
import io.github.echen0719.compressionmod.blocks.MegaCompressedCobblestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block COMPRESSED_COBBLESTONE = new CompressedCobblestone("compressed_cobblestone", Material.ROCK);
	public static final Block EXTRA_COMPRESSED_COBBLESTONE = new ExtraCompressedCobblestone("extra_compressed_cobblestone", Material.ROCK);
	public static final Block SUPER_COMPRESSED_COBBLESTONE = new SuperCompressedCobblestone("super_compressed_cobblestone", Material.ROCK);
	public static final Block HYPER_COMPRESSED_COBBLESTONE = new HyperCompressedCobblestone("hyper_compressed_cobblestone", Material.ROCK);
	public static final Block ULTRA_COMPRESSED_COBBLESTONE = new UltraCompressedCobblestone("ultra_compressed_cobblestone", Material.ROCK);
	public static final Block MEGA_COMPRESSED_COBBLESTONE = new MegaCompressedCobblestone("mega_compressed_cobblestone", Material.ROCK);
}
