package exercicios;

public class Exercicio07 {
	/*
	 * Dada a seguinte inserção em uma pilha: 1,3,4,5,6 e 10, remova o terceiro
	 * elemento inserido (4) e recoloque os dois anteriores.
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> p = new PilhaV<Integer>(10);
		PilhaV<Integer> p_aux = new PilhaV<Integer>(10);

		// inserindo os elementos
		p.inserir(1);
		p.inserir(3);
		p.inserir(4);
		p.inserir(5);
		p.inserir(6);
		p.inserir(10);
		
		//transferindo os elementos para poder retirar o 4
		p_aux.inserir(p.remover());
		p_aux.inserir(p.remover());
		p_aux.inserir(p.remover());
		
		//retirando o elemento 4
		p.remover();
		
		//recolocando os outros elementos
		p.inserir(p_aux.remover());
		p.inserir(p_aux.remover());
		p.inserir(p_aux.remover());

	}

}
