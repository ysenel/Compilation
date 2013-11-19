import java_cup.runtime.Symbol;

%%
%class CalculetteLexer
%line
%column
%cupsym CalculetteSymbol
%cup

%{
/*
private Symbol symbol(int type, Object value) {
	return new Symbol(type, yyline, yycolumn, value);
}
*/
%}

Number = [[:digit:]]+(\.[[:digit:]]+)?([Ee][+-]?[[:digit:]]+)?
Strings = [a-zA-Z]+


%%

/* -------------------------------------------------
        Operateurs
   ------------------------------------------------- */

// arithmetic
"+"	{ return new Symbol(CalculetteSymbol.PLUS, yyline, yycolumn); }
"-"	{ return new Symbol(CalculetteSymbol.MINUS, yyline, yycolumn); }
"*"	{ return new Symbol(CalculetteSymbol.TIMES, yyline, yycolumn); }
"/"	{ return new Symbol(CalculetteSymbol.DIVIDE, yyline, yycolumn); }
"=" { return new Symbol(CalculetteSymbol.EQ, yyline, yycolumn); }


// logic
"!"	{ return new Symbol(CalculetteSymbol.NOT, yyline, yycolumn); }
"&"	{ return new Symbol(CalculetteSymbol.AND, yyline, yycolumn); }
"|"	{ return new Symbol(CalculetteSymbol.OR, yyline, yycolumn); }
"=="	{ return new Symbol(CalculetteSymbol.EQUAL, yyline, yycolumn); }
"!="	{ return new Symbol(CalculetteSymbol.EQUAL_NOT, yyline, yycolumn); }
"<="	{ return new Symbol(CalculetteSymbol.EQUAL_INF, yyline, yycolumn); }
">="	{ return new Symbol(CalculetteSymbol.EQUAL_SUP, yyline, yycolumn); }
">"	{ return new Symbol(CalculetteSymbol.SUP, yyline, yycolumn); }
"<"	{ return new Symbol(CalculetteSymbol.INF, yyline, yycolumn); }
"T"	{ return new Symbol(CalculetteSymbol.TRUE, yyline, yycolumn); }
"F"	{ return new Symbol(CalculetteSymbol.FALSE, yyline, yycolumn); }

// Symbol
"[" { return new Symbol(CalculetteSymbol.LBRACKET, yyline, yycolumn); }
"]" { return new Symbol(CalculetteSymbol.RBRACKET, yyline, yycolumn); }
".." { return new Symbol(CalculetteSymbol.DOTDOT, yyline, yycolumn); }
"," { return new Symbol(CalculetteSymbol.COMA, yyline, yycolumn); }
"(" { return new Symbol(CalculetteSymbol.LPAR, yyline, yycolumn); }
")" { return new Symbol(CalculetteSymbol.RPAR, yyline, yycolumn); }
";"      { return new Symbol(CalculetteSymbol.SEMIC, yyline, yycolumn); }
"\"" { return new Symbol(CalculetteSymbol.QUOTE, yyline, yycolumn); }
"{" { return new Symbol(CalculetteSymbol.LBRACE, yyline, yycolumn); }
"}" { return new Symbol(CalculetteSymbol.RBRACE, yyline, yycolumn); }

// simple type
"Integer" { return new Symbol(CalculetteSymbol.INTEGER, yyline, yycolumn); }
"BigInteger" { return new Symbol(CalculetteSymbol.BIGINTEGER, yyline, yycolumn); }
"UnsignedInteger" { return new Symbol(CalculetteSymbol.UINTEGER, yyline, yycolumn); }
"UnsignedBigInteger" { return new Symbol(CalculetteSymbol.UBIGINTEGER, yyline, yycolumn); }
"Boolean" { return new Symbol(CalculetteSymbol.BOOL, yyline, yycolumn); }
"Character" { return new Symbol(CalculetteSymbol.CHAR, yyline, yycolumn); }
"Real" { return new Symbol(CalculetteSymbol.REAL, yyline, yycolumn); }
"Enumeration" { return new Symbol(CalculetteSymbol.ENUM, yyline, yycolumn); }

// complex type
"->"  { return new Symbol(CalculetteSymbol.ARROW, yyline, yycolumn); }
"String" { return new Symbol(CalculetteSymbol.STRING, yyline, yycolumn); }

// LOOP
"SWITCH" { return new Symbol(CalculetteSymbol.SWITCH, yyline, yycolumn); }
"CASE" { return new Symbol(CalculetteSymbol.CASE, yyline, yycolumn); } 
"END_SWITCH" { return new Symbol(CalculetteSymbol.END_SWITCH, yyline, yycolumn); }
"WHILE" { return new Symbol(CalculetteSymbol.WHILE, yyline, yycolumn); }
"DO" { return new Symbol(CalculetteSymbol.DO, yyline, yycolumn); }
"OD" { return new Symbol(CalculetteSymbol.OD, yyline, yycolumn); }

// comments


/* -------------------------------------------------
        Nombres
   ------------------------------------------------- */
{Number}     { return new Symbol(CalculetteSymbol.NUMBER, yyline, yycolumn, new Float(yytext())); }

//strings
{Strings} { return new Symbol(CalculetteSymbol.STRINGCONTENT, yyline, yycolumn); }


/* -------------------------------------------------
   ------------------------------------------------- */
.|\n {}


