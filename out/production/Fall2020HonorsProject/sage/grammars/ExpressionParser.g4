parser grammar ExpressionParser;
options { tokenVocab=ExpressionLexer; }

@header {
import sage.java.nodes.base.Node;
}

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

quant : (LBRACKET quantToken=(U_QUANT | E_QUANT) LBRACKET variables+=IDENTIFIER (LIST_DELIM variables+=IDENTIFIER)* RBRACKET RBRACKET);

boolVar : IDENTIFIER ;

predicate : predicateName=IDENTIFIER LBRACKET predicateVars+=IDENTIFIER (LIST_DELIM predicateVars+=IDENTIFIER)* RBRACKET ;

e
  locals [
  Node node
  ]

  : LBRACKET exp=e RBRACKET   # BracketedExpression
  | op=rightOp exp=e          # RightOpExpression
  | exp1=e op=binaryOp exp2=e # BinaryOpExpression
  | boolVar                   # BoolVarExpresion
  | predicate                 # PredicateExpression
  ;