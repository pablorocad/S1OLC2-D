lexer grammar ChemsLexer;


// Tokens

CONSOLE:  'console';
LOG:      'log';
P_NUMBER:   'number';
P_STRING:   'string';
P_IF:       'if';
P_WHILE:       'while';

NUMBER: [0-9]+;
STRING: '"'~["]*'"';
ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

PUNTO:          '.';
PTCOMA:         ';';
DIFERENTE:      '!';
IGUAL:          '=';
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

