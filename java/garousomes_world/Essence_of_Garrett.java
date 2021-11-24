package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Essence_of_Garrett extends Block {

	protected Essence_of_Garrett(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(12.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setStepSound(soundTypeStone);
		
	}
	
}
