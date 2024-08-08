package view;
import controller.MetodosController;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MetodosController met = new MetodosController();
		
		System.out.println("Entre com o texto");
		String texto = scan.next();
		met.splitText(texto);
		scan.close();
	}

}
