package com.jain.core.reasoning.assertion;

import java.util.Objects;

/**
 * Hindi: {@code Shart} / paristhiti.
 * English: A condition under which an assertion is evaluated or explained.
 */
public record Condition(String description) {
    public Condition {
        Objects.requireNonNull(description, "description must not be null");
    }

    public static Condition unspecified() {
        return new Condition("without a specific stated condition");
    }
}
