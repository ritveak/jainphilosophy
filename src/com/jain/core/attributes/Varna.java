package com.jain.core.attributes;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Varn} — rang ke mukhya bhed.
 * English: Five primary colours of pudgala (murta); intensities vary (Kachhara 2016).
 */
public enum Varna implements Lexical {
    KRISHN("Black"),
    NEEL("Blue"),
    LOHIT("Red"),
    HARIT("Yellow / green-yellow"),
    SHUKL("White");

    private final String englishMeaning;

    Varna(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
