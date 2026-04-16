package com.jain.core.api;

import com.jain.core.karma.DefaultKarmaLifecycleService;
import com.jain.core.karma.KarmaBundle;
import com.jain.core.karma.KarmaContext;
import com.jain.core.karma.KarmaEvent;
import com.jain.core.karma.KarmaLifecycleService;
import com.jain.core.reasoning.SyadStatement;
import com.jain.core.reasoning.SyadvadaReasoner;
import com.jain.core.registry.OntologyNode;
import com.jain.core.registry.OntologyRegistry;
import java.util.List;

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

    public OntologyNode ontologyRoot() {
        return ontologyRegistry.root();
    }
}
