package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Essence_of_Matthew extends Block {

	protected Essence_of_Matthew(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(6.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
		
	}

}
