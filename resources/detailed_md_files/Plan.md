# Jain Philosophy Engine - AI Coding Prompt

## Objective

Build a modular, extensible Java library that encodes Jain philosophical ontology, attributes, karma system, and reasoning frameworks (Anekantavada, Syadvada, Nayavada) into a reusable engine.

This engine should support:

* Simulation systems (games, narrative engines)
* Moral/karma-based progression systems
* Knowledge graphs and reasoning systems
* Extensible domain modeling

---

## Core Architectural Principles

1. Separation of Concerns:

   * Ontology Layer (What exists)
   * Attribute Layer (Properties of entities)
   * State Layer (Dynamic states like karma, soul progression)
   * Rule/Reasoning Layer (Logic, interpretation, transformation)
   * Simulation Layer (Events, world, actors)

2. Use Patterns:

   * Interfaces for contracts
   * Enums for fixed doctrinal categories
   * Immutable value objects (records)
   * Strategy pattern (reasoning systems)
   * State machine (karma lifecycle)
   * Event-driven architecture (actions → karma → outcomes)

---

## Package Structure

```
com.jain.core
├── ontology
├── attributes
├── state
├── karma
├── reasoning
├── rules
├── simulation
├── registry
└── api
```

---

## Ontology Layer

Define core interfaces:

```java
public interface Dravya {
    String id();
    String name();
}
```

### Key Entities

* Jiva (soul)
* Ajiva (non-living)
* Pudgala (matter)
* Kala (time)
* Dharmaastikaya (motion medium)
* Adharmaastikaya (rest medium)
* Akashastikaya (space)

---

## Attribute Layer

Every entity should support attributes.

```java
public interface HasAttributes {
    Map<String, Object> attributes();
}
```

### Sensory Attributes (Pudgala)

* Varna (color)
* Rasa (taste)
* Gandha (smell)
* Sparsha (touch)

Use value objects:

```java
public record SensoryProfile(
    Varna varna,
    Rasa rasa,
    Gandha gandha,
    Set<Sparsha> sparsha
) {}
```

---

## Karma Engine

### Core Model

```java
public class KarmaParticle {
    KarmaType type;
    KarmaSubType subType;
    int intensity;
    int duration;
    KarmaState state;
}
```

### Karma States

```java
public enum KarmaState {
    BANDHA,
    SATTA,
    UDAYA,
    UDIRANA,
    APAVARTANA,
    SANKRAMANA,
    NIRJARA,
    UPASHAMA,
    KSHAYA
}
```

### Lifecycle Service

```java
public interface KarmaLifecycleService {
    KarmaBundle bond(KarmaBundle current, KarmaEvent event);
    KarmaBundle activate(KarmaBundle current, KarmaContext context);
    KarmaBundle shed(KarmaBundle current, KarmaContext context);
}
```

---

## Karma Subtypes (Must Implement)

### Ghati Karma

* Jnanavarniya (5 types)
* Darshanavarniya (9 types)
* Mohaniya (28 types)
* Antaray (5 types)

### Aghati Karma

* Vedniya (2 types)
* Nam (large classification tree)
* Gotra (2 types)
* Ayushya (4 types)

All must be modeled with subtype hierarchies.

---

## Reasoning Layer

### Anekantavada

Multiple perspectives on same entity

### Syadvada

Conditional truth assertions

```java
public record SyadStatement(
    String condition,
    String assertion,
    String mode
) {}
```

### Nayavada

Perspective-based interpretation

```java
public interface NayaStrategy {
    Interpretation interpret(Object target);
}
```

---

## Soul State

```java
public class SoulState {
    Gunasthana gunasthana;
    Gati gati;
    KarmaBundle karma;
}
```

---

## Simulation Layer

* Event-driven system
* Player/NPC actions generate karma
* Karma affects future outcomes

Patterns:

* Command Pattern
* Observer Pattern
* Event Bus

---

## Ontology Registry

Use graph-based registry:

```java
public class OntologyNode {
    Concept concept;
    List<OntologyNode> children;
}
```

---


## Requirements for AI Assistant

1. Generate full Java project structure
2. Create interfaces and base classes
3. Implement enums for classifications
4. Implement Karma Engine with lifecycle
5. Add reasoning strategies
6. Provide example usage (simulation/game scenario)
7. Ensure extensibility
8. Keep documentation in code

