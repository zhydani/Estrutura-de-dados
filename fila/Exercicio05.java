package fila;

public class Exercicio05 {
	/*
	 * Escreva um código de insira elementos em uma fila até que a mesma chegue
	 * ao estado de cheia. O código deve funcionar para filas de qualquer
	 * tamanho.
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);
		int n = 0; 
		
		//Preenchendo a fila
		while(f.inserir(n++)){
		}
	}
}
