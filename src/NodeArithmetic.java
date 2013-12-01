public class NodeArithmetic implements Node{
	private Node left;
	private Node right;
	private MyEnumType type;


	public NodeArithmetic(MyEnumType type, Node left, Node right){
		this.type = type;
		this.left = left;
		this.right = right;
	}

    public String getValue()
	{
		return "t"+Tree.numVar;
	}

    public String GetTac(){
		String left = this.left.GetTac();
		String right  = this.right.GetTac();
		String val = getValue();

		Tree.numVar++;
		
		Tac tac = new Tac(type.toString(), left, right, val, EnumTac.CALC);
		Tree.tac.add(tac);
		
		
		return val;
	}
	//build TAC, and return temporary variable name

}
