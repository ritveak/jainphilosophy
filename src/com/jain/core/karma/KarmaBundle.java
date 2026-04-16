package com.jain.core.karma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class KarmaBundle {
    private final List<KarmaParticle> particles;

    public KarmaBundle(List<KarmaParticle> particles) {
        this.particles = new ArrayList<>(particles);
    }

    public static KarmaBundle empty() {
        return new KarmaBundle(List.of());
    }

    public List<KarmaParticle> particles() {
        return Collections.unmodifiableList(particles);
    }

    public KarmaBundle withAdded(KarmaParticle particle) {
        List<KarmaParticle> copy = new ArrayList<>(particles);
        copy.add(particle);
        return new KarmaBundle(copy);
    }
}
