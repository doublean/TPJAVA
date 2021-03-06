package main.java.fr.uga.poo.expr.builder;

import main.java.fr.uga.poo.expr.binary.BinaryOperation;
import main.java.fr.uga.poo.expr.constants.ConstArithmeticExpression;
import main.java.fr.uga.poo.expr.constants.RationalConst;

public class RationalProduct extends BinaryOperation<RationalConst, RationalConst> {

	public RationalProduct(RationalConst left, RationalConst right) {
		super(left, right);

	}

	@Override
	public ConstArithmeticExpression value() {
		int num = this.left.getNum() * this.right.getNum();
		int denum = this.left.getDenum() * this.right.getDenum();

		return new RationalConst(num, denum);

	}

}
