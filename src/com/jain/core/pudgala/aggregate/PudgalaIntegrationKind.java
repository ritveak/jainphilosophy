package com.jain.core.pudgala.aggregate;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Bandh} — pudgal sangh ke prakaar.
 * English: Integration modes of matter (Kachhara §2).
 */
public enum PudgalaIntegrationKind implements Lexical {
    VAISRASIK_SAADI_SHURUAT("Natural integration with a definite beginning (e.g. clouds, rainbow)"),
    VAISRASIK_ANAADI("Natural integration without definite beginning"),
    PRAYOGIK_DRAVY_MISHRAN("Organism-made material combination (e.g. chemical composites)"),
    JEEV_KARM_BANDH("Soul–matter bondage of karmic vargana"),
    JEEV_SHARIR_SANYOG("Soul–matter combination for body and vital functions (non-karma bond)");

    private final String englishMeaning;

    PudgalaIntegrationKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
