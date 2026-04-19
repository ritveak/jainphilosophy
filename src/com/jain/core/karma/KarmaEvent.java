package com.jain.core.karma;

import java.util.Optional;
import java.util.Objects;

/**
 * Hindi: {@code Karm ghatna}.
 * English: Event that proposes new bondage or modification of karma.
 *
 * <p>{@code subType} is the canonical lowest-level classification when present. {@code fallbackType} is used only
 * for broader events where no subtype is specified yet.
 */
public record KarmaEvent(KarmaSubType subType, KarmaType fallbackType, int intensityDelta, int durationDelta) {
    public KarmaEvent {
        if (subType == null && fallbackType == null) {
            throw new IllegalArgumentException("either subType or fallbackType must be provided");
        }
        if (subType != null && fallbackType != null && !KarmaTaxonomy.isCompatible(fallbackType, subType)) {
            throw new IllegalArgumentException(
                    "karma subtype " + subType + " does not belong to fallback karma type " + fallbackType);
        }
    }

    public KarmaEvent(KarmaSubType subType, int intensityDelta, int durationDelta) {
        this(Objects.requireNonNull(subType, "subType must not be null"), null, intensityDelta, durationDelta);
    }

    public KarmaEvent(KarmaType fallbackType, int intensityDelta, int durationDelta) {
        this(null, Objects.requireNonNull(fallbackType, "fallbackType must not be null"), intensityDelta, durationDelta);
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
}
