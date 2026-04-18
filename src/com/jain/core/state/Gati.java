package com.jain.core.state;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Gati} — char janm-sthaan.
 * English: Realm of rebirth (four gatis).
 */
public enum Gati implements Lexical {
    DEV("Celestial realm"),
    MANUSHYA("Human realm"),
    TIRYANCH("Animal / plant realm"),
    NARAK("Infernal realm");

    private final String englishMeaning;

    Gati(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
