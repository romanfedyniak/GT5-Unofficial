package gregtech.api.gui;

import static gregtech.api.enums.GT_Values.RES_PATH_GUI;

import net.minecraft.entity.player.InventoryPlayer;

import gregtech.api.interfaces.tileentity.IGregTechTileEntity;

public class GT_GUIContainer_4by4 extends GT_GUIContainerMetaTile_Machine {

    private final String mName;

    public GT_GUIContainer_4by4(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity, String aName) {
        super(new GT_Container_4by4(aInventoryPlayer, aTileEntity), RES_PATH_GUI + "4by4.png");
        mName = aName;
    }

    public GT_GUIContainer_4by4(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity, String aName,
        String aBackground) {
        super(new GT_Container_4by4(aInventoryPlayer, aTileEntity), RES_PATH_GUI + aBackground + "4by4.png");
        mName = aName;
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        fontRendererObj.drawString(mName, 8, 4, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        super.drawGuiContainerBackgroundLayer(par1, par2, par3);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
