import java.util.*;

public class NodeWhile implements Node{
	private Node prop;
	private ArrayList<Node> ins;


	public NodeWhile(Node prop, ArrayList<Node> ins){
		this.prop = prop;
		this.ins = ins;
	}


	public String GetTac(){

		//label L0
		String L0 = "L" + Tree.numLab++ + ":";
		Tac tac1 = new Tac(null, L0, null, null, EnumTac.LABEL);
		Tree.tac.add(tac1);

		//condition
		String proposition = prop.GetTac();
		//System.out.println(proposition);

		//if cond jmp L1
		Tac tac2 = new Tac("jmpcond", proposition, null, null, EnumTac.JMPCOND);// set L1 after
		Tree.tac.add(tac2);

		//instructions
		System.out.println("empty2: " + ins.isEmpty());
		String name;

		System.out.println("ici48");

		for (Node n: ins){
			System.out.println("ici49");
			name = n.GetTac();
			System.out.println("ici50");
			Tac tac5 = new Tac(name + " = " + n.getValue(), null, null, null, EnumTac.VARIABLE);
			System.out.println("ici51");
			Tree.tac.add(tac5);
			System.out.println("ici52");
		}

		System.out.println("ici47");

		//jmp L0
		Tac tac3 = new Tac("jmp", null, L0, null, EnumTac.JMP);
		Tree.tac.add(tac3);

		//label L1
		String L1 = "L" + Tree.numLab++ + ":";
		Tac tac4 = new Tac(null, L1, null, null, EnumTac.LABEL);
		Tree.tac.add(tac4);

		tac2.setAddr2(L1);

		return new String("phony string !");
	}
	public String getT(){
		return "phony";
	}
	public String getValue(){
		return "phony";
	}
	public void lolString(){
	}	
}
