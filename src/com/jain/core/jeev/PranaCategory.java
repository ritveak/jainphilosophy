package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: Prana ke mukhya varg.
 * English: The major categories of Prana (Vitality) in Jain philosophy.
 */
public enum PranaCategory implements Lexical {
    INDRIYA("Five senses vitality"),
    BALA("Three forces vitality"),
    SHVASOCHCHHVAS("Respiration vitality"),
    AYUSHYA("Life-span vitality");

    private final String englishMeaning;

    PranaCategory(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
