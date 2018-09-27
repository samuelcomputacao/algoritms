package com.leda.TAD;

import java.util.Stack;

public class Expressao {
	
	//		(1+((2+3)*(4*5)))
	//		((7+4)*(3-4))-(2*3)
	public static String calculaExpressao(String str) {
		Stack<String> pilha = new Stack<>();
		//Stack<String> polonesa = new Stack<>();
		int i = 0;
		while(i < str.length()) {
			String cr = str.substring(i,i+1);
			if(cr.equals(")")) {
				resolve(pilha);
			}else if(!str.substring(i, i+1).equals("(")){
				pilha.push(str.substring(i, i+1));
			}
			i++;
		}
		resolve(pilha);
		return pilha.pop();
	}

	private static void resolve(Stack<String> pilha) {
		if(pilha.isEmpty()||pilha.size()==1) return;
		int valor2 = Integer.parseInt(pilha.pop());
		String operacao = pilha.pop();
		int valor1 = Integer.parseInt(pilha.pop());
		pilha.push(calcular(valor1,valor2,operacao));
	}

	private static String calcular(int valor1, int valor2, String operacao) {
		int valor = 0;
		switch (operacao) {
		case "+":
			valor = valor1 + valor2;
			break;
		case "-":
			valor = valor1 - valor2;
			break;
		case "*":
			valor = valor1 * valor2;
			break;
		case "/":
			valor = valor1 / valor2;
			break;
		
		}
		return String.valueOf(valor);
	}

}
