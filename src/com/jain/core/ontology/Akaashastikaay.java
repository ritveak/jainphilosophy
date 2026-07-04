package com.jain.core.ontology;

/**
 * Hindi: {@code Aakaashastikaay} — sthaan pradaayak dravya.
 * English: Space substance. It provides accommodation to all other substances.
 * It is an Astikaay (extensive) but amurta (without physical properties like touch).
 */
public interface Akaashastikaay extends Astikaay {
    
    @Override
    default String name() {
        return "Akaashastikaay";
    }

}
