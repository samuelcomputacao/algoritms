package TesteExpression;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import adt.bt.arithmeticExpression.BTExpression;
import adt.bt.arithmeticExpression.BTExpressionImpl;
import adt.bt.arithmeticExpression.DivisionExpression;
import adt.bt.arithmeticExpression.ModuloExpression;
import adt.bt.arithmeticExpression.MultiplicationExpression;
import adt.bt.arithmeticExpression.NumberExpression;
import adt.bt.arithmeticExpression.SomaExpression;
import adt.bt.arithmeticExpression.SubtracaoExpression;

class TestArithmetic {
	
	private BTExpression btExpression;

	@Test
	@Before
	void test() {
		NumberExpression n2 = new NumberExpression(2);
		NumberExpression n5 = new NumberExpression(5);
		
		SomaExpression soma = new SomaExpression(n2, n5);
		
		NumberExpression n7 = new NumberExpression(7);
		
		MultiplicationExpression multiplicacao = new MultiplicationExpression(soma, n7);
		
		NumberExpression n4 = new NumberExpression(4);
		NumberExpression n_2 = new NumberExpression(2);
		
		DivisionExpression divisao = new DivisionExpression(n4, n_2);
		
		ModuloExpression modulo  = new ModuloExpression(multiplicacao, divisao);
		
		NumberExpression n1 = new NumberExpression(1);
		
		SubtracaoExpression subtracao = new SubtracaoExpression(modulo, n1);
		
		btExpression = new BTExpressionImpl.Builder().root(subtracao).builder();
		assertEquals(new Integer(0), btExpression.evaluate());
		
	}

}
