package com.jain.core.ontology;

import java.util.Objects;

/**
 * Hindi: {@code Dravya} ka saadhaaran lekh.
 * English: Concrete substance value with identifier, display name, and kind.
 */
public record Substance(String id, String name, SubstanceKind kind) implements Dravya {
    public Substance {
        Objects.requireNonNull(id, "id must not be null");
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(kind, "kind must not be null");
    }
}
