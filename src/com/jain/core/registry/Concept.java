package com.jain.core.registry;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Tattv} vriksh ke node.
 * English: High-level concepts in the ontology graph.
 */
public enum Concept implements Lexical {
    DRAVYA("Substance (fundamental reality with qualities and modes)"),
    ASTIKAAY("Extensive substance (occupies many space-points)"),
    JEEV("Soul / living sentient substance"),
    AJIV("Non-living substance"),
    PUDGAL("Matter (corporeal, sense-perceptible substance)"),
    PARAMANU("Ultimate particle of matter"),
    VARGAN("Functional cluster of similar paramanus (matter field)"),
    KARM("Karmic matter cluster"),
    GHAATI("Destructive karmas (obstruct soul qualities)"),
    AGHAATI("Non-destructive karmas (embodied conditions)");

    private final String englishMeaning;

    Concept(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
