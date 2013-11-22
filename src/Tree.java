public class Tree {
	private Node node;

	public ArrayList<Tac> tac;
	public int numVar;

	public Tree(Node node){
		this.node = node;
		this.numVar = 0;
		this.tac = new ArrayList<Tac>();
	}
}