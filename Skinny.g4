grammar Skinny;

@header {
package com.embeddedmicro.skinny.parser;
}

source       : (label | instruction |assignment| end)*;

label        : NAME ':' (end|EOF);

instruction  : NAME  NAME (',' NAME )* (end|EOF);
           

assignment   : '#define' NAME '=' NAME (end|EOF);

end          :  NL|COMMENT|BLOCK_COMMENT;


NAME:           [a-zA-Z0-9_]+;
BLOCK_COMMENT:  ('/*' .*? '*/');
COMMENT:        ('//' ~[\r\n]* ('\r'? '\n' | EOF));
NL:             ('\r'? '\n');
WS:             [ \t]+ -> skip;



// Last compiled Sunday 11th June 2017
