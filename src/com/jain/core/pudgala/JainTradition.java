package com.jain.core.pudgala;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Jain sampradaay}.
 * English: Major Jain textual communities (e.g. paramanu bonding variants).
 */
public enum JainTradition implements Lexical {
    SHVETAMBAR("Śvetāmbara tradition"),
    DIGAMBAR("Digambara tradition");

    private final String englishMeaning;

    JainTradition(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
