package com.jain.core.karma;

public record KarmaEvent(KarmaType type, KarmaSubType subType, int intensityDelta, int durationDelta) {}
