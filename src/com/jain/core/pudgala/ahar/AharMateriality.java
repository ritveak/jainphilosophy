package com.jain.core.pudgala.ahar;

import com.jain.core.lexicon.Lexical;

/**
 * English: High-level doctrinal roughness/subtlety of an ahar modality.
 */
public enum AharMateriality implements Lexical {
    GROSS("Gross — ordinary material intake involving palpable pudgala"),
    MIXED("Mixed — bridges subtle vitality support and bodily nourishment"),
    SUBTLE("Subtle — fine intake not dependent on ordinary gross ingestion");

    private final String englishMeaning;

    AharMateriality(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
