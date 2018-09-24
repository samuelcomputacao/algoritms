package com.project.matriz;

public class Matriz {
	
	private int ordem;
	private int[][] matriz;
	private int index = 0;
	
	public Matriz(int ordem) {
		this.matriz = new int[ordem][ordem];
		this.ordem = ordem;
	}

	public void addLine(int[] integers) {
		matriz[index++] = integers;	
	}
	
	
	public int getDeterminante() {
		int retorno = 0;
		if(ordem==1) {
			retorno = matriz[0][0];
		}else if (ordem == 2) {
			retorno = matriz[0][0] * matriz[1][1] - (matriz[0][1] * matriz[1][0]);
		}else {
			int j = 0;
			for(int i  = 0; i<ordem; i++) {
				Matriz m = geraMatriz(i, j, matriz, ordem-1);
				retorno += (int) (Math.pow(-1, j+i+2) * m.getDeterminante());
				j++;
			}
		}
		return retorno;
	}


	private Matriz geraMatriz(int linha, int coluna, int[][] matriz,int ordem) {
		Matriz m = new Matriz(ordem);		
		int indexlinha = 0;
		int[] l = new int[ordem];
		for(int i  = 0; i <= ordem; i++ ) {
			if(i!=linha) {
			indexlinha = 0;
			l = new int[ordem];
			for(int j = 0; j <= ordem; j++) {
				if(j!=coluna) {
					l[indexlinha++] = matriz[i][j];
				}
			}
			m.addLine(l);
			}
		}
		return m;
		
	}


}
