package com.jain.core.reasoning;

import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.reasoning.assertion.Condition;
import com.jain.core.reasoning.assertion.Perspective;
import java.util.List;

/**
 * Hindi: {@code Syaad-vaad} niyam.
 * English: Builds illustrative qualified assertions from a doctrinal assertion.
 */
public final class SyadvadaReasoner {
    public List<SyadStatement> sevenfold(Assertion assertion) {
        Assertion asti =
                assertion.withPerspective(new Perspective("SYAD_AFFIRMING", "Affirming qualified standpoint"))
                        .withCondition(new Condition("from one standpoint"));
        Assertion nasti =
                assertion.withClaim("not " + assertion.claim())
                        .withPerspective(new Perspective("SYAD_NEGATING", "Negating qualified standpoint"))
                        .withCondition(new Condition("from another standpoint"));
        Assertion astiNasti =
                assertion.withClaim(assertion.claim() + " and not " + assertion.claim())
                        .withPerspective(new Perspective("SYAD_CHANGING_STATE", "Changing-state qualified standpoint"))
                        .withCondition(new Condition("across changing states"));

        return List.of(
                new SyadStatement(asti, SyadMode.SYAD_ASTI),
                new SyadStatement(nasti, SyadMode.SYAD_NASTI),
                new SyadStatement(astiNasti, SyadMode.SYAD_ASTI_NASTI));
    }

    public List<SyadStatement> sevenfold(String assertion) {
        return sevenfold(Assertion.plain(assertion));
    }
}
