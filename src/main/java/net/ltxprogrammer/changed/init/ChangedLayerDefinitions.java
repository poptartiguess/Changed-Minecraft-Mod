package net.ltxprogrammer.changed.init;

import net.ltxprogrammer.changed.Changed;
import net.ltxprogrammer.changed.client.renderer.model.*;
import net.ltxprogrammer.changed.client.renderer.model.armor.*;
import net.ltxprogrammer.changed.client.renderer.model.hair.Legacy;
import net.ltxprogrammer.changed.data.DelayLoadedModel;
import net.ltxprogrammer.changed.entity.HairStyle;
import net.ltxprogrammer.changed.util.PatreonBenefits;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChangedLayerDefinitions {
    public static final ModelLayerLocation LATEX_COAT = new ModelLayerLocation(Changed.modResource("player"), "latex_coat");
    public static final ModelLayerLocation LATEX_COAT_SLIM = new ModelLayerLocation(Changed.modResource("player_slim"), "latex_coat");

    @SubscribeEvent
    public static void registerLayerDefinitions(FMLCommonSetupEvent event) {
        ForgeHooksClient.registerLayerDefinition(LATEX_COAT, () ->
                LayerDefinition.create(PlayerModel.createMesh(new CubeDeformation(0.01F), false), 64, 64));
        ForgeHooksClient.registerLayerDefinition(LATEX_COAT_SLIM, () ->
                LayerDefinition.create(PlayerModel.createMesh(new CubeDeformation(0.01F), false), 64, 64));
        ForgeHooksClient.registerLayerDefinition(DarkLatexMaskModel.LAYER_LOCATION, DarkLatexMaskModel::createMask);
        ForgeHooksClient.registerLayerDefinition(CentaurChestPackModel.LAYER_LOCATION, CentaurChestPackModel::createPack);

        ForgeHooksClient.registerLayerDefinition(BehemothHeadModel.LAYER_LOCATION, BehemothHeadModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(BehemothHandLeftModel.LAYER_LOCATION, BehemothHandLeftModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(BehemothHandRightModel.LAYER_LOCATION, BehemothHandRightModel::createBodyLayer);

        ForgeHooksClient.registerLayerDefinition(AerosolLatexWolfModel.LAYER_LOCATION, AerosolLatexWolfModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(DarkLatexDragonModel.LAYER_LOCATION, DarkLatexDragonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(DarkLatexWolfFemaleModel.LAYER_LOCATION, DarkLatexWolfFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(DarkLatexWolfMaleModel.LAYER_LOCATION, DarkLatexWolfMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(DarkLatexYufengModel.LAYER_LOCATION, DarkLatexYufengModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(HeadlessKnightModel.LAYER_LOCATION, HeadlessKnightModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexBeifengModel.LAYER_LOCATION, LatexBeifengModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexBenignWolfModel.LAYER_LOCATION, LatexBenignWolfModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexBlueDragonModel.LAYER_LOCATION, LatexBlueDragonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexBlueWolfModel.LAYER_LOCATION, LatexBlueWolfModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexCrocodileModel.LAYER_LOCATION, LatexCrocodileModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexCrystalWolfModel.LAYER_LOCATION, LatexCrystalWolfModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexDeerModel.LAYER_LOCATION, LatexDeerModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexHypnoCatModel.LAYER_LOCATION, LatexHypnoCatModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexLeafModel.LAYER_LOCATION, LatexLeafModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexMantaRayFemaleModel.LAYER_LOCATION, LatexMantaRayFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexMantaRayMaleModel.LAYER_LOCATION, LatexMantaRayMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexMedusaCatModel.LAYER_LOCATION, LatexMedusaCatModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexMermaidSharkModel.LAYER_LOCATION, LatexMermaidSharkModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexMimicPlantModel.LAYER_LOCATION, LatexMimicPlantModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexOrcaModel.LAYER_LOCATION, LatexOrcaModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexOtterModel.LAYER_LOCATION, LatexOtterModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexPinkDeerModel.LAYER_LOCATION, LatexPinkDeerModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexPinkWyvernModel.LAYER_LOCATION, LatexPinkWyvernModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexPinkYuinDragonModel.LAYER_LOCATION, LatexPinkYuinDragonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexPurpleFoxModel.LAYER_LOCATION, LatexPurpleFoxModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexRaccoonModel.LAYER_LOCATION, LatexRaccoonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexRedDragonModel.LAYER_LOCATION, LatexRedDragonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexRedPandaModel.LAYER_LOCATION, LatexRedPandaModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSharkModel.LAYER_LOCATION, LatexSharkModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSharkFemaleModel.LAYER_LOCATION, LatexSharkFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSharkMaleModel.LAYER_LOCATION, LatexSharkMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSilverFoxModel.LAYER_LOCATION, LatexSilverFoxModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSirenModel.LAYER_LOCATION, LatexSirenModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSnakeModel.LAYER_LOCATION, LatexSnakeModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSniperDogModel.LAYER_LOCATION, LatexSniperDogModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSnowLeopardFemaleModel.LAYER_LOCATION, LatexSnowLeopardFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSnowLeopardMaleModel.LAYER_LOCATION, LatexSnowLeopardMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSquidDogFemaleModel.LAYER_LOCATION, LatexSquidDogFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSquidDogMaleModel.LAYER_LOCATION, LatexSquidDogMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexSquirrelModel.LAYER_LOCATION, LatexSquirrelModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexStigerModel.LAYER_LOCATION, LatexStigerModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexTigerSharkModel.LAYER_LOCATION, LatexTigerSharkModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexTrafficConeDragonModel.LAYER_LOCATION, LatexTrafficConeDragonModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexTranslucentLizardModel.LAYER_LOCATION, LatexTranslucentLizardModel::createInnerLayer);
        ForgeHooksClient.registerLayerDefinition(LatexTranslucentLizardModel.LAYER_LOCATION_OUTER, LatexTranslucentLizardModel::createOuterLayer);
        ForgeHooksClient.registerLayerDefinition(LatexWatermelonCatModel.LAYER_LOCATION, LatexWatermelonCatModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexWhiteTigerModel.LAYER_LOCATION, LatexWhiteTigerModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LatexYuinModel.LAYER_LOCATION, LatexYuinModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexCentaurModel.LAYER_LOCATION, LightLatexCentaurModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexKnightModel.LAYER_LOCATION, LightLatexKnightModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexKnightFusionModel.LAYER_LOCATION, LightLatexKnightFusionModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexWolfFemaleModel.LAYER_LOCATION, LightLatexWolfFemaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexWolfMaleModel.LAYER_LOCATION, LightLatexWolfMaleModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(LightLatexWolfOrganicModel.LAYER_LOCATION, LightLatexWolfOrganicModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(MilkPuddingModel.LAYER_LOCATION, MilkPuddingModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(SharkModel.LAYER_LOCATION, SharkModel::createBodyLayer);
        ForgeHooksClient.registerLayerDefinition(WhiteLatexWolfModel.LAYER_LOCATION, WhiteLatexWolfModel::createBodyLayer);

        ForgeHooksClient.registerLayerDefinition(ArmorNoneModel.INNER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorNoneModel.OUTER_ARMOR, () -> ArmorNoneModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorNoTailModel.INNER_ARMOR, () -> ArmorNoTailModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorNoTailModel.OUTER_ARMOR, () -> ArmorNoTailModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorUpperBodyModel.INNER_ARMOR, () -> ArmorUpperBodyModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorUpperBodyModel.OUTER_ARMOR, () -> ArmorUpperBodyModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorAbdomenModel.INNER_ARMOR, () -> ArmorAbdomenModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorAbdomenModel.OUTER_ARMOR, () -> ArmorAbdomenModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorSnakeAbdomenModel.INNER_ARMOR, () -> ArmorSnakeAbdomenModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorSnakeAbdomenModel.OUTER_ARMOR, () -> ArmorSnakeAbdomenModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorMermaidSharkAbdomenModel.INNER_ARMOR, () -> ArmorMermaidSharkAbdomenModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorMermaidSharkAbdomenModel.OUTER_ARMOR, () -> ArmorMermaidSharkAbdomenModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorHeadlessKnightModel.INNER_ARMOR, () -> ArmorHeadlessKnightModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorHeadlessKnightModel.OUTER_ARMOR, () -> ArmorHeadlessKnightModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexYuinModel.INNER_ARMOR, () -> ArmorLatexYuinModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexYuinModel.OUTER_ARMOR, () -> ArmorLatexYuinModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexWolfModel.INNER_ARMOR, () -> ArmorLatexWolfModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexWolfModel.OUTER_ARMOR, () -> ArmorLatexWolfModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexOtterModel.INNER_ARMOR, () -> ArmorLatexOtterModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexOtterModel.OUTER_ARMOR, () -> ArmorLatexOtterModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSharkModel.INNER_ARMOR, () -> ArmorLatexSharkModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSharkModel.OUTER_ARMOR, () -> ArmorLatexSharkModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexStigerModel.INNER_ARMOR, () -> ArmorLatexStigerModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexStigerModel.OUTER_ARMOR, () -> ArmorLatexStigerModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexCrocodileModel.INNER_ARMOR, () -> ArmorLatexCrocodileModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexCrocodileModel.OUTER_ARMOR, () -> ArmorLatexCrocodileModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexDragonModel.INNER_ARMOR, () -> ArmorLatexDragonModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexDragonModel.OUTER_ARMOR, () -> ArmorLatexDragonModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSnowLeopardModel.INNER_ARMOR, () -> ArmorLatexSnowLeopardModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSnowLeopardModel.OUTER_ARMOR, () -> ArmorLatexSnowLeopardModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexBuffSharkModel.INNER_ARMOR, () -> ArmorLatexBuffSharkModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexBuffSharkModel.OUTER_ARMOR, () -> ArmorLatexBuffSharkModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSquidDogModel.INNER_ARMOR, () -> ArmorLatexSquidDogModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexSquidDogModel.OUTER_ARMOR, () -> ArmorLatexSquidDogModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexTrafficConeDragonModel.INNER_ARMOR, () -> ArmorLatexTrafficConeDragonModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexTrafficConeDragonModel.OUTER_ARMOR, () -> ArmorLatexTrafficConeDragonModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexBlueDragonModel.INNER_ARMOR, () -> ArmorLatexBlueDragonModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLatexBlueDragonModel.OUTER_ARMOR, () -> ArmorLatexBlueDragonModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexCentaurModel.INNER_ARMOR, () -> ArmorLightLatexCentaurModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexCentaurModel.OUTER_ARMOR, () -> ArmorLightLatexCentaurModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexKnightModel.INNER_ARMOR, () -> ArmorLightLatexKnightModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexKnightModel.OUTER_ARMOR, () -> ArmorLightLatexKnightModel.createArmorLayer(ArmorModel.OUTER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexKnightFusionModel.INNER_ARMOR, () -> ArmorLightLatexKnightFusionModel.createArmorLayer(ArmorModel.INNER));
        ForgeHooksClient.registerLayerDefinition(ArmorLightLatexKnightFusionModel.OUTER_ARMOR, () -> ArmorLightLatexKnightFusionModel.createArmorLayer(ArmorModel.OUTER));

        PatreonBenefits.LAYER_LOCATIONS.forEach((uuid, location) -> {
            PatreonBenefits.SpecialLatexForm form = PatreonBenefits.getPlayerSpecialForm(uuid);
            if (form == null)
                return;

            ForgeHooksClient.registerLayerDefinition(location.get(), () ->
                    form.model().createBodyLayer(
                            DelayLoadedModel.HUMANOID_PART_FIXER,
                            DelayLoadedModel.HUMANOID_GROUP_FIXER));
        });

        ArmorModelLayerLocation.ARMOR_LAYER_LOCATIONS.forEach((uuid, locations) -> {
            PatreonBenefits.SpecialLatexForm form = PatreonBenefits.getPlayerSpecialForm(uuid);
            if (form == null)
                return;

            ForgeHooksClient.registerLayerDefinition(locations.inner().get(), () ->
                    form.armorModelInner().createBodyLayer(
                            DelayLoadedModel.HUMANOID_PART_FIXER,
                            DelayLoadedModel.HUMANOID_GROUP_FIXER));
            ForgeHooksClient.registerLayerDefinition(locations.outer().get(), () ->
                    form.armorModelOuter().createBodyLayer(
                            DelayLoadedModel.HUMANOID_PART_FIXER,
                            DelayLoadedModel.HUMANOID_GROUP_FIXER));
        });

        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_MALE.headHair, Legacy::createMaleHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_RIGHT_BANG.lowerHair, Legacy::createFemaleLowerHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_RIGHT_BANG.headHair, Legacy::createFemaleRightBangHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_LEFT_BANG.headHair, Legacy::createFemaleLeftBangHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_DUAL_BANGS.headHair, Legacy::createFemaleDualBangHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_TRIPLE_BANGS.headHair, Legacy::createFemaleTripleBangsHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.FEMALE_NO_BANGS.headHair, Legacy::createFemaleNoBangsHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.FEMALE_SIDE_BANGS.headHair, Legacy::createFemaleSideBangsHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MOHAWK.headHair, Legacy::createMohawkHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.HEAD_FUZZ.headHair, Legacy::createHeadFuzzHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_STANDARD.headHair, Legacy::createMaleStandardHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_NWE.headHair, Legacy::createMaleHairNWE);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_RIGHT_BANG_S.headHair, Legacy::createFemaleRightBangHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_LEFT_BANG_S.headHair, Legacy::createFemaleLeftBangHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_DUAL_BANGS_S.headHair, Legacy::createFemaleDualBangHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.LEGACY_FEMALE_TRIPLE_BANGS_S.headHair, Legacy::createFemaleTripleBangsHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.FEMALE_NO_BANGS_S.headHair, Legacy::createFemaleNoBangsHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.FEMALE_SIDE_BANGS_S.headHair, Legacy::createFemaleSideBangsHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MOHAWK_S.headHair, Legacy::createMohawkHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.HEAD_FUZZ_S.headHair, Legacy::createHeadFuzzHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_STANDARD_S.headHair, Legacy::createMaleStandardHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_NWE_S.headHair, Legacy::createMaleHairNWESHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_SHORT_FRONT.headHair, Legacy::createShortFrontHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_SHORT_FRONT_S.headHair, Legacy::createShortFrontHairSHDD);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_SIDEBURN.headHair, Legacy::createSideburnHair);
        ForgeHooksClient.registerLayerDefinition(HairStyle.MALE_SIDEBURN_S.headHair, Legacy::createSideburnHairSHDD);
    }
}
