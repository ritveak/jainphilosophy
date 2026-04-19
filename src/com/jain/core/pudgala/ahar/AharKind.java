package com.jain.core.pudgala.ahar;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Ahar} ke mukhya prakaar.
 * English: Canonical methodologies by which pudgala is taken in by embodied or subtle beings.
 */
public enum AharKind implements Lexical {

    OJ_AHAR(
            "Ojahara",
            "Vital-energy intake",
            "Subtle embryonic or vitality-supporting nourishment drawn in before ordinary eating begins.",
            AharMateriality.MIXED,
            AharIntakeChannel.VITAL_ASSIMILATION),
    ROM_AHAR(
            "Romahara",
            "Pore absorption",
            "Matter absorbed through the body surface or pores, comparable to plant-like uptake.",
            AharMateriality.GROSS,
            AharIntakeChannel.BODY_SURFACE),
    KAVAL_AHAR(
            "Kavalahara",
            "Morsel intake",
            "Ordinary mouth-based intake of edible morsels and drinks; this is the only ahar kind with a further canonical fourfold breakdown.",
            AharMateriality.GROSS,
            AharIntakeChannel.MOUTH),
    LEP_AHAR(
            "Lepahara",
            "Smearing intake",
            "Intake through bodily application, smearing, or external contact with nutritive substances.",
            AharMateriality.GROSS,
            AharIntakeChannel.BODY_APPLICATION),
    MANAS_AHAR(
            "Manasahara",
            "Mental intake",
            "Subtle satisfaction or nourishment obtained through thought rather than ordinary physical ingestion.",
            AharMateriality.SUBTLE,
            AharIntakeChannel.MENTAL),
    KARMAN_AHAR(
            "Karmanahara",
            "Karmic intake",
            "Subtle karmic matter continuously drawn in, especially relevant in transitional and karmic-body discussions.",
            AharMateriality.SUBTLE,
            AharIntakeChannel.KARMIC);

    private final String transliteratedName;
    private final String englishMeaning;
    private final String description;
    private final AharMateriality materiality;
    private final AharIntakeChannel intakeChannel;

    AharKind(
            String transliteratedName,
            String englishMeaning,
            String description,
            AharMateriality materiality,
            AharIntakeChannel intakeChannel) {
        this.transliteratedName = transliteratedName;
        this.englishMeaning = englishMeaning;
        this.description = description;
        this.materiality = materiality;
        this.intakeChannel = intakeChannel;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public String transliteratedName() {
        return transliteratedName;
    }

    /**
     * Backward-compatible alias retained because the interrupted implementation already introduced this accessor.
     */
    public String simpleName() {
        return transliteratedName();
    }

    public String description() {
        return description;
    }

    public AharMateriality materiality() {
        return materiality;
    }

    public AharIntakeChannel intakeChannel() {
        return intakeChannel;
    }

    public boolean supportsSubdivision() {
        return this == KAVAL_AHAR;
    }
}
