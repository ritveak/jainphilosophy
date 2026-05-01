package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Saini / Asaini}.
 * English: Cognitive classification based on the presence of a functional Mind (Manas).
 */
public enum CognitionLevel implements Lexical {
    SAINI("Rational: Beings with a Mind capable of discernment, memory, and spiritual learning"),
    ASAINI("Irrational: Beings without a functional Mind acting purely on instinct");

    private final String englishMeaning;

    CognitionLevel(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
