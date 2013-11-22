public class NodeConstant implements Node{
	private String value;
	private EnumType type;


	public NodeConstant(String s, EnumType type){
		this.value = s;
		this.type = type;
	}

	public String getTAC(){
		return this.value;
	}

}