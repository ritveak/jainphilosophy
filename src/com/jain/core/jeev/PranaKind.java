package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: Dasa Prana.
 * English: The 10 specific vitalities (Prana) that manifest in embodied souls.
 */
public enum PranaKind implements Lexical {
    SPARSH_INDRIYA("Touch vitality", PranaCategory.INDRIYA),
    RAS_INDRIYA("Taste vitality", PranaCategory.INDRIYA),
    GHRAN_INDRIYA("Smell vitality", PranaCategory.INDRIYA),
    CHAKSHU_INDRIYA("Vision vitality", PranaCategory.INDRIYA),
    SHRAVAN_INDRIYA("Hearing vitality", PranaCategory.INDRIYA),
    
    MANO_BAL("Mind vitality", PranaCategory.BALA),
    VACHAN_BAL("Speech vitality", PranaCategory.BALA),
    KAYA_BAL("Body vitality", PranaCategory.BALA),
    
    SHVASOCHCHHVAS("Respiration vitality", PranaCategory.SHVASOCHCHHVAS),
    
    AYUSHYA("Life-span vitality", PranaCategory.AYUSHYA);

    private final String englishMeaning;
    private final PranaCategory category;

    PranaKind(String englishMeaning, PranaCategory category) {
        this.englishMeaning = englishMeaning;
        this.category = category;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public PranaCategory category() {
        return category;
    }
}
