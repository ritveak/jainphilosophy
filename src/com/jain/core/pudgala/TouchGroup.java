package com.jain.core.pudgala;

import com.jain.core.attributes.Sparsha;
import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Sparsh} samooh — chaar jode.
 * English: Four touch pairs for sparshad motion (Kachhara §9).
 */
public enum TouchGroup implements Lexical {
    TAAP(Sparsha.SHEET, Sparsha.USHNA, "Thermal pair (cold / hot)"),
    AAVESH(Sparsha.SNIGDH, Sparsha.RUKSH, "Charge-like pair (smooth / rough)"),
    TANAANV(Sparsha.MRIDU, Sparsha.KATHOR, "Stress–strain pair (soft / hard)"),
    BHAAR(Sparsha.LAGHU, Sparsha.GURU, "Weight pair (light / heavy)");

    private final Sparsha first;
    private final Sparsha second;
    private final String englishMeaning;

    TouchGroup(Sparsha first, Sparsha second, String englishMeaning) {
        this.first = first;
        this.second = second;
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public Sparsha first() {
        return first;
    }

    public Sparsha second() {
        return second;
    }

    public boolean contains(Sparsha s) {
        return s == first || s == second;
    }
}
