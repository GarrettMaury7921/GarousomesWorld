package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DC_Block extends Block {

	protected DC_Block(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(3.0F);
		this.setStepSound(soundTypeMetal);
	}
	
}
