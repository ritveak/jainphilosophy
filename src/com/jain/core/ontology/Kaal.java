package com.jain.core.ontology;

/**
 * Hindi: {@code Kaal dravya} — samay.
 * English: Time substance. It is the only Anastikaay (non-extensive) substance.
 */
public interface Kaal extends Anastikaay {
    
    @Override
    default String name() {
        return "Kaal";
    }

}
