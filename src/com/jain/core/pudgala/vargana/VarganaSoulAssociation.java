package com.jain.core.pudgala.vargana;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Jeev}–{@code vargan} sambandh.
 * English: Whether a vargana associates with the soul.
 */
public enum VarganaSoulAssociation implements Lexical {
    JEEV_YUKT("Associates with soul (subtle bodies, mind, speech, karma)"),
    JEEV_VIYUKT("Does not associate with soul (non-bodily clusters)");

    private final String englishMeaning;

    VarganaSoulAssociation(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
