public class NodeInstruction implements Node{
	private Node instruction;
	private Node next;

	public NodeInstruction(Node instruction, Node next){
		this.instruction = instruction;
		this.next = next;
	}
	
	//lead nodes instruction and next to build TAC
	//return value is never used
	public String GetTac(){
		return instruction.GetTac() + next.GetTac();
	}
}
