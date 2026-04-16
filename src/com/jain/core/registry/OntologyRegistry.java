package com.jain.core.registry;

public final class OntologyRegistry {
    public OntologyNode root() {
        OntologyNode dravya = new OntologyNode(Concept.DRAVYA);
        OntologyNode astikaya = new OntologyNode(Concept.ASTIKAYA);
        OntologyNode jiva = new OntologyNode(Concept.JIVA);
        OntologyNode ajiva = new OntologyNode(Concept.AJIVA);
        OntologyNode pudgala = new OntologyNode(Concept.PUDGALA);
        OntologyNode karman = new OntologyNode(Concept.KARMAN);
        OntologyNode ghati = new OntologyNode(Concept.GHATI);
        OntologyNode aghati = new OntologyNode(Concept.AGHATI);

        dravya.addChild(astikaya);
        astikaya.addChild(jiva).addChild(ajiva);
        ajiva.addChild(pudgala);
        pudgala.addChild(karman);
        karman.addChild(ghati).addChild(aghati);
        return dravya;
    }
}
