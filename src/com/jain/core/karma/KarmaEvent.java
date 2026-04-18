package com.jain.core.karma;

/**
 * Hindi: {@code Karm ghatna}.
 * English: Event that proposes new bondage or modification of karma (type, subtype, deltas).
 */
public record KarmaEvent(KarmaType type, KarmaSubType subType, int intensityDelta, int durationDelta) {
    public KarmaEvent {
        if (subType.parentType() != type) {
            throw new IllegalArgumentException(
                    "Karma type "
                            + type
                            + " does not match subtype "
                            + subType
                            + " (expected "
                            + subType.parentType()
                            + ")");
        }
    }
}
