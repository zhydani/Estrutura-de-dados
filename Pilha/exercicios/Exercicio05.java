package exercicios;

public class Exercicio05 {
	/*
	 * Escreva um c�digo de insira elementos em uma pilha at� que a mesma chegue ao
	 * estado de cheia. O c�digo deve funcionar para pilhas de qualquer tamanho.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		Integer numero = 0;

		// Preenchendo a pilha at� ela ficar cheia
		while (p.inserir(numero)) {
			System.out.println("Inserido " + numero + "\n");
			numero++;
		}

	}

}
