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
  : lbracket exp=sentence rbracket          # BracketedExpression
  | op=rightOp exp=sentence                 # RightOpExpression
  | exp1=sentence op=binaryOp exp2=sentence # BinaryOpExpression
  | boolVar                                 # BoolVarExpresion
  | predicate                               # PredicateExpression
  ;

logicRule : RULE ;

premise : sentence LINE_DELIM ;

conclusion : sentence LINE_DELIM logicRule LINE_DELIM ;

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