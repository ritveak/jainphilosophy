package com.jain.core.ontology;

import java.util.Collections;
import java.util.Set;
import com.jain.core.attributes.Sparsha;

/**
 * Hindi: {@code Astikaay} — pradeshaatmak dravya.
 * English: Extensive substance (all dravyas except time/kaal).
 */
public interface Astikaay extends Dravya {
    /**
     * Touch properties of the substance.
     * By default, non-material substances (amurta dravya) have no touch.
     */
    default Set<Sparsha> touchProperties() {
        return Collections.emptySet();
    }
}
