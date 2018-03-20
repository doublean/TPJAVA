package main.java.fr.uga.poo.expr.binary;

import main.java.fr.uga.poo.expr.constants.ConstArithmeticExpression;
import main.java.fr.uga.poo.expr.constants.RationalConst;

public class RationalSum extends BinaryOperation<RationalConst, RationalConst> {

	public RationalSum(RationalConst left, RationalConst right) {
		super(left, right);

	}

	@Override
	public ConstArithmeticExpression value() {
		int num = this.left.getNum() * this.right.getDenum() + this.left.getDenum() * this.right.getNum();
		int denum = this.left.getDenum() * this.right.getDenum();

		return new RationalConst(num, denum);
	}

}
