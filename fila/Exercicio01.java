package fila;

public class Exercicio01 {
	/*
	 * Desenhe um fila para os seguintes estados, considere além do vetor de 10
	 * posições o topo:
	 * 
	 * Inserir elemento 1 Inserir elemento 3 Inserir elemento 4 Inserir elemento
	 * 5 Remover elemento Inserir elemento 6 Remover elemento Remover elemento
	 * Remover elemento Remover elemento Inserir elemento 4
	 */

	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);

		// Desenho da pilha
		// inserindo 1 -> f = [1]
		f.inserir(1);
		// inserindo 1 -> f = [1]
		f.inserir(3);
		// inserindo 3 -> f = [3, 1]
		f.inserir(4);
		// inserindo 4 -> f = [4, 3, 1]
		f.inserir(5);
		// inserindo 5 -> f = [5, 4, 3, 1]
		f.remover();
		// removendo final 1 -> f = [5, 4, 3]
		f.inserir(6);
		// inserindo 6 -> f = [6, 5, 4, 3]
		f.remover();
		// removendo o final 3 -> f = [6, 5, 4]
		f.remover();
		// removendo o final 4 -> f = [6, 5]
		f.remover();
		// removendo o final 5 -> f = [1]
		f.remover();
		// removendo o final 6 -> f = []
		f.inserir(4);
		// inserindo 4 -> f = [4]

	}
}
