package net.ltxprogrammer.changed.entity;

import net.ltxprogrammer.changed.Changed;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraftforge.common.IExtensibleEnum;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.*;

public enum HairStyle implements IExtensibleEnum, StringRepresentable {
    BALD(Gender.MALE),
    LEGACY_MALE(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_male"), "main"),
            Changed.modResource("textures/hair/legacy_male.png")),
    LEGACY_FEMALE_RIGHT_BANG(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_right_bang"), "main"),
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_lower"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    LEGACY_FEMALE_LEFT_BANG(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_left_bang"), "main"),
            LEGACY_FEMALE_RIGHT_BANG.lowerHair,
            Changed.modResource("textures/hair/legacy_collection.png")),
    LEGACY_FEMALE_DUAL_BANGS(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_dual_bangs"), "main"),
            LEGACY_FEMALE_RIGHT_BANG.lowerHair,
            Changed.modResource("textures/hair/legacy_collection.png")),
    LEGACY_FEMALE_TRIPLE_BANGS(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_triple_bangs"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    FEMALE_NO_BANGS(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/female_no_bangs"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    FEMALE_SIDE_BANGS(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/female_side_bangs"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    MOHAWK(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/mohawk_hair"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    HEAD_FUZZ(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/head_fuzz"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    MALE_STANDARD(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_standard"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    MALE_NWE(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_nwe"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    LEGACY_FEMALE_RIGHT_BANG_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_right_bang_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    LEGACY_FEMALE_LEFT_BANG_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_left_bang_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    LEGACY_FEMALE_DUAL_BANGS_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_dual_bangs_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    FEMALE_NO_BANGS_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/female_no_bangs_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    LEGACY_FEMALE_TRIPLE_BANGS_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/legacy_female_triple_bangs_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    FEMALE_SIDE_BANGS_S(Gender.FEMALE,
            new ModelLayerLocation(Changed.modResource("hair/female_side_bangs_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    MOHAWK_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/mohawk_hair_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    HEAD_FUZZ_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/head_fuzz_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    MALE_STANDARD_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_standard_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    MALE_NWE_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_nwe_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    MALE_SHORT_FRONT(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_short_front"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    MALE_SHORT_FRONT_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_short_front_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    MALE_SIDEBURN(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_sideburn"), "main"),
            Changed.modResource("textures/hair/legacy_collection.png")),
    MALE_SIDEBURN_S(Gender.MALE,
            new ModelLayerLocation(Changed.modResource("hair/male_sideburn_s"), "main"),
            Changed.modResource("textures/hair/legacy_collection_s.png")),
    DICHROME_MALE_STANDARD(Gender.MALE,
            MALE_STANDARD.headHair,
            MALE_STANDARD.textures[0], Changed.modResource("textures/hair/squirrel_layer.png")),
    DICHROME_MALE_STANDARD_S(Gender.MALE,
                           MALE_STANDARD.headHair,
                           MALE_STANDARD.textures[0], Changed.modResource("textures/hair/raccoon_layer.png")),
    DICHROME_FEMALE_TRIPLE_BANGS_S(Gender.FEMALE,
                             MALE_STANDARD.headHair,
                             MALE_STANDARD.textures[0], Changed.modResource("textures/hair/siren_layer.png"));
    @Nullable
    public final ModelLayerLocation headHair;
    @Nullable
    public final ModelLayerLocation lowerHair;
    @NotNull
    public final ResourceLocation[] textures;

    public boolean hasModel() {
        return headHair != null || lowerHair != null;
    }

    public boolean hasTexture() {
        return textures != null;
    }

    public static class Sorted {
        public static final EnumMap<Gender, List<HairStyle>> BY_GENDER = new EnumMap<>(Gender.class);
    }

    HairStyle(Gender gender) {
        Sorted.BY_GENDER.computeIfAbsent(gender, ignored -> new ArrayList<>()).add(this);
        this.headHair = null;
        this.lowerHair = null;
        this.textures = new ResourceLocation[0];
    }

    HairStyle(Gender gender, @Nullable ModelLayerLocation headHair, @NotNull ResourceLocation... textures) {
        Sorted.BY_GENDER.computeIfAbsent(gender, ignored -> new ArrayList<>()).add(this);
        this.headHair = headHair;
        this.lowerHair = null;
        this.textures = textures;
    }

    HairStyle(Gender gender, @Nullable ModelLayerLocation headHair, @Nullable ModelLayerLocation lowerHair, @NotNull ResourceLocation... textures) {
        Sorted.BY_GENDER.computeIfAbsent(gender, ignored -> new ArrayList<>()).add(this);
        this.headHair = headHair;
        this.lowerHair = lowerHair;
        this.textures = textures;
    }

    public static HairStyle randomStyle(Random random) {
        return HairStyle.values()[random.nextInt(HairStyle.values().length)];
    }

    public static HairStyle randomStyle(Gender gender, Random random) {
        if (!Sorted.BY_GENDER.containsKey(gender)) {
            return LEGACY_MALE;
        }

        else {
            var list = Sorted.BY_GENDER.get(gender);
            return list.get(random.nextInt(list.size()));
        }
    }

    public static HairStyle create(String name, Gender gender) {
        throw new IllegalStateException("Enum not extended");
    }

    public static HairStyle create(String name, Gender gender, @NotNull ModelLayerLocation headHair, @NotNull ResourceLocation... texture) {
        throw new IllegalStateException("Enum not extended");
    }

    public static HairStyle create(String name, Gender gender, @NotNull ModelLayerLocation headHair,
                                   @NotNull ModelLayerLocation lowerHair, @NotNull ResourceLocation... texture) {
        throw new IllegalStateException("Enum not extended");
    }

    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
