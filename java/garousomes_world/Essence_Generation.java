package garousomes_world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Essence_Generation implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 1:
				generateEnd(world, random, chunkX, chunkZ);
				break;	
			case 0:
				generateOverworld(world, random, chunkX, chunkZ);
				break;
			case -1:
				generateNether(world, random, chunkX, chunkZ);
				break;
		} //switch
	} //generate()
	
	public void generateEnd(World world, Random rand, int x, int z) {
		
	}
	
	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(Garousomes_World.Essence_of_Garrett, world, rand, x, z, 2, 4, 1, 0, 8, Blocks.stone); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_Ethan, world, rand, x, z, 2, 14, 8, 0, 180, Blocks.stone); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_Danny, world, rand, x, z, 2, 8, 3, 0, 55, Blocks.stone); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_Matthew, world, rand, x, z, 2, 6, 2, 0, 20, Blocks.stone); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_MineNFool, world, rand, x, z, 2, 4, 4, 0, 200, Blocks.stone); //play with the variables after z
	}
	
	public void generateNether(World world, Random rand, int x, int z) {
		generateOre(Garousomes_World.Essence_of_MineNFool, world, rand, x, z, 2, 4, 4, 0, 200, Blocks.netherrack); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_Danny, world, rand, x, z, 2, 4, 1, 0, 55, Blocks.netherrack); //play with the variables after z
		generateOre(Garousomes_World.Essence_of_Garrett, world, rand, x, z, 2, 5, 3, 0, 80, Blocks.nether_brick); //play with the variables after z
	}
	
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			gen.generate(world, random, xRand, yRand, zRand);
		} //for
	} //generateOre()

} //Essence_Generation class
