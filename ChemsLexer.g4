lexer grammar ChemsLexer;


// Tokens

CONSOLE:  'console';
LOG:      'log';

NUMBER: [0-9]+;
STRING: '"'~["]*'"';

PUNTO:          '.';
PTCOMA:         ';';
DIFERENTE:      '!';
MAYORIGUAL:     '>=';
MENORIGUAL:     '<=';
MAYOR:          '>';
MENOR:          '<';
MUL:            '*';
DIV:            '/';
ADD:            '+';
SUB:            '-';
PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';


WHITESPACE: [ \\\r\n\t]+ -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

