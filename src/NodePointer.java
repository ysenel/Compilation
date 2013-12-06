public class NodePointer implements Node{
	private String value;
	private String name;
	private MyEnumType type;


	public NodePointer(MyEnumType type, String name, String value){
		this.name = new String("__" + name);
		this.type = type;
		this.value = value;	
	}

	public String getValue()
	{
		return "t"+Tree.numVar;
	}

    //build TAC, and return var name
	public String GetTac(){
		Tac tac = new Tac(toString(), null, value, null, EnumTac.VARIABLE);
		Tree.tac.add(tac);
		return getValue();
	}


    public String toString()
	{	
		if(value == null && type == null)
			return getValue() + " = *" + name ;
		if(value == null && type != null){
			return "POINTER " + type.toString() + name;
		}
		if(type == null && value != null)
			return name + " = &" + value;

        if(type != null && value != null)
            return type.toString() + name + " = &" + value;

        return "null";
	}

}