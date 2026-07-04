package com.jain.core.pudgala.vargana.karma;

import java.util.Optional;
import java.util.Objects;

import com.jain.core.pudgala.aggregate.PudgalaAggregateClass;
import com.jain.core.ontology.Pudgalastikaay;
import com.jain.core.pudgala.vargana.VarganaKind;

/**
 * Hindi: {@code Karm anu}.
 * English: One karma particle with subtype-first classification, intensity, duration, and lifecycle state.
 */
public final class KarmaParticle implements Pudgalastikaay {
    private final KarmaSubType subType;
    private final KarmaType karmaType;
    private final int intensity;
    private final int duration;
    private final KarmaState state;

    public KarmaParticle(
            KarmaSubType subType,
            KarmaType karmaType,
            int intensity,
            int duration,
            KarmaState state) {
        Objects.requireNonNull(state, "state must not be null");
        if (subType == null && karmaType == null) {
            throw new IllegalArgumentException("either subType or Karma type must be provided");
        }
        if (subType != null && karmaType != null && !KarmaTaxonomy.isCompatible(karmaType, subType)) {
            throw new IllegalArgumentException(
                    "karma subtype " + subType + " does not belong to fallback karma type " + karmaType);
        }
        this.subType = subType;
        this.karmaType = karmaType;
        this.intensity = intensity;
        this.duration = duration;
        this.state = state;
    }

    public KarmaParticle(KarmaSubType subType, int intensity, int duration, KarmaState state) {
        this(Objects.requireNonNull(subType, "subType must not be null"), null, intensity, duration, state);
    }

    public KarmaParticle(KarmaType karmaType, int intensity, int duration, KarmaState state) {
        this(null, Objects.requireNonNull(karmaType, "Karma type must not be null"), intensity, duration, state);
    }

    public KarmaSubType subType() {
        return subType;
    }

    public KarmaType karmaType() {
        return karmaType;
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
        return subType != null ? subType.type() : karmaType;
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
        return new KarmaParticle(subType, karmaType, intensity, duration, nextState);
    }
    
    @Override
    public boolean isSukshm() {
        return true;
    }

    @Override
    public VarganaKind getVargana() {
        return  VarganaKind.KARM_VARGAN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (KarmaParticle) obj;
        return Objects.equals(this.subType, that.subType) &&
               Objects.equals(this.karmaType, that.karmaType) &&
               this.intensity == that.intensity &&
               this.duration == that.duration &&
               Objects.equals(this.state, that.state);}

    @Override
    public int hashCode() {
        return Objects.hash(subType, karmaType, intensity, duration, state);
    }

    @Override
    public String toString() {
        return "KarmaParticle[" +
                "subType=" + subType + ", " +
                "Karma type=" + karmaType + ", " +
                "intensity=" + intensity + ", " +
                "duration=" + duration + ", " +
                "state=" + state + ']';
    }
    
    @Override
    public String id() {
        return "KarmaParticle-" + hashCode();
    }
}
