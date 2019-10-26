package exercicios;

public class Exercicio06 {
	/*
	 * Dada a seguinte inserção em uma pilha: 1,3,4,5,6 e 10, remova os 3 últimos
	 * elementos inseridos.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);

		// inserindo os elementos
		p.inserir(1);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		p.inserir(6);
		p.inserir(10);
		
		//removendo os 3 ultimos elementos inseridos
		p.remover();
		p.remover();
		p.remover();

	}

}
