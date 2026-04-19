package com.jain.core.karma;

import java.util.Objects;

/**
 * Hindi: {@code Karm ghatna}.
 * English: Event that proposes new bondage or modification of karma (type, subtype, deltas).
 */
public record KarmaEvent(KarmaType type, KarmaSubType subType, int intensityDelta, int durationDelta) {
    public KarmaEvent {
        Objects.requireNonNull(type, "type must not be null");
        Objects.requireNonNull(subType, "subType must not be null");
        if (!KarmaTaxonomy.isCompatible(type, subType)) {
            throw new IllegalArgumentException("karma subtype " + subType + " does not belong to karma type " + type);
        }
    }
}
