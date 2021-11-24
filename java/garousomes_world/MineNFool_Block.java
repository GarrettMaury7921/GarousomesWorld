package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MineNFool_Block extends Block {

	protected MineNFool_Block(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setStepSound(soundTypeMetal);
	}
	
}
