package com.project.tabelaHash;

import java.util.Arrays;
import java.util.Scanner;

public class TabelaFrequencia {

	private static Integer[] tabela;
	private static Integer[] frequencias;
	
	
	
	
	public static void main(String[] args) {
		
		Integer[] array = convert((new Scanner(System.in)).nextLine().split(" "));
		inicializa(array.length);
		for(Integer v: array) {
			inserirOcorrencia(v);
		}
		String saida = "";
		for(Integer v: keys()) {
			if(saida.length()>0) {
				saida += " ";
			}
			saida += v+","+getFrequencia(v);
		}
		System.out.println(saida);
	}
	
	 
	

	private static Integer[] keys() {
		Integer[] ret = new  Integer[tabela.length];
		int i = 0;
		for(int j = 0; j < tabela.length; j++) {
			if(tabela[j]!=null) {
				ret[i++] = tabela[j];
			}
		}
		return Arrays.copyOf(ret, i);

	}




	private static Integer[] convert(String[] array1) {
		Integer[] array = new Integer[array1.length];
		int i = 0;
		for(String v : array1) {
			array[i++] = new Integer(v);
		}
		return array;
	}




	public static void inicializa(int tam) {
		tabela =  new Integer[tam];
		frequencias = new Integer[tam];
	}

	public static void inserirOcorrencia(Integer element) {
		int indice = pegaIndice(element, 0);
		if (tabela[indice] == null) { 
			tabela[indice] =  element;
			frequencias[indice] = new Integer(1);
		}else {
			frequencias[indice] = new Integer(frequencias[indice]+1);
		}
	}

	private static int pegaIndice(Integer element, int i) {
		int indice = i;
		if (tabela[indice] == null || tabela[indice].equals(element)) {
			return indice;
		} else {
			return pegaIndice(element, i + 1);
		}
	}
	public static Integer getFrequencia(Integer element) {
		int indice = indexOf(element,0);
		if(indice==-1) {
			return 0;
		}
		return frequencias[indice];
	}

	private static int indexOf(Integer element,int i) {
		int retorno = -1;
		if(i>=tabela.length) {
			retorno = -1;
		}else if(tabela[i]!=null && tabela[i].equals(element)){
			retorno = i;
		}else {
			retorno = indexOf(element, ++i);
		}
		return retorno;
	}
	

}
