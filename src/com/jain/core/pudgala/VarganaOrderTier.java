package com.jain.core.pudgala;

import com.jain.core.lexicon.Lexical;
import java.util.Optional;

/**
 * Hindi: {@code Vargan kram}.
 * English: Vargana order tiers 2–23 (Kachhara 2016).
 */
public enum VarganaOrderTier implements Lexical {
    KRAM_DO_CHAUDAH(
            "Orders 2–14: four-touch, weightless",
            2,
            14,
            PudgalaAggregateClass.SUKSHM_CHATUSPARSH_SKANDH,
            "Four-touch; paramanus cluster without bonding."),
    KRAM_PANDRAH(
            "Order 15: intermediate / uncertain",
            15,
            15,
            null,
            "Between four-touch and eight-touch categories; nature uncertain in the paper’s summary."),
    KRAM_SOLAH_TEIS(
            "Orders 16–23: eight-touch, with weight",
            16,
            23,
            PudgalaAggregateClass.BADAR_ASHTASPARSH_SKANDH,
            "Eight-touch; bonded paramanus; weight arises.");

    private final String englishMeaning;
    private final int minOrder;
    private final int maxOrder;
    private final PudgalaAggregateClass typicalAggregateClass;
    private final String note;

    VarganaOrderTier(
            String englishMeaning,
            int minOrder,
            int maxOrder,
            PudgalaAggregateClass typicalAggregateClass,
            String note) {
        this.englishMeaning = englishMeaning;
        this.minOrder = minOrder;
        this.maxOrder = maxOrder;
        this.typicalAggregateClass = typicalAggregateClass;
        this.note = note;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public static Optional<VarganaOrderTier> forOrder(int order) {
        if (order >= 2 && order <= 14) {
            return Optional.of(KRAM_DO_CHAUDAH);
        }
        if (order == 15) {
            return Optional.of(KRAM_PANDRAH);
        }
        if (order >= 16 && order <= 23) {
            return Optional.of(KRAM_SOLAH_TEIS);
        }
        return Optional.empty();
    }

    public int minOrder() {
        return minOrder;
    }

    public int maxOrder() {
        return maxOrder;
    }

    public PudgalaAggregateClass typicalAggregateClass() {
        return typicalAggregateClass;
    }

    public String note() {
        return note;
    }
}
