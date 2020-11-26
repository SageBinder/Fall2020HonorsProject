lexer grammar ProofLexer;

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
  | '<>'
  ;

// Constants:
TAUTOLOGY
  : '⊤'
  | 'true'
  ;

CONTRADICTION
 : '⊥'
 | 'false'
 ;

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

RULE_START : '#' -> mode(RULE_MODE) ;

// Variables:
IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]* ;

// Ignore hitespace:
UNICODE_WS : [\p{White_Space}] -> skip;

mode RULE_MODE ;

CONJ_INTRO : AND 'I' ;
CONJ_ELIM : AND 'E' ;

DISJ_INTRO : OR 'I' ;
DISJ_ELIM : OR 'E' ;

COND_INTRO : IF 'I' ;
COND_ELIM : IF 'E' ;

BICOND_INTRO : IFF 'I' ;
BICOND_ELIM : IFF 'E' ;

NEG_INTRO : NOT 'I' ;
NEG_ELIM : NOT 'E' ;

U_INTRO : U_QUANT 'I' ;
U_ELIM : U_QUANT 'E' ;

E_INTRO : E_QUANT 'I' ;
E_ELIM : E_QUANT 'E' ;

AC : 'AC' ;
RD : 'RD' ;
W : 'W' ;
DC : 'DC' ;
CD : 'CD' ;
DM : 'DM' ;
CP : 'CP' ;
C : 'C' ;
R : 'R' ;
TC : 'TC' ;

NUMBER : [0-9]+ ;

RULE_LIST_DELIM : LIST_DELIM -> type(LIST_DELIM) ;

RULE_END : LINE_DELIM -> mode(DEFAULT_MODE) ;

// Ignore hitespace:
RULE_UNICODE_WS : UNICODE_WS -> skip;