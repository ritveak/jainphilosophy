package com.jain.core.reasoning;

/**
 * Hindi: {@code Naya} riti.
 * English: Strategy that produces an interpretation from a target object.
 */
public interface NayaStrategy {
    Interpretation interpret(Object target);
}
