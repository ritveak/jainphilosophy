package com.jain.core.simulation;

import com.jain.core.pudgala.vargana.karma.KarmaEvent;

/**
 * Hindi: {@code Kriya} aadesh.
 * English: Command that executes to a karma event (simulation hook).
 */
public interface ActionCommand {
    KarmaEvent execute();
}
