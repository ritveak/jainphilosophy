package com.jain.core.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} ki up-prakaar / prakritiyan.
 * English: Karma subtypes (prakritis) under each main karma type.
 */
public enum KarmaSubType implements Lexical {
    MATI_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA,
            KarmaSubTypeGroup.GYAANAVARNIYA_PANCHAKA,
            "Obscuring mati-jnana (sensory-cognition knowledge)"),
    SHRUT_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA,
            KarmaSubTypeGroup.GYAANAVARNIYA_PANCHAKA,
            "Obscuring shruta-jnana (scriptural knowledge)"),
    AVADHI_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA,
            KarmaSubTypeGroup.GYAANAVARNIYA_PANCHAKA,
            "Obscuring avadhi-jnana (clairvoyant knowledge)"),
    MANAHPARYAAY_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA,
            KarmaSubTypeGroup.GYAANAVARNIYA_PANCHAKA,
            "Obscuring manahparyaya-jnana (telepathic knowledge)"),
    KEVAL_GYAANAVARNIYA(
            KarmaType.GYAANAVARNIYA,
            KarmaSubTypeGroup.GYAANAVARNIYA_PANCHAKA,
            "Obscuring kevala-jnana (omniscience)"),

    CHAKSHU_DARSHANAVARNIYA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_DARSHAN_CHATUSTAYA,
            "Obscuring ocular perception"),
    ACHAKSHU_DARSHANAVARNIYA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_DARSHAN_CHATUSTAYA,
            "Obscuring non-ocular perception"),
    AVADHI_DARSHANAVARNIYA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_DARSHAN_CHATUSTAYA,
            "Obscuring avadhi perception"),
    KEVAL_DARSHANAVARNIYA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_DARSHAN_CHATUSTAYA,
            "Obscuring kevala perception"),
    NIDRA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_NIDRA_PANCHAKA,
            "Ordinary sleep obscuring perception"),
    NIDRA_NIDRA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_NIDRA_PANCHAKA,
            "Deep sleep obscuring perception"),
    PRACHALA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_NIDRA_PANCHAKA,
            "Drowsy wakefulness"),
    PRACHALA_PRACHALA(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_NIDRA_PANCHAKA,
            "Heavy drowsy wakefulness"),
    STYAANARDDHI(
            KarmaType.DARSHANAVARNIYA,
            KarmaSubTypeGroup.DARSHANAVARNIYA_NIDRA_PANCHAKA,
            "Lethargy / psychic stupor obscuring perception"),

    MITHYATAVA(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.DARSHAN_MOHANIYA_TRAYA,
            "Faith-deluding wrong belief"),
    SAMYAKTVA_MOHANIYA(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.DARSHAN_MOHANIYA_TRAYA,
            "Faith-deluding obstruction of right belief"),
    MISHR(KarmaType.MOHANIYA, KarmaSubTypeGroup.DARSHAN_MOHANIYA_TRAYA, "Mixed faith-delusion"),
    KRODH_ANANTANUBANDHI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_ANANTANUBANDHI_KASHAYA_CHATUSTAYA,
            "Endless-binding anger passion"),
    MAAN_ANANTANUBANDHI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_ANANTANUBANDHI_KASHAYA_CHATUSTAYA,
            "Endless-binding pride passion"),
    MAYA_ANANTANUBANDHI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_ANANTANUBANDHI_KASHAYA_CHATUSTAYA,
            "Endless-binding deceit passion"),
    LOBH_ANANTANUBANDHI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_ANANTANUBANDHI_KASHAYA_CHATUSTAYA,
            "Endless-binding greed passion"),
    HASYA(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Laughter / frivolity (non-passion delusion)"),
    RATI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Attachment / liking (non-passion delusion)"),
    ARATI(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Dislike / aversion (non-passion delusion)"),
    SHOK(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Sorrow (non-passion delusion)"),
    BHAY(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Fear (non-passion delusion)"),
    JUGUPSA(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA,
            "Disgust (non-passion delusion)"),
    PURUSH_VED(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_VEDA_TRAYA,
            "Male gendered infatuation"),
    STRI_VED(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_VEDA_TRAYA,
            "Female gendered infatuation"),
    NAPUNSAK_VED(
            KarmaType.MOHANIYA,
            KarmaSubTypeGroup.CHARITRA_MOHANIYA_VEDA_TRAYA,
            "Neuter gendered infatuation"),

    DAAN_ANTARAI(KarmaType.ANTARAI, KarmaSubTypeGroup.ANTARAI_PANCHAKA, "Obstruction to charity"),
    LABH_ANTARAI(KarmaType.ANTARAI, KarmaSubTypeGroup.ANTARAI_PANCHAKA, "Obstruction to gain"),
    BHOG_ANTARAI(KarmaType.ANTARAI, KarmaSubTypeGroup.ANTARAI_PANCHAKA, "Obstruction to enjoyment"),
    UPABHOG_ANTARAI(
            KarmaType.ANTARAI,
            KarmaSubTypeGroup.ANTARAI_PANCHAKA,
            "Obstruction to repeated enjoyment"),
    VIRYA_ANTARAI(KarmaType.ANTARAI, KarmaSubTypeGroup.ANTARAI_PANCHAKA, "Obstruction to energy / power"),

    SHAATA_VEDANIYA(KarmaType.VEDANIYA, KarmaSubTypeGroup.VEDANIYA_DVAYA, "Pleasant-feeling karma"),
    ASHAATA_VEDANIYA(KarmaType.VEDANIYA, KarmaSubTypeGroup.VEDANIYA_DVAYA, "Unpleasant-feeling karma"),

    UCHCHH_GOTRA(KarmaType.GOTRA, KarmaSubTypeGroup.GOTRA_DVAYA, "High-status determining karma"),
    NICHCHH_GOTRA(KarmaType.GOTRA, KarmaSubTypeGroup.GOTRA_DVAYA, "Low-status determining karma"),

    DEV_AAYUSHYA(KarmaType.AAYUSHYA, KarmaSubTypeGroup.AAYUSHYA_CHATUSTAYA, "Celestial life-span karma"),
    MANUSHYA_AAYUSHYA(KarmaType.AAYUSHYA, KarmaSubTypeGroup.AAYUSHYA_CHATUSTAYA, "Human life-span karma"),
    TIRYANCH_AAYUSHYA(KarmaType.AAYUSHYA, KarmaSubTypeGroup.AAYUSHYA_CHATUSTAYA, "Animal life-span karma"),
    NARAK_AAYUSHYA(KarmaType.AAYUSHYA, KarmaSubTypeGroup.AAYUSHYA_CHATUSTAYA, "Infernal life-span karma"),

    GATI_NAAM(
            KarmaType.NAAM,
            KarmaSubTypeGroup.NAAM_EXISTENTIAL_DETERMINERS,
            "Realm-determining nama-karma"),
    JAATI_NAAM(
            KarmaType.NAAM,
            KarmaSubTypeGroup.NAAM_EXISTENTIAL_DETERMINERS,
            "Birth-class-determining nama-karma"),
    SHARIR_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_BODY_FORMATION, "Body-type-determining nama-karma"),
    ANGOPANG_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_BODY_FORMATION, "Limb-determining nama-karma"),
    SAMHAANAN_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_BODY_FORMATION, "Joint-binding nama-karma"),
    SAMSTHAAN_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_BODY_FORMATION, "Symmetry / stature nama-karma"),
    VARN_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_SENSORY_QUALITIES, "Bodily-colour nama-karma"),
    GANDH_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_SENSORY_QUALITIES, "Bodily-smell nama-karma"),
    RAAS_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_SENSORY_QUALITIES, "Bodily-taste nama-karma"),
    SPARSH_NAAM(KarmaType.NAAM, KarmaSubTypeGroup.NAAM_SENSORY_QUALITIES, "Bodily-touch nama-karma");

    private final KarmaType type;
    private final KarmaSubTypeGroup group;
    private final String englishMeaning;

    KarmaSubType(KarmaType type, KarmaSubTypeGroup group, String englishMeaning) {
        if (group.type() != type) {
            throw new IllegalArgumentException("group " + group + " does not belong to karma type " + type);
        }
        this.type = type;
        this.group = group;
        this.englishMeaning = englishMeaning;
    }

    public KarmaType type() {
        return type;
    }

    public KarmaSubTypeGroup group() {
        return group;
    }

    public KarmaClass karmaClass() {
        return type.karmaClass();
    }

    public boolean matchesType(KarmaType expectedType) {
        return type == expectedType;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
