package adt.bt.arithmeticExpression;

public abstract class BaseExpression extends ArithmeticExpression {
	
	protected ArithmeticExpression expression1;
	protected ArithmeticExpression expression2;
	
	public BaseExpression(ArithmeticExpression expression1, ArithmeticExpression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

}
