package com.jain.core.pudgala.ahar;

import com.jain.core.lexicon.Lexical;

/**
 * English: Primary intake interface or route associated with an ahar modality.
 */
public enum AharIntakeChannel implements Lexical {
    VITAL_ASSIMILATION("Vital assimilation — subtle vitality-supporting intake"),
    BODY_SURFACE("Body surface — through pores, skin, or exposed surface"),
    MOUTH("Mouth — ordinary chewing, swallowing, or drinking"),
    BODY_APPLICATION("Body application — through smearing or bodily contact"),
    MENTAL("Mental — through thought-based satisfaction"),
    KARMIC("Karmic — through subtle karmic inflow");

    private final String englishMeaning;

    AharIntakeChannel(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
