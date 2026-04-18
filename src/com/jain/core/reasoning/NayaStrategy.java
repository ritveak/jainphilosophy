package com.jain.core.reasoning;

import com.jain.core.reasoning.assertion.Perspective;

/**
 * Hindi: {@code Naya} riti.
 * English: Typed strategy that interprets a target through one doctrinal standpoint.
 */
public interface NayaStrategy<T> {
    NayaKind kind();

    default Perspective perspective() {
        return Perspective.of(kind());
    }

    Interpretation interpret(T target);
}
