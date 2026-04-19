package com.jain.core.context;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Jain sampradaay}.
 * English: Major Jain textual communities (e.g. paramanu bonding variants, textual logic).
 */
public enum JainContext implements Lexical {
    SHVETAMBAR_TERAPANTH("Śvetāmbara Terāpanth tradition"),
    SHVETAMBAR_STHANAKVASI("Śvetāmbara Sthānakavāsī tradition"),
    SHVETAMBAR_MURTIPUJAK("Śvetāmbara Mūrtipūjaka tradition"),
    DIGAMBAR("Digambara tradition");

    private final String englishMeaning;

    JainContext(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public boolean isShvetambar() {
        return this == SHVETAMBAR_TERAPANTH || this == SHVETAMBAR_STHANAKVASI || this == SHVETAMBAR_MURTIPUJAK;
    }

    public boolean isDigambar() {
        return this == DIGAMBAR;
    }

    public static JainContext defaultContext() {
        return SHVETAMBAR_TERAPANTH;
    }
}
