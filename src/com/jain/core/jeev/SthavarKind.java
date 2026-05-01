package com.jain.core.jeev;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Sthavar}.
 * English: Five immobile bodies (Ekendriya subtypes).
 */
public enum SthavarKind implements Lexical {
    PRITHVI_KAY("Earth-bodied"),
    AP_KAY("Water-bodied"),
    TEJAS_KAY("Fire-bodied"),
    VAYU_KAY("Air-bodied"),
    VANASPATI_KAY("Plant-bodied");

    private final String englishMeaning;

    SthavarKind(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    /**
     * All five immobile bodies (Sthavar) can manifest in both Gross (Badar) and Subtle (Sukshma) forms.
     */
    public java.util.Set<BodySize> getSupportedBodySizes() {
        return java.util.Set.of(BodySize.BADAR, BodySize.SUKSHMA);
    }

    /**
     * Determines whether the Sthavar kind can have individual (Pratyeka) or shared (Sadharana) embodiment.
     * Only Plant bodies (Vanaspati) can be shared (Sadharana/Nigod).
     */
    public java.util.Set<VanaspatiEmbodiment> getSupportedEmbodiments() {
        if (this == VANASPATI_KAY) {
            return java.util.Set.of(VanaspatiEmbodiment.PRATYEKA, VanaspatiEmbodiment.SADHARANA);
        }
        return java.util.Set.of(VanaspatiEmbodiment.PRATYEKA);
    }
}
