package com.jain.core.attributes;

import java.util.Set;

/**
 * Hindi: {@code Indriya panchak} — varn, raas, gandh, sparsh.
 * English: Murta matter sensory profile (colour, taste, smell, touches).
 */
public record SensoryProfile(Varna varna, Rasa rasa, Gandha gandha, Set<Sparsha> sparsha) {}
