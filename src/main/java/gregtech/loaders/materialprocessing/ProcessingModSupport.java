package gregtech.loaders.materialprocessing;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;

public class ProcessingModSupport implements gregtech.api.interfaces.IMaterialHandler {

    public static boolean aTGregSupport = Loader.isModLoaded("TGregworks");
    public static boolean aEnablePFAAMats = Loader.isModLoaded("PFAAGeologica") || aTGregSupport;
    public static boolean aEnableUBCMats = Loader.isModLoaded("UndergroundBiomes") || aTGregSupport;
    public static boolean aEnableRotaryCraftMats = Loader.isModLoaded("RotaryCraft") || aTGregSupport;
    public static boolean aEnableEnderIOMats = Loader.isModLoaded("EnderIO") || aTGregSupport;
    public static boolean aEnableRailcraftMats = Loader.isModLoaded(GT_Values.MOD_ID_RC) || aTGregSupport;
    public static boolean aEnableGCMarsMats = Loader.isModLoaded("GalacticraftMars") || aTGregSupport;
    public static boolean aEnableMetallurgyMats = Loader.isModLoaded("Metallurgy") || aTGregSupport;

    public ProcessingModSupport() {
        Materials.add(this);
    }

    @Override
    public void onMaterialsInit() {
        // Disable Materials if Parent Mod is not loaded
        if (!aEnablePFAAMats) {
            Materials.Alunite.mHasParentMod = false;
            Materials.Asbestos.mHasParentMod = false;
            Materials.BasalticMineralSand.mHasParentMod = false;
            Materials.Borax.mHasParentMod = false;
            Materials.CassiteriteSand.mHasParentMod = false;
            Materials.Chromite.mHasParentMod = false;
            Materials.Chrysotile.mHasParentMod = false;
            Materials.Diatomite.mHasParentMod = false;
            Materials.FullersEarth.mHasParentMod = false;
            Materials.GarnetSand.mHasParentMod = false;
            Materials.GlauconiteSand.mHasParentMod = false;
            Materials.GraniticMineralSand.mHasParentMod = false;
            Materials.Kaolinite.mHasParentMod = false;
            Materials.Kyanite.mHasParentMod = false;
            Materials.Mirabilite.mHasParentMod = false;
            Materials.Perlite.mHasParentMod = false;
            Materials.Pollucite.mHasParentMod = false;
            Materials.Pumice.mHasParentMod = false;
            Materials.QuartzSand.mHasParentMod = false;
            Materials.Vermiculite.mHasParentMod = false;
            Materials.VolcanicAsh.mHasParentMod = false;
            Materials.Wollastonite.mHasParentMod = false;
            Materials.Zeolite.mHasParentMod = false;
        }
        if (!aTGregSupport) {
            Materials.Dysprosium.mHasParentMod = false;
            Materials.Erbium.mHasParentMod = false;
            Materials.Gadolinium.mHasParentMod = false;
            Materials.Holmium.mHasParentMod = false;
            // Materials.Indium.mHasParentMod = false;
            Materials.Lanthanum.mHasParentMod = false;
            Materials.Praseodymium.mHasParentMod = false;
            Materials.Promethium.mHasParentMod = false;
            Materials.Rubidium.mHasParentMod = false;
            Materials.Samarium.mHasParentMod = false;
            Materials.Scandium.mHasParentMod = false;
            Materials.Strontium.mHasParentMod = false;
            Materials.Tellurium.mHasParentMod = false;
            Materials.Terbium.mHasParentMod = false;
            Materials.Thulium.mHasParentMod = false;
            Materials.Ytterbium.mHasParentMod = false;
            Materials.Endium.mHasParentMod = false;
            Materials.DarkIron.mHasParentMod = false;
            Materials.ElectrumFlux.mHasParentMod = false;
            Materials.Force.mHasParentMod = false;
            Materials.Nikolite.mHasParentMod = false;
            Materials.Sunnarium.mHasParentMod = false;
            Materials.BlueAlloy.mHasParentMod = false;
            Materials.ChromiumDioxide.mHasParentMod = false;
        }
        if (!aEnableMetallurgyMats) {
            Materials.Angmallen.mHasParentMod = false;
            Materials.Atlarus.mHasParentMod = false;
            Materials.Carmot.mHasParentMod = false;
            Materials.Celenegil.mHasParentMod = false;
            Materials.Ceruclase.mHasParentMod = false;
            Materials.Eximite.mHasParentMod = false;
            Materials.Haderoth.mHasParentMod = false;
            Materials.Hepatizon.mHasParentMod = false;
            Materials.Ignatius.mHasParentMod = false;
            Materials.Infuscolium.mHasParentMod = false;
            Materials.Inolashite.mHasParentMod = false;
            Materials.Kalendrite.mHasParentMod = false;
            Materials.Lemurite.mHasParentMod = false;
            Materials.Meutoite.mHasParentMod = false;
            Materials.Orichalcum.mHasParentMod = false;
            Materials.Oureclase.mHasParentMod = false;
            Materials.Prometheum.mHasParentMod = false;
            Materials.Rubracium.mHasParentMod = false;
            Materials.Sanguinite.mHasParentMod = false;
            Materials.Tartarite.mHasParentMod = false;
            Materials.Vulcanite.mHasParentMod = false;
            Materials.Vyroxeres.mHasParentMod = false;
            Materials.DeepIron.mHasParentMod = false;
            Materials.Adamantium.mHasParentMod = false;
        }
        if (!aEnableUBCMats) {
            Materials.Blueschist.mHasParentMod = false;
            Materials.Chert.mHasParentMod = false;
            Materials.Dacite.mHasParentMod = false;
            Materials.Epidote.mHasParentMod = false;
            Materials.Eclogite.mHasParentMod = false;
            Materials.Gabbro.mHasParentMod = false;
            Materials.Gneiss.mHasParentMod = false;
            Materials.Greenschist.mHasParentMod = false;
            Materials.Greywacke.mHasParentMod = false;
            Materials.Komatiite.mHasParentMod = false;
            Materials.Rhyolite.mHasParentMod = false;
            Materials.Siltstone.mHasParentMod = false;
        }
        if (!aEnablePFAAMats) {
            Materials.Mica.mHasParentMod = false;
            Materials.Gypsum.mHasParentMod = false;
            Materials.Trona.mHasParentMod = false;
        }
        if (!aEnableGCMarsMats) {
            Materials.Desh.mHasParentMod = false;
            Materials.MeteoricIron.mHasParentMod = false;
            Materials.MeteoricSteel.mHasParentMod = false;
        }
        if (!aEnableRotaryCraftMats) {
            Materials.HSLA.mHasParentMod = false;
        }
        if (!aEnableEnderIOMats) {
            Materials.DarkSteel.mHasParentMod = false;
        }
        if (!aEnableRailcraftMats) {
            Materials.Firestone.mHasParentMod = false;
        }

        // Enable Materials if correct mod is Loaded
        Materials.ChromiumDioxide.mHasParentMod = Loader.isModLoaded("computronics");
    }

    @Override
    public void onComponentInit() {
        if (Loader.isModLoaded("computronics")) {
            OrePrefixes.ring.enableComponent(Materials.RedAlloy);
            OrePrefixes.ring.enableComponent(Materials.NiobiumTitanium);
            OrePrefixes.foil.enableComponent(Materials.StainlessSteel);
            OrePrefixes.foil.enableComponent(Materials.ChromiumDioxide);
            OrePrefixes.foil.enableComponent(Materials.Iron);
            OrePrefixes.plate.enableComponent(Materials.ChromiumDioxide);
            OrePrefixes.screw.enableComponent(Materials.Copper);
        }
    }

    @Override
    public void onComponentIteration(Materials aMaterial) {
        // NOOP
    }
}
