package com.jain.core.pudgala.vargana;

import com.jain.core.lexicon.Lexical;

/**
 * Hindi: {@code Vargan} ke mukhya prakaar.
 * English: Important functional pudgala clusters (Bhagwati / Gommatsar; Kachhara 2016).
 */
public enum VarganaKind implements Lexical {
    AHAR(
            VarganaSoulAssociation.JEEV_YUKT,
            "Food / intake vargana",
            "Ahara vargana — gross, vaikriya (protean), and aharaka (migratory) bodies."),
    TEJ(
            VarganaSoulAssociation.JEEV_YUKT,
            "Fiery vargana",
            "Tejas (fiery) vargana — taijasa / fiery body of organisms."),
    BHAASHAA(
            VarganaSoulAssociation.JEEV_YUKT,
            "Speech / sound vargana",
            "Bhasha (sound) vargana — speech and all sound including instruments and thunder."),
    MAN(
            VarganaSoulAssociation.JEEV_YUKT,
            "Mind vargana",
            "Mano vargana — physical mind (dravya manah)."),
    KARM_VARGAN(
            VarganaSoulAssociation.JEEV_YUKT,
            "Karmic vargana",
            "Karman vargana — karmic body / karmic matter cluster."),
    STHAVAR_SAHAYI(
            VarganaSoulAssociation.JEEV_VIYUKT,
            "Plant and nigoda-assisting vargana",
            "Higher-order varganas assisting sthavara bodies and nigodas; compared in the paper to sunlight (photons)."),
    SHAASHVAT_SHOONY(
            VarganaSoulAssociation.JEEV_VIYUKT,
            "Permanent nil (sunya) vargana",
            "Permanent nil (sunya) varganas — scriptures sparse; candidate for undetected mass."),
    MAHAA_SKANDH(
            VarganaSoulAssociation.JEEV_VIYUKT,
            "Gross matter (maha-skandha / GMV) vargana",
            "Maha-skandha / GMV — ordinary visible and invisible matter including tras bodies.");

    private final VarganaSoulAssociation association;
    private final String englishMeaning;
    private final String description;

    VarganaKind(VarganaSoulAssociation association, String englishMeaning, String description) {
        this.association = association;
        this.englishMeaning = englishMeaning;
        this.description = description;
    }

    @Override
    public String englishMeaning() {
        return englishMeaning;
    }

    public VarganaSoulAssociation association() {
        return association;
    }

    /** Longer doctrinal note (English). */
    public String description() {
        return description;
    }
}
