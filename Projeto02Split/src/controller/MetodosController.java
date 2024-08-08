package controller;

public class MetodosController {
	public void splitText(String texto) {
		String[] vetor = texto.split(";");
		int tamanho = 0;
		
		for(String palavra : vetor) {
			tamanho++;
		}
		System.out.println("Quantidade de partes: " + tamanho);
	}
}
