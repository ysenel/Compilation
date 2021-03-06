import java.util.*;

public class Tree {
	public static ArrayList<Node> node;

	public static ArrayList<Tac> tac;
	public static int numVar;
	public static int numLab;

	public Tree(){
		//this.node = null;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();
		node = new ArrayList<Node>();
	}

	public String TacToString(){
		//GetTac() used to build ArrayList tac, string is never used
		Collections.reverse(node);  // get the instructions in the wright order
		for(Node n: node){
			n.GetTac();
		}
		StringBuffer sb = new StringBuffer();
		for(Tac t: tac){
			sb.append(t.toString());
			sb.append("\n");
		}

		return sb.toString();
	}
}
