package com.jain.core.karma;

import java.util.List;
import java.util.stream.Collectors;

public final class DefaultKarmaLifecycleService implements KarmaLifecycleService {
    @Override
    public KarmaBundle bond(KarmaBundle current, KarmaEvent event) {
        KarmaParticle bonded =
                new KarmaParticle(
                        event.type(),
                        event.subType(),
                        Math.max(0, event.intensityDelta()),
                        Math.max(1, event.durationDelta()),
                        KarmaState.BANDHA);
        return current.withAdded(bonded);
    }

    @Override
    public KarmaBundle activate(KarmaBundle current, KarmaContext context) {
        List<KarmaParticle> transitioned =
                current.particles().stream()
                        .map(
                                p ->
                                        p.state() == KarmaState.BANDHA
                                                ? p.transitionTo(KarmaState.SATTA)
                                                : p.state() == KarmaState.SATTA
                                                        ? p.transitionTo(KarmaState.UDAYA)
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
                                        context.asceticPractice() && p.state() == KarmaState.UDAYA
                                                ? p.transitionTo(KarmaState.NIRJARA)
                                                : p)
                        .filter(p -> p.state() != KarmaState.KSHAYA)
                        .collect(Collectors.toList());
        return new KarmaBundle(transitioned);
    }
}
