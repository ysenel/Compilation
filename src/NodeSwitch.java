import java.util.*;
public class NodeSwitch implements Node{

	private ArrayList<Node> cases;

	public NodeSwitch(ArrayList<Node> cases){
		this.cases = cases;
	}
	
	public String GetTac(){
		Collections.reverse(cases);//reverse to have instruction in the right order
		for (Node n: cases){
			n.GetTac();
		}
		return new String("");
	}

    public String getValue(){
		return "";
	}
}
