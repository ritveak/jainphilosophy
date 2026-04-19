package com.jain.core.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} up-prakaar samooh.
 * English: Doctrinal grouping of karma subtypes within each main karma type.
 */
public enum KarmaSubTypeGroup implements Lexical {
    GYAANAVARNIYA_PANCHAKA(KarmaType.GYAANAVARNIYA, "Five knowledge-obscuring subtypes"),
    DARSHANAVARNIYA_DARSHAN_CHATUSTAYA(
            KarmaType.DARSHANAVARNIYA, "Four direct perception-obscuring subtypes"),
    DARSHANAVARNIYA_NIDRA_PANCHAKA(KarmaType.DARSHANAVARNIYA, "Five sleep and lethargy obscuring subtypes"),
    DARSHAN_MOHANIYA_TRAYA(KarmaType.MOHANIYA, "Three faith-deluding subtypes"),
    CHARITRA_MOHANIYA_ANANTANUBANDHI_KASHAYA_CHATUSTAYA(
            KarmaType.MOHANIYA, "Four endless-binding passion-deluding subtypes"),
    CHARITRA_MOHANIYA_NO_KASHAYA_SHATKA(KarmaType.MOHANIYA, "Six quasi-passional conduct-deluding subtypes"),
    CHARITRA_MOHANIYA_VEDA_TRAYA(KarmaType.MOHANIYA, "Three gender-infatuation conduct-deluding subtypes"),
    ANTARAI_PANCHAKA(KarmaType.ANTARAI, "Five obstructive subtypes"),
    VEDANIYA_DVAYA(KarmaType.VEDANIYA, "Two feeling-producing subtypes"),
    GOTRA_DVAYA(KarmaType.GOTRA, "Two status-determining subtypes"),
    AAYUSHYA_CHATUSTAYA(KarmaType.AAYUSHYA, "Four life-span determining subtypes"),
    NAAM_EXISTENTIAL_DETERMINERS(KarmaType.NAAM, "Existential and birth-form determining nama subtypes"),
    NAAM_BODY_FORMATION(KarmaType.NAAM, "Body-formation and structure determining nama subtypes"),
    NAAM_SENSORY_QUALITIES(KarmaType.NAAM, "Embodied sensory-quality determining nama subtypes");

    private final KarmaType type;
    private final String englishMeaning;

    KarmaSubTypeGroup(KarmaType type, String englishMeaning) {
        this.type = type;
        this.englishMeaning = englishMeaning;
    }

    public KarmaType type() {
        return type;
    }

    public KarmaClass karmaClass() {
        return type.karmaClass();
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
