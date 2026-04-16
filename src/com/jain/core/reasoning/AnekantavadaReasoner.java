package com.jain.core.reasoning;

import java.util.List;

public final class AnekantavadaReasoner {
    public List<Interpretation> perspectives(Object target, List<NayaStrategy> strategies) {
        return strategies.stream().map(s -> s.interpret(target)).toList();
    }
}
