package com.jain.core.attributes;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Raas} — svaad ke mukhya bhed.
 * English: Five primary tastes of pudgala (murta); intensities vary (Kachhara 2016).
 */
public enum Rasa implements Lexical {
    MADHUR("Sweet"),
    TIKTA("Bitter"),
    KATU("Pungent / acrid"),
    AMLA("Sour"),
    KASHAAY("Astringent");

    private final String englishMeaning;

    Rasa(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
