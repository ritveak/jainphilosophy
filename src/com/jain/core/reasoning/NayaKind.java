package com.jain.core.reasoning;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Naya} ke saat mukhya bhed.
 * English: Seven classical standpoints of nayavada.
 */
public enum NayaKind implements Lexical {
    NAIGAM("Common-purpose standpoint"),
    SANGRAH("Generic / class-level standpoint"),
    VYAVAHAR("Practical / particular standpoint"),
    RJUSUTRA("Momentary-present-mode standpoint"),
    SHABD("Verbal / linguistic standpoint"),
    SAMABHIRUDH("Etymologically specific verbal standpoint"),
    EVAMBHOOT("Actualized-function standpoint");

    private final String englishMeaning;

    NayaKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
