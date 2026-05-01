package com.jain.core.jeev.state;

import com.jain.core.pudgala.vargana.karma.KarmaBundle;

import java.util.Set;
import com.jain.core.jeev.PranaKind;
import com.jain.core.jeev.JatiKind;
import com.jain.core.jeev.CognitionLevel;

/**
 * Hindi: {@code Jeev avasthaa}.
 * English: Soul snapshot: spiritual stage, rebirth realm, karma bundle, and
 * active vitalities.
 */
public record SoulState(
        Gunasthana gunasthana,
        Gati gati,
        JatiKind jati,
        CognitionLevel cognitionLevel,
        KarmaBundle karma) {
    public Set<PranaKind> getActivePranas() {
        return jati.getPranas(cognitionLevel == CognitionLevel.SAINI);
    }
}
