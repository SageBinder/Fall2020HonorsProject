lexer grammar ProofLexer;

RULE : 'DC' ; // TODO



LIST_DELIM : ',' ;

LINE_DELIM : ';' ;

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
  : [∨|∥]
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

// Proof syntax:
ASSUME : 'assume' ;

PREMISES : 'premises' ;

// Brackets:
R_PBRACKET : ')' ;
L_PBRACKET : '(' ;

R_SBRACKET : ']' ;
L_SBRACKET : '[' ;

R_CBRACKET : '}' ;
L_CBRACKET : '{' ;

// Variables:
IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]* ;

// Misc:
NUMBER : [0-9]+ ;

// Ignore hitespace:
UNICODE_WS : [\p{White_Space}] -> skip;