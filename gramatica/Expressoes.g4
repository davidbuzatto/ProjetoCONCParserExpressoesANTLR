/**
 * Gramática da linguagem de expressões.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */
grammar Expressoes;

programa  : expressao EOF ;
expressao : termo ( ( ADI | SUB ) termo )* ;
termo     : fator ( ( MUL | DIV | MOD | ) fator )* ;
fator     : INT               # fatorInt
          | DEC               # fatorDec
          | '(' expressao ')' # fatorParenteses
          ;

ADI  : '+' ;
SUB  : '-' ;
MUL  : '*' ;
DIV  : '/' ;
MOD  : '%' ;

fragment
DIG : [0-9] ;
INT : DIG+ ;
DEC : DIG+ '.' DIG+ ;
WS  : [ \t\r\n]+ -> skip ;