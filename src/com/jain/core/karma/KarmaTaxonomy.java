package com.jain.core.karma;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Hindi: {@code Karm} vargikaran sahayak.
 * English: Query helper over karma classes, types, subtype groups, and subtype compatibility.
 */
public final class KarmaTaxonomy {

    private KarmaTaxonomy() {}

    public static List<KarmaType> typesInClass(KarmaClass karmaClass) {
        Objects.requireNonNull(karmaClass, "karmaClass must not be null");
        return Arrays.stream(KarmaType.values()).filter(type -> type.karmaClass() == karmaClass).toList();
    }

    public static List<KarmaSubTypeGroup> groupsOf(KarmaType type) {
        Objects.requireNonNull(type, "type must not be null");
        return Arrays.stream(KarmaSubTypeGroup.values()).filter(group -> group.type() == type).toList();
    }

    public static List<KarmaSubType> subtypesOf(KarmaType type) {
        Objects.requireNonNull(type, "type must not be null");
        return Arrays.stream(KarmaSubType.values()).filter(subType -> subType.type() == type).toList();
    }

    public static List<KarmaSubType> subtypesOf(KarmaSubTypeGroup group) {
        Objects.requireNonNull(group, "group must not be null");
        return Arrays.stream(KarmaSubType.values()).filter(subType -> subType.group() == group).toList();
    }

    public static Map<KarmaSubTypeGroup, List<KarmaSubType>> groupedSubtypesOf(KarmaType type) {
        Objects.requireNonNull(type, "type must not be null");
        return subtypesOf(type).stream()
                .collect(
                        Collectors.groupingBy(
                                KarmaSubType::group,
                                LinkedHashMap::new,
                                Collectors.toList()));
    }

    public static boolean isCompatible(KarmaType type, KarmaSubType subType) {
        return type != null && subType != null && subType.type() == type;
    }
}
