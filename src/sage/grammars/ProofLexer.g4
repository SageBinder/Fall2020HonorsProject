lexer grammar ProofLexer;

LIST_DELIM : ',' ;

LINE_DELIM : ';' ;

U_QUANT
  : '*'
  | '\u2200' // ∀
  ;

E_QUANT
  : '+'
  | '\u2203' // ∃
  ;

// Boolean operators:
NOT
  : [~!]
  | '\u02DC' // ˜
  | '\u00AC' // ¬
  ;

AND
  : '&'
  | '&&'
  | '.'
  | '\u2227' // ∧
  ;

NAND : '@' ;

OR
  : '|'
  | '||'
  | '\u2225' // ∥
  | '\u2228' // ∨
  ;

IF
  : '>'
  | '->'
  | '=>'
  | '\u2192' // →
  | '\u2283' // ⊃
  | '\u21D2' // ⇒
  ;

IFF
  : '='
  | '=='
  | '<=>'
  | '<->'
  | '<>'
  | '\u2261' // ≡
  | '\u2194' // ↔
  | '\u21D4' // ⇔
  ;

// Constants:
TAUTOLOGY
  : '\u22A4' // ⊤
  | 'true'
  ;

CONTRADICTION
 : '\u22A5' // ⊥
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