package com.jain.core.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class OntologyNode {
    private final Concept concept;
    private final List<OntologyNode> children = new ArrayList<>();

    public OntologyNode(Concept concept) {
        this.concept = concept;
    }

    public Concept concept() {
        return concept;
    }

    public List<OntologyNode> children() {
        return Collections.unmodifiableList(children);
    }

    public OntologyNode addChild(OntologyNode child) {
        children.add(child);
        return this;
    }
}
