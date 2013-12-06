public class Tac{

	private String op;
	private String add1;
	private String add2;
	private String add3;
	private EnumTac type;

	public Tac(String op, String add1, String add2, String add3, EnumTac type){
		this.op = op;
		this.add1 = add1;
		this.add2 = add2;
		this.add3 = add3;
		this.type = type;
	}

	public Tac(String op, String add1, String add2, String add3)
	{
		this(op, add1, add2, add3, EnumTac.VARIABLE);
	}

	public Tac(String op, EnumTac type)
	{
		this(op, null, null , null, type);
	}

	public String getAdd1(){
		return add1;
	}

	public String getAdd2(){
		return add2;
	}
	
	public String getAdd3(){
		return add3;
	}

	public String getOp(){
		return this.op;
	}

	public void setAddr2(String L1){
		add2 = L1;
	}

	public String toString(){
		switch(type){
			case VARIABLE : 
				return new String(this.op);

			case CALC :
				return add3 + " = "  + add1 + " " + op + " " + add2;

			case JMPCOND :
				return "if " + add1 + " jmp " + add2;

			case JMP :
				return "jmp " + add2;

			case LABEL :
				return add1;

			case VAR_ALREADY_DEF :
				return "!!!!!!! Variable " + "'" + op + "'" + " already defined at line : " + add1 + " and column : " + add2 + " !!!!!!!";

			case VAR_UNDECLARED :
				return "!!!!!!! Variable " + "'" + op + "'" + " undeclared at line : " + add1 + " and column : " + add2 + " !!!!!!!"; 
 

			default:
				return new String("non reconnu");				
		}
	}
}
