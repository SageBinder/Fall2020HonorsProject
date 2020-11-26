package sage.java.proof;

import sage.java.antlrparser.ProofParser;

public enum RuleType {
    CONJ_INTRO,    // Conjunction introduction
    CONJ_ELIM,     // Conjunction elimination

    DISJ_INTRO,    // Disjunction introduction
    DISJ_ELIM,     // Disjunction elimination

    COND_INTRO,    // Conditional introduction
    COND_ELIM,     // Conditional elimination

    BICOND_INTRO,  // Biconditional introduction
    BICOND_ELIM,   // Biconditional elimination

    NEG_INTRO,     // Negation introduction
    NEG_ELIM,      // Negation elimination

    U_INTRO,
    U_ELIM,

    E_INTRO,
    E_ELIM,

    AC,            // Argument by cases

    RD,            // Reductio ad absurdum

    W,             // Weakening

    DC,            // Denying the consequent

    CD,            // Contradiction

    DM,            // DeMorgan rule

    CP,            // Contraposition

    C,             // Conditional rule

    R,             // Reiteration

    TC;            // TautCon

    public static RuleType fromRuleCtx(ProofParser.RuleExpressionContext ctx) {
        return switch(ctx.ruleType().token.getType()) {
            case ProofParser.CONJ_INTRO: yield CONJ_INTRO;
            case ProofParser.CONJ_ELIM: yield CONJ_ELIM;
            case ProofParser.DISJ_INTRO: yield DISJ_INTRO;
            case ProofParser.DISJ_ELIM: yield DISJ_ELIM;
            case ProofParser.COND_INTRO: yield COND_INTRO;
            case ProofParser.COND_ELIM: yield COND_ELIM;
            case ProofParser.BICOND_INTRO: yield BICOND_INTRO;
            case ProofParser.BICOND_ELIM: yield BICOND_ELIM;
            case ProofParser.NEG_INTRO: yield NEG_INTRO;
            case ProofParser.NEG_ELIM: yield NEG_ELIM;
            case ProofParser.U_INTRO: yield U_INTRO;
            case ProofParser.U_ELIM: yield U_ELIM;
            case ProofParser.E_INTRO: yield E_INTRO;
            case ProofParser.E_ELIM: yield E_ELIM;
            case ProofParser.AC: yield AC;
            case ProofParser.RD: yield RD;
            case ProofParser.W: yield W;
            case ProofParser.DC: yield DC;
            case ProofParser.CD: yield CD;
            case ProofParser.DM: yield DM;
            case ProofParser.CP: yield CP;
            case ProofParser.C: yield C;
            case ProofParser.R: yield R;
            case ProofParser.TC: yield TC;
            default: throw new BadRuleTypeException(ctx);
        };
    }
}
