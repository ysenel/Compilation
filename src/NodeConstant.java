public class NodeConstant implements Node{
	private String value;
	private MyEnumType type;


	public NodeConstant(String s, MyEnumType type){
		this.value = s;
		this.type = type;
	}

	//return value to build TAC
	public String GetTac(){
		return this.value;
	}

}
