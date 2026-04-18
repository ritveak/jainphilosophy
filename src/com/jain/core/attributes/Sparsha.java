package com.jain.core.attributes;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Sparsh} — aath sparsh gunn.
 * English: Eight touch qualities of pudgala (murta); grouped as thermal, charge-like, stress/strain, and weight
 * (Kachhara 2016).
 */
public enum Sparsha implements Lexical {
    SHEET("Cold touch"),
    USHNA("Hot touch"),
    SNIGDH("Smooth touch (positive charge tendency)"),
    RUKSH("Rough touch (negative charge tendency)"),
    LAGHU("Light touch"),
    GURU("Heavy touch"),
    MRIDU("Soft touch"),
    KATHOR("Hard touch");

    private final String englishMeaning;

    Sparsha(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    /** Primary touches: thermal and charge-like pair before secondary touches in gross bonding. */
    public boolean primaryInChargeAndThermalSense() {
        return this == SHEET || this == USHNA || this == SNIGDH || this == RUKSH;
    }

    /** Secondary touches from bonded paramanus in eight-touch gross aggregates. */
    public boolean secondaryInWeightAndTextureSense() {
        return this == LAGHU || this == GURU || this == MRIDU || this == KATHOR;
    }
}
