package com.jain.core.pudgala.vargana.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Ghaati} / {@code Aghaati} bhed.
 * English: Broad doctrinal split between destructive and non-destructive karmas.
 */
public enum KarmaClass implements Lexical {
    GHATI("Destructive karmas that obstruct core soul qualities"),
    AGHATI("Non-destructive karmas that shape embodied conditions");

    private final String englishMeaning;

    KarmaClass(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
