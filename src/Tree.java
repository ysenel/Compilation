import java.util.*;

public class Tree {
	public static ArrayList<Node> node;

	public static ArrayList<Tac> tac;
	public static int numVar;

	public Tree(){
		//this.node = null;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();
		node = new ArrayList<Node>();
	}
	/*public Tree(Node node){		
		this.node = node;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();
	}*/
	
	/*public void setNode(Node node){
		this.node = node;
	}*/

	public String TacToString(){
		//GetTac() used to build ArrayList tac, string is never used
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
