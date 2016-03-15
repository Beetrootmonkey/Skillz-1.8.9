package items;

import iamtheissue.skillz.Main;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class SkillzSpade extends ItemSpade
{

	public SkillzSpade(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}

}
