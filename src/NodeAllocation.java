public class NodeAllocation implements Node{
	private Tree tree;
	private Node value;
	private String name;
	private MyEnumType type;


	public NodeAllocation(String var, MyEnumType type, Node value, Tree tree){
		this.name = var;
		this.type = type;
		this.value = value;
		this.tree = tree;
	}

	//build TAC, and return var name
	public String GetTac(){
		String t = new String("u" + name);
		Tac tac = new Tac(type.toString(), t, value.GetTac(), null);
		tree.tac.add(tac);
		return t;
	}
	public void lolString(){

	}
	public String getValue(){
		return "phony";
	}
	public String getT(){
		return "phony";
	}

}
