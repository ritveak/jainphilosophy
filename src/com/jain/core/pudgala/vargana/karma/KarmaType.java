package com.jain.core.pudgala.vargana.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} ke aath mukhya prakaar.
 * English: Main karma types (eight prakritis).
 */
public enum KarmaType implements Lexical {
    GYAANAVARNIYA(KarmaClass.GHATI, "Knowledge-obscuring karma"),
    DARSHANAVARNIYA(KarmaClass.GHATI, "Perception-obscuring karma"),
    MOHANIYA(KarmaClass.GHATI, "Deluding karma"),
    ANTARAI(KarmaClass.GHATI, "Obstruction karma"),
    VEDANIYA(KarmaClass.AGHATI, "Feeling-producing karma"),
    NAAM(KarmaClass.AGHATI, "Body-determining karma"),
    GOTRA(KarmaClass.AGHATI, "Status-determining karma"),
    AAYUSHYA(KarmaClass.AGHATI, "Life-span-determining karma");

    private final KarmaClass karmaClass;
    private final String englishMeaning;

    KarmaType(KarmaClass karmaClass, String englishMeaning) {
        this.karmaClass = karmaClass;
        this.englishMeaning = englishMeaning;
    }

    public KarmaClass karmaClass() {
        return karmaClass;
    }

    public boolean isGhati() {
        return karmaClass == KarmaClass.GHATI;
    }

    public boolean isAghati() {
        return karmaClass == KarmaClass.AGHATI;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
