public class NodeError implements Node{
	private String name;
	private int line;
	private int column;
	private EnumTac type;


	public NodeError(EnumTac type, String name, int line, int column){
		this.type = type;
		this.name = name;
		this.line = line;
		this.column = column;
	}

    public String getValue()
	{
		return "t"+Tree.numVar;
	}

    public String GetTac(){
    	//Tac tac;
    	if(this.type == EnumTac.VAR_ALREADY_DEF){
			Tac tac1 = new Tac(name, line+"", column+"", null, EnumTac.VAR_ALREADY_DEF);
			Tree.tac.add(tac1);


		}

		else{
			Tac tac2 = new Tac(name, line+"", column+"", null, EnumTac.VAR_UNDECLARED);
			Tree.tac.add(tac2);
			}
		
		
		
		
		return "error";
	}
	//build TAC, and return temporary variable name

}
