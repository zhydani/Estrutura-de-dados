package fila;

import java.util.Scanner;

public class Exercicio09 {
	/*
	 * Crie um código que dado um número n qualquer entre 1 e o tamanho da fila
	 * remova o elemento n e recoloque todos os elementos anteriores. O código
	 * deve funcionar para qualquer estado da fila.
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);
		FilaV<Integer> aux = new FilaV<Integer>(10);
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

			if (l != null) {
				System.out.println("Removido " + l);
			}

			if (l != n && l != null)
				aux.inserir(l);

		} while (l != n && l !=null);

		System.out.println("-------------------------");

		// Preenchendo a fila
		while (f.inserir(aux.remover())) {

		}

		// usando o toString implicitamente aqui
		System.out.println(f);
	}
}
