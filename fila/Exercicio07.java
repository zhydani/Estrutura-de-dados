package fila;

public class Exercicio07 {
	/*
	 * Dada a seguinte inserção em uma fila: 1,3,4,5,6 e 10, remova o terceiro
	 * elemento inserido (4) e recoloque os dois anteriores.
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

		// transferindo os elementos para poder retirar o 4
		aux.inserir(f.remover());
		aux.inserir(f.remover());

		// retirando o elemento 4
		f.remover();

		// recolocando os outros elementos
		f.inserir(aux.remover());
		f.inserir(aux.remover());

		// usando o toString implicitamente aqui
		System.out.println(f);
	}
}
