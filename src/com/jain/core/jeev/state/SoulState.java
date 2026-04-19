package com.jain.core.jeev.state;

import com.jain.core.pudgala.vargana.karma.KarmaBundle;

import java.util.Set;
import com.jain.core.jeev.PranaKind;

/**
 * Hindi: {@code Jeev avasthaa}.
 * English: Soul snapshot: spiritual stage, rebirth realm, karma bundle, and active vitalities.
 */
public record SoulState(
    Gunasthana gunasthana, 
    Gati gati, 
    KarmaBundle karma, 
    Set<PranaKind> activePranas
) {}
