package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * Crie um c�digo que dado um n�mero n qualquer entre 1 e o tamanho da pilha
	 * remova todos os elementos at� o elemento n (incluindo o n).
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
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
		numero = p.remover();
		while (numero != n) {
			numero = p.remover();
			System.out.println("Removendo " + numero + "\n");
		}

	}

}
