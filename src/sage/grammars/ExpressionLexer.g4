lexer grammar ExpressionLexer;

LIST_DELIM : ',' ;

U_QUANT : [*∀] ;

E_QUANT : [+∃] ;

// Boolean operators:
NOT : [~˜!¬] ;

AND
  : [&∧]
  | '&&'
  ;

NAND : '.' ;

OR
  : [+∨|∥]
  | '||'
  ;

IF
  : [>⇒→⊃]
  | '->'
  | '=>'
  ;

IFF
  : [⇔↔≡=]
  | '=='
  | '<=>'
  | '<->'
  ;

// Constants:
TAUTOLOGY : [1⊤] ;

CONTRADICTION : [0⊥] ;

// Brackets:
RBRACKET : [)\]}] ;

LBRACKET : [([{] ;

// Variables:
IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]* ;

// Ignore hitespace:
UNICODE_WS : [\p{White_Space}] -> skip;