package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Essence_of_Danny extends Block {

	protected Essence_of_Danny(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(0.2F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
	}

}
