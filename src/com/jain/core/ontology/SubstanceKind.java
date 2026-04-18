package com.jain.core.ontology;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Dravya} ke chhah bhed.
 * English: Kinds of substance (six dravyas in Jain metaphysics).
 */
public enum SubstanceKind implements Lexical {
    JEEV("Soul"),
    PUDGAL("Matter"),
    KAAL("Time"),
    DHARMASTIKAAY("Medium of motion"),
    ADHARMASTIKAAY("Medium of rest"),
    AAKAASHSTIKAAY("Space substance");

    private final String englishMeaning;

    SubstanceKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
