package view;

import controller.ClasseMetodos;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClasseMetodos met = new ClasseMetodos();
		
		boolean coleta = false;
		while (!coleta) {
			int tamanho = scan.nextInt();
			if(tamanho <= 100 && tamanho > 0) {
				coleta = true;
			}
		}
		scan.close();

	}
}
