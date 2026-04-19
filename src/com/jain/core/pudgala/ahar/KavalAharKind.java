package com.jain.core.pudgala.ahar;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Kaval ahar} ka chaturbhed.
 * English: Canonical fourfold breakdown of kaval ahar (morsel intake).
 */
public enum KavalAharKind implements Lexical {

    ASANAM(
            "Asanam",
            "Solid food morsels",
            "Ashana: solid, hunger-satisfying morsels such as grains, rice, or bread.",
            KavalAharForm.SOLID_MEAL),
    PAANAM(
            "Paanam",
            "Liquid food",
            "Pana: drinkable nourishment such as water, milk, or other liquids.",
            KavalAharForm.LIQUID_NOURISHMENT),
    KHAIMAM(
            "Khaimam",
            "Snacks and chewables",
            "Khadima: fruits, chewable snacks, or small bite-sized foods.",
            KavalAharForm.CHEWABLE_SNACK),
    SAIMAM(
            "Saimam",
            "Taste enhancers",
            "Swadima: lickable, chewable, or mouth-freshening adjuncts such as spices or fennel.",
            KavalAharForm.TASTE_ENHANCER);

    private final String transliteratedName;
    private final String englishMeaning;
    private final String description;
    private final KavalAharForm form;

    KavalAharKind(String transliteratedName, String englishMeaning, String description, KavalAharForm form) {
        this.transliteratedName = transliteratedName;
        this.englishMeaning = englishMeaning;
        this.description = description;
        this.form = form;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public String transliteratedName() {
        return transliteratedName;
    }

    /**
     * Backward-compatible alias retained because the interrupted implementation already introduced this accessor.
     */
    public String simpleName() {
        return transliteratedName();
    }

    public String description() {
        return description;
    }

    public KavalAharForm form() {
        return form;
    }

    public AharKind parentKind() {
        return AharKind.KAVAL_AHAR;
    }
}
