package main.java.fr.uga.poo.expr.binary;

import main.java.fr.uga.poo.expr.ArithmeticExpression;

public abstract class BinaryOperation<LEFT, RIGHT> implements ArithmeticExpression {

	protected LEFT left;
	protected RIGHT right;

	public BinaryOperation(LEFT left, RIGHT right) {
		this.left = left;
		this.right = right;
	}

}
