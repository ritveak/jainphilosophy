package com.jain.core.karma;

public interface KarmaLifecycleService {
    KarmaBundle bond(KarmaBundle current, KarmaEvent event);
    KarmaBundle activate(KarmaBundle current, KarmaContext context);
    KarmaBundle shed(KarmaBundle current, KarmaContext context);
}
