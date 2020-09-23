parser grammar ExpressionParser;
options { tokenVocab=ExpressionLexer; }

binaryOp
  : AND
  | NAND
  | OR
  | IF
  | IFF
  ;

uQuant : LBRACKET U_QUANT LBRACKET (IDENTIFIER LIST_DELIM?)* RBRACKET RBRACKET ;

eQuant : LBRACKET E_QUANT LBRACKET (IDENTIFIER LIST_DELIM?)* RBRACKET RBRACKET ;

quant
  : uQuant
  | eQuant
  ;

rightOp
  : NOT
  | quant
  ;

boolVar : IDENTIFIER ;

predicate : IDENTIFIER LBRACKET (IDENTIFIER LIST_DELIM?)* RBRACKET ;

e
  : LBRACKET e RBRACKET
  | e binaryOp e
  | rightOp e
  | boolVar
  | predicate
  ;