package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Badar-Sukshma}.
 * English: Classification of bodies based on grossness and subtlety (pervasiveness).
 */
public enum BodySize implements Lexical {
    BADAR("Gross: A physical body that is obstructed by other matter"),
    SUKSHMA("Subtle: A minute body that is pervasive and cannot be obstructed");

    private final String englishMeaning;

    BodySize(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
