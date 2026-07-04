package com.jain.core.ontology;

/**
 * Hindi: {@code Jeevastikaay} — aatma.
 * English: Soul or living substance. It is an Astikaay (extensive) but amurta (without physical properties like touch).
 */
public interface Jeevastikaay extends Astikaay {
    
    @Override
    default String name() {
        return "Jeevastikaay";
    }

}
