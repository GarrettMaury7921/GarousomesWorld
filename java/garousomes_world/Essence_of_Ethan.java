package garousomes_world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class Essence_of_Ethan extends Block {

	protected Essence_of_Ethan(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeStone);
		
	}
	
	@Override
	public Item getItemDropped(int metadata, Random r, int fortune) {
		return Garousomes_World.EthanScrap;
	}
	
	@Override
	public int quantityDropped(Random r) {
		return 0 + r.nextInt(10);
	}
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return 5; //number = exp drop
	}

}
