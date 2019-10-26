package exercicios;

public class Exercicio02 {
	/*
	 * Modifique a sequencia de comandos acima para que haja um overflow de
	 * inserção. Ou seja, inserir até que o máximo seja alcançado.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);

		// Inserindo na pilha ate dar Overflow
		p.inserir(1);
		System.out.println(p.estaCheia());
		p.inserir(3);
		System.out.println(p.estaCheia());
		p.inserir(4);
		System.out.println(p.estaCheia());
		p.inserir(5);
		System.out.println(p.estaCheia());
		p.inserir(6);
		System.out.println(p.estaCheia());
		p.inserir(4);
		System.out.println(p.estaCheia());
		p.inserir(7);
		System.out.println(p.estaCheia());
		p.inserir(8);
		System.out.println(p.estaCheia());
		p.inserir(9);
		System.out.println(p.estaCheia());
		p.inserir(10);
		System.out.println(p.estaCheia());
		p.inserir(11);
		System.out.println(p.estaCheia());
	}

}
