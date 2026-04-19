package com.jain.core.pudgala.motion;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Parinaam} ka kaaran.
 * English: How pudgala transforms relative to life (Kachhara §8).
 */
public enum MatterParinamaKind implements Lexical {
    PRAYOG_PARINAAT("Living organic matter transformed by vital processes"),
    MISHR_PARINAAT("Formerly living / mixed organic matter (e.g. leather, meat)"),
    VISRAS_PARINAAT("Non-living inorganic matter with natural change only");

    private final String englishMeaning;

    MatterParinamaKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
