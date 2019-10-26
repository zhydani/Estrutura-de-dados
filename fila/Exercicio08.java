package fila;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * Crie um código que dado um número n qualquer entre 1 e o tamanho da fila
	 * remova todos os elementos até o elemento n (incluindo o n).
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);
		int n = 1;

		// Preenchendo a fila
		while (f.inserir(n++)) {
		}

		System.out.println("-------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe ate qual valor deseja remover: ");
		n = scan.nextInt();

		// removendo os elementos da fila
		Integer l = null;
		do {
			l = f.remover();

			if (l != null)
				System.out.println("Removido " + l);

		} while (l != n);

		// usando o toString implicitamente aqui
		System.out.println(f);

	}

}
