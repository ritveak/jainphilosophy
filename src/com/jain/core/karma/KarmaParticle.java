package com.jain.core.karma;

import java.util.Optional;
import java.util.Objects;

/**
 * Hindi: {@code Karm anu}.
 * English: One karma particle with subtype-first classification, intensity, duration, and lifecycle state.
 */
public record KarmaParticle(
        KarmaSubType subType,
        KarmaType fallbackType,
        int intensity,
        int duration,
        KarmaState state) {

    public KarmaParticle {
        Objects.requireNonNull(state, "state must not be null");
        if (subType == null && fallbackType == null) {
            throw new IllegalArgumentException("either subType or fallbackType must be provided");
        }
        if (subType != null && fallbackType != null && !KarmaTaxonomy.isCompatible(fallbackType, subType)) {
            throw new IllegalArgumentException(
                    "karma subtype " + subType + " does not belong to fallback karma type " + fallbackType);
        }
    }

    public KarmaParticle(KarmaSubType subType, int intensity, int duration, KarmaState state) {
        this(Objects.requireNonNull(subType, "subType must not be null"), null, intensity, duration, state);
    }

    public KarmaParticle(KarmaType fallbackType, int intensity, int duration, KarmaState state) {
        this(null, Objects.requireNonNull(fallbackType, "fallbackType must not be null"), intensity, duration, state);
    }

    public KarmaType type() {
        return subType != null ? subType.type() : fallbackType;
    }

    public KarmaClass karmaClass() {
        return type().karmaClass();
    }

    public boolean hasSpecificSubtype() {
        return subType != null;
    }

    public Optional<KarmaSubTypeGroup> subTypeGroup() {
        return subType == null ? Optional.empty() : Optional.of(subType.group());
    }

    public KarmaParticle transitionTo(KarmaState nextState) {
        return new KarmaParticle(subType, fallbackType, intensity, duration, nextState);
    }
}
