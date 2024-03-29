package gregtech.loaders.oreprocessing;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import gregtech.common.GT_Proxy;

public class ProcessingFineWire implements gregtech.api.interfaces.IOreRecipeRegistrator {

    public ProcessingFineWire() {
        OrePrefixes.wireFine.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName,
        ItemStack aStack) {
        if (!aMaterial.contains(gregtech.api.enums.SubTag.NO_SMASHING)) {
            GT_Values.RA.addWiremillRecipe(
                GT_OreDictUnificator.get(OrePrefixes.ingot, aMaterial, 1L),
                GT_Utility.copyAmount(8L, new Object[] { aStack }),
                3,
                100,
                4);
        }
        if ((aMaterial.mUnificatable) && (aMaterial.mMaterialInto == aMaterial)
            && !aMaterial.contains(SubTag.NO_WORKING)) {
            GT_ModHandler.addCraftingRecipe(
                GT_Utility.copyAmount(1L, new Object[] { aStack }),
                GT_Proxy.tBits,
                new Object[] { "Xx", Character.valueOf('X'), OrePrefixes.foil.get(aMaterial) });
        }
    }
}
