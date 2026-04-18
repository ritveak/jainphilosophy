package com.jain.core.api;

import com.jain.core.karma.DefaultKarmaLifecycleService;
import com.jain.core.karma.KarmaBundle;
import com.jain.core.karma.KarmaContext;
import com.jain.core.karma.KarmaEvent;
import com.jain.core.karma.KarmaLifecycleService;
import com.jain.core.reasoning.SyadStatement;
import com.jain.core.reasoning.SyadvadaReasoner;
import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.pudgala.PudgalaKnowledge;
import com.jain.core.pudgala.VarganaKind;
import com.jain.core.registry.OntologyNode;
import com.jain.core.registry.OntologyRegistry;
import java.util.List;

/**
 * Hindi: {@code Jain darshan} aavruttikaran.
 * English: Facade over karma lifecycle, syadvada, ontology, and pudgala reference data.
 */
public final class JainPhilosophyEngine {
    private final KarmaLifecycleService karmaLifecycleService;
    private final SyadvadaReasoner syadvadaReasoner;
    private final OntologyRegistry ontologyRegistry;

    public JainPhilosophyEngine() {
        this.karmaLifecycleService = new DefaultKarmaLifecycleService();
        this.syadvadaReasoner = new SyadvadaReasoner();
        this.ontologyRegistry = new OntologyRegistry();
    }

    public KarmaBundle processAction(KarmaBundle current, KarmaEvent event, KarmaContext context) {
        KarmaBundle bonded = karmaLifecycleService.bond(current, event);
        KarmaBundle active = karmaLifecycleService.activate(bonded, context);
        return karmaLifecycleService.shed(active, context);
    }

    public List<SyadStatement> evaluateSyadvada(String assertion) {
        return syadvadaReasoner.sevenfold(assertion);
    }

    public List<SyadStatement> evaluateSyadvada(Assertion assertion) {
        return syadvadaReasoner.sevenfold(assertion);
    }

    public OntologyNode ontologyRoot() {
        return ontologyRegistry.root();
    }

    /** Classifiers and reference data from canonical pudgala literature (see {@link PudgalaKnowledge}). */
    public String pudgalaSummary() {
        return PudgalaKnowledge.pudgalaDefinitionSummary();
    }

    public List<VarganaKind> associableVarganas() {
        return PudgalaKnowledge.associableVarganasWithSoul();
    }
}
