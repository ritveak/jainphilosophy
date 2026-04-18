package com.jain.core.reasoning.assertion;

import com.jain.core.reasoning.NayaKind;
import java.util.Objects;

/**
 * Hindi: {@code Drishtikon} / naya.
 * English: Named standpoint from which an assertion is made.
 */
public record Perspective(String name, String description) {
    public Perspective {
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(description, "description must not be null");
    }

    public static Perspective unspecified() {
        return new Perspective("UNSPECIFIED", "No explicit standpoint has been attached yet.");
    }

    public static Perspective of(NayaKind kind) {
        return new Perspective(kind.name(), kind.englishMeaning());
    }

    public static Perspective of(NayaKind kind, String description) {
        return new Perspective(kind.name(), description);
    }
}
