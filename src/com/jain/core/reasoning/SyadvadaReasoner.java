package com.jain.core.reasoning;

import java.util.List;

/**
 * Hindi: {@code Syaad-vaad} niyam.
 * English: Builds illustrative conditional assertions (syad statements) from a plain assertion.
 */
public final class SyadvadaReasoner {
    public List<SyadStatement> sevenfold(String assertion) {
        return List.of(
                new SyadStatement("from one standpoint", assertion, "SYAD_ASTI"),
                new SyadStatement("from another standpoint", "not " + assertion, "SYAD_NASTI"),
                new SyadStatement("across changing states", assertion + " and not " + assertion, "SYAD_ASTI_NASTI"));
    }
}
