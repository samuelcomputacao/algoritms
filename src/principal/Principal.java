package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5};
		ArrayList<Integer> a = new ArrayList<>();
		preenche(a, arr, 0, arr.length);
		ArrayList<Integer> destino = new ArrayList<>();
		List<Integer> indices = new ArrayList<>();
		indices.add(0);
		indices.add(arr.length);
		List<Integer> indicesAdicinados = new ArrayList<>();
		preenche(arr, destino, indices,indicesAdicinados);

	}

	private static void preenche(Integer[] origem, List<Integer> destino, List<Integer> indices,List<Integer> indicesAdicionados) {
		if (destino.size() < origem.length) {
			int i = 1;
			List<Integer> novosIndices = new ArrayList<>();
			while (i < indices.size()) {
				int index = (indices.get(i - 1) + indices.get(i)) / 2;
				Integer element = origem[index];
				if(!indicesAdicionados.contains(index)) {
					destino.add(element);
					novosIndices.add(index);
					indicesAdicionados.add(index);
					
				}
				i++;
			}
			insereAll(indices,novosIndices);
			preenche(origem, destino, indices,indicesAdicionados);
		}

	}

	private static void insereAll(List<Integer> indices, List<Integer> novosIndices) {
		for (Integer i : novosIndices) {
			insere(i, indices);
		}

	}

	private static void insere(int index, List<Integer> indices) {
		int i = 0;
		while (i < indices.size() && indices.get(i).compareTo(index) < 0) {
			i++;
		}
		if (i >= indices.size()) {
			indices.add(index);
		} else {
			indices.add(i, index);
		}

	}

	private static void preenche(ArrayList<Integer> a, Integer[] arr, int inicio, int fim) {
		if (inicio < fim) {
			int posicao = (inicio + fim) / 2;
			a.add(arr[posicao]);
			preenche(a, arr, inicio, posicao);
			preenche(a, arr, posicao + 1, fim);

		}

	}

}
