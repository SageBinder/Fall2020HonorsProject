parser grammar ProofParser;
options { tokenVocab=ProofLexer; }

@header {
import sage.java.nodes.base.Node;
import sage.java.proof.Proof;
}

lbracket : L_PBRACKET | L_SBRACKET | L_CBRACKET ;
rbracket : R_PBRACKET | R_SBRACKET | R_CBRACKET ;

binaryOp
  : AND  # AND
  | NAND # NAND
  | OR   # OR
  | IF   # IF
  | IFF  # IFF
  ;

rightOp
  : opToken=NOT           # NOT
  | quantExpression=quant # QUANTIFIER
  ;

quant : (lbracket quantToken=(U_QUANT | E_QUANT) L_PBRACKET variables+=IDENTIFIER (LIST_DELIM variables+=IDENTIFIER)* R_PBRACKET rbracket);

boolVar : IDENTIFIER ;

predicate : predicateName=IDENTIFIER L_PBRACKET predicateVars+=IDENTIFIER (LIST_DELIM predicateVars+=IDENTIFIER)* R_PBRACKET ;

sentence
  locals [
  Node node
  ]
  : lbracket sentence rbracket                     # BracketedExpression
  | rightOp sentence                               # RightOpExpression
  | sentence1=sentence binaryOp sentence2=sentence # BinaryOpExpression
  | boolVar                                        # BoolVarExpression
  | predicate                                      # PredicateExpression
  ;

ruleType
  : token=CONJ_INTRO
  | token=CONJ_ELIM
  | token=DISJ_INTRO
  | token=DISJ_ELIM
  | token=COND_INTRO
  | token=COND_ELIM
  | token=BICOND_INTRO
  | token=BICOND_ELIM
  | token=NEG_INTRO
  | token=NEG_ELIM
  | token=U_INTRO
  | token=U_ELIM
  | token=E_INTRO
  | token=E_ELIM
  | token=AC
  | token=RD
  | token=W
  | token=DC
  | token=CD
  | token=DM
  | token=CP
  | token=C
  | token=R
  | token=TC
  ;

ruleExpression : ruleType (LIST_DELIM lineNumbers+=NUMBER)* ; // If this rule is named "rule", the generated ProofParser.java breaks

premise : sentence LINE_DELIM ;

conclusion : sentence RULE_START ruleExpression RULE_END ;

proofConstruct
  locals [
  Proof proofNode
  ]
  :
  L_SBRACKET
    (premise)+
  R_SBRACKET L_CBRACKET
    (conclusion | assumption)+
  R_CBRACKET
  ;

assumption : ASSUME proofConstruct ;

proof : PREMISES proofConstruct ;