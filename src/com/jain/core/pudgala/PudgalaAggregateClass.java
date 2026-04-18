package com.jain.core.pudgala;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Pudgal} varg — sparsh sankhyaa ke anusaar.
 * English: Pudgala classes by touch count and manifest quality sets (Kachhara 2016).
 */
public enum PudgalaAggregateClass implements Lexical {
    PARAMANU_DWISPARSH(
            "Ultimate particle (two-touch)",
            2,
            1,
            1,
            1,
            true,
            "Ultimate particle; dimensionless in Jain sense; weightless."),
    SUKSHM_CHATUSPARSH_SKANDH(
            "Subtle aggregate (four-touch)",
            4,
            5,
            2,
            5,
            true,
            "Subtle aggregates; paramanus cluster; weightless four-touch vargana tier."),
    BADAR_ASHTASPARSH_SKANDH(
            "Gross aggregate (eight-touch)",
            8,
            5,
            2,
            5,
            false,
            "Gross aggregates; bonding produces secondary touches; weight (light/heavy).");

    private final String englishMeaning;
    private final int touchCount;
    private final int coloursManifestSetSize;
    private final int smellsManifestSetSize;
    private final int tastesManifestSetSize;
    private final boolean weightlessTypical;
    private final String summary;

    PudgalaAggregateClass(
            String englishMeaning,
            int touchCount,
            int coloursManifestSetSize,
            int smellsManifestSetSize,
            int tastesManifestSetSize,
            boolean weightlessTypical,
            String summary) {
        this.englishMeaning = englishMeaning;
        this.touchCount = touchCount;
        this.coloursManifestSetSize = coloursManifestSetSize;
        this.smellsManifestSetSize = smellsManifestSetSize;
        this.tastesManifestSetSize = tastesManifestSetSize;
        this.weightlessTypical = weightlessTypical;
        this.summary = summary;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public int touchCount() {
        return touchCount;
    }

    public int coloursManifestSetSize() {
        return coloursManifestSetSize;
    }

    public int smellsManifestSetSize() {
        return smellsManifestSetSize;
    }

    public int tastesManifestSetSize() {
        return tastesManifestSetSize;
    }

    public boolean weightlessTypical() {
        return weightlessTypical;
    }

    public String summary() {
        return summary;
    }
}
