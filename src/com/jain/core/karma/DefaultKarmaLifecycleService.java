package com.jain.core.karma;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hindi: {@code Karm chakr} kaa saadhaaran niyam.
 * English: Default lifecycle transitions (simplified illustrative rules).
 */
public final class DefaultKarmaLifecycleService implements KarmaLifecycleService {
    @Override
    public KarmaBundle bond(KarmaBundle current, KarmaEvent event) {
        KarmaParticle bonded =
                new KarmaParticle(
                        event.type(),
                        event.subType(),
                        Math.max(0, event.intensityDelta()),
                        Math.max(1, event.durationDelta()),
                        KarmaState.BANDH);
        return current.withAdded(bonded);
    }

    @Override
    public KarmaBundle activate(KarmaBundle current, KarmaContext context) {
        List<KarmaParticle> transitioned =
                current.particles().stream()
                        .map(
                                p ->
                                        p.state() == KarmaState.BANDH
                                                ? p.transitionTo(KarmaState.SATTA)
                                                : p.state() == KarmaState.SATTA
                                                        ? p.transitionTo(KarmaState.UDAY)
                                                        : p)
                        .collect(Collectors.toList());
        return new KarmaBundle(transitioned);
    }

    @Override
    public KarmaBundle shed(KarmaBundle current, KarmaContext context) {
        List<KarmaParticle> transitioned =
                current.particles().stream()
                        .map(
                                p ->
                                        context.asceticPractice() && p.state() == KarmaState.UDAY
                                                ? p.transitionTo(KarmaState.NIRJAR)
                                                : p)
                        .filter(p -> p.state() != KarmaState.KSHAY)
                        .collect(Collectors.toList());
        return new KarmaBundle(transitioned);
    }
}
