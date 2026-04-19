package com.jain.core.jeev.state;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Gunasthaan} — chaudah charan.
 * English: Stages of spiritual development of the soul (fourteen gunasthanas).
 */
public enum Gunasthana implements Lexical {
    MITHYATAVA("Wrong faith"),
    SAASVAADAAN("Transient taste of right faith"),
    MISHR("Mixed faith and delusion"),
    AVIRAT_SAMYAK("Right faith without vows"),
    DESH_VIRAT("Partial vow restraint"),
    PRAMATT_SANYAM("Imperfect vow conduct"),
    APRAMATT_SANYAM("Perfect vow conduct"),
    APOORV_KARAN("Novel thought-activity stage"),
    ANIVRITTI_KARAN("Passions-on-the-wane activity"),
    SUKSHM_SAMPARAAY("Subtle greed remaining"),
    UPASHANT_MOH("Delusion suppressed"),
    KSHIN_MOH("Delusion destroyed"),
    SAYOG_KEVALI("Omniscient with vibratory activity"),
    AYOG_KEVALI("Omniscient without activity (liberated)");

    private final String englishMeaning;

    Gunasthana(String englishMeaning) {
        this.englishMeaning = englishMeaning;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }
}
