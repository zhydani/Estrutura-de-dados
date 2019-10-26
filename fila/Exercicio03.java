package fila;

public class Exercicio03 {
	/*
	 * Escreva um código que insira os seguintes elementos na fila: 1,3,4,5,6 e
	 * 10
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);

		// inserindo os elementos
		f.inserir(1);
		f.inserir(3);
		f.inserir(4);
		f.inserir(5);
		f.inserir(6);
		f.inserir(10);

	}

}
