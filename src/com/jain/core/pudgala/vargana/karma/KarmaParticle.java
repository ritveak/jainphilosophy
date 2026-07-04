package com.jain.core.pudgala.vargana.karma;

import java.util.Optional;
import java.util.Objects;
import java.util.Set;

import com.jain.core.attributes.Sparsha;
import com.jain.core.pudgala.aggregate.PudgalaAggregateClass;
import com.jain.core.pudgala.Pudgalastikaay;
import com.jain.core.pudgala.vargana.Vargana;

/**
 * Hindi: {@code Karm anu}.
 * English: One karma particle with subtype-first classification, intensity, duration, and lifecycle state.
 */
public final class KarmaParticle implements Pudgalastikaay {
    private final KarmaSubType subType;
    private final KarmaType fallbackType;
    private final int intensity;
    private final int duration;
    private final KarmaState state;
    private final KarmVargana vargana;

    public KarmaParticle(
            KarmaSubType subType,
            KarmaType fallbackType,
            int intensity,
            int duration,
            KarmaState state,
            KarmVargana vargana) {
        Objects.requireNonNull(state, "state must not be null");
        if (subType == null && fallbackType == null) {
            throw new IllegalArgumentException("either subType or fallbackType must be provided");
        }
        if (subType != null && fallbackType != null && !KarmaTaxonomy.isCompatible(fallbackType, subType)) {
            throw new IllegalArgumentException(
                    "karma subtype " + subType + " does not belong to fallback karma type " + fallbackType);
        }
        this.subType = subType;
        this.fallbackType = fallbackType;
        this.intensity = intensity;
        this.duration = duration;
        this.state = state;
        this.vargana = vargana;
    }

    public KarmaParticle(
            KarmaSubType subType,
            KarmaType fallbackType,
            int intensity,
            int duration,
            KarmaState state) {
        this(subType, fallbackType, intensity, duration, state, null);
    }

    public KarmaParticle(KarmaSubType subType, int intensity, int duration, KarmaState state) {
        this(Objects.requireNonNull(subType, "subType must not be null"), null, intensity, duration, state, null);
    }

    public KarmaParticle(KarmaType fallbackType, int intensity, int duration, KarmaState state) {
        this(null, Objects.requireNonNull(fallbackType, "fallbackType must not be null"), intensity, duration, state, null);
    }

    public KarmaSubType subType() {
        return subType;
    }

    public KarmaType fallbackType() {
        return fallbackType;
    }

    public int intensity() {
        return intensity;
    }

    public int duration() {
        return duration;
    }

    public KarmaState state() {
        return state;
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

    public PudgalaAggregateClass aggregateClass() {
        return PudgalaAggregateClass.SUKSHM_CHATUSPARSH_SKANDH;
    }

    public KarmaParticle transitionTo(KarmaState nextState) {
        return new KarmaParticle(subType, fallbackType, intensity, duration, nextState, vargana);
    }
    
    @Override
    public boolean isSukshm() {
        return true;
    }

    @Override
    public Optional<Vargana> getVargana() {
        return Optional.ofNullable(vargana);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (KarmaParticle) obj;
        return Objects.equals(this.subType, that.subType) &&
               Objects.equals(this.fallbackType, that.fallbackType) &&
               this.intensity == that.intensity &&
               this.duration == that.duration &&
               Objects.equals(this.state, that.state) &&
               Objects.equals(this.vargana, that.vargana);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subType, fallbackType, intensity, duration, state, vargana);
    }

    @Override
    public String toString() {
        return "KarmaParticle[" +
                "subType=" + subType + ", " +
                "fallbackType=" + fallbackType + ", " +
                "intensity=" + intensity + ", " +
                "duration=" + duration + ", " +
                "state=" + state + ']';
    }
    
    @Override
    public String id() {
        return "KarmaParticle-" + hashCode();
    }
}
