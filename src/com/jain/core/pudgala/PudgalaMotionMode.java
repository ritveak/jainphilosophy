package com.jain.core.pudgala;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Gati} ke do bhed.
 * English: Motion with vs without touch-mediated contact (Kachhara §9).
 */
public enum PudgalaMotionMode implements Lexical {
    SPARSHAD("Touch-mediated motion (pudgala on space-points)"),
    ASPARSHAD("Non-contact motion (pure soul, no touch forces)");

    private final String englishMeaning;

    PudgalaMotionMode(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
