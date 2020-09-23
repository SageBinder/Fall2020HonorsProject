parser grammar ExpressionParser;
options { tokenVocab=ExpressionLexer; }

binaryOp
  : AND
  | NAND
  | OR
  | IF
  | IFF
  ;

uQuant : LBRACKET U_QUANT LBRACKET (IDENTIFIER) RBRACKET RBRACKET ;

eQuant : LBRACKET E_QUANT LBRACKET (IDENTIFIER) RBRACKET RBRACKET ;

quant
  : uQuant
  | eQuant
  ;

rightOp
  : NOT
  | quant
  ;

boolVar : IDENTIFIER ;

predicate : IDENTIFIER LBRACKET (IDENTIFIER ','?)* RBRACKET ;

e
  : LBRACKET e RBRACKET
  | e binaryOp e
  | rightOp e
  | boolVar
  | predicate
  ;