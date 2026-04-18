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

    public KarmaParticle transitionTo(KarmaState nextState) {
        return new KarmaParticle(type, subType, intensity, duration, nextState);
    }
}
