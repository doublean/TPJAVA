
public abstract class BinaryOperation implements ArithmeticExpression {
	protected ArithmeticExpression left,right;
	
	
	public BinaryOperation(){
		this.left=null;
		this.right=null;
	}
	
	public BinaryOperation(ArithmeticExpression l , ArithmeticExpression r){
		this.left= l;
		this.right=r;
	}
	
}

