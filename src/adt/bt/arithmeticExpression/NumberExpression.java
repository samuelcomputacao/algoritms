package adt.bt.arithmeticExpression;

public class NumberExpression extends ArithmeticExpression {
	
	private Integer number;
	
	public NumberExpression(Integer n) {
		number = n;
	}

	@Override
	public Integer evaluate() {
		return number;
	}

}
