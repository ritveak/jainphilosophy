package com.jain.core.pudgala.paramanu;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Aavesh} samata.
 * English: Similar vs opposite charge sign between two paramanus (bonding rules).
 */
public enum ChargeParity implements Lexical {
    SADRISH("Same sign of charge (similar)"),
    VIPARIT("Opposite sign of charge (dissimilar)");

    private final String englishMeaning;

    ChargeParity(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
