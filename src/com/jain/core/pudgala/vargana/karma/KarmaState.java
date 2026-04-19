package com.jain.core.pudgala.vargana.karma;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Karm} kriyaavasthaa.
 * English: States in the karma lifecycle.
 */
public enum KarmaState implements Lexical {
    BANDH("Bondage (karma attaching to soul)"),
    SATTA("Existence (bound karma latent)"),
    UDAY("Rise / activation of karma effect"),
    UDIRAN("Premature rise"),
    APAVARTAN("Transformation of karma"),
    SANKRAMAN("Migration between subtypes"),
    NIRJAR("Shedding / expulsion of karma"),
    UPASHAM("Suppression of karma"),
    KSHAY("Annihilation of karma");

    private final String englishMeaning;

    KarmaState(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
