package adt.bt.arithmeticExpression;

public class SubtracaoExpression extends BaseExpression {

	public SubtracaoExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
		super(expression1, expression2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer evaluate() {
		return expression1.evaluate() - expression2.evaluate();
	}

}
