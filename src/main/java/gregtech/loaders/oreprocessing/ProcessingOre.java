package gregtech.loaders.oreprocessing;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import gregtech.GT_Mod;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.SubTag;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;

public class ProcessingOre implements gregtech.api.interfaces.IOreRecipeRegistrator {

    private ArrayList<Materials> mAlreadyListedOres = new ArrayList<Materials>(1000);

    public ProcessingOre() {
        OrePrefixes.oreChunk.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName,
        ItemStack aStack) {
        if (aMaterial == Materials.Oilsands) {
            GT_Values.RA.addCentrifugeRecipe(
                GT_Utility.copyAmount(1L, new Object[] { aStack }),
                null,
                null,
                Materials.Oil.getFluid(500L),
                new ItemStack(net.minecraft.init.Blocks.sand, 1, 0),
                null,
                null,
                null,
                null,
                null,
                new int[] { 5000 },
                1000,
                5);
        } else {
            registerStandardOreRecipes(
                aPrefix,
                aMaterial,
                GT_Utility.copyAmount(1L, new Object[] { aStack }),
                Math.max(
                    1,
                    gregtech.api.GregTech_API.sOPStuff.get(
                        gregtech.api.enums.ConfigCategories.Materials.oreprocessingoutputmultiplier,
                        aMaterial.toString(),
                        1)));
        }
    }

    private boolean registerStandardOreRecipes(OrePrefixes aPrefix, Materials aMaterial, ItemStack aOreStack,
        int aMultiplier) {
        if ((aOreStack == null) || (aMaterial == null)) return false;
        GT_ModHandler
            .addValuableOre(GT_Utility.getBlockFromStack(aOreStack), aOreStack.getItemDamage(), aMaterial.mOreValue);
        Materials tMaterial = aMaterial.mOreReplacement;
        Materials tPrimaryByMaterial = null;
        aMultiplier = Math.max(1, aMultiplier);
        aOreStack = GT_Utility.copyAmount(1L, new Object[] { aOreStack });
        aOreStack.stackSize = 1;

        ItemStack tIngot = GT_OreDictUnificator.get(OrePrefixes.ingot, aMaterial.mDirectSmelting, 1L);
        ItemStack tGem = GT_OreDictUnificator.get(OrePrefixes.gem, tMaterial, 1L);
        ItemStack tSmeltInto = tIngot
            == null
                ? null
                : aMaterial.contains(SubTag.SMELTING_TO_GEM)
                    ? GT_OreDictUnificator.get(
                        OrePrefixes.gem,
                        tMaterial.mDirectSmelting,
                        GT_OreDictUnificator.get(
                            OrePrefixes.crystal,
                            tMaterial.mDirectSmelting,
                            GT_OreDictUnificator.get(
                                OrePrefixes.gem,
                                tMaterial,
                                GT_OreDictUnificator.get(OrePrefixes.crystal, tMaterial, 1L),
                                1L),
                            1L),
                        1L)
                    : tIngot;

        ItemStack tDust = GT_OreDictUnificator.get(OrePrefixes.dust, tMaterial, tGem, 1L);
        ItemStack tCleaned = GT_OreDictUnificator.get(OrePrefixes.crushedPurified, tMaterial, tDust, 1L);
        ItemStack tCrushed = GT_OreDictUnificator
            .get(OrePrefixes.crushed, tMaterial, aMaterial.mOreMultiplier * aMultiplier);
        ItemStack tPrimaryByProduct = null;

        if (tCrushed == null) {
            tCrushed = GT_OreDictUnificator.get(
                OrePrefixes.dustImpure,
                tMaterial,
                GT_Utility.copyAmount(aMaterial.mOreMultiplier * aMultiplier, new Object[] { tCleaned, tDust, tGem }),
                aMaterial.mOreMultiplier * aMultiplier);
        }

        ArrayList<ItemStack> tByProductStacks = new ArrayList<ItemStack>();

        for (Materials tMat : aMaterial.mOreByProducts) {
            ItemStack tByProduct = GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
            if (tByProduct != null) tByProductStacks.add(tByProduct);
            if (tPrimaryByProduct == null) {
                tPrimaryByMaterial = tMat;
                tPrimaryByProduct = GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
                if (GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMat, 1L) == null) GT_OreDictUnificator
                    .get(OrePrefixes.dustTiny, tMat, GT_OreDictUnificator.get(OrePrefixes.nugget, tMat, 2L), 2L);
            }
            GT_OreDictUnificator.get(OrePrefixes.dust, tMat, 1L);
            if (GT_OreDictUnificator.get(OrePrefixes.dustSmall, tMat, 1L) == null) GT_OreDictUnificator
                .get(OrePrefixes.dustTiny, tMat, GT_OreDictUnificator.get(OrePrefixes.nugget, tMat, 2L), 2L);
        }
        if ((!tByProductStacks.isEmpty()) && (!this.mAlreadyListedOres.contains(aMaterial))) {
            this.mAlreadyListedOres.add(aMaterial);
            gregtech.api.util.GT_Recipe.GT_Recipe_Map.sByProductList.addFakeRecipe(
                false,
                new ItemStack[] { GT_OreDictUnificator.get(OrePrefixes.ore, aMaterial, aOreStack, 1L) },
                (ItemStack[]) tByProductStacks.toArray(new ItemStack[tByProductStacks.size()]),
                null,
                null,
                null,
                null,
                0,
                0,
                0);
        }

