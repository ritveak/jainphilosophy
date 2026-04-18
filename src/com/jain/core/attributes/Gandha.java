package com.jain.core.attributes;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Gandh} — sugandh aur dur-gandh.
 * English: Two odours of pudgala; magnitude can vary.
 */
public enum Gandha implements Lexical {
    SURABHI("Pleasant smell"),
    DURAABHI("Unpleasant smell");

    private final String englishMeaning;

    Gandha(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
