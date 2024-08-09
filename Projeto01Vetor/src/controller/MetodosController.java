package controller;

public class MetodosController {
	
	public void percorreVetor(int[] vetor) {
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal /= Math.pow(10,9);
		System.out.println(tempoTotal + "s.");
	}
}
