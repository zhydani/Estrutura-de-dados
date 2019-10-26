package exercicios;

public class Exercicio04 {
	/*
	 * Escreva um código de removar todos os elementos adicionados em uma pilha. O
	 * código deve funcionar para qualquer estado da pilha.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		Integer numero = 0;

		// inserindo os elementos
		p.inserir(1);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		p.inserir(6);
		p.inserir(10);

		// Removendo da pilha até ela ficar vazia
		numero = p.remover();
		while (numero != null) {
			System.out.println("Removendo " + numero + "\n");
			numero = p.remover();
		}
	}
}
