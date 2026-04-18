package com.jain.core.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} ki up-prakaar / prakritiyan.
 * English: Karma subtypes (prakritis) under each main karma type.
 */
public enum KarmaSubType implements Lexical {
    MATI_GYAANAVARNIYA(KarmaType.GYAANAVARNIYA, "Obscuring mati-jnana (sensory-cognition knowledge)"),
    SHRUT_GYAANAVARNIYA(KarmaType.GYAANAVARNIYA, "Obscuring shruta-jnana (scriptural knowledge)"),
    AVADHI_GYAANAVARNIYA(KarmaType.GYAANAVARNIYA, "Obscuring avadhi-jnana (clairvoyant knowledge)"),
    MANAHPARYAAY_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA, "Obscuring manahparyaya-jnana (telepathic knowledge)"),
    KEVAL_GYAANAVARNIYA(KarmaType.GYAANAVARNIYA, "Obscuring kevala-jnana (omniscience)"),

    CHAKSHU_DARSHANAVARNIYA(KarmaType.DARSHANAVARNIYA, "Obscuring ocular perception"),
    ACHAKSHU_DARSHANAVARNIYA(KarmaType.DARSHANAVARNIYA, "Obscuring non-ocular perception"),
    AVADHI_DARSHANAVARNIYA(KarmaType.DARSHANAVARNIYA, "Obscuring avadhi perception"),
    KEVAL_DARSHANAVARNIYA(KarmaType.DARSHANAVARNIYA, "Obscuring kevala perception"),
    NIDRA(KarmaType.DARSHANAVARNIYA, "Ordinary sleep obscuring perception"),
    NIDRA_NIDRA(KarmaType.DARSHANAVARNIYA, "Deep sleep obscuring perception"),
    PRACHALA(KarmaType.DARSHANAVARNIYA, "Drowsy wakefulness"),
    PRACHALA_PRACHALA(KarmaType.DARSHANAVARNIYA, "Heavy drowsy wakefulness"),
    STYAANARDDHI(KarmaType.DARSHANAVARNIYA, "Lethargy / psychic stupor obscuring perception"),

    MITHYATAVA(KarmaType.MOHANIYA, "Faith-deluding wrong belief"),
    SAMYAKTVA_MOHANIYA(KarmaType.MOHANIYA, "Faith-deluding obstruction of right belief"),
    MISHR(KarmaType.MOHANIYA, "Mixed faith-delusion"),
    KRODH_ANANTANUBANDHI(KarmaType.MOHANIYA, "Endless-binding anger passion"),
    MAAN_ANANTANUBANDHI(KarmaType.MOHANIYA, "Endless-binding pride passion"),
    MAYA_ANANTANUBANDHI(KarmaType.MOHANIYA, "Endless-binding deceit passion"),
    LOBH_ANANTANUBANDHI(KarmaType.MOHANIYA, "Endless-binding greed passion"),
    HASYA(KarmaType.MOHANIYA, "Laughter / frivolity (non-passion delusion)"),
    RATI(KarmaType.MOHANIYA, "Attachment / liking (non-passion delusion)"),
    ARATI(KarmaType.MOHANIYA, "Dislike / aversion (non-passion delusion)"),
    SHOK(KarmaType.MOHANIYA, "Sorrow (non-passion delusion)"),
    BHAY(KarmaType.MOHANIYA, "Fear (non-passion delusion)"),
    JUGUPSA(KarmaType.MOHANIYA, "Disgust (non-passion delusion)"),
    PURUSH_VED(KarmaType.MOHANIYA, "Male gendered infatuation"),
    STRI_VED(KarmaType.MOHANIYA, "Female gendered infatuation"),
    NAPUNSAK_VED(KarmaType.MOHANIYA, "Neuter gendered infatuation"),

    DAAN_ANTARAI(KarmaType.ANTARAI, "Obstruction to charity"),
    LABH_ANTARAI(KarmaType.ANTARAI, "Obstruction to gain"),
    BHOG_ANTARAI(KarmaType.ANTARAI, "Obstruction to enjoyment"),
    UPABHOG_ANTARAI(KarmaType.ANTARAI, "Obstruction to repeated enjoyment"),
    VIRYA_ANTARAI(KarmaType.ANTARAI, "Obstruction to energy / power"),

    SHAATA_VEDANIYA(KarmaType.VEDANIYA, "Pleasant-feeling karma"),
    ASHAATA_VEDANIYA(KarmaType.VEDANIYA, "Unpleasant-feeling karma"),

    UCHCHH_GOTRA(KarmaType.GOTRA, "High-status determining karma"),
    NICHCHH_GOTRA(KarmaType.GOTRA, "Low-status determining karma"),

    DEV_AAYUSHYA(KarmaType.AAYUSHYA, "Celestial life-span karma"),
    MANUSHYA_AAYUSHYA(KarmaType.AAYUSHYA, "Human life-span karma"),
    TIRYANCH_AAYUSHYA(KarmaType.AAYUSHYA, "Animal life-span karma"),
    NARAK_AAYUSHYA(KarmaType.AAYUSHYA, "Infernal life-span karma"),

    GATI_NAAM(KarmaType.NAAM, "Realm-determining nama-karma"),
    JAATI_NAAM(KarmaType.NAAM, "Birth-class-determining nama-karma"),
    SHARIR_NAAM(KarmaType.NAAM, "Body-type-determining nama-karma"),
    ANGOPANG_NAAM(KarmaType.NAAM, "Limb-determining nama-karma"),
    SAMHAANAN_NAAM(KarmaType.NAAM, "Joint-binding nama-karma"),
    SAMSTHAAN_NAAM(KarmaType.NAAM, "Symmetry / stature nama-karma"),
    VARN_NAAM(KarmaType.NAAM, "Bodily-colour nama-karma"),
    GANDH_NAAM(KarmaType.NAAM, "Bodily-smell nama-karma"),
    RAAS_NAAM(KarmaType.NAAM, "Bodily-taste nama-karma"),
    SPARSH_NAAM(KarmaType.NAAM, "Bodily-touch nama-karma");

    private final KarmaType parentType;
    private final String englishMeaning;

    KarmaSubType(KarmaType parentType, String englishMeaning) {
        this.parentType = parentType;
        this.englishMeaning = englishMeaning;
    }

    public KarmaType parentType() {
        return parentType;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
