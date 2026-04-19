package com.jain.core.karma;

import java.util.Objects;

/**
 * Hindi: {@code Karm anu}.
 * English: One karma particle with type, subtype, intensity, duration, and lifecycle state.
 */
public record KarmaParticle(
        KarmaType type,
        KarmaSubType subType,
        int intensity,
        int duration,
        KarmaState state) {

    public KarmaParticle {
        Objects.requireNonNull(type, "type must not be null");
        Objects.requireNonNull(subType, "subType must not be null");
        Objects.requireNonNull(state, "state must not be null");
        if (!KarmaTaxonomy.isCompatible(type, subType)) {
            throw new IllegalArgumentException("karma subtype " + subType + " does not belong to karma type " + type);
        }
    }

    public KarmaParticle transitionTo(KarmaState nextState) {
        return new KarmaParticle(type, subType, intensity, duration, nextState);
    }
}
