public class NodeArithmetic implements Node{
	private Node left;
	private Node right;
	private MyEnumType type;
	private String t;


	public NodeArithmetic(MyEnumType type, Node left, Node right, String t){
		this.type = type;
		this.left = left;
		this.right = right;
		this.t = t;

	}

	public String getT(){
		return this.t;
	}
	
	public String getValue()
	{
		return "t0";
	}
	public void lolString()
	{
		
	}

	public String GetTac(){
		return "salut";
	}
	//build TAC, and return temporary variable name

}
