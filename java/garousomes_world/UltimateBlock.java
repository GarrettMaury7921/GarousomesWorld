package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UltimateBlock extends Block {

	protected UltimateBlock(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(50.0F);
		this.setHarvestLevel("pickaxe", 5);
		this.setStepSound(soundTypeMetal);
	}
	
}