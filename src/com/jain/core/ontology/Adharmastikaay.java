package com.jain.core.ontology;

/**
 * Hindi: {@code Adharmastikaay} — sthiti sahayak dravya.
 * English: Medium of rest. It is an Astikaay (extensive) but amurta (without physical properties like touch).
 */
public interface Adharmastikaay extends Astikaay {
    
    @Override
    default String name() {
        return "Adharmastikaay";
    }

}
