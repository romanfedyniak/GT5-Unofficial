package gregtech.common.items.armor.components;

import net.minecraft.item.ItemStack;

import gregtech.common.items.armor.ArmorData;

public interface IArmorComponent {

    boolean isArmorComponent(ItemStack aStack);

    void calculateArmor(ArmorData aArmorData);
}
