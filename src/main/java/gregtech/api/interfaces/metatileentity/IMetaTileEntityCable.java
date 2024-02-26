package gregtech.api.interfaces.metatileentity;

import java.util.ArrayList;
import java.util.HashSet;

import net.minecraft.tileentity.TileEntity;

public interface IMetaTileEntityCable extends IMetaTileEntity {

    @Deprecated
    public long transferElectricity(byte aSide, long aVoltage, long aAmperage,
        ArrayList<TileEntity> aAlreadyPassedTileEntityList);

    public long transferElectricity(byte aSide, long aVoltage, long aAmperage, HashSet<TileEntity> aAlreadyPassedSet);
}
