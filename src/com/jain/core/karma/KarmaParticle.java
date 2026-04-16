package com.jain.core.karma;

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
