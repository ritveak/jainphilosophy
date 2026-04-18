# Reasoning Module

This package holds the project's early reasoning model for Jain multi-perspective thought.

## What This Covers

- `assertion/` contains the structured claim model.
- `NayaKind` defines the classical naya taxonomy used by strategies.
- `SyadvadaReasoner` builds qualified statements from an assertion.
- `SyadStatement` pairs a structured assertion with a `SyadMode`.
- `AnekantavadaReasoner` collects multiple viewpoint-based interpretations.
- `NayaStrategy` is the extension point for standpoint-specific readings.

## What An Assertion Is

In this project, an assertion is not just a plain sentence. It is a doctrinal claim with context.

`Assertion` contains:

- `subject`: what the claim is about
- `claim`: the actual statement being made
- `perspective`: the standpoint or naya-like angle
- `condition`: the condition under which the claim is being made
- `sourceReference`: a lightweight source/citation slot

This is the project's first step toward the rule described in the docs:

- avoid unconditional binary facts
- prefer qualified, explainable, perspective-aware claims

## Package Location

Structured assertion types now live in:

- `com.jain.core.reasoning.assertion.Assertion`
- `com.jain.core.reasoning.assertion.Perspective`
- `com.jain.core.reasoning.assertion.Condition`
- `com.jain.core.reasoning.assertion.SourceReference`

They sit inside `reasoning` because they are the base representation that syadvada and naya-based interpretation work on.

## What Nayavada Means Here

`Nayavada` is modeled here as standpoint-based interpretation.

The key idea is:

- one object or claim can be read through different partial standpoints
- each standpoint reveals something legitimate but incomplete
- multiple interpretations can coexist without forcing a single absolute sentence

In the current codebase, this is represented by:

- `NayaKind`: doctrinal identity of the standpoint
- `NayaStrategy<T>`: typed strategy for producing one interpretation
- `Interpretation`: one result containing a `Perspective` and an `Assertion`
- `AnekantavadaReasoner`: collector that applies many `NayaStrategy` instances

### Current Naya Taxonomy

The `NayaKind` enum currently includes the 7 classical standpoints:

- `NAIGAM`
- `SANGRAH`
- `VYAVAHAR`
- `RJUSUTRA`
- `SHABD`
- `SAMABHIRUDH`
- `EVAMBHOOT`

### What `NayaStrategy` Does

`NayaStrategy` is now intentionally small but clearer than before.

It provides:

- `kind()`: which doctrinal naya the strategy represents
- `perspective()`: default named perspective derived from that naya
- `interpret(T target)`: how that standpoint reads the target

This is still not a full Nayavada engine. It does not yet ship with built-in doctrinal strategies or conflict-resolution rules.

## What Syadvada Means Here

`Syadvada` is modeled here as qualified assertion logic.

Instead of saying:

- "the soul is bound"

the code tries to say:

- from one standpoint, it is
- from another standpoint, it is not
- across changing states, it is and is not

That is why `SyadStatement` wraps:

- a structured `Assertion`
- a `SyadMode`

Nayavada and Syadvada are related here, but they are not the same thing:

- Nayavada asks: from which standpoint is this being described?
- Syadvada asks: in what qualified way can this claim be said?

## Current Scope

The code already includes all 7 classical `SyadMode` enum values.

The code also includes the 7 classical `NayaKind` values.

The current `SyadvadaReasoner` implementation is still intentionally small:

- it accepts either a raw string or an `Assertion`
- it currently emits 3 illustrative outputs
- it is not yet a full doctrinal `saptabhangi` evaluator

The current Nayavada support is also intentionally early:

- `NayaStrategy` is a framework hook, not a finished doctrinal library
- there are no built-in concrete naya strategy classes yet
- `AnekantavadaReasoner` currently just aggregates strategy outputs
- viewpoint conflict analysis is not implemented yet

So this package should be seen as a clean foundation, not a finished reasoning engine.

## How To Use It

### 1. Quick usage with a plain string

```java
JainPhilosophyEngine engine = new JainPhilosophyEngine();
List<SyadStatement> statements = engine.evaluateSyadvada("the soul is bound");
```

### 2. Better usage with a structured assertion

```java
import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.reasoning.assertion.Condition;
import com.jain.core.reasoning.assertion.Perspective;
import com.jain.core.reasoning.assertion.SourceReference;

Assertion assertion =
        new Assertion(
                "soul",
                "is bound by karma",
                new Perspective("VYAVAHARA", "Practical standpoint"),
                new Condition("while karmic influx and bondage are active"),
                new SourceReference("Working note", "Project reasoning prototype"));
```

Then evaluate it:

```java
List<SyadStatement> statements = engine.evaluateSyadvada(assertion);
```

### 3. Nayavada usage with a strategy

```java
import com.jain.core.reasoning.AnekantavadaReasoner;
import com.jain.core.reasoning.Interpretation;
import com.jain.core.reasoning.NayaKind;
import com.jain.core.reasoning.NayaStrategy;
import com.jain.core.reasoning.assertion.Assertion;
import com.jain.core.reasoning.assertion.Perspective;

NayaStrategy<Assertion> vyavaharaStrategy =
        new NayaStrategy<>() {
            @Override
            public NayaKind kind() {
                return NayaKind.VYAVAHAR;
            }

            @Override
            public Interpretation interpret(Assertion target) {
                Perspective perspective =
                        Perspective.of(kind(), "Practical standpoint focused on transactional reality");
                return new Interpretation(perspective, target.withPerspective(perspective));
            }
        };

AnekantavadaReasoner reasoner = new AnekantavadaReasoner();
List<Interpretation> interpretations = reasoner.perspectives(assertion, List.of(vyavaharaStrategy));
```

### 4. Reading the result

Each `SyadStatement` gives you:

- `assertion()`: the full structured claim
- `mode()`: the qualified syad mode
- `condition()`: convenience access to the condition text
- `claim()`: convenience access to the claim text

Each `Interpretation` gives you:

- `perspective()`: the explicit standpoint used
- `assertion()`: the resulting doctrinal claim
- `naya()`: convenience access to the perspective name
- `statement()`: convenience access to the human-readable statement

## Design Intent

This layout is meant to make future work easier:

- richer naya taxonomies
- concrete built-in naya strategies
- full saptabhangi output
- source-backed explanations
- conflict/compatibility analysis between standpoints
- reasoning APIs for educational tools

If you extend this package, prefer structured objects over raw strings whenever possible.
