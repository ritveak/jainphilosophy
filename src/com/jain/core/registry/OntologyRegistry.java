package com.jain.core.registry;

/**
 * Hindi: {@code Tattv} kosh.
 * English: Builds a small default ontology graph (dravya → … → karma).
 */
public final class OntologyRegistry {
    public OntologyNode root() {
        OntologyNode dravya = new OntologyNode(Concept.DRAVYA);
        OntologyNode astikaay = new OntologyNode(Concept.ASTIKAAY);
        OntologyNode jeev = new OntologyNode(Concept.JEEV);
        OntologyNode ajiv = new OntologyNode(Concept.AJIV);
        OntologyNode pudgal = new OntologyNode(Concept.PUDGAL);
        OntologyNode paramanu = new OntologyNode(Concept.PARAMANU);
        OntologyNode vargan = new OntologyNode(Concept.VARGAN);
        OntologyNode karm = new OntologyNode(Concept.KARM);
        OntologyNode ghaati = new OntologyNode(Concept.GHAATI);
        OntologyNode aghaati = new OntologyNode(Concept.AGHAATI);

        dravya.addChild(astikaay);
        astikaay.addChild(jeev).addChild(ajiv);
        ajiv.addChild(pudgal);
        pudgal.addChild(paramanu).addChild(vargan).addChild(karm);
        karm.addChild(ghaati).addChild(aghaati);
        return dravya;
    }
}
