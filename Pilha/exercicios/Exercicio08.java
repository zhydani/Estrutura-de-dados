package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * Crie um código que dado um número n qualquer entre 1 e o tamanho da pilha
	 * remova todos os elementos até o elemento n (incluindo o n).
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		Integer numero = 0;
		Integer n;

		// Preenchendo a pilha até ela ficar cheia
		while (p.inserir(numero)) {
			System.out.println("Inserido " + numero + "\n");
			numero++;
		}

		System.out.println("-------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe ate qual valor deseja remover: ");
		n = scan.nextInt();

		// Removendo da pilha até ela ficar vazia
		numero = p.remover();
		while (numero != n) {
			numero = p.remover();
			System.out.println("Removendo " + numero + "\n");
		}

	}

}
