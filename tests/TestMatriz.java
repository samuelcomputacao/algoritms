
import org.junit.jupiter.api.Test;

import com.project.matriz.Matriz;

class TestMatriz {
	
	private Matriz matriz;

	@Test
	void test() {
		matriz = new Matriz(2);
		matriz.addLine(new int[] {5,-5});
		matriz.addLine(new int[] {-5,4});
		System.out.println(matriz.getDeterminante());
	}

}
