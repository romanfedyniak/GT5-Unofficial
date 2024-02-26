package gregtech.api.interfaces.tileentity;

import net.minecraft.block.Block;

import gregtech.api.interfaces.ITexture;

public interface ITexturedTileEntity {

    /**
     * @return the Textures rendered by the GT Rendering
     */
    public ITexture[] getTexture(Block aBlock, byte aSide);
}
