package fila;

public class Exercicio06 {
	/*
	 * Dada a seguinte inserção em uma fila: 1,3,4,5,6 e 10, remova os 3 últimos
	 * elementos inseridos.
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);
		FilaV<Integer> aux = new FilaV<Integer>(10);

		// inserindo os elementos
		f.inserir(1);
		f.inserir(3);
		f.inserir(4);
		f.inserir(5);
		f.inserir(6);
		f.inserir(10);

		aux.inserir(f.remover());
		aux.inserir(f.remover());
		aux.inserir(f.remover());

		// removendo os 3 ultimos inseridos
		f.remover();
		f.remover();
		f.remover();

		f.inserir(aux.remover());
		f.inserir(aux.remover());
		f.inserir(aux.remover());

		// usando o toString implicitamente aqui
		System.out.println(f);

	}

}
