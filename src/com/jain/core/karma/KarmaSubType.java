package com.jain.core.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} ki up-prakaar / prakritiyan.
 * English: Karma subtypes (prakritis) under each main karma type.
 */
public enum KarmaSubType implements Lexical {
    MATI_GYAANAVARNIYA("Obscuring mati-jnana (sensory-cognition knowledge)"),
    SHRUT_GYAANAVARNIYA("Obscuring shruta-jnana (scriptural knowledge)"),
    AVADHI_GYAANAVARNIYA("Obscuring avadhi-jnana (clairvoyant knowledge)"),
    MANAHPARYAAY_GYAANAVARNIYA("Obscuring manahparyaya-jnana (telepathic knowledge)"),
    KEVAL_GYAANAVARNIYA("Obscuring kevala-jnana (omniscience)"),

    CHAKSHU_DARSHANAVARNIYA("Obscuring ocular perception"),
    ACHAKSHU_DARSHANAVARNIYA("Obscuring non-ocular perception"),
    AVADHI_DARSHANAVARNIYA("Obscuring avadhi perception"),
    KEVAL_DARSHANAVARNIYA("Obscuring kevala perception"),
    NIDRA("Ordinary sleep obscuring perception"),
    NIDRA_NIDRA("Deep sleep obscuring perception"),
    PRACHALA("Drowsy wakefulness"),
    PRACHALA_PRACHALA("Heavy drowsy wakefulness"),
    STYAANARDDHI("Lethargy / psychic stupor obscuring perception"),

    MITHYATAVA("Faith-deluding wrong belief"),
    SAMYAKTVA_MOHANIYA("Faith-deluding obstruction of right belief"),
    MISHR("Mixed faith-delusion"),
    KRODH_ANANTANUBANDHI("Endless-binding anger passion"),
    MAAN_ANANTANUBANDHI("Endless-binding pride passion"),
    MAYA_ANANTANUBANDHI("Endless-binding deceit passion"),
    LOBH_ANANTANUBANDHI("Endless-binding greed passion"),
    HASYA("Laughter / frivolity (non-passion delusion)"),
    RATI("Attachment / liking (non-passion delusion)"),
    ARATI("Dislike / aversion (non-passion delusion)"),
    SHOK("Sorrow (non-passion delusion)"),
    BHAY("Fear (non-passion delusion)"),
    JUGUPSA("Disgust (non-passion delusion)"),
    PURUSH_VED("Male gendered infatuation"),
    STRI_VED("Female gendered infatuation"),
    NAPUNSAK_VED("Neuter gendered infatuation"),

    DAAN_ANTARAI("Obstruction to charity"),
    LABH_ANTARAI("Obstruction to gain"),
    BHOG_ANTARAI("Obstruction to enjoyment"),
    UPABHOG_ANTARAI("Obstruction to repeated enjoyment"),
    VIRYA_ANTARAI("Obstruction to energy / power"),

    SHAATA_VEDANIYA("Pleasant-feeling karma"),
    ASHAATA_VEDANIYA("Unpleasant-feeling karma"),

    UCHCHH_GOTRA("High-status determining karma"),
    NICHCHH_GOTRA("Low-status determining karma"),

    DEV_AAYUSHYA("Celestial life-span karma"),
    MANUSHYA_AAYUSHYA("Human life-span karma"),
    TIRYANCH_AAYUSHYA("Animal life-span karma"),
    NARAK_AAYUSHYA("Infernal life-span karma"),

    GATI_NAAM("Realm-determining nama-karma"),
    JAATI_NAAM("Birth-class-determining nama-karma"),
    SHARIR_NAAM("Body-type-determining nama-karma"),
    ANGOPANG_NAAM("Limb-determining nama-karma"),
    SAMHAANAN_NAAM("Joint-binding nama-karma"),
    SAMSTHAAN_NAAM("Symmetry / stature nama-karma"),
    VARN_NAAM("Bodily-colour nama-karma"),
    GANDH_NAAM("Bodily-smell nama-karma"),
    RAAS_NAAM("Bodily-taste nama-karma"),
    SPARSH_NAAM("Bodily-touch nama-karma");

    private final String englishMeaning;

    KarmaSubType(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
