package adt.bt.arithmeticExpression;

public class SomaExpression extends BaseExpression {

	public SomaExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
		super(expression1, expression2);
	}

	@Override
	public Integer evaluate() {
		return expression1.evaluate() + expression2.evaluate();
	}

}
