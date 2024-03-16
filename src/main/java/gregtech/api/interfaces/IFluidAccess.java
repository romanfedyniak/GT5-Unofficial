package gregtech.api.interfaces;

import net.minecraftforge.fluids.FluidStack;

public interface IFluidAccess {

    void set(FluidStack stack);

    FluidStack get();

    int getCapacity();

    default void addAmount(int amount) {
        FluidStack fluid = get();
        if (fluid != null) {
            fluid.amount = Math.min(fluid.amount + amount, getCapacity());
        }
    }

    default void verifyFluidStack() {
        FluidStack fluid = get();
        if (fluid != null && fluid.amount <= 0) set(null);
    }
}
