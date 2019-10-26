package exercicios;

public class Exercicio01 {
	/*
	 * Desenhe um pilha para os seguintes estados, considere além do vetor de 10
	 * posições o topo:
	 * 
	 * Inserir elemento 1 Inserir elemento 3 Inserir elemento 4 Inserir elemento 5
	 * Remover elemento Inserir elemento 6 Remover elemento Remover elemento Remover
	 * elemento Remover elemento Inserir elemento 4
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);

		// Desenho da pilha
		// inserindo 1 -> p = [1]
		p.inserir(1);
		// inserindo 1 -> p = [1]
		p.inserir(3);
		// inserindo 3 -> p = [1, 3]
		p.inserir(4);
		// inserindo 4 -> p = [1, 3, 4]
		p.inserir(5);
		// inserindo 5 -> p = [1, 3, 4, 5]
		p.remover();
		// removendo o topo 5 -> p = [1, 3, 4]
		p.inserir(6);
		// inserindo 6 -> p = [1, 3, 4, 6]
		p.remover();
		// removendo o topo 6 -> p = [1, 3, 4]
		p.remover();
		// removendo o topo 4 -> p = [1, 3]
		p.remover();
		// removendo o topo 3 -> p = [1]
		p.remover();
		// removendo o topo 1 -> p = []
		p.inserir(4);
		// inserindo 4 -> p = [4]

	}

}
