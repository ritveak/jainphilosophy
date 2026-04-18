package com.jain.core.pudgala;

/**
 * Hindi: {@code Samay} aur {@code pradesh}.
 * English: Minimal space–time units tied to paramanu dynamics (Kachhara 2016): samaya (smallest time), pradesha
 * (space of one paramanu).
 */
public final class TimeSpacePudgalaUnits {

    private TimeSpacePudgalaUnits() {}

    public record Samaya(String definition) {
        public static Samaya canonical() {
            return new Samaya(
                    "Indivisible instant; minimum life of a free paramanu or aggregate is one samaya; maximum innumerable samayas.");
        }
    }

    public record Pradesha(String definition) {
        public static Pradesha canonical() {
            return new Pradesha("Space of one paramanu; unit for slowest crossing in one samaya.");
        }
    }
}
