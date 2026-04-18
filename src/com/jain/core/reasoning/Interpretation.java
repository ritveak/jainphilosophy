package com.jain.core.reasoning;

import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.reasoning.assertion.Perspective;

/**
 * Hindi: {@code Naya vyakhya}.
 * English: One perspective’s reading expressed as a structured doctrinal assertion.
 */
public record Interpretation(Perspective perspective, Assertion assertion) {
    public String naya() {
        return perspective.name();
    }

    public String statement() {
        return assertion.statement();
    }
}
