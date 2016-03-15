package items;

import iamtheissue.skillz.Main;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class SkillzHoe extends ItemHoe
{

	public SkillzHoe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
