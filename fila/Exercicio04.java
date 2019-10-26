package fila;

public class Exercicio04 {
	/*
	 * Escreva um código de remova todos os elementos adicionados em uma fila. O
	 * código deve funcionar para qualquer estado da pilha.
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

		// removendo os elementos da fila
		Integer l = null;
		do {
			l = f.remover();

			if (l != null)
				System.out.println("Removido " + l);

		} while (l != null);

	}

}
