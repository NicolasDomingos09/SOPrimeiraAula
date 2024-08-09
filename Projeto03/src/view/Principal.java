package view;

import controller.ClasseMetodos;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClasseMetodos met = new ClasseMetodos();
		
		//Coleta do tamanho limitando a 100
		int tamanho = 0;
		while (tamanho <= 0 || tamanho > 100) {
			System.out.println("Entre com um valor inteiro entre 0 e 100 para o tamanho do vetor");
			tamanho = scan.nextInt();
		}
		
		//Criação do vetor
		int[] vetorInteiro = new int[tamanho];
		
		//Carrega vetor
		vetorInteiro = met.carregaVetor(vetorInteiro);
		
		//Percorre vetor
		met.percorreVetor(vetorInteiro);
		scan.close();
	}
}