---

## Output Expectations

* Clean architecture
* Domain-driven design
* Extensible modules
* Ready for game/simulation integration

---

## Future Extensions

* Leshya system
* Gunasthana transitions
* Rebirth simulation
* Narrative engine integration

---


## Mermaid Reference (Complete Tatva Structure)

For reference here is a mermaid diagram detailing every bit of classification

```mermaid
graph TD


%% ROOT
Dravya["Dravya — Substance: fundamental reality with qualities and modes"] --> Astikay["Astikaya — Extensive substances: occupy multiple space-points"]
Dravya --> Nastikay["Anastikaya — Non-extensive substance: does not occupy multiple space-points"]

%% TIME
Nastikay --> Kaal["Kaal — Time: enables sequence, change, and duration"]
Kaal --> Samay["Samay — Ultimate unit: indivisible instant of time"]
Kaal --> Avali["Avali — Countless samays: practical bundle of time-instants"]

%% ASTIKAYA
Astikay --> Jeev["Jeev — Soul: conscious, sentient substance with knowledge and perception"]
Astikay --> Ajiv["Ajiv — Non-living substance: without consciousness"]

%% AJIV
Ajiv --> Dharm["Dharmastikay — Medium of motion: supports movement without itself moving"]
Ajiv --> Adharm["Adharmastikay — Medium of rest: supports rest without itself stopping"]
Ajiv --> Akash["Akashastikay — Space: accommodates all substances"]
Ajiv --> Pudgal["Pudgalastikay — Matter: only corporeal, perceivable substance"]

Akash --> Lokakash["Lokakash — Occupied universe: region where substances exist"]
Akash --> Alokakash["Alokakash — Empty space: beyond the occupied universe"]

%% =========================
%% JEEV
%% =========================

Jeev --> Mukta["Mukta — Liberated souls: free from karma and dwelling in pure state"]
Jeev --> Sansari["Sansari — Worldly souls: bound by karma and subject to rebirth"]

Sansari --> Sthavar["Sthavar — Immobile beings: one-sensed life forms"]
Sansari --> Tras["Tras — Mobile beings: two to five sensed life forms"]

Sthavar --> Prithvikay["Prithvikay — Earth-bodied: life associated with earth matter"]
Sthavar --> Apkay["Apkay — Water-bodied: life associated with water matter"]
Sthavar --> Teukay["Teukay — Fire-bodied: life associated with fire matter"]
Sthavar --> Vayukay["Vayukay — Air-bodied: life associated with air matter"]
Sthavar --> Vanaspatikay["Vanaspatikay — Plant-bodied: vegetation life"]

Vanaspatikay --> Pratyek["Pratyek — Individual plant soul: one soul per body"]
Vanaspatikay --> Sadharan["Sadharan — Common/Nigod: many souls sharing one body"]

Sthavar --> SthavarSize["Sthavar Size — Classification by pervasiveness and visibility"]
SthavarSize --> BadarJeev["Badar — Gross: visible or obstructed"]
SthavarSize --> SukshmaJeev["Sukshma — Minute: pervasive or unobstructed"]

Tras --> Dwindriya["Dwindriya — Two-sensed: touch and taste"]
Tras --> Trindriya["Trindriya — Three-sensed: touch, taste, smell"]
Tras --> Chaurindriya["Chaurindriya — Four-sensed: adds sight"]
Tras --> Panchendriya["Panchendriya — Five-sensed: adds hearing"]

Panchendriya --> Saini["Saini — With mind: sentient and reflective"]
Panchendriya --> Asaini["Asaini — Without mind: instinctive or mindless"]

Sansari --> GatiClassification["Gati — Realm of rebirth classification"]
GatiClassification --> Dev["Dev — Celestial realm beings"]
GatiClassification --> Manushya["Manushya — Human realm beings"]
GatiClassification --> Tiryanch["Tiryanch — Animal/plant realm beings"]
GatiClassification --> Narak["Narak — Infernal realm beings"]

Sansari --> PranaClassification["Prana — Vitalities classification"]
PranaClassification --> IndriyaPrana["Indriya Prana — Five senses vitality"]
PranaClassification --> BalaPrana["Bala Prana — Three forces vitality"]
PranaClassification --> AyushyaPrana["Ayushya Prana — Life-span vitality"]
PranaClassification --> ShvasochchhvasPrana["Shvasochchhvas Prana — Respiration vitality"]

IndriyaPrana --> SparshIndriya["Sparsh — Touch vitality"]
IndriyaPrana --> RasIndriya["Ras — Taste vitality"]
IndriyaPrana --> GhranIndriya["Ghran — Smell vitality"]
IndriyaPrana --> ChakshuIndriya["Chakshu — Vision vitality"]
IndriyaPrana --> ShravanIndriya["Shravan — Hearing vitality"]

BalaPrana --> ManoBala["Mano-bal — Mind vitality"]
BalaPrana --> VachanBala["Vachan-bal — Speech vitality"]
BalaPrana --> KayaBala["Kaya-bal — Body vitality"]

%% =========================
%% PUDGAL CORE
%% =========================

Pudgal --> Murta["Murta — Corporeal: perceptible through the senses"]
Murta --> Rupatva["Rupatva — Sensory manifestation: defined by material qualities"]

Rupatva --> Colour["Varna — Colour property"]
Rupatva --> Taste["Rasa — Taste property"]
Rupatva --> Smell["Gandha — Smell property"]
Rupatva --> Touch["Sparsha — Touch property"]

Colour --> Black["Black — one of the five primary colours"]
Colour --> Blue["Blue — one of the five primary colours"]
Colour --> Red["Red — one of the five primary colours"]
Colour --> Yellow["Yellow — one of the five primary colours"]
Colour --> White["White — one of the five primary colours"]

Taste --> Sweet["Sweet — one of the five tastes"]
Taste --> Bitter["Bitter — one of the five tastes"]
Taste --> Pungent["Pungent — one of the five tastes"]
Taste --> Sour["Sour — one of the five tastes"]
Taste --> Astringent["Astringent — one of the five tastes"]

Smell --> GoodSmell["Good smell — one of the two odours"]
Smell --> BadSmell["Bad smell — one of the two odours"]

Touch --> Cold["Cold — one of the eight touches"]
Touch --> Hot["Hot — one of the eight touches"]
Touch --> Smooth["Snigdha — Smooth or positive-charge touch"]
Touch --> Rough["Ruksha — Rough or negative-charge touch"]
Touch --> Light["Laghu — Light touch"]
Touch --> Heavy["Guru — Heavy touch"]
Touch --> Soft["Mridu — Soft touch"]
Touch --> Hard["Kathor — Hard touch"]

%% =========================
%% PUDGAL CLASSIFICATIONS
%% =========================

Pudgal --> StateClassification["State — Classification by perceptibility and fineness"]
Pudgal --> StructureClassification["Structure — Classification by form and aggregation"]
Pudgal --> TouchBasedClassification["Touch-based — Classification by touch count"]
Pudgal --> FunctionClassification["Function — Classification by karmic or bodily role"]
Pudgal --> PudgalQualityClassification["Quality Set — Classification by colour, taste, smell, touch"]
Pudgal --> AharMethodology["Ahar — Physical and subtle intake methodologies"]

%% AHAR
AharMethodology --> OjAhar["Ojahara — Energy absorption"]
AharMethodology --> RomAhar["Romahara — Pore absorption"]
AharMethodology --> KavalAhar["Kavalahara — Morsel intake"]
AharMethodology --> LepAhar["Lepahara — Smearing intake"]
AharMethodology --> ManasAhar["Manasahara — Mental intake"]
AharMethodology --> KarmanAhar["Karmanahara — Karmic intake"]

KavalAhar --> KavalAharClassification["Kaval Ahar Types — Sub-classification of morsel intake"]
KavalAharClassification --> Asanam["Asanam — Solid food morsels"]
KavalAharClassification --> Paanam["Paanam — Liquid food"]
KavalAharClassification --> Khaimam["Khaimam — Snacks"]
KavalAharClassification --> Saimam["Saimam — Taste enhancers"]

%% STATE
StateClassification --> SthulaSthula["Sthula-Sthula — Gross solid matter, like wood or stone"]
StateClassification --> Sthula["Sthula — Liquid matter, like water or oil"]
StateClassification --> SthulaSukshma["Sthula-Sukshma — Visible but untouchable, like light or shadow"]
StateClassification --> SukshmaSthula["Sukshma-Sthula — Invisible but sensible, like air or smell"]
StateClassification --> Sukshma["Sukshma — Subtle matter, including karmic matter"]
StateClassification --> SukshmaSukshma["Sukshma-Sukshma — Ultra-subtle matter, atom-like"]

%% STRUCTURE
StructureClassification --> Paramanu["Paramanu — Atom: smallest indivisible unit of matter"]
StructureClassification --> Skandh["Skandh — Aggregate: cluster of atoms"]

%% TOUCH-BASED
TouchBasedClassification --> TwoTouch["Two-touch — Minimal matter level: paramanu"]
TouchBasedClassification --> FourTouch["Four-touch — Subtle matter level"]
TouchBasedClassification --> EightTouch["Eight-touch — Gross matter level"]

%% QUALITY SET
PudgalQualityClassification --> QualitySet["Guna-set — Possesses colour, taste, smell, and touch"]
QualitySet --> QualityColour["Varna-set — five primary colours"]
QualitySet --> QualityTaste["Rasa-set — five tastes"]
QualitySet --> QualitySmell["Gandha-set — two smells"]
QualitySet --> QualityTouch["Sparsha-set — eight touches"]

%% =========================
%% PUDGAL FUNCTION / VARGANA
%% =========================

FunctionClassification --> Vargana["Vargana — Functional clusters of matter"]

Vargana --> Audarik["Audarik Vargana — Physical body matter"]
Vargana --> Vaikriya["Vaikriya Vargana — Transformable body matter"]
Vargana --> Aharak["Aharak Vargana — Projected or communication body matter"]
Vargana --> Taijas["Taijas Vargana — Luminous or fiery body matter"]
Vargana --> Karman["Karman Vargana — Karmic matter"]
Vargana --> Bhasha["Bhasha Vargana — Speech matter"]
Vargana --> Shvasochhvas["Shvasochhvas Vargana — Respiratory matter"]
Vargana --> Manah["Manah Vargana — Mind matter"]

Karman --> Ghati["Ghati Karma — Destructive karmas: obstruct soul qualities"]
Karman --> Aghati["Aghati Karma — Non-destructive karmas: shape embodied conditions"]

%% GHATI KARMA
Ghati --> Jnanavarniya["Jnanavarniya — Knowledge-obscuring karma"]
Ghati --> Darshanavarniya["Darshanavarniya — Perception-obscuring karma"]
Ghati --> Mohaniya["Mohaniya — Deluding karma"]
Ghati --> Antaray["Antaray — Obstruction-causing karma"]

Jnanavarniya --> JnanavarniyaClassification["Jnanavarniya Prakritis — Five knowledge-obscuring subtypes"]
JnanavarniyaClassification --> MatiJnanavarniya["Mati — Sensory and mental knowledge obscuring"]
JnanavarniyaClassification --> ShrutJnanavarniya["Shrut — Scriptural or learned knowledge obscuring"]
JnanavarniyaClassification --> AvadhiJnanavarniya["Avadhi — Clairvoyant knowledge obscuring"]
JnanavarniyaClassification --> ManahparyayaJnanavarniya["Manahparyaya — Telepathic knowledge obscuring"]
JnanavarniyaClassification --> KevalaJnanavarniya["Kevala — Omniscient knowledge obscuring"]

Darshanavarniya --> DarshanavarniyaClassification["Darshanavarniya Prakritis — Nine perception-obscuring subtypes"]
DarshanavarniyaClassification --> ChakshuDarshanavarniya["Chakshu — Sight perception obscuring"]
DarshanavarniyaClassification --> AchakshuDarshanavarniya["Achakshu — Non-sight perception obscuring"]
DarshanavarniyaClassification --> AvadhiDarshanavarniya["Avadhi — Clairvoyant perception obscuring"]
DarshanavarniyaClassification --> KevalaDarshanavarniya["Kevala — Omniperception obscuring"]
DarshanavarniyaClassification --> Nidra["Nidra — Ordinary sleep"]
DarshanavarniyaClassification --> NidraNidra["Nidra-Nidra — Deep sleep, hard to awaken from"]
DarshanavarniyaClassification --> Prachala["Prachala — Sleep even while active"]
DarshanavarniyaClassification --> PrachalaPrachala["Prachala-Prachala — Very intense sleep state"]
DarshanavarniyaClassification --> Styanarddhi["Styanarddhi — Sleep-like dullness or psychic stupor"]

Mohaniya --> MohaniyaClassification["Mohaniya Prakritis — Twenty-eight deluding subtypes"]
MohaniyaClassification --> DarshanaMohaniya["Darshana Mohaniya — Faith-deluding branch"]
MohaniyaClassification --> CharitraMohaniya["Charitra Mohaniya — Conduct-deluding branch"]

DarshanaMohaniya --> DarshanaMohaniyaClassification["Darshana Mohaniya Types — Three faith-deluding subtypes"]
DarshanaMohaniyaClassification --> Mithyatva["Mithyatva — False faith or wrong belief"]
DarshanaMohaniyaClassification --> SamyaktvaMohaniya["Samyaktva Mohaniya — Right faith obscuring delusion"]
DarshanaMohaniyaClassification --> Mishra["Mishra — Mixed or partially right faith"]

CharitraMohaniya --> CharitraMohaniyaClassification["Charitra Mohaniya Types — Conduct-deluding subtypes"]
CharitraMohaniyaClassification --> Kashaya["Kashaya — Passions: anger, pride, deceit, greed"]
CharitraMohaniyaClassification --> Nokashaya["Nokashaya — Non-passions: softer conduct-deluding states"]

Kashaya --> KashayaClassification["Kashaya Grouping — Sixteen passion subtypes by intensity"]
KashayaClassification --> Krodh["Krodh — Anger"]
KashayaClassification --> Maan["Maan — Pride"]
KashayaClassification --> Maya["Maya — Deceit"]
KashayaClassification --> Lobh["Lobh — Greed"]

Krodh --> KrodhAnantanubandhi["Anantanubandhi Krodh — Endless binding anger"]
Krodh --> KrodhApratyakhyanavaraniya["Apratyakhyanavaraniya Krodh — Prevents partial vows"]
Krodh --> KrodhPratyakhyanavaraniya["Pratyakhyanavaraniya Krodh — Prevents full vows"]
Krodh --> KrodhSanjvalan["Sanjvalan Krodh — Burning, momentary anger"]

Maan --> MaanAnantanubandhi["Anantanubandhi Maan — Endless binding pride"]
Maan --> MaanApratyakhyanavaraniya["Apratyakhyanavaraniya Maan — Prevents partial vows"]
Maan --> MaanPratyakhyanavaraniya["Pratyakhyanavaraniya Maan — Prevents full vows"]
Maan --> MaanSanjvalan["Sanjvalan Maan — Burning, momentary pride"]

Maya --> MayaAnantanubandhi["Anantanubandhi Maya — Endless binding deceit"]
Maya --> MayaApratyakhyanavaraniya["Apratyakhyanavaraniya Maya — Prevents partial vows"]
Maya --> MayaPratyakhyanavaraniya["Pratyakhyanavaraniya Maya — Prevents full vows"]
Maya --> MayaSanjvalan["Sanjvalan Maya — Burning, momentary deceit"]

Lobh --> LobhAnantanubandhi["Anantanubandhi Lobh — Endless binding greed"]
Lobh --> LobhApratyakhyanavaraniya["Apratyakhyanavaraniya Lobh — Prevents partial vows"]
Lobh --> LobhPratyakhyanavaraniya["Pratyakhyanavaraniya Lobh — Prevents full vows"]
Lobh --> LobhSanjvalan["Sanjvalan Lobh — Burning, momentary greed"]

Nokashaya --> NokashayaClassification["Nokashaya Grouping — Nine non-passion subtypes"]
NokashayaClassification --> Hasya["Hasya — Laughter or joking"]
NokashayaClassification --> Rati["Rati — Attachment or liking"]
NokashayaClassification --> Arati["Arati — Dislike or aversion"]
NokashayaClassification --> Shok["Shok — Sorrow"]
NokashayaClassification --> Bhaya["Bhaya — Fear"]
NokashayaClassification --> Jugupsa["Jugupsa — Disgust"]
NokashayaClassification --> Purushveda["Purushveda — Male passion"]
NokashayaClassification --> Striveda["Striveda — Female passion"]
NokashayaClassification --> Napumsakaveda["Napumsakaveda — Neuter passion"]

Antaray --> AntarayClassification["Antaray Prakritis — Five obstruction subtypes"]
AntarayClassification --> DanaAntaray["Dana — Donation obstructing"]
AntarayClassification --> LabhaAntaray["Labha — Gain obstructing"]
AntarayClassification --> BhogaAntaray["Bhoga — Enjoyment obstructing"]
AntarayClassification --> UpabhogaAntaray["Upabhoga — Re-enjoyment obstructing"]
AntarayClassification --> ViryaAntaray["Virya — Energy obstructing"]

%% AGHATI KARMA
Aghati --> Vedniya["Vedniya — Feeling-producing karma"]
Aghati --> Nam["Nam — Body-determining karma"]
Aghati --> Gotra["Gotra — Status-determining karma"]
Aghati --> Ayushya["Ayushya — Life-span-determining karma"]

Vedniya --> VedniyaClassification["Vedniya Types — Two feeling-producing subtypes"]
VedniyaClassification --> ShataVedniya["Shata — Pleasure-producing feeling"]
VedniyaClassification --> AshataVedniya["Ashata — Pain-producing feeling"]

Ayushya --> AyushyaClassification["Ayushya Types — Four life-span subtypes"]
AyushyaClassification --> DevaAyu["Deva — Celestial life-span"]
AyushyaClassification --> ManushyaAyu["Manushya — Human life-span"]
AyushyaClassification --> TiryanchAyu["Tiryanch — Animal life-span"]
AyushyaClassification --> NarakaAyu["Naraka — Infernal life-span"]

Gotra --> GotraClassification["Gotra Types — Two status subtypes"]
GotraClassification --> UcchaGotra["Uccha — High status"]
GotraClassification --> NeechaGotra["Neecha — Low status"]

Nam --> NamClassification["Nam Karma Prakritis — Main body-making groupings and finer subtypes"]
NamClassification --> GatiNam["Gati — Four states of existence"]
NamClassification --> JatiNam["Jati — Five classes of beings"]
NamClassification --> ShariraNam["Sharira — Five body types"]
NamClassification --> AngopangaNam["Angopanga — Body-part determining"]
NamClassification --> SamhananaNam["Samhanana — Joint structure and bone binding"]
NamClassification --> SamsthanaNam["Samsthana — Bodily symmetry and form"]
NamClassification --> VarnaNam["Varna — Body colour"]
NamClassification --> GandhaNam["Gandha — Body smell"]
NamClassification --> RasaNam["Rasa — Body taste"]
NamClassification --> SparshaNam["Sparsha — Body touch"]
NamClassification --> AnupurviNam["Anupurvi — Direction of rebirth movement"]
NamClassification --> VihayogatiNam["Vihayogati — Mode of movement"]
NamClassification --> TrasaNam["Trasa — Mobile body tendency"]
NamClassification --> SthavaraNam["Sthavara — Immobile body tendency"]
NamClassification --> BadaraNam["Badara — Gross body tendency"]
NamClassification --> SukshmaNam["Sukshma — Subtle body tendency"]
NamClassification --> ParyaptaNam["Paryapta — Fully developed faculties"]
NamClassification --> AparyaptaNam["Aparyapta — Underdeveloped faculties"]
NamClassification --> PratyekaNam["Pratyeka — Individual body"]
NamClassification --> SadharanaNam["Sadharana — Common body"]
NamClassification --> SthiraNam["Sthira — Firmness of body parts"]
NamClassification --> AsthiraNam["Asthira — Flexibility of body parts"]
NamClassification --> SubhaNam["Subha — Beautiful bodily formation"]
NamClassification --> AsubhaNam["Asubha — Unbeautiful bodily formation"]
NamClassification --> SubhagaNam["Subhaga — Pleasant or lovable"]
NamClassification --> DurbhagaNam["Durbhaga — Unpleasant or unlovable"]
NamClassification --> SusvaraNam["Susvara — Sweet voice"]
NamClassification --> DuhsvaraNam["Duhsvara — Harsh voice"]
NamClassification --> AdeyaNam["Adeya — Acceptable or authoritative speech"]
NamClassification --> AnadeyaNam["Anadeya — Unacceptable or unconvincing speech"]
NamClassification --> YashahkirtiNam["Yashahkirti — Honour and fame"]
NamClassification --> AyashahkirtiNam["Ayashahkirti — Dishonour and infamy"]

%% Major Nama body groupings
GatiNam --> DevaGatiNam["Deva gati — Celestial state determining"]
GatiNam --> ManushyaGatiNam["Manushya gati — Human state determining"]
GatiNam --> TiryagGatiNam["Tiryag gati — Animal state determining"]
GatiNam --> NarakaGatiNam["Naraka gati — Infernal state determining"]

JatiNam --> EkendriyaJati["Ekendriya — One-sensed birth"]
JatiNam --> DvindriyaJati["Dvindriya — Two-sensed birth"]
JatiNam --> TrindriyaJati["Trindriya — Three-sensed birth"]
JatiNam --> CaturindriyaJati["Caturindriya — Four-sensed birth"]
JatiNam --> PanchendriyaJati["Panchendriya — Five-sensed birth"]

ShariraNam --> AudarikaSharira["Audarika sharira — Gross physical body"]
ShariraNam --> VaikriyaSharira["Vaikriya sharira — Transformable body"]
ShariraNam --> AharakaSharira["Aharaka sharira — Projected body"]
ShariraNam --> TaijasaSharira["Taijasa sharira — Fiery or luminous body"]
ShariraNam --> KarmanaSharira["Karmana sharira — Karmic body"]

AngopangaNam --> AudarikaAngopanga["Audarika angopanga — Gross body parts"]
AngopangaNam --> VaikriyaAngopanga["Vaikriya angopanga — Transformable body parts"]
AngopangaNam --> AharakaAngopanga["Aharaka angopanga — Projected body parts"]

SamhananaNam --> VajraRsabhanaraca["Vajra-rsabhanaraca — Highest bone binding"]
SamhananaNam --> Rsabhanaraca["Rsabhanaraca — Strong binding"]
SamhananaNam --> Naraca["Naraca — Moderate binding"]
SamhananaNam --> ArdhNaraca["Ardha-naraca — Partial binding"]
SamhananaNam --> Kilika["Kilika — Weak binding"]
SamhananaNam --> Sevartta["Sevartta — Very weak binding"]

SamsthanaNam --> Samacaturasra["Samacaturasra — Symmetrical body"]
SamsthanaNam --> Nyagrodhaparimandala["Nyagrodhaparimandala — Upper body symmetry"]
SamsthanaNam --> Sadi["Sadi — Lower body symmetry"]
SamsthanaNam --> Kubja["Kubja — Hunchbacked form"]
SamsthanaNam --> Vamana["Vamana — Dwarf-like form"]
SamsthanaNam --> Hunda["Hunda — Deformed form"]

VarnaNam --> KrishnaVarna["Krishna — Black body colour"]
VarnaNam --> NilaVarna["Nila — Blue body colour"]
VarnaNam --> LohitaVarna["Lohita — Red body colour"]
VarnaNam --> HaritaVarna["Harita — Yellow body colour"]
VarnaNam --> SuklaVarna["Sukla — White body colour"]

GandhaNam --> SurabhiGandha["Surabhi — Pleasant smell"]
GandhaNam --> DurabhiGandha["Durabhi — Unpleasant smell"]

RasaNam --> TiktaRasa["Tikta — Bitter body taste"]
RasaNam --> KatuRasa["Katu — Pungent body taste"]
RasaNam --> KasayaRasa["Kasaya — Astringent body taste"]
RasaNam --> AmlaRasa["Amla — Sour body taste"]
RasaNam --> MadhuraRasa["Madhura — Sweet body taste"]

SparshaNam --> GuruSparsha["Guru — Heavy touch"]
SparshaNam --> LaghuSparsha["Laghu — Light touch"]
SparshaNam --> MriduSparsha["Mridu — Soft touch"]
SparshaNam --> KathorSparsha["Kathor — Hard touch"]
SparshaNam --> SnigdhaSparsha["Snigdha — Smooth touch"]
SparshaNam --> RukshaSparsha["Ruksha — Rough touch"]
SparshaNam --> SheetaSparsha["Sheeta — Cold touch"]
SparshaNam --> UshnaSparsha["Ushna — Hot touch"]

AnupurviNam --> DevaAnupurvi["Deva anupurvi — Direction toward celestial birth"]
AnupurviNam --> ManushyaAnupurvi["Manushya anupurvi — Direction toward human birth"]
AnupurviNam --> TiryanchAnupurvi["Tiryanch anupurvi — Direction toward animal birth"]
AnupurviNam --> NarakaAnupurvi["Naraka anupurvi — Direction toward infernal birth"]

VihayogatiNam --> PrasastaVihayogati["Prasasta vihayogati — Pleasant movement"]
VihayogatiNam --> AprasastaVihayogati["Aprasasta vihayogati — Unpleasant movement"]

TrasaNam --> TrasaFully["Trasa — Mobile beings and mobility"]
SthavaraNam --> SthavaraFully["Sthavara — Immobile beings and stillness"]
BadaraNam --> BadaraFully["Badara — Gross body development"]
SukshmaNam --> SukshmaFully["Sukshma — Minute body development"]
ParyaptaNam --> ParyaptaFully["Paryapta — Complete bodily development"]
AparyaptaNam --> AparyaptaFully["Aparyapta — Incomplete bodily development"]
PratyekaNam --> PratyekaFully["Pratyeka — Individual embodiment"]
SadharanaNam --> SadharanaFully["Sadharana — Shared embodiment"]
SthiraNam --> SthiraFully["Sthira — Stability of organs"]
AsthiraNam --> AsthiraFully["Asthira — Flexibility of organs"]
SubhaNam --> SubhaFully["Subha — Beautiful features"]
AsubhaNam --> AsubhaFully["Asubha — Unbeautiful features"]
SubhagaNam --> SubhagaFully["Subhaga — Pleasing or fortunate"]
DurbhagaNam --> DurbhagaFully["Durbhaga — Unpleasing or unfortunate"]
SusvaraNam --> SusvaraFully["Susvara — Pleasant speech"]
DuhsvaraNam --> DuhsvaraFully["Duhsvara — Harsh speech"]
AdeyaNam --> AdeyaFully["Adeya — Acceptable or convincing"]
AnadeyaNam --> AnadeyaFully["Anadeya — Unacceptable or unconvincing"]
YashahkirtiNam --> YashahkirtiFully["Yashahkirti — Fame and honour"]
AyashahkirtiNam --> AyashahkirtiFully["Ayashahkirti — Shame and dishonour"]

%% =========================
%% STYLING: ONLY CLASSIFICATION NODES GREY
%% =========================

style SthavarSize fill:#ddd,stroke:#333
style PranaClassification fill:#ddd,stroke:#333
style GatiClassification fill:#ddd,stroke:#333
style PudgalQualityClassification fill:#ddd,stroke:#333
style AharMethodology fill:#ddd,stroke:#333
style KavalAharClassification fill:#ddd,stroke:#333
style StateClassification fill:#ddd,stroke:#333
style StructureClassification fill:#ddd,stroke:#333
style TouchBasedClassification fill:#ddd,stroke:#333
style FunctionClassification fill:#ddd,stroke:#333
style JnanavarniyaClassification fill:#ddd,stroke:#333
style DarshanavarniyaClassification fill:#ddd,stroke:#333
style MohaniyaClassification fill:#ddd,stroke:#333
style DarshanaMohaniyaClassification fill:#ddd,stroke:#333
style CharitraMohaniyaClassification fill:#ddd,stroke:#333
style KashayaClassification fill:#ddd,stroke:#333
style NokashayaClassification fill:#ddd,stroke:#333
style AntarayClassification fill:#ddd,stroke:#333
style VedniyaClassification fill:#ddd,stroke:#333
style AyushyaClassification fill:#ddd,stroke:#333
style GotraClassification fill:#ddd,stroke:#333
style NamClassification fill:#ddd,stroke:#333
```
