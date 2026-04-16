package com.jain.core.ontology;

import java.util.Objects;

public record Substance(String id, String name, SubstanceKind kind) implements Dravya {
    public Substance {
        Objects.requireNonNull(id, "id must not be null");
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(kind, "kind must not be null");
    }
}
