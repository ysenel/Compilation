import java_cup.runtime.Symbol;

%%
%class Lexer
%line
%column
%cupsym MySymbol
%cup

%{

private Symbol Symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value);
}

%}

Number = [[:digit:]]+(\.[[:digit:]]+)?([Ee][+-]?[[:digit:]]+)?
Strings = [a-zA-Z]+


%%

/* -------------------------------------------------
        Operateurs
   ------------------------------------------------- */

// arithmetic
"+"	{ return new Symbol(MySymbol.PLUS, yyline, yycolumn); }
"-"	{ return new Symbol(MySymbol.MINUS, yyline, yycolumn); }
"*"	{ return new Symbol(MySymbol.TIMES, yyline, yycolumn); }
"/"	{ return new Symbol(MySymbol.DIVIDE, yyline, yycolumn); }

// logic
"!"	{ return new Symbol(MySymbol.NOT, yyline, yycolumn); }
"&"	{ return new Symbol(MySymbol.AND, yyline, yycolumn); }
"|"	{ return new Symbol(MySymbol.OR, yyline, yycolumn); }
"=="	{ return new Symbol(MySymbol.EQUAL, yyline, yycolumn); }
"!="	{ return new Symbol(MySymbol.EQUAL_NOT, yyline, yycolumn); }
"<="	{ return new Symbol(MySymbol.EQUAL_INF, yyline, yycolumn); }
">="	{ return new Symbol(MySymbol.EQUAL_SUP, yyline, yycolumn); }
">"	{ return new Symbol(MySymbol.SUP, yyline, yycolumn); }
"<"	{ return new Symbol(MySymbol.INF, yyline, yycolumn); }
"T"	{ return new Symbol(MySymbol.TRUE, yyline, yycolumn, new String(yytext())); }
"F"	{ return new Symbol(MySymbol.FALSE, yyline, yycolumn, new String(yytext())); }

// Symbol
"=" { return new Symbol(MySymbol.EQ, yyline, yycolumn); }
"[" { return new Symbol(MySymbol.LBRACKET, yyline, yycolumn); }
"]" { return new Symbol(MySymbol.RBRACKET, yyline, yycolumn); }
".." { return new Symbol(MySymbol.DOTDOT, yyline, yycolumn); }
"," { return new Symbol(MySymbol.COMA, yyline, yycolumn); }
"(" { return new Symbol(MySymbol.LPAR, yyline, yycolumn); }
")" { return new Symbol(MySymbol.RPAR, yyline, yycolumn); }
";"      { return new Symbol(MySymbol.SEMIC, yyline, yycolumn); }
"\"" { return new Symbol(MySymbol.QUOTE, yyline, yycolumn); }
"{" { return new Symbol(MySymbol.LBRACE, yyline, yycolumn); }
"}" { return new Symbol(MySymbol.RBRACE, yyline, yycolumn); }

// simple type
"Integer" { return new Symbol(MySymbol.INTEGER, yyline, yycolumn); }
"BigInteger" { return new Symbol(MySymbol.BIGINTEGER, yyline, yycolumn); }
"UnsignedInteger" { return new Symbol(MySymbol.UINTEGER, yyline, yycolumn); }
"UnsignedBigInteger" { return new Symbol(MySymbol.UBIGINTEGER, yyline, yycolumn); }
"Boolean" { return new Symbol(MySymbol.BOOL, yyline, yycolumn); }
"Character" { return new Symbol(MySymbol.CHAR, yyline, yycolumn); }
"Real" { return new Symbol(MySymbol.REAL, yyline, yycolumn); }
"Enumeration" { return new Symbol(MySymbol.ENUM, yyline, yycolumn); }

// complex type
"->"  { return new Symbol(MySymbol.ARROW, yyline, yycolumn); }
"String" { return new Symbol(MySymbol.STRING, yyline, yycolumn); }

// LOOP
"SWITCH" { return new Symbol(MySymbol.SWITCH, yyline, yycolumn); }
"CASE" { return new Symbol(MySymbol.CASE, yyline, yycolumn); } 
"END_SWITCH" { return new Symbol(MySymbol.END_SWITCH, yyline, yycolumn); }
"WHILE" { return new Symbol(MySymbol.WHILE, yyline, yycolumn); }
"DO" { return new Symbol(MySymbol.DO, yyline, yycolumn); }
"OD" { return new Symbol(MySymbol.OD, yyline, yycolumn); }

// comments


/* -------------------------------------------------
        Nombres
   ------------------------------------------------- */
{Number}     { return new Symbol(MySymbol.NUMBER, yyline, yycolumn, new String(yytext())); }

//strings
{Strings} { return new Symbol(MySymbol.STRINGCONTENT, yyline, yycolumn, new String(yytext())); }


/* -------------------------------------------------
   ------------------------------------------------- */
.|\n {}


