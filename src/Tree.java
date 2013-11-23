import java.util.*;

public class Tree {
	private Node node;

	public ArrayList<Tac> tac;
	public int numVar;

	public Tree(){
		this.node = null;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();

	}
	public Tree(Node node){		
		this.node = node;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();
	}
	
	public void setNode(Node node){
		this.node = node;
	}

	public String TacToString(){
		//GetTac() used to build ArrayList tac, string is never used
		String phony = node.GetTac();
		StringBuffer sb = new StringBuffer();
		for(Tac t: tac){
			sb.append(t.toString());
		}
		return sb.toString();
	}
}
