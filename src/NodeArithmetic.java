public class NodeArithmetic implements Node{
	private Node left;
	private Node right;
	private EnumType type;

	public NodeArithmetic(Node left, Node right){
		this.left = left;
		this.right = right;
	}
	
	public String GetTAC(){
		Tac tac = new Tac("t" + numVar, this.left.getTAC(), this.type, this.right.getTAC());
		Tree.tac.add(tac);
	}
}