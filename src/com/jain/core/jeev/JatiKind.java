package com.jain.core.jeev;

import com.jain.core.jeev.state.Gati;
import com.jain.core.lexicon.Lexical;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Hindi: {@code Jati}.
 * English: Sensory classification and capability provider for vitalities.
 */
public enum JatiKind implements Lexical {
    EKENDRIYA("One-sensed", 1),
    DVINDRIYA("Two-sensed", 2),
    TRINDRIYA("Three-sensed", 3),
    CATURINDRIYA("Four-sensed", 4),
    PANCHENDRIYA("Five-sensed", 5);

    private final String englishMeaning;
    private final int senseCount;

    JatiKind(String englishMeaning, int senseCount) {
        this.englishMeaning = englishMeaning;
        this.senseCount = senseCount;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    /**
     * Determines mandatory Pranas based on Jati.
     * While Pranas are physical vitalities, they are fundamentally governed by the
     * Nama Karma (specifically Jati-Nama).
     */
    public Set<PranaKind> getPranas(boolean isRational) {
        Set<PranaKind> pranas = new HashSet<>(Set.of(
                PranaKind.KAYA_BAL,
                PranaKind.SHVASOCHCHHVAS,
                PranaKind.AYUSHYA,
                PranaKind.SPARSH_INDRIYA));

        if (senseCount >= 2) {
            pranas.add(PranaKind.RAS_INDRIYA);
            pranas.add(PranaKind.VACHAN_BAL);
        }
        if (senseCount >= 3)
            pranas.add(PranaKind.GHRAN_INDRIYA);
        if (senseCount >= 4)
            pranas.add(PranaKind.CHAKSHU_INDRIYA);
        if (senseCount >= 5) {
            pranas.add(PranaKind.SHRAVAN_INDRIYA);
            if (isRational) {
                pranas.add(PranaKind.MANO_BAL);
            }
        }

        return Collections.unmodifiableSet(pranas);
    }

    /**
     * Determines whether the Jati can manifest in Gross (Badar) or Subtle (Sukshma)
     * forms.
     * Only Ekendriya (1-sensed) beings can be Sukshma. All others are strictly
     * Badar.
     */
    public Set<BodySize> getSupportedBodySizes() {
        if (this == EKENDRIYA) {
            return Set.of(BodySize.BADAR, BodySize.SUKSHMA);
        }
        return Set.of(BodySize.BADAR);
    }

    /**
     * Primary Classification: Returns the realms (Gatis) where this Jati can be
     * born.
     * Ekendriya to Caturindriya are strictly Tiryanch (Animal/Plant realm).
     * Panchendriya can be found in all four realms.
     */
    public Set<Gati> getSupportedGatis() {
        if (this == PANCHENDRIYA) {
            return Set.of(
                    Gati.NARAK,
                    Gati.TIRYANCH,
                    Gati.MANUSHYA,
                    Gati.DEV);
        }
        return Set.of(Gati.TIRYANCH);
    }

    /**
     * Cognitive Classification: Returns whether beings of this Jati possess a Mind.
     * Panchendriya can be both Saini (rational) and Asaini (irrational).
     * 1 to 4-sensed beings are strictly Asaini.
     */
    public Set<CognitionLevel> getSupportedCognitionLevels() {
        if (this == PANCHENDRIYA) {
            return Set.of(CognitionLevel.SAINI, CognitionLevel.ASAINI);
        }
        return Set.of(CognitionLevel.ASAINI);
    }
}
