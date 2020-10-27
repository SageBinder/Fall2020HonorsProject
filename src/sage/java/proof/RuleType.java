package sage.java.proof;

public enum RuleType {
    CONJ_INTRO,    // Conjunction introduction
    CONJ_ELIM,     // Conjunection elimination

    DISJ_INTRO,    // Disjunction introduction
    DISJ_ELIM,     // Disjunction elimination

    COND_INTRO,    // Conditional introduction
    COND_ELIM,     // Conditional elimination

    BICOND_INTRO,  // Biconditional introduction
    BICOND_ELIM,   // Biconditional elimination

    NEG_INTRO,     // Negation introduction
    NEG_ELIM,      // Negation elimination

    AC,            // Argument by cases

    RD,            // Reductio ad absurdum

    W,             // Weakening

    DC,            // Denying the consequent

    CD,            // Contradiction

    DM,            // DeMorgan rule

    CP,            // Contraposition

    C,             // Conditional rule

    R,             // Reiteration

    TC,            // TautCon
}
