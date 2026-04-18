package com.jain.core.reasoning.assertion;

import java.util.Objects;

/**
 * Hindi: {@code Siddhaant vaakya}.
 * English: A doctrinal claim with subject, perspective, condition, and source metadata.
 */
public record Assertion(
        String subject,
        String claim,
        Perspective perspective,
        Condition condition,
        SourceReference sourceReference) {

    public Assertion {
        Objects.requireNonNull(subject, "subject must not be null");
        Objects.requireNonNull(claim, "claim must not be null");
        Objects.requireNonNull(perspective, "perspective must not be null");
        Objects.requireNonNull(condition, "condition must not be null");
        Objects.requireNonNull(sourceReference, "sourceReference must not be null");
    }

    public static Assertion plain(String claim) {
        return new Assertion("", claim, Perspective.unspecified(), Condition.unspecified(), SourceReference.unspecified());
    }

    public Assertion withClaim(String nextClaim) {
        return new Assertion(subject, nextClaim, perspective, condition, sourceReference);
    }

    public Assertion withPerspective(Perspective nextPerspective) {
        return new Assertion(subject, claim, nextPerspective, condition, sourceReference);
    }

    public Assertion withCondition(Condition nextCondition) {
        return new Assertion(subject, claim, perspective, nextCondition, sourceReference);
    }

    public Assertion withSourceReference(SourceReference nextSourceReference) {
        return new Assertion(subject, claim, perspective, condition, nextSourceReference);
    }

    /**
     * Human-readable statement for demos and logs.
     */
    public String statement() {
        return subject.isBlank() ? claim : subject + ": " + claim;
    }
}
