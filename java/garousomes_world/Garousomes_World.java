package garousomes_world;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import garousomes_world.item.UltimateAxe;
import garousomes_world.item.UltimateHoe;
import garousomes_world.item.UltimatePickaxe;
import garousomes_world.item.UltimateShovel;
import garousomes_world.item.UltimateSword;
import garousomes_world.item.UltimateArmor;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

@Mod(modid = "gw", name = "Garousome's World", version = "1.0")
public class Garousomes_World {
	
	//Attributes
	//Blocks
	public static Block Essence_of_Garrett;
	public static Block Garrett_Block;
	public static Block Essence_of_Matthew;
	public static Block Essence_of_Danny;
	public static Block Essence_of_Ethan;
	public static Block DC_Block;
	public static Block IsBetterThan_Block;
	public static Block Marvel_Block;
	public static Block Emu_Block;
	public static Block Essence_of_MineNFool;
	public static Block Matthew_Block;
	public static Block MineNFool_Block;
	public static Block UltimateBlock;
	
	//Items
	public static Item GarrettIngot; 
	public static Item MatthewIngot;
	public static Item DannyIngot;
	public static Item EthanIngot;
	public static Item EthanScrap;
	public static Item MineNFoolDrop;
	public static Item CD_1; //nimbus
	public static Item CD_2; //ChouzetsuDynamic
	public static Item CD_3; //gas gas gas
	public static Item CD_4; //Grog
	public static Item CD_5; //Ocean man
	public static Item CD_6; //Riders on the storm
	public static Item CD_7; //Time Chamber
	public static Item CD_8; //Ultimate Battle
	public static Item CD_9; //Ultra Dripstinct
	public static Item CD_10; //The Funny
	public static Item CD_11; //The Shire
	public static Item CD_12; //Edge of Night
	public static Item CD_13; //Annoying Sounds
	public static Item CD_14; //Stereo Saiyan 3d
	public static Item CD_15; //Goblin Bridge
	public static Item CD_16; //Weathertop
	public static Item CD_17; //Amon Hen
	public static Item CD_18; //Never gonna give you up
	public static Item CD_19; //Ladbroke
	public static Item ChocolateMilk;
	public static Item SuperChocolateMilk;
	public static Item UltimateChocolateMilk;
	
	//Tools and Armor
	public static Item UltimatePickaxe;
	public static Item UltimateAxe;
	public static Item UltimateShovel;
	public static Item UltimateHoe;
	public static Item UltimateSword;
	public static final Item.ToolMaterial UPToolMaterial = EnumHelper.addToolMaterial("UPToolMaterial", 6, 3000, 60.0F, 0.0F, 30);
	public static final Item.ToolMaterial UAToolMaterial = EnumHelper.addToolMaterial("UPToolMaterial", 6, 3000, 55.0F, 25.0F, 35);
	
