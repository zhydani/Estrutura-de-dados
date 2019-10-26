package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	/*
	 * [Média] Implemente um algoritmo do jogo torre de hannoi usando três pilhas.
	 * No jogo o jogador indicará a pilha de remoção do disco e a pilha de inserção
	 * do disco. O jogo deve garantir a regra da torre de hannoi: não é possível
	 * inserir um disco maior sobre um disco menor.
	 */

	// Executa movimentações entre as pilhas
	public static void torreHanoi(int discos, Pilha origem, Pilha destino, Pilha auxiliar) throws Exception {
		if (discos > 0) {
			torreHanoi(discos - 1, origem, auxiliar, destino);
			System.out.println("mova o disco " + origem.topo.getValor() + " do pino " + origem.nome + " para o pino "
					+ destino.nome);
			destino.empilha(origem.desempilha()); // Troca entre pinos
			torreHanoi(discos - 1, auxiliar, destino, origem);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a quantidade de dicos: ");
		int discos = leitor.nextInt();

		Pilha pinoA = new Pilha('A');
		Pilha pinoB = new Pilha('B');
		Pilha pinoC = new Pilha('C');

		// Inicia todas os dicos no pino A
		for (int i = discos; i > 0; i--) {
			pinoA.empilha(i);
		}

		// Movimentações
		torreHanoi(discos, pinoA, pinoC, pinoB);

		leitor.close(); // Encerra a leitura

	}
}

class Disco {
	private int valor;
	private Disco anterior;

	public void setAnterior(Disco anterior) {
		this.anterior = anterior;
	}

	public Disco getAnterior() {
		return anterior;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
}

class Pilha {
	Disco topo = null;
	char nome;

	// Nome para identificação do pino
	public Pilha(char nome) {
		this.nome = nome;
	}

	public void empilha(int valor) throws Exception {
		if (topo != null) {
			if (valor > topo.getValor()) {
				throw new Exception("Erro: O disco não pode ser maior que a anterior");
			}
		}

		Disco novo = new Disco();
		novo.setValor(valor);
		novo.setAnterior(topo);
		topo = novo;
	}

	public int desempilha() throws Exception {
		if (topo == null) {
			throw new Exception("Erro: Pilha vazia");
		}

		int valor = topo.getValor();
		topo = topo.getAnterior();
		return valor;
	}

}
