package com.jain.core.karma;

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

    public KarmaParticle transitionTo(KarmaState nextState) {
        return new KarmaParticle(type, subType, intensity, duration, nextState);
    }
}
