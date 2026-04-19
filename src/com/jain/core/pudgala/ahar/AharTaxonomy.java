package com.jain.core.pudgala.ahar;

import com.jain.core.registry.Concept;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

/**
 * Hindi: {@code Ahar} vargikaran sahayak.
 * English: Bidirectional query helper for ahar methodologies, kaval subtypes, and their ontology mappings.
 */
public final class AharTaxonomy {
    private static final List<AharKind> AHAR_KINDS = List.of(AharKind.values());
    private static final List<KavalAharKind> KAVAL_AHAR_KINDS = List.of(KavalAharKind.values());
    private static final List<KavalAharForm> KAVAL_AHAR_FORMS = List.of(KavalAharForm.values());

    private AharTaxonomy() {}

    public static List<AharKind> allAharKinds() {
        return AHAR_KINDS;
    }

    public static List<AharKind> siblingAharKindsOf(AharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return AHAR_KINDS.stream().filter(candidate -> candidate != kind).toList();
    }

    public static List<AharKind> aharKindsByMateriality(AharMateriality materiality) {
        Objects.requireNonNull(materiality, "materiality must not be null");
        return AHAR_KINDS.stream().filter(kind -> kind.materiality() == materiality).toList();
    }

    public static List<AharKind> aharKindsByChannel(AharIntakeChannel channel) {
        Objects.requireNonNull(channel, "channel must not be null");
        return AHAR_KINDS.stream().filter(kind -> kind.intakeChannel() == channel).toList();
    }

    public static List<KavalAharKind> allKavalAharKinds() {
        return KAVAL_AHAR_KINDS;
    }

    public static List<KavalAharForm> allKavalAharForms() {
        return KAVAL_AHAR_FORMS;
    }

    public static List<KavalAharKind> subdivisionsOf(AharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return KAVAL_AHAR_KINDS.stream().filter(candidate -> candidate.parentKind() == kind).toList();
    }

    public static List<KavalAharKind> siblingKavalAharKindsOf(KavalAharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return KAVAL_AHAR_KINDS.stream().filter(candidate -> candidate != kind).toList();
    }

    public static List<KavalAharKind> kavalAharKindsByForm(KavalAharForm form) {
        Objects.requireNonNull(form, "form must not be null");
        return KAVAL_AHAR_KINDS.stream().filter(kind -> kind.form() == form).toList();
    }

    public static boolean isSubdivisionOf(AharKind parentKind, KavalAharKind childKind) {
        return parentKind != null && childKind != null && childKind.parentKind() == parentKind;
    }

    public static Optional<AharKind> parentOf(KavalAharKind kind) {
        return kind == null ? Optional.empty() : Optional.of(kind.parentKind());
    }

    public static Optional<AharKind> findAharKindByName(String name) {
        return AHAR_KINDS.stream()
                .filter(kind -> matches(name, kind.name(), kind.transliteratedName(), kind.englishMeaning()))
                .findFirst();
    }

    public static Optional<KavalAharKind> findKavalAharKindByName(String name) {
        return KAVAL_AHAR_KINDS.stream()
                .filter(kind -> matches(name, kind.name(), kind.transliteratedName(), kind.englishMeaning()))
                .findFirst();
    }

    public static Optional<KavalAharForm> findKavalAharFormByName(String name) {
        return KAVAL_AHAR_FORMS.stream()
                .filter(form -> matches(name, form.name(), form.englishMeaning()))
                .findFirst();
    }

    public static Concept conceptOf(AharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return switch (kind) {
            case OJ_AHAR -> Concept.OJ_AHAR;
            case ROM_AHAR -> Concept.ROM_AHAR;
            case KAVAL_AHAR -> Concept.KAVAL_AHAR;
            case LEP_AHAR -> Concept.LEP_AHAR;
            case MANAS_AHAR -> Concept.MANAS_AHAR;
            case KARMAN_AHAR -> Concept.KARMAN_AHAR;
        };
    }

    public static Concept conceptOf(KavalAharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return switch (kind) {
            case ASANAM -> Concept.ASANAM;
            case PAANAM -> Concept.PAANAM;
            case KHAIMAM -> Concept.KHAIMAM;
            case SAIMAM -> Concept.SAIMAM;
        };
    }

    public static Optional<AharKind> aharKindOf(Concept concept) {
        if (concept == null) return Optional.empty();
        return switch (concept) {
            case OJ_AHAR -> Optional.of(AharKind.OJ_AHAR);
            case ROM_AHAR -> Optional.of(AharKind.ROM_AHAR);
            case KAVAL_AHAR -> Optional.of(AharKind.KAVAL_AHAR);
            case LEP_AHAR -> Optional.of(AharKind.LEP_AHAR);
            case MANAS_AHAR -> Optional.of(AharKind.MANAS_AHAR);
            case KARMAN_AHAR -> Optional.of(AharKind.KARMAN_AHAR);
            default -> Optional.empty();
        };
    }

    public static Optional<KavalAharKind> kavalAharKindOf(Concept concept) {
        if (concept == null) return Optional.empty();
        return switch (concept) {
            case ASANAM -> Optional.of(KavalAharKind.ASANAM);
            case PAANAM -> Optional.of(KavalAharKind.PAANAM);
            case KHAIMAM -> Optional.of(KavalAharKind.KHAIMAM);
            case SAIMAM -> Optional.of(KavalAharKind.SAIMAM);
            default -> Optional.empty();
        };
    }

    public static List<Concept> lineageOf(AharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return List.of(Concept.AHAR_METHODOLOGY, conceptOf(kind));
    }

    public static List<Concept> lineageOf(KavalAharKind kind) {
        Objects.requireNonNull(kind, "kind must not be null");
        return List.of(
                Concept.AHAR_METHODOLOGY,
                conceptOf(kind.parentKind()),
                Concept.KAVAL_AHAR_CLASSIFICATION,
                conceptOf(kind));
    }

    private static boolean matches(String probe, String... candidates) {
        if (probe == null || probe.isBlank()) return false;
        String normalizedProbe = normalize(probe);
        for (String candidate : candidates) {
            if (normalizedProbe.equals(normalize(candidate))) return true;
        }
        return false;
    }

    private static String normalize(String value) {
        return value == null ? "" : value.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
    }
}
