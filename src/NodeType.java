public class NodeType implements Node {

	private MyEnumType type;

	public NodeType(MyEnumType type){
		this.type = type;
	}

	public String GetTac(){
		return type.name();
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