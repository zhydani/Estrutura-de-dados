package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	/*
	 * Crie um c�digo que dado um n�mero n qualquer entre 1 e o tamanho da pilha
	 * remova o elemento n e recoloque todos os elementos anteriores. O c�digo deve
	 * funcionar para qualquer estado da pilha.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		PilhaV<Integer> p_aux = new PilhaV<Integer>(10);
		Integer numero = 0;
		Integer n;

		// Preenchendo a pilha at� ela ficar cheia
		while (p.inserir(numero)) {
			System.out.println("Inserido " + numero + "\n");
			numero++;
		}

		System.out.println("-------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe ate qual valor deseja remover: ");
		n = scan.nextInt();

		// Removendo da pilha at� ela ficar vazia
		while (numero != n) {
			numero = p.remover();
			System.out.println("Removendo " + numero + "\n");
			p_aux.inserir(numero);
		}
		System.out.println("-------------------------");

		if (!p_aux.estaVazia()) {
			p_aux.remover();
			numero = p_aux.remover();
			while (p.inserir(numero)) {

				System.out.println("Inserido " + numero + "\n");
				numero = p_aux.remover();
			}
		}

	}

}
