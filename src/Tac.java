public class Tac{

	private String op;
	private String operator1;
	private String operator2;
	private String name;


	public Tac(String name, String operator1, String op, String operator2,){
		this.name = name;
		this.op = op;
		this.operator1 = operator1;
		this.operator2 = operator2;
	}


	public String getName(){
		return this.name;
	}


		public String getOp(){
		return this.op;
	}




		public String getOperator1(){
		return this.operator1;
	}



		public String getOperator2(){
		return this.operator2;
	}
}