package com.jain.core.reasoning;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Syaad} ke sapt bhaang.
 * English: Seven classic qualified modes of assertion in syadvada.
 */
public enum SyadMode implements Lexical {
    SYAD_ASTI("In some respect, it is"),
    SYAD_NASTI("In some respect, it is not"),
    SYAD_ASTI_NASTI("In some respect, it is and is not"),
    SYAD_AVAKTAVYA("In some respect, it is indescribable"),
    SYAD_ASTI_AVAKTAVYA("In some respect, it is and is indescribable"),
    SYAD_NASTI_AVAKTAVYA("In some respect, it is not and is indescribable"),
    SYAD_ASTI_NASTI_AVAKTAVYA("In some respect, it is, is not, and is indescribable");

    private final String englishMeaning;

    SyadMode(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
