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

//Number = "-"?[[:digit:]]+(\.[[:digit:]]+)?([Ee][+-]?[[:digit:]]+)?
Number = [[:digit:]]+(\.[[:digit:]]+)?([Ee][+-]?[[:digit:]]+)?
Comment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"

%%

/* -------------------------------------------------
        Operateurs
   ------------------------------------------------- */

// arithmetic
"+"	{ return new Symbol(CalculetteSymbol.PLUS, yyline, yycolumn); }
"-"	{ return new Symbol(CalculetteSymbol.MINUS, yyline, yycolumn); }
"*"	{ return new Symbol(CalculetteSymbol.TIMES, yyline, yycolumn); }
"/"	{ return new Symbol(CalculetteSymbol.DIVIDE, yyline, yycolumn); }
"("	{ return new Symbol(CalculetteSymbol.LPAR, yyline, yycolumn); }
")"	{ return new Symbol(CalculetteSymbol.RPAR, yyline, yycolumn); }

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
"->"	{ return new Symbol(CalculetteSymbol.IMPLY, yyline, yycolumn); }
"<->"	{ return new Symbol(CalculetteSymbol.EQUI, yyline, yycolumn); }
"T"	{ return new Symbol(CalculetteSymbol.T, yyline, yycolumn); }
"F"	{ return new Symbol(CalculetteSymbol.F, yyline, yycolumn); }

";"      { return new Symbol(CalculetteSymbol.SEMIC, yyline, yycolumn); }


/* -------------------------------------------------
        Nombres
   ------------------------------------------------- */
{Number}     { return new Symbol(CalculetteSymbol.NUMBER, yyline, yycolumn, new Float(yytext())); }

/* -------------------------------------------------
        Commentaires - Caracteres non pris en compte
   ------------------------------------------------- */
{Comment} {}

/* -------------------------------------------------
   ------------------------------------------------- */
.|\n {}

//========================================================================
// VERSION DEBOGGAGE
//========================================================================
/*
/* -------------------------------------------------
        Operateurs
   ------------------------------------------------- */
"+"    { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
"-"    {System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
"*"      { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
"/"      { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
"("      { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
")"      { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }
";"      { System.err.println(yytext() +  ":" + yyline + "," + yycolumn); }

/* -------------------------------------------------
        Nombres
   ------------------------------------------------- */
{Number}     { System.err.println(yytext() + ":" + yyline + "," + yycolumn); }

/* -------------------------------------------------
        Commentaires - Caracteres non pris en compte
   ------------------------------------------------- */
{Comment} {}

/* -------------------------------------------------
   ------------------------------------------------- */
.|\n {}
*/
