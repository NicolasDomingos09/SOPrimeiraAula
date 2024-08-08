package view;

import controller.MetodosController;

public class Principal {

	public static void main(String[] args) {
		int[] vetorMil = new int[1000];
		int[] vetorDezMil = new int[10000];
		int[] vetorCemMil = new int[100000];
		
		MetodosController met = new MetodosController();
		
		met.percorreVetor(vetorMil);
		met.percorreVetor(vetorDezMil);
		met.percorreVetor(vetorCemMil);
	}
}
