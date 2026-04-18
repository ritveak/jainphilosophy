package com.jain.core.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} ke aath mukhya prakaar.
 * English: Main karma types (eight prakritis).
 */
public enum KarmaType implements Lexical {
    GYAANAVARNIYA("Knowledge-obscuring karma"),
    DARSHANAVARNIYA("Perception-obscuring karma"),
    MOHANIYA("Deluding karma"),
    ANTARAI("Obstruction karma"),
    VEDANIYA("Feeling-producing karma"),
    NAAM("Body-determining karma"),
    GOTRA("Status-determining karma"),
    AAYUSHYA("Life-span-determining karma");

    private final String englishMeaning;

    KarmaType(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
