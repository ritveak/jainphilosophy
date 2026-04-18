package com.jain.core.simulation;

import com.jain.core.karma.KarmaEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hindi: {@code Ghatna} shaalin.
 * English: Simple publish–subscribe bus for karma events in a simulation.
 */
public final class SimulationEventBus {
    private final List<Consumer<KarmaEvent>> listeners = new ArrayList<>();

    public void subscribe(Consumer<KarmaEvent> listener) {
        listeners.add(listener);
    }

    public void publish(KarmaEvent event) {
        listeners.forEach(l -> l.accept(event));
    }
}
