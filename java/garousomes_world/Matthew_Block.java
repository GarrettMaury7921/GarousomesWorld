package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Matthew_Block extends Block {

	protected Matthew_Block(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(6.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
	}
	
}
