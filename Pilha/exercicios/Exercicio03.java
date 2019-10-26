package exercicios;

public class Exercicio03 {
	/*
	 * Escreva um código que insira os seguintes elementos na pilha: 1,3,4,5,6 e 10
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		
		//inserindo os elementos
		p.inserir(1);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		p.inserir(6);
		p.inserir(10);
		
	}
}
