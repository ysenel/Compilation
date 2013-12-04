import java.util.*;

public class NodeWhile implements Node{
	private Node prop;
	private ArrayList<Node> ins;

	public NodeWhile(Node prop, ArrayList<Node> ins){
		this.prop = prop;
		this.ins = ins;
	}

	public String GetTac(){
        //set the label names
        String L0 = "L" + Tree.numLab++ + ":";
        String L1 = "L" + Tree.numLab++ + ":";
        String L2 = "L" + Tree.numLab++ + ":";


		//label L0
		Tac tac1 = new Tac(null, L0, null, null, EnumTac.LABEL);
		Tree.tac.add(tac1);

		//condition
		String proposition = prop.GetTac();

		//if cond jmp L1
		Tac tac2 = new Tac("jmpcond", proposition, L1, null, EnumTac.JMPCOND);
		Tree.tac.add(tac2);

		//jmp L2
		Tac tac3 = new Tac("jmp", null, L2, null, EnumTac.JMP);
		Tree.tac.add(tac3);

		//label L1
		Tac tac4 = new Tac(null, L1, null, null, EnumTac.LABEL);
		Tree.tac.add(tac4);

		//instructions
		String name;
		Collections.reverse(ins);//reverse to have instruction in the right order
		for (Node n: ins){
			name = n.GetTac();
			Tac tac5 = new Tac(name + " = " + n.getValue(), null, null, null, EnumTac.VARIABLE);
			if ( n.getValue() != "")
				Tree.tac.add(tac5);
		}

		//jmp L0
		Tac tac6 = new Tac("jmp", null, L0, null, EnumTac.JMP);
		Tree.tac.add(tac6);

		//label L2
		Tac tac7 = new Tac(null, L2, null, null, EnumTac.LABEL);
		Tree.tac.add(tac7);

		return new String("");
	}

    public String getValue(){
		return "";
	}
}
