public class NodeVariable implements Node{
	private String value;
	private String name;
	private MyEnumType type;


	public NodeVariable(MyEnumType type, String name, String value){
		this.name = name;
		this.type = type;
		this.value = value;	
	}

	public void lolString(){
		System.out.println(this.type.toString() + " " + this.name + " " + this.value);
	}
	//build TAC, and return var name
	/*public String GetTac(){
		String t = new String("u" + name);
		Tac tac = new Tac(type.toString(), t, value.GetTac(), null);
		tree.tac.add(tac);
		return t;
	}*/

}