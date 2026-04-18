package com.jain.core.reasoning;

/**
 * Hindi: {@code Syaad vaakya}.
 * English: Conditional assertion in syadvada (condition, assertion, epistemic mode).
 */
public record SyadStatement(String condition, String assertion, String mode) {}
