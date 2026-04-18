package com.jain.core.pudgala;

import java.util.List;

/**
 * Hindi: {@code Paramanu bandh} sarini.
 * English: Canonical bonding rows from Kachhara (2016) Table 1; {@code q} is minimal unit charge magnitude.
 */
public final class ParamanuBondingTable {

    private ParamanuBondingTable() {}

    /**
     * Rows 1–8: minimum q does not bond; 2q+2q and 2q+3q vary by tradition; 2q+4q and higher dissimilar pairs bond
     * in both traditions per the paper’s table.
     */
    public static List<ParamanuBondingRule> rules() {
        return List.of(
                new ParamanuBondingRule("q+q", 1, 1, false, false, false, false),
                new ParamanuBondingRule("q+2q", 1, 2, false, false, false, false),
                new ParamanuBondingRule("q+3q", 1, 3, false, false, false, false),
                new ParamanuBondingRule("q+nq_n>=4", 1, 4, false, false, false, false),
                new ParamanuBondingRule("2q+2q", 2, 2, false, true, false, false),
                new ParamanuBondingRule("2q+3q", 2, 3, false, true, false, false),
                new ParamanuBondingRule("2q+4q", 2, 4, true, true, true, true),
                new ParamanuBondingRule("2q+nq_n>=5", 2, 5, true, true, true, true));
    }

    /**
     * Whether two charge multiples (each ≥1, in units of q) may bond under tradition and parity. Uses the most
     * specific matching row; unknown patterns default to false.
     */
    public static boolean canBond(
            int chargeMultipleA, int chargeMultipleB, JainTradition tradition, ChargeParity parity) {
        int a = Math.min(chargeMultipleA, chargeMultipleB);
        int b = Math.max(chargeMultipleA, chargeMultipleB);
        for (ParamanuBondingRule r : rules()) {
            if (matches(a, b, r)) {
                return r.canBond(tradition, parity);
            }
        }
        return false;
    }

    private static boolean matches(int a, int b, ParamanuBondingRule r) {
        return switch (r.id()) {
            case "q+q" -> a == 1 && b == 1;
            case "q+2q" -> a == 1 && b == 2;
            case "q+3q" -> a == 1 && b == 3;
            case "q+nq_n>=4" -> a == 1 && b >= 4;
            case "2q+2q" -> a == 2 && b == 2;
            case "2q+3q" -> a == 2 && b == 3;
            case "2q+4q" -> a == 2 && b == 4;
            case "2q+nq_n>=5" -> a == 2 && b >= 5;
            default -> false;
        };
    }
}