	public static Item UltimateHelmet;
	public static Item UltimateChestplate;
	public static Item UltimateLeggings;
	public static Item UltimateBoots;
	public static ItemArmor.ArmorMaterial UltimateArmorMaterial = EnumHelper.addArmorMaterial("UltimateArmorMaterial", 250, new int[]{6,11,8,5}, 30);
	
	
	//Methods
	public void GarrettBlocksAndItems() {
		//Essence of Garrett
		Essence_of_Garrett = new Essence_of_Garrett(Material.iron).setBlockName("Essence_of_Garrett").setBlockTextureName("gw:Essence_of_Garrett");
		GameRegistry.registerBlock(Essence_of_Garrett, Essence_of_Garrett.getUnlocalizedName().substring(5));
		
		//Garrett Ingot
		GarrettIngot = new GarrettIngot().setUnlocalizedName("GarrettIngot").setTextureName("gw:GarrettIngot");
		GameRegistry.registerItem(GarrettIngot, GarrettIngot.getUnlocalizedName().substring(5));
		
		//Garrett Block
		Garrett_Block = new Garrett_Block(Material.iron).setBlockName("Garrett_Block").setBlockTextureName("gw:Garrett_Block");
		GameRegistry.registerBlock(Garrett_Block, Garrett_Block.getUnlocalizedName().substring(5));
	}
	public void MatthewOre() {
		//Essence of Matthew
		Essence_of_Matthew = new Essence_of_Matthew(Material.iron).setBlockName("Essence_of_Matthew").setBlockTextureName("gw:Essence_of_Matthew");
		GameRegistry.registerBlock(Essence_of_Matthew, Essence_of_Matthew.getUnlocalizedName().substring(5));
		
		//Matthew Ingot
		MatthewIngot = new MatthewIngot().setUnlocalizedName("MatthewIngot").setTextureName("gw:MatthewIngot");
		GameRegistry.registerItem(MatthewIngot, MatthewIngot.getUnlocalizedName().substring(5));
		
		//Matthew Block
		Matthew_Block = new Matthew_Block(Material.iron).setBlockName("Matthew_Block").setBlockTextureName("gw:Matthew_Block");
		GameRegistry.registerBlock(Matthew_Block, Matthew_Block.getUnlocalizedName().substring(5));
	}
	public void DannyOre() {
		//Essence of Danny
		Essence_of_Danny = new Essence_of_Danny(Material.iron).setBlockName("Essence_of_Danny").setBlockTextureName("gw:Essence_of_Danny");
		GameRegistry.registerBlock(Essence_of_Danny, Essence_of_Danny.getUnlocalizedName().substring(5));
		
		//Danny Ingot
		DannyIngot = new DannyIngot().setUnlocalizedName("DannyIngot").setTextureName("gw:DannyIngot");
		GameRegistry.registerItem(DannyIngot, DannyIngot.getUnlocalizedName().substring(5));
		
		//Emu Block
		Emu_Block = new Emu_Block(Material.iron).setBlockName("Emu_Block").setBlockTextureName("gw:Emu_Block");
		GameRegistry.registerBlock(Emu_Block, Emu_Block.getUnlocalizedName().substring(5));
	}
	public void EthanOre() {
		//Essence of Ethan
		Essence_of_Ethan = new Essence_of_Ethan(Material.iron).setBlockName("Essence_of_Ethan").setBlockTextureName("gw:Essence_of_Ethan");
		GameRegistry.registerBlock(Essence_of_Ethan, Essence_of_Ethan.getUnlocalizedName().substring(5));
		
		//Ethan Ingot
		EthanIngot = new EthanIngot().setUnlocalizedName("EthanIngot").setTextureName("gw:EthanIngot");
		GameRegistry.registerItem(EthanIngot, EthanIngot.getUnlocalizedName().substring(5));
		
		//Scraps from the essence, craftable into the ingot
		EthanScrap = new EthanScrap().setUnlocalizedName("EthanScrap").setTextureName("gw:EthanScrap");
		GameRegistry.registerItem(EthanScrap, EthanScrap.getUnlocalizedName().substring(5));
		
		//DC
		DC_Block = new DC_Block(Material.iron).setBlockName("DC_Block").setBlockTextureName("gw:DC_Block");
		GameRegistry.registerBlock(DC_Block, DC_Block.getUnlocalizedName().substring(5));
		
		//Is Better Than
		IsBetterThan_Block = new IsBetterThan_Block(Material.iron).setBlockName("IsBetterThan_Block").setBlockTextureName("gw:IsBetterThan_Block");
		GameRegistry.registerBlock(IsBetterThan_Block, IsBetterThan_Block.getUnlocalizedName().substring(5));
		
		//Marvel
		Marvel_Block = new Marvel_Block(Material.iron).setBlockName("Marvel_Block").setBlockTextureName("gw:Marvel_Block");
		GameRegistry.registerBlock(Marvel_Block, Marvel_Block.getUnlocalizedName().substring(5));
	}
	public void MineNFoolOre() {
		//Essence of MineNFool
		Essence_of_MineNFool = new Essence_of_MineNFool(Material.iron).setBlockName("Essence_of_MineNFool").setBlockTextureName("gw:Essence_of_MineNFool");
		GameRegistry.registerBlock(Essence_of_MineNFool, Essence_of_MineNFool.getUnlocalizedName().substring(5));
		
		//Drop from the essence
		MineNFoolDrop = new MineNFoolDrop().setUnlocalizedName("MineNFoolDrop").setTextureName("gw:MineNFoolDrop");
		GameRegistry.registerItem(MineNFoolDrop, MineNFoolDrop.getUnlocalizedName().substring(5));
		
		//MineNFool Block
		MineNFool_Block = new MineNFool_Block(Material.iron).setBlockName("MineNFool_Block").setBlockTextureName("gw:MineNFool_Block");
		GameRegistry.registerBlock(MineNFool_Block, MineNFool_Block.getUnlocalizedName().substring(5));
	}
	public void Recipes() {
		//Garrett Recipes
		GameRegistry.addRecipe(new ItemStack(Garrett_Block), new Object[] {"III", "III", "III", 'I', GarrettIngot});
		GameRegistry.addRecipe(new ItemStack(GarrettIngot, 9), new Object[] {"   ", " B ", "   ", 'B', Garrett_Block});
		//Danny Recipes
		GameRegistry.addRecipe(new ItemStack(Emu_Block), new Object[] {"III", "III", "III", 'I', DannyIngot});
		GameRegistry.addRecipe(new ItemStack(DannyIngot, 9), new Object[] {"   ", " B ", "   ", 'B', Emu_Block});
		
		//Ethan Recipes
		GameRegistry.addRecipe(new ItemStack(EthanIngot), new Object[] {"SSS", "SSS", "SSS", 'S', EthanScrap});
		GameRegistry.addRecipe(new ItemStack(EthanScrap, 9), new Object[] {"   ", " I ", "   ", 'I', EthanIngot});
		
		GameRegistry.addRecipe(new ItemStack(DC_Block), new Object[] {"III", "III", "III", 'I', EthanIngot});
		GameRegistry.addRecipe(new ItemStack(EthanIngot, 9), new Object[] {"   ", " I ", "   ", 'I', DC_Block});
		
		GameRegistry.addRecipe(new ItemStack(IsBetterThan_Block), new Object[] {"BBB", "BBB", "BBB", 'B', DC_Block});
		GameRegistry.addRecipe(new ItemStack(DC_Block, 9), new Object[] {"   ", " B ", "   ", 'B', IsBetterThan_Block});
		
		GameRegistry.addRecipe(new ItemStack(Marvel_Block), new Object[] {"BBB", "BBB", "BBB", 'B', IsBetterThan_Block});
		GameRegistry.addRecipe(new ItemStack(IsBetterThan_Block, 9), new Object[] {"   ", " B ", "   ", 'B', Marvel_Block});
		
		//Matthew Recipes
		GameRegistry.addRecipe(new ItemStack(Matthew_Block), new Object[] {"III", "III", "III", 'I', MatthewIngot});
		GameRegistry.addRecipe(new ItemStack(MatthewIngot, 9), new Object[] {"   ", " B ", "   ", 'B', Matthew_Block});
		//MineNFool Recipes
		GameRegistry.addRecipe(new ItemStack(MineNFool_Block), new Object[] {"III", "III", "III", 'I', MineNFoolDrop});
		GameRegistry.addRecipe(new ItemStack(MineNFoolDrop, 9), new Object[] {"   ", " B ", "   ", 'B', MineNFool_Block});
		
		//Smelting
		GameRegistry.addSmelting(Essence_of_Garrett, new ItemStack(GarrettIngot), 1000);
		GameRegistry.addSmelting(Essence_of_Matthew, new ItemStack(MatthewIngot), 30);
		GameRegistry.addSmelting(Essence_of_Danny, new ItemStack(DannyIngot), 10);
		
		//Food Recipes
		GameRegistry.addRecipe(new ItemStack(ChocolateMilk), new Object[] {"CCC", "CMC", "CMC", 'C', Items.cookie, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(SuperChocolateMilk), new Object[] {"DMD", "GCG", "GGG", 'C', ChocolateMilk, 'G', Blocks.glass, 'D', DC_Block, 'M', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(UltimateChocolateMilk), new Object[] {"FTC", "NSM", "ROE", 'S', SuperChocolateMilk, 'R', Items.redstone, 'O', Blocks.obsidian, 'E', EthanIngot, 'F', Items.fermented_spider_eye, 'T', Blocks.stone, 'C', ChocolateMilk, 'N', MineNFoolDrop, 'M', MatthewIngot});
		
		//Tool Recipes
		GameRegistry.addRecipe(new ItemStack(UltimatePickaxe), new Object[] {"BBB", " G ", " S ", 'S', Items.stick, 'G', Items.golden_apple, 'B', Garrett_Block});
		GameRegistry.addRecipe(new ItemStack(UltimateAxe), new Object[] {" UU", " GB", " S ", 'S', Items.stick, 'G', Items.golden_apple, 'B', Garrett_Block, 'U', UltimateBlock});
		GameRegistry.addRecipe(new ItemStack(UltimateShovel), new Object[] {" U ", " S ", " S ", 'S', Items.stick, 'U', UltimateBlock});
		GameRegistry.addRecipe(new ItemStack(UltimateHoe), new Object[] {" UU", " S ", " S ", 'S', Items.stick, 'U', DC_Block});
		GameRegistry.addRecipe(new ItemStack(UltimateSword), new Object[] {" U ", " U ", " S ", 'S', Items.stick, 'U', UltimateBlock});
		
		//Armor Recipes
		GameRegistry.addRecipe(new ItemStack(UltimateHelmet), new Object[] {"BGB", "M M", "   ", 'B', Emu_Block, 'M', Matthew_Block, 'G', Garrett_Block});
		GameRegistry.addRecipe(new ItemStack(UltimateChestplate), new Object[] {"B B", "MNE", "FBF", 'B', UltimateBlock, 'N', Marvel_Block, 'M', Matthew_Block, 'E', Emu_Block, 'F', MineNFool_Block});
		GameRegistry.addRecipe(new ItemStack(UltimateLeggings), new Object[] {"DGD", "M M", "M M", 'D', Marvel_Block, 'G', Garrett_Block, 'M', Matthew_Block});
		GameRegistry.addRecipe(new ItemStack(UltimateBoots), new Object[] {"   ", "D E", "F M", 'D', DC_Block, 'E', Emu_Block, 'F', MineNFool_Block, 'M', Matthew_Block});
	}
	public void MusicDiscs() {
		CD_1 = new Record(0, "FlyingNimbus").setTextureName("gw:1").setUnlocalizedName("1");
		GameRegistry.registerItem(CD_1, "CD_1");
		
		CD_2 = new Record(0, "ChouzetsuDynamic").setTextureName("gw:2").setUnlocalizedName("2");
		GameRegistry.registerItem(CD_2, "CD_2");
		
		CD_3 = new Record(0, "Gas").setTextureName("gw:3").setUnlocalizedName("3");
		GameRegistry.registerItem(CD_3, "CD_3");
		
		CD_4 = new Record(0, "Grog").setTextureName("gw:4").setUnlocalizedName("4");
		GameRegistry.registerItem(CD_4, "CD_4");
		
		CD_5 = new Record(0, "OceanMan").setTextureName("gw:5").setUnlocalizedName("5");
		GameRegistry.registerItem(CD_5, "CD_5");
		
		CD_6 = new Record(0, "Riders").setTextureName("gw:6").setUnlocalizedName("6");
		GameRegistry.registerItem(CD_6, "CD_6");
		
		CD_7 = new Record(0, "TimeChamber").setTextureName("gw:7").setUnlocalizedName("7");
		GameRegistry.registerItem(CD_7, "CD_7");
		
		CD_8 = new Record(0, "UltimateBattle").setTextureName("gw:8").setUnlocalizedName("8");
		GameRegistry.registerItem(CD_8, "CD_8");
		
		CD_9 = new Record(0, "UltraDripstinct").setTextureName("gw:9").setUnlocalizedName("9");
		GameRegistry.registerItem(CD_9, "CD_9");
		
		CD_10 = new Record(0, "TheFunny").setTextureName("gw:10").setUnlocalizedName("10");
		GameRegistry.registerItem(CD_10, "CD_10");
		
		CD_11 = new Record(0, "TheShire").setTextureName("gw:11").setUnlocalizedName("11");
		GameRegistry.registerItem(CD_11, "CD_11");
		
		CD_12 = new Record(0, "EdgeOfNight").setTextureName("gw:12").setUnlocalizedName("12");
		GameRegistry.registerItem(CD_12, "CD_12");
		
		CD_13 = new Record(0, "aaa").setTextureName("gw:13").setUnlocalizedName("13");
		GameRegistry.registerItem(CD_13, "CD_13");
		
		CD_14 = new Record(0, "Stereo").setTextureName("gw:14").setUnlocalizedName("14");
		GameRegistry.registerItem(CD_14, "CD_14");
		
		CD_15 = new Record(0, "GoblinBridge").setTextureName("gw:15").setUnlocalizedName("15");
		GameRegistry.registerItem(CD_15, "CD_15");
		
		CD_16 = new Record(0, "Weathertop").setTextureName("gw:16").setUnlocalizedName("16");
		GameRegistry.registerItem(CD_16, "CD_16");
		
		CD_17 = new Record(0, "AmonHen").setTextureName("gw:17").setUnlocalizedName("17");
		GameRegistry.registerItem(CD_17, "CD_17");
		
		CD_18 = new Record(0, "Never").setTextureName("gw:18").setUnlocalizedName("18");
		GameRegistry.registerItem(CD_18, "CD_18");
		
		CD_19 = new Record(0, "Ladbroke").setTextureName("gw:19").setUnlocalizedName("19");
		GameRegistry.registerItem(CD_19, "CD_19");
		
		GameRegistry.addRecipe(new ItemStack(CD_1), new Object[] {"YYY", "Y Y", "YYY", 'Y', Items.blaze_rod});
		GameRegistry.addRecipe(new ItemStack(CD_2), new Object[] {"IME", "F Z", "BDB", 'I', GarrettIngot, 'M', MatthewIngot, 'E', EthanIngot, 'F', MineNFoolDrop, 'Z', DannyIngot, 'B', Blocks.iron_block, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(CD_3), new Object[] {"BBB", "B B", "BBB", 'B', Blocks.coal_block});
		GameRegistry.addRecipe(new ItemStack(CD_4), new Object[] {"MFM", "M M", "MFM", 'M', MatthewIngot, 'F', MineNFoolDrop});
		GameRegistry.addRecipe(new ItemStack(CD_5), new Object[] {"WWW", "W W", "WWW", 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(CD_6), new Object[] {"DGD", "D D", "DDD", 'G', Garrett_Block, 'D', DannyIngot});
		GameRegistry.addRecipe(new ItemStack(CD_7), new Object[] {"CCC", "C C", "CCC", 'C', Items.clock});
		GameRegistry.addRecipe(new ItemStack(CD_8), new Object[] {"GMG", "I I", "III", 'G', Garrett_Block, 'M', Marvel_Block, 'I', GarrettIngot});
		GameRegistry.addRecipe(new ItemStack(CD_9), new Object[] {"DBM", "Z Z", "GWG", 'D', DC_Block, 'B', IsBetterThan_Block, 'M', Marvel_Block, 'Z', Blocks.diamond_block, 'G', Garrett_Block, 'W', Items.nether_star});
		GameRegistry.addRecipe(new ItemStack(CD_10), new Object[] {"CCC", "C C", "CCC", 'C', Items.chicken});
		GameRegistry.addRecipe(new ItemStack(CD_11), new Object[] {"SCS", "C C", "SCS", 'S', Blocks.stonebrick, 'C', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(CD_12), new Object[] {"RRR", "E E", "RRR", 'R', Items.rotten_flesh, 'E', EthanIngot});
		GameRegistry.addRecipe(new ItemStack(CD_13), new Object[] {"RCT", "T T", "TCR", 'C', Items.clock, 'R', Blocks.deadbush, 'T', Blocks.tnt});
		GameRegistry.addRecipe(new ItemStack(CD_14), new Object[] {"GGC", "G C", "CCC", 'C', Blocks.redstone_block, 'G', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(CD_15), new Object[] {"CGC", "C C", "BBB", 'C', Items.rotten_flesh, 'B', Blocks.log, 'G', Blocks.gold_block});
		GameRegistry.addRecipe(new ItemStack(CD_16), new Object[] {"CWC", "C C", "CCC", 'C', Items.rotten_flesh, 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(CD_17), new Object[] {"CCC", "C C", "CCC", 'C', Items.wooden_sword});
		GameRegistry.addRecipe(new ItemStack(CD_18), new Object[] {"CDC", "D D", "CDC", 'D', Items.diamond, 'C', Items.golden_apple});
		GameRegistry.addRecipe(new ItemStack(CD_19), new Object[] {"EDE", "C C", "ECE", 'D', Items.diamond, 'E', DannyIngot, 'C', Items.gold_ingot});
	}
	public void Tools() {
		//Tools
		UltimatePickaxe = new UltimatePickaxe(UPToolMaterial).setUnlocalizedName("UltimatePickaxe").setTextureName("gw:UltimatePickaxe");
		UltimateAxe = new UltimateAxe(UAToolMaterial).setUnlocalizedName("UltimateAxe").setTextureName("gw:UltimateAxe");
		UltimateShovel = new UltimateShovel(UPToolMaterial).setUnlocalizedName("UltimateShovel").setTextureName("gw:UltimateShovel");
		UltimateHoe = new UltimateHoe(UAToolMaterial).setUnlocalizedName("UltimateHoe").setTextureName("gw:UltimateHoe");
		UltimateSword = new UltimateSword(UAToolMaterial).setUnlocalizedName("UltimateSword").setTextureName("gw:UltimateSword");
		
		GameRegistry.registerItem(UltimatePickaxe, UltimatePickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateAxe, UltimateAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateShovel, UltimateShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateHoe, UltimateHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateSword, UltimateSword.getUnlocalizedName().substring(5));
		
		//Armor
		UltimateHelmet = new UltimateArmor(UltimateArmorMaterial, 0, 0).setUnlocalizedName("UltimateHelmet").setTextureName("gw:UltimateHelmet");
		UltimateChestplate = new UltimateArmor(UltimateArmorMaterial, 0, 1).setUnlocalizedName("UltimateChestplate").setTextureName("gw:UltimateChestplate");
		UltimateLeggings = new UltimateArmor(UltimateArmorMaterial, 0, 2).setUnlocalizedName("UltimateLeggings").setTextureName("gw:UltimateLeggings");
		UltimateBoots = new UltimateArmor(UltimateArmorMaterial, 0, 3).setUnlocalizedName("UltimateBoots").setTextureName("gw:UltimateBoots");
		
		GameRegistry.registerItem(UltimateHelmet, UltimateHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateChestplate, UltimateChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateLeggings, UltimateLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(UltimateBoots, UltimateBoots.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void preInitialization(FMLPreInitializationEvent event) {
		//Item / Block initialization and registering
		//Configuration handling
		//All are called within every mod before initialization
		
		//Essence of Garrett
		GarrettBlocksAndItems();
		
		//Essence of Matthew
		MatthewOre();
		
		//Essence of Danny
		DannyOre();
		
		//Essence of Ethan
		EthanOre();
		
		//Essence of MineNFool
		MineNFoolOre();
		
		//Generate Ores
		GameRegistry.registerWorldGenerator(new Essence_Generation(), 0);
		
		//FOOD - X * 0.5 = 10 hunger
		ChocolateMilk = new ItemFood(11, 0.3F, false).setUnlocalizedName("ChocolateMilk").setTextureName("gw:ChocolateMilk");
		GameRegistry.registerItem(ChocolateMilk, ChocolateMilk.getUnlocalizedName().substring(5));
		SuperChocolateMilk = new ItemFood(16, 0.6F, false).setUnlocalizedName("SuperChocolateMilk").setTextureName("gw:SuperChocolateMilk");
		GameRegistry.registerItem(SuperChocolateMilk, SuperChocolateMilk.getUnlocalizedName().substring(5));
		UltimateChocolateMilk = new ItemFood(20, 1.0F, false).setUnlocalizedName("UltimateChocolateMilk").setTextureName("gw:UltimateChocolateMilk");
		GameRegistry.registerItem(UltimateChocolateMilk, UltimateChocolateMilk.getUnlocalizedName().substring(5));
		
		Tools();
		
		//Ultimate Block
		UltimateBlock = new UltimateBlock(Material.iron).setBlockName("UltimateBlock").setBlockTextureName("gw:UltimateBlock");
		GameRegistry.registerBlock(UltimateBlock, UltimateBlock.getUnlocalizedName().substring(5));
	}
	
	@EventHandler
	public void initialization(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity, GUI and Packet Registering

		Recipes();
		
		//Music discs
		MusicDiscs();
		
		//Ultimate Block
		GameRegistry.addRecipe(new ItemStack(UltimateBlock), new Object[] {"EGE", "BMB", "FEF", 'G', Garrett_Block, 'E', Emu_Block, 'M', Marvel_Block, 'B', Matthew_Block, 'F', MineNFool_Block});
		
		//Minecraft Recipes
		GameRegistry.addRecipe(new ItemStack(Items.coal), new Object[] {"   ", " II", " II", 'I', EthanScrap});
		GameRegistry.addRecipe(new ItemStack(Items.cookie, 7), new Object[] {"   ", " I ", "   ", 'I', Essence_of_Ethan});
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 6), new Object[] {"   ", "DMF", "   ", 'D', DannyIngot, 'M', MatthewIngot, 'F', MineNFoolDrop});
		GameRegistry.addRecipe(new ItemStack(Items.diamond), new Object[] {"EGE", "DMF", "DED", 'D', DannyIngot, 'M', MatthewIngot, 'F', MineNFoolDrop, 'E', EthanIngot, 'G', GarrettIngot});
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 3), new Object[] {"   ", "MEM", "   ", 'M', MatthewIngot, 'E', Emu_Block});
		GameRegistry.addRecipe(new ItemStack(GarrettIngot), new Object[] {"EME", "DBF", "RRR", 'E', DannyIngot, 'M', MatthewIngot, 'D', DC_Block, 'B', Blocks.iron_block, 'F', MineNFoolDrop, 'R', Items.redstone});
	}
	
	@EventHandler
	public void postInitialization(FMLPostInitializationEvent event) {
		
	}
	
}
