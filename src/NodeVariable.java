public class NodeVariable implements Node{
	private String value;
	private Node nodeValue;
	private String name;
	private MyEnumType type;


	public NodeVariable(MyEnumType type, String name, String value, Node nodeValue){
		this.name = new String("__" + name);
		this.type = type;
		this.value = value;	
		this.nodeValue = nodeValue;
	}

	public String getValue()
	{
		return "t"+Tree.numVar;
	}

    //build TAC, and return var name
	public String GetTac(){
		//Tac tac = new Tac("", t, value, "", EnumTac.VARIABLE);
		value = nodeValue.GetTac();
		Tac tac = new Tac(toString(), null, value, null, EnumTac.VARIABLE);
		Tree.tac.add(tac);
		return getValue();
	}


    public String toString()
	{
		if(value == null)
			return type.toString() + " " + name;

		if(type == null)
			return name + "=" + value;


		return type.toString() + " " + name + "=" + value;
	}

}