package com.jain.core.pudgala.vargana.karma;

/**
 * Hindi: {@code Karm chakr} seva.
 * English: Service for bondage, activation, and shedding phases of karma bundles.
 */
public interface KarmaLifecycleService {
    KarmaBundle bond(KarmaBundle current, KarmaEvent event);
    KarmaBundle activate(KarmaBundle current, KarmaContext context);
    KarmaBundle shed(KarmaBundle current, KarmaContext context);
}
