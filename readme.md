## Vision

This project models core Jain philosophical concepts using Object-Oriented Design and clean system architecture.

As I learn Jainism, I will continuously extend this codebase to represent concepts such as Lok, Akash, Jeev, Pudgal, and their properties, relations, and behaviors.  
The goal is to build a reusable Java backend that can power educational UIs, visualization tools, and game-like learning experiences.

## Design Goals

- Extensible domain model that grows with learning
- Strong separation of concerns (Domain, Application, Infrastructure)
- Backward-compatible evolution of concepts and rules
- Explainable outputs for educational use
- Reusable APIs for future UI clients

## Architecture Principles

- Domain-first modeling of Jain concepts
- Interfaces and composition over rigid inheritance
- Testable business logic independent of frameworks
- Incremental adoption of design patterns where they fit naturally

## Planned Pattern Usage

This project will adopt design patterns pragmatically as complexity grows:

- Strategy for concept classification and explanation
- Factory/Builder for safe object creation
- Specification for doctrinal/rule composition
- Visitor for alternate output representations
- State for lifecycle-oriented simulations
- Observer/Event-driven hooks for UI and analytics integration

## Long-Term Outcome

A robust and evolving Java service that:
1. Encodes Jain concepts as a structured knowledge model
2. Supports learning-oriented simulations and explanations
4. Acts as a hands-on system design and OOP learning project

## Core Domain Visualization

```mermaid
graph TD
    subgraph Jati_Hierarchy
        E1[Ekendriya] --> S[Sthavar]
        E2[Dvindriya] --> T[Trasa]
        E3[Trindriya] --> T
        E4[Caturindriya] --> T
        E5[Panchendriya] --> T
    end

    subgraph Body_Size
        S --> BAD[Badar / Gross]
        S --> SUK[Sukshma / Subtle]
        T --> BAD
    end

    subgraph Prana_Mapping
        E1 --- P4[4 Pranas]
        E2 --- P6[6 Pranas]
        E3 --- P7[7 Pranas]
        E4 --- P8[8 Pranas]
        E5 --- P10[9 or 10 Pranas]
    end

    subgraph Sthavar_Subtypes
        S --> PR[Prithvi]
        S --> AP[Ap]
        S --> TE[Tejas]
        S --> VA[Vayu]
        S --> VN[Vanaspati]
        VN --> V_PRAT[Pratyeka / Individual]
        VN --> V_SADH[Sadharana / Shared]
    end

    subgraph Panchendriya_Classification
        E5 --> G_NARAK[Naraki]
        E5 --> G_TIRYANCH[Tiryanch]
        E5 --> G_MANUSHYA[Manushya]
        E5 --> G_DEV[Dev]
        
        E5 --> C_ASAINI[Asaini / Irrational]
        E5 --> C_SAINI[Saini / Rational]
    end
```