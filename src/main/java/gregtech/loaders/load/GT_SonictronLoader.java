package gregtech.loaders.load;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import gregtech.GT_Mod;
import gregtech.api.util.GT_Log;

public class GT_SonictronLoader implements Runnable {

    public void run() {
        GT_Log.out.println("GT_Mod: Loading Sonictron Sounds");
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.iron_block, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.harp");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.gold_block, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.pling");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.stone, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bd");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.log, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bassattack");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.planks, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.bass");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.glass, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.hat");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.sand, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("note.snare");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(25));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.record_cat, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("streaming.");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(12));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.tnt, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.explode");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(3));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.fire, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("fire.fire");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.flint_and_steel, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("fire.ignite");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.lava, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.lavapop");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.water, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.water");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.water_bucket, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("liquid.splash");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.lava_bucket, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.fizz");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.portal, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.portal");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.end_portal, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.travel");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.end_portal_frame, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("portal.trigger");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.glass_pane, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.glass");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.ender_pearl, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.orb");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.ender_eye, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.levelup");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.stone_button, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.click");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.cobblestone, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.fallbig");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.dirt, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.fallsmall");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.iron_sword, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("damage.hurtflesh");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.diamond_sword, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.hurt");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.bow, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.bow");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.arrow, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.drr");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.fishing_rod, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.bowhit");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.iron_shovel, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.break");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.bucket, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.breath");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.potionitem, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.drink");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.glass_bottle, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.burp");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems
            .add(new ItemStack(Blocks.ender_chest == null ? Blocks.obsidian : Blocks.ender_chest, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.chestopen");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.chest, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.chestclosed");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.iron_door, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.door_open");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.wooden_door, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.door_close");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Items.porkchop, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("random.eat");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.wool, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.cloth");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.grass, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.grass");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.gravel, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.gravel");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.snow, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("step.snow");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.piston, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("tile.piston.out");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.sticky_piston, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("tile.piston.in");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.mossy_cobblestone, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.cave.cave");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.lapis_block, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.weather.rain");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
        GT_Mod.gregtechproxy.mSoundItems.add(new ItemStack(Blocks.diamond_block, 1));
        GT_Mod.gregtechproxy.mSoundNames.add("ambient.weather.thunder");
        GT_Mod.gregtechproxy.mSoundCounts.add(Integer.valueOf(1));
    }
}
