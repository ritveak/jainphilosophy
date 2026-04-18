package com.jain.core.reasoning;

import java.util.List;

/**
 * Hindi: {@code Anekant} anusheelan.
 * English: Collects multiple naya-based interpretations of one target.
 */
public final class AnekantavadaReasoner {
    public <T> List<Interpretation> perspectives(T target, List<? extends NayaStrategy<? super T>> strategies) {
        return strategies.stream().map(strategy -> strategy.interpret(target)).toList();
    }
}
