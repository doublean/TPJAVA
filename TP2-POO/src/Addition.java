
public class Addition extends BinaryOperation{
	
	public ArithmeticExpression value(){
		if(this.left.value() instanceof IntegerConst){
			IntegerConst a = (IntegerConst) this.left;
			IntegerConst b = (IntegerConst) this.right;
		}
	}
	
	public ArithmeticExpression value(IntegerConst a , IntegerConst b){
		return new IntegerConst(a+b);
	}
	
}
