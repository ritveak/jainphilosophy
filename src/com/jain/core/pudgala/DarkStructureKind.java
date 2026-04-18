package com.jain.core.pudgala;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Andhakaar} maandal.
 * English: Ultra-dark cosmic structures (Bhagwati; Kachhara §6).
 */
public enum DarkStructureKind implements Lexical {
    TAAMASKAAY("Mass of darkness (tamaskaya)"),
    KRISHNARAAJI("Eight black streaks in a closed loop (krsnaraji)");

    private final String englishMeaning;

    DarkStructureKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
