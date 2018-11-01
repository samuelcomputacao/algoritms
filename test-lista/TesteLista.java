import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.algorithms.lista.Lista;

class TesteLista {

	private Lista<Integer> lista1;
	private Lista<Integer> lista2;
	

	@Test
	void test() {
		lista1 = new Lista<>();
		lista2 = new Lista<>();
		
		lista1.add(1);
		lista1.add(2);
		lista1.add(4);
		lista1.add(5);
		lista1.add(6);
		
		lista1.add(2);
		lista1.add(10);
		lista1.add(18);
		lista1.add(2);
		lista1.add(3);
		
		System.out.println(lista1);
		lista1.inverte();
		System.out.println(lista1);
	}

}
