package com.jain.core.reasoning.assertion;

import java.util.Objects;

/**
 * Hindi: {@code Srot sandarbh}.
 * English: Lightweight source/citation reference for explainable doctrinal claims.
 */
public record SourceReference(String title, String citation) {
    public SourceReference {
        Objects.requireNonNull(title, "title must not be null");
        Objects.requireNonNull(citation, "citation must not be null");
    }

    public static SourceReference unspecified() {
        return new SourceReference("Unspecified source", "No citation attached yet.");
    }
}
