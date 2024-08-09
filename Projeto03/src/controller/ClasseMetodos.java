package controller;
import java.util.Scanner;

public class ClasseMetodos {
	
	public ClasseMetodos() {
		super();
	}
	
	public int[] carregaVetor(int[] vetor) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira os valores inteiros para preencher o vetor");
		int tamanho = vetor.length;
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = scan.nextInt(); 
		}
		scan.close();
		return vetor;
	}
	
	public void percorreVetor(int[] vetor) {
		for(int num : vetor) {
			if(num % 2 == 0) {
				if(num % 10 == 0) {
					System.out.println("Número " + num + " é par e múltiplo de 10");
				}
			}else {
				System.out.println("Número " + num + " é ímpar");
			}
		}
	}
}
