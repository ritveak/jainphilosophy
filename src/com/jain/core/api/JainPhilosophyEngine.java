package com.jain.core.api;

import com.jain.core.pudgala.vargana.karma.DefaultKarmaLifecycleService;
import com.jain.core.pudgala.vargana.karma.KarmaBundle;
import com.jain.core.pudgala.vargana.karma.KarmaClass;
import com.jain.core.pudgala.vargana.karma.KarmaContext;
import com.jain.core.pudgala.vargana.karma.KarmaEvent;
import com.jain.core.pudgala.vargana.karma.KarmaLifecycleService;
import com.jain.core.pudgala.vargana.karma.KarmaSubType;
import com.jain.core.pudgala.vargana.karma.KarmaSubTypeGroup;
import com.jain.core.pudgala.vargana.karma.KarmaTaxonomy;
import com.jain.core.pudgala.vargana.karma.KarmaType;
import com.jain.core.reasoning.SyadStatement;
import com.jain.core.reasoning.SyadvadaReasoner;
import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.pudgala.ahar.AharIntakeChannel;
import com.jain.core.pudgala.ahar.AharKind;
import com.jain.core.pudgala.ahar.AharMateriality;
import com.jain.core.pudgala.ahar.AharTaxonomy;
import com.jain.core.pudgala.ahar.KavalAharForm;
import com.jain.core.pudgala.ahar.KavalAharKind;
import com.jain.core.pudgala.PudgalaKnowledge;
import com.jain.core.pudgala.vargana.VarganaKind;
import com.jain.core.registry.Concept;
import com.jain.core.registry.OntologyNode;
import com.jain.core.registry.OntologyRegistry;
import com.jain.core.context.JainContext;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public List<SyadStatement> evaluateSyadvada(JainContext context, String assertion) {
        if (context == null) context = JainContext.defaultContext();
        return syadvadaReasoner.sevenfold(assertion);
    }

    public List<SyadStatement> evaluateSyadvada(JainContext context, Assertion assertion) {
        if (context == null) context = JainContext.defaultContext();
        return syadvadaReasoner.sevenfold(assertion);
    }

    public List<KarmaType> karmaTypesInClass(JainContext context, KarmaClass karmaClass) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.typesInClass(karmaClass);
    }

    public List<KarmaSubTypeGroup> karmaGroups(JainContext context, KarmaType type) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.groupsOf(type);
    }

    public List<KarmaSubType> karmaSubtypes(JainContext context, KarmaType type) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.subtypesOf(type);
    }

    public List<KarmaSubType> karmaSubtypes(JainContext context, KarmaSubTypeGroup group) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.subtypesOf(group);
    }

    public Map<KarmaSubTypeGroup, List<KarmaSubType>> groupedKarmaSubtypes(JainContext context, KarmaType type) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.groupedSubtypesOf(type);
    }

    public boolean isCompatibleKarmaSubtype(JainContext context, KarmaType type, KarmaSubType subType) {
        if (context == null) context = JainContext.defaultContext();
        return KarmaTaxonomy.isCompatible(type, subType);
    }

    public OntologyNode ontologyRoot() {
        return ontologyRegistry.root();
    }

    /** Classifiers and reference data from canonical pudgala literature (see {@link PudgalaKnowledge}). */
    public String pudgalaSummary() {
        return PudgalaKnowledge.pudgalaDefinitionSummary();
    }

    public String aharSummary() {
        return PudgalaKnowledge.aharClassificationSummary();
    }

    public List<VarganaKind> associableVarganas() {
        return PudgalaKnowledge.associableVarganasWithSoul();
    }

    public List<AharKind> aharKinds() {
        return PudgalaKnowledge.aharKinds();
    }

    public List<AharKind> siblingAharKindsOf(AharKind kind) {
        return AharTaxonomy.siblingAharKindsOf(kind);
    }

    public List<AharKind> aharKindsByMateriality(AharMateriality materiality) {
        return AharTaxonomy.aharKindsByMateriality(materiality);
    }

    public List<AharKind> aharKindsByChannel(AharIntakeChannel channel) {
        return AharTaxonomy.aharKindsByChannel(channel);
    }

    public Optional<AharKind> aharKind(String name) {
        return AharTaxonomy.findAharKindByName(name);
    }

    public Optional<AharKind> aharKind(Concept concept) {
        return AharTaxonomy.aharKindOf(concept);
    }

    public List<KavalAharKind> kavalAharKinds() {
        return PudgalaKnowledge.kavalAharKinds();
    }

    public List<KavalAharKind> kavalAharKinds(AharKind kind) {
        return AharTaxonomy.subdivisionsOf(kind);
    }

    public List<KavalAharKind> siblingKavalAharKindsOf(KavalAharKind kind) {
        return AharTaxonomy.siblingKavalAharKindsOf(kind);
    }

    public List<KavalAharKind> kavalAharKindsByForm(KavalAharForm form) {
        return AharTaxonomy.kavalAharKindsByForm(form);
    }

    public Optional<KavalAharKind> kavalAharKind(String name) {
        return AharTaxonomy.findKavalAharKindByName(name);
    }

    public Optional<KavalAharKind> kavalAharKind(Concept concept) {
        return AharTaxonomy.kavalAharKindOf(concept);
    }
}
