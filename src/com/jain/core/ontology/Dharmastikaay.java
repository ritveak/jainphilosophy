package com.jain.core.ontology;

/**
 * Hindi: {@code Dharmastikaay} — gati sahayak dravya.
 * English: Medium of motion. It is an Astikaay (extensive) but amurta (without physical properties like touch).
 */
public interface Dharmastikaay extends Astikaay {
    
    @Override
    default String name() {
        return "Dharmastikaay";
    }

}
