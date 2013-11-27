public class Tac{

	private String op;
	private String add1;
	private String add2;
	private String add3;

	public Tac(String op, String add1, String add2, String add3){
		this.op = op;
		this.add1 = add1;
		this.add2 = add2;
		this.add3 = add3;
	}

	public String getAdd1(){
		return add1;
	}

	public String getAdd2(){
		return add2;
	}
	
	public String getAdd3(){
		return add3;
	}

	public String getOp(){
		return this.op;
	}

	public String toString(){
		return new String(op + " : " + this.add1 + " : " + this.add2 + " : " + this.add3);
	}
}
