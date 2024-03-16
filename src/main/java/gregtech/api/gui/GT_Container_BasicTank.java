package gregtech.api.gui;

import java.util.Iterator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.interfaces.IFluidAccess;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_BasicTank;

/**
 * NEVER INCLUDE THIS FILE IN YOUR MOD!!!
 * <p/>
 * The Container I use for all my Basic Tanks
 */
public class GT_Container_BasicTank extends GT_ContainerMetaTile_Machine {

    public int content = 0;

    public GT_Container_BasicTank(InventoryPlayer inventoryPlayer, IGregTechTileEntity tileEntity) {
        super(inventoryPlayer, tileEntity);
    }

    @Override
    public void addSlots(InventoryPlayer inventoryPlayer) {
        addSlotToContainer(new Slot(mTileEntity, 0, 80, 17));
        addSlotToContainer(new GT_Slot_Output(mTileEntity, 1, 80, 53));
        addSlotToContainer(new GT_Slot_Render(mTileEntity, 2, 59, 42));
    }

    @Override
    public ItemStack slotClick(int slotIndex, int mouseclick, int shifthold, EntityPlayer player) {
        if (slotIndex == 2 && (mouseclick == 0 || mouseclick == 1)) {
            GT_MetaTileEntity_BasicTank tank = (GT_MetaTileEntity_BasicTank) mTileEntity.getMetaTileEntity();
            IFluidAccess fluidAccess = constructFluidAccess(tank, false);
            return handleFluidSlotClick(fluidAccess, player, mouseclick);
        }
        return super.slotClick(slotIndex, mouseclick, shifthold, player);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        if (mTileEntity.isClientSide() || mTileEntity.getMetaTileEntity() == null) return;
        if (((GT_MetaTileEntity_BasicTank) mTileEntity.getMetaTileEntity()).mFluid != null)
            content = ((GT_MetaTileEntity_BasicTank) mTileEntity.getMetaTileEntity()).mFluid.amount;
        else content = 0;
        Iterator<ICrafting> crafter = this.crafters.iterator();
        while (crafter.hasNext()) {
            ICrafting var1 = (ICrafting) crafter.next();
            var1.sendProgressBarUpdate(this, 100, content & 65535);
            var1.sendProgressBarUpdate(this, 101, content >>> 16);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int value) {
        super.updateProgressBar(id, value);
        switch (id) {
            case 100:
                content = content & -65536 | value;
                break;
            case 101:
                content = content & 65535 | value << 16;
                break;
        }
    }

    @Override
    public int getSlotCount() {
        return 2;
    }

    @Override
    public int getShiftClickSlotCount() {
        return 1;
    }

    protected IFluidAccess constructFluidAccess(GT_MetaTileEntity_BasicTank tank, boolean isFillableStack) {
        return new BasicTankFluidAccess(tank, isFillableStack);
    }

    static class BasicTankFluidAccess implements IFluidAccess {

        protected final GT_MetaTileEntity_BasicTank tank;
        protected final boolean isFillableStack;

        public BasicTankFluidAccess(GT_MetaTileEntity_BasicTank tank, boolean isFillableStack) {
            this.tank = tank;
            this.isFillableStack = isFillableStack;
        }

        @Override
        public void set(FluidStack stack) {
            if (isFillableStack) tank.setFillableStack(stack);
            else tank.setDrainableStack(stack);
        }

        @Override
        public FluidStack get() {
            return isFillableStack ? tank.getFillableStack() : tank.getDrainableStack();
        }

        @Override
        public int getCapacity() {
            return tank.getCapacity();
        }
    }
}
