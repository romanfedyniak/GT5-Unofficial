package gregtech.common.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import gregtech.api.GregTech_API;
import gregtech.api.util.GT_LanguageManager;

public class GT_Item_Stones_Abstract extends ItemBlock {

    private final String mNoMobsToolTip = GT_LanguageManager
        .addStringLocalization("gt.nomobspawnsonthisblock", "Mobs cannot Spawn on this Block");

    public GT_Item_Stones_Abstract(Block par1) {
        super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        setCreativeTab(GregTech_API.TAB_GREGTECH_MATERIALS);
    }

    public String getUnlocalizedName(ItemStack aStack) {
        return this.field_150939_a.getUnlocalizedName() + "." + getDamage(aStack);
    }

    public int getMetadata(int aMeta) {
        return aMeta;
    }

    public void addInformation(ItemStack aStack, EntityPlayer aPlayer, List<String> aList, boolean aF3_H) {
        super.addInformation(aStack, aPlayer, aList, aF3_H);
        if (aStack.getItemDamage() % 8 >= 3) {
            aList.add(this.mNoMobsToolTip);
        }
    }
}
