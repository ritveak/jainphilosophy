package com.jain.core.ontology;

import com.jain.core.attributes.Sparsha;
import com.jain.core.pudgala.vargana.VarganaKind;

import java.util.Set;

/**
 * Hindi: {@code Pudgalastikaay} — murta dravya.
 * English: Matter substance, capable of integration and disintegration.
 * Represents an individual entity (like a paramanu) that can belong to a cluster (vargana).
 */
public interface Pudgalastikaay extends Astikaay {
    
    /**
     * Determines whether this pudgal is a subtle (sukshm) particle.
     */
    boolean isSukshm();

    /**
     * Retrieves the cluster (vargana) this particle belongs to.
     */
    VarganaKind getVargana();

    @Override
    default Set<Sparsha> touchProperties() {
        if (isSukshm()) {
            return Set.of(Sparsha.SHEET, Sparsha.USHNA, Sparsha.SNIGDH, Sparsha.RUKSH);
        } else {
            return Set.of(
                Sparsha.SHEET, Sparsha.USHNA, Sparsha.SNIGDH, Sparsha.RUKSH,
                Sparsha.LAGHU, Sparsha.GURU, Sparsha.MRIDU, Sparsha.KATHOR
            );
        }
    }

    @Override
    default String name() {
        return "Pudgalastikaay";
    }
}