        if (tPrimaryByMaterial == null) tPrimaryByMaterial = tMaterial;
        if (tPrimaryByProduct == null) tPrimaryByProduct = tDust;
        boolean tHasSmelting = false;

        if (tSmeltInto != null) {
            if ((aMaterial.mBlastFurnaceRequired) || (aMaterial.mDirectSmelting.mBlastFurnaceRequired)) {
                GT_ModHandler.removeFurnaceSmelting(aOreStack);
            } else {
                tHasSmelting = GT_ModHandler.addSmeltingRecipe(
                    aOreStack,
                    GT_Utility.copyAmount(aMultiplier * aMaterial.mSmeltingMultiplier, new Object[] { tSmeltInto }));
            }

            if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_TRIPLE)) {
                GT_Values.RA.addBlastRecipe(
                    aOreStack,
                    GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, aMultiplier),
                    null,
                    null,
                    GT_Utility.mul(aMultiplier * 3 * aMaterial.mSmeltingMultiplier, new Object[] { tSmeltInto }),
                    null,
                    tSmeltInto.stackSize * 500,
                    120,
                    1500);
                GT_Values.RA.addBlastRecipe(
                    aOreStack,
                    GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Quicklime, aMultiplier),
                    null,
                    null,
                    GT_Utility.mul(aMultiplier * 3 * aMaterial.mSmeltingMultiplier, new Object[] { tSmeltInto }),
                    null,
                    tSmeltInto.stackSize * 500,
                    120,
                    1500);
            } else if (aMaterial.contains(SubTag.BLASTFURNACE_CALCITE_DOUBLE)) {
                GT_Values.RA.addBlastRecipe(
                    aOreStack,
                    GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Calcite, aMultiplier),
                    null,
                    null,
                    GT_Utility.mul(
                        aMultiplier * (GT_Mod.gregtechproxy.mMixedOreOnlyYieldsTwoThirdsOfPureOre ? 2 : 3)
                            * aMaterial.mSmeltingMultiplier,
                        new Object[] { tSmeltInto }),
                    null,
                    tSmeltInto.stackSize * 500,
                    120,
                    1500);
                GT_Values.RA.addBlastRecipe(
                    aOreStack,
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Quicklime, aMultiplier * 3),
                    null,
                    null,
                    GT_Utility.mul(aMultiplier * 2 * aMaterial.mSmeltingMultiplier, new Object[] { tSmeltInto }),
                    null,
                    tSmeltInto.stackSize * 500,
                    120,
                    1500);
            }
        }

        if (!tHasSmelting) {
            GT_ModHandler.addSmeltingRecipe(
                aOreStack,
                GT_OreDictUnificator.get(
                    OrePrefixes.gem,
                    tMaterial.mDirectSmelting,
                    Math.max(1, aMultiplier * aMaterial.mSmeltingMultiplier / 2)));
        }

        if (tCrushed != null) {
            GT_Values.RA.addForgeHammerRecipe(
                aOreStack,
                GT_Utility
                    .copy(new Object[] { GT_Utility.copyAmount(tCrushed.stackSize, new Object[] { tGem }), tCrushed }),
                16,
                10);
            GT_ModHandler.addPulverisationRecipe(
                aOreStack,
                GT_Utility.mul(2L, new Object[] { tCrushed }),
                tMaterial.contains(SubTag.PULVERIZING_CINNABAR)
                    ? GT_OreDictUnificator.get(
                        OrePrefixes.crystal,
                        Materials.Cinnabar,
                        GT_OreDictUnificator.get(
                            OrePrefixes.gem,
                            tPrimaryByMaterial,
                            GT_Utility.copyAmount(1L, new Object[] { tPrimaryByProduct }),
                            1L),
                        1L)
                    : GT_OreDictUnificator.get(
                        OrePrefixes.gem,
                        tPrimaryByMaterial,
                        GT_Utility.copyAmount(1L, new Object[] { tPrimaryByProduct }),
                        1L),
                tPrimaryByProduct == null ? 0
                    : tPrimaryByProduct.stackSize * 10 * aMultiplier * aMaterial.mByProductMultiplier,
                GT_OreDictUnificator.getDust(aPrefix.mSecondaryMaterial),
                50,
                true);
        }
        return true;
    }
}
