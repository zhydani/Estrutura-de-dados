package fila;

public class Exercicio02 {
	/*
	 * Modifique a sequência de comandos acima para que haja um overflow de
	 * inserção. Ou seja, inserir até que o máximo seja alcançado.
	 */
	public static void main(String[] args) {
		// Criando a fila
		FilaV<Integer> f = new FilaV<Integer>(10);

		// Inserindo na fila ate dar Overflow
		f.inserir(1);
		System.out.println(f.estaCheia());
		f.inserir(3);
		System.out.println(f.estaCheia());
		f.inserir(4);
		System.out.println(f.estaCheia());
		f.inserir(5);
		System.out.println(f.estaCheia());
		f.inserir(6);
		System.out.println(f.estaCheia());
		f.inserir(4);
		System.out.println(f.estaCheia());
		f.inserir(7);
		System.out.println(f.estaCheia());
		f.inserir(8);
		System.out.println(f.estaCheia());
		f.inserir(9);
		System.out.println(f.estaCheia());
		f.inserir(10);
		System.out.println(f.estaCheia());
		f.inserir(11);
		System.out.println(f.estaCheia());
	}

}
