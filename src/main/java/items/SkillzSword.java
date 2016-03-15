package items;

import iamtheissue.skillz.Main;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class SkillzSword extends ItemSword
{

	public SkillzSword(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
