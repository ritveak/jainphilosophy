package com.jain.core.pudgala.ahar;

import com.jain.core.lexicon.Lexical;

/**
 * English: Practical intake form used to organize the four kaval ahar subdivisions.
 */
public enum KavalAharForm implements Lexical {
    SOLID_MEAL("Solid meal — substantive chewable food"),
    LIQUID_NOURISHMENT("Liquid nourishment — drinkable food and beverages"),
    CHEWABLE_SNACK("Chewable snack — fruits, bites, and munchable items"),
    TASTE_ENHANCER("Taste enhancer — lickable, chewable, or mouth-freshening adjuncts");

    private final String englishMeaning;

    KavalAharForm(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
