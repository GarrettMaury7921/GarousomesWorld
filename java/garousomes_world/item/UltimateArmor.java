package garousomes_world.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class UltimateArmor extends ItemArmor {

	public UltimateArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);

	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(this.armorType == 2) {
			return "gw:textures/models/armor/Ultimate_layer_2.png";
		}
		return "gw:textures/models/armor/Ultimate_layer_1.png";
	}

}
