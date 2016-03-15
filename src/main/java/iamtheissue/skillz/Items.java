package iamtheissue.skillz;

import cpw.mods.fml.common.registry.GameRegistry;
import items.SkillzAxe;
import items.SkillzHoe;
import items.SkillzPickaxe;
import items.SkillzSpade;
import items.SkillzSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Items
{
	public static Item flintPickaxe;
	public static Item flintAxe;
	public static Item flintSpade;
	public static Item flintHoe;
	public static Item flintSword;
	
	
	public static ToolMaterial FLINT = EnumHelper.addToolMaterial("FLINT", 1, 131, 4f, 1f, 5);
	
	
	public static void init()
	{
		flintPickaxe = new SkillzPickaxe("flintPickaxe", FLINT);
		flintPickaxe = new SkillzAxe("flintAxe", FLINT);
		flintPickaxe = new SkillzSpade("flintSpade", FLINT);
		flintPickaxe = new SkillzHoe("flintHoe", FLINT);
		flintPickaxe = new SkillzSword("flintSword", FLINT);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(flintPickaxe = new SkillzPickaxe("flintPickaxe", FLINT), flintPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintAxe = new SkillzAxe("flintAxe", FLINT), flintAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintSpade = new SkillzSpade("flintSpade", FLINT), flintSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintHoe = new SkillzHoe("flintHoe", FLINT), flintHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintSword = new SkillzSword("flintSword", FLINT), flintSword.getUnlocalizedName().substring(5));
	}
	
}
