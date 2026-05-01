package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Pratyek / Sadharan Vanaspati}.
 * English: Classification of Plant bodies based on individual or shared soul embodiment.
 */
public enum VanaspatiEmbodiment implements Lexical {
    PRATYEKA("Individual: One soul per physical plant body"),
    SADHARANA("Common/Nigod: Infinite souls sharing a single physical plant body");

    private final String englishMeaning;

    VanaspatiEmbodiment(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
