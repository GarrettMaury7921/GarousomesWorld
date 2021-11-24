package garousomes_world;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Emu_Block extends Block {

	protected Emu_Block(Material material) {
		super(material);
		this.setResistance(15.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
	}
	
}
