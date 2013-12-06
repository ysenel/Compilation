import java.util.*;
public class SymboleTable {
	private HashMap<String, MyEnumType> table;
	

	public SymboleTable(){
		table = new HashMap<String, MyEnumType>();
	}

	public void addVariable(MyEnumType type, String name){
		table.put(name, type);
	}

	public Boolean exist(String name){
		return table.containsKey(name);
	}
	

}