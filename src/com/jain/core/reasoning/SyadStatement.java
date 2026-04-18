package com.jain.core.reasoning;

import com.jain.core.reasoning.assertion.Assertion;

/**
 * Hindi: {@code Syaad vaakya}.
 * English: Qualified doctrinal assertion in syadvada.
 */
public record SyadStatement(Assertion assertion, SyadMode mode) {
    public String condition() {
        return assertion.condition().description();
    }

    public String claim() {
        return assertion.claim();
    }
}
