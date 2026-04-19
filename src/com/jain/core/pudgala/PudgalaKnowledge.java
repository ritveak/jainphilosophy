package com.jain.core.pudgala;

import com.jain.core.pudgala.aggregate.PudgalaAggregateClass;
import com.jain.core.pudgala.paramanu.ParamanuBondingRule;
import com.jain.core.pudgala.paramanu.ParamanuBondingTable;
import com.jain.core.pudgala.vargana.VarganaKind;
import java.util.List;

/**
 * Hindi: {@code Pudgal} gyaan-sangrah.
 * English: Curated facts and classifiers from Kachhara, “Matter (Pudgalastikaya or Pudgala) in Jain Philosophy,”
 * Philosophy Study 6.4 (2016), DOI 10.17265/2159-5313/2016.04.005 — for simulation and knowledge-graph use.
 */
public final class PudgalaKnowledge {

    private PudgalaKnowledge() {}

    public static String pudgalaDefinitionSummary() {
        return "Ajiva dravya; murta; the only extensive sense-perceptible substance; permanent yet origination-decay-permanence modes; integrates and disintegrates.";
    }

    public static List<PudgalaAggregateClass> aggregateClassesByTouch() {
        return List.of(
                PudgalaAggregateClass.PARAMANU_DWISPARSH,
                PudgalaAggregateClass.SUKSHM_CHATUSPARSH_SKANDH,
                PudgalaAggregateClass.BADAR_ASHTASPARSH_SKANDH);
    }

    /**
     * Five vargana types the paper lists as associable with the soul (Ahara, Tejas, Bhasha, Mano, Karman). Bhagwati
     * also speaks of eight soul-salient kinds in a broader reckoning; those extra classes are modelled under {@link
     * #additionalMajorVarganaGroupings()}.
     */
    public static List<VarganaKind> associableVarganasWithSoul() {
        return List.of(
                VarganaKind.AHAR,
                VarganaKind.TEJ,
                VarganaKind.BHAASHAA,
                VarganaKind.MAN,
                VarganaKind.KARM_VARGAN);
    }

    public static List<VarganaKind> additionalMajorVarganaGroupings() {
        return List.of(
                VarganaKind.STHAVAR_SAHAYI,
                VarganaKind.SHAASHVAT_SHOONY,
                VarganaKind.MAHAA_SKANDH);
    }

    public static List<ParamanuBondingRule> paramanuBondingRules() {
        return ParamanuBondingTable.rules();
    }
}
