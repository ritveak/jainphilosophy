package com.jain.core.pudgala.paramanu;

import com.jain.core.context.JainContext;

/**
 * Hindi: {@code Paramanu bandh} niyam-pankti.
 * English: One row from Table 1 (Kachhara 2016, after Tatvartha Sutra / Rajvartika): whether two paramanus with given
 * charge quanta multiples may bond. {@code chargeMultipleA} and {@code chargeMultipleB} are in units of minimal
 * indivisible charge {@code q}; convention from paper rows 5–8 uses 2q, 3q, etc.
 */
public record ParamanuBondingRule(
        String id,
        int chargeMultipleA,
        int chargeMultipleB,
        boolean svetambaraSimilarBonds,
        boolean svetambaraDissimilarBonds,
        boolean digambaraSimilarBonds,
        boolean digambaraDissimilarBonds) {

    public boolean canBond(JainContext tradition, ChargeParity parity) {
        if (tradition.isShvetambar()) {
            return parity == ChargeParity.SADRISH
                    ? svetambaraSimilarBonds
                    : svetambaraDissimilarBonds;
        } else if (tradition.isDigambar()) {
            return parity == ChargeParity.SADRISH
                    ? digambaraSimilarBonds
                    : digambaraDissimilarBonds;
        }
        return false;
    }
}
