package view;

import controller.MetodosController;

public class Principal {

	public static void main(String[] args) {
		int[] vetorMil = new int[1000];
		int[] vetorDezMil = new int[10000];
		int[] vetorCemMil = new int[100000];
		
		MetodosController met = new MetodosController();
		
		System.out.print("Tempo para percorrer vetor de tamanho 1000: ");
		met.percorreVetor(vetorMil);
		
		System.out.print("Tempo para percorrer vetor de tamanho 10000: ");
		met.percorreVetor(vetorDezMil);
		
		System.out.print("Tempo para percorrer vetor de tamanho 100000: ");
		met.percorreVetor(vetorCemMil);
	}
}
