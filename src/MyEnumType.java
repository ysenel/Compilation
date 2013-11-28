
public enum MyEnumType {
	// types simples
	CHARACTER("CHARACTER"), INTEGER("INTEGER"), UINTEGER("UINTEGER"), BIGINTEGER("BIGINTEGER"), UBIGINTEGER("UBIGINTEGER"), 
	STRING("STRING"), BOOLEAN("BOOLEAN"), REAL("REAL"), 
	ARROW("ARROW"), ARRAY("ARRAY"), ENUM("ENUM"), INTERVALS("INTERVALS"), 	
	PLUS("+"), MINUS("-"), DIVIDE("/"), TIMES("*"), 
	FALSE("FALSE"), TRUE("TRUE"), NOT("!"), EQUAL_INF("=<"), EQUAL_SUP("=>"), SUP(">"), INF("<"),
	EQUAL_NOT("!="), EQUAL("=="), OR("\\/"), AND("/\\"),

	ALLOC("ALLOC"),

	ERROR("OUPS!");

	private final String tag;

	MyEnumType(String tag){
		this.tag = tag;
	}   

	public String toString(){
		return tag;
	} 
}
