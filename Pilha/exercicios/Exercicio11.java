package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	/*
	 * [Média] Implemente um algoritmo que simule um estacionamento. Neste
	 * estacionamento entram e saem carros pela mesma extremidade. Para remover um
	 * carro x é preciso remover todos os inseridos após ele. Cada manobra deve ser
	 * contabiliza e quando um carro sair, deve-se indicar a placa do carro e
	 * quantas vezes ele foi manobrado para fora (dando passagem para outro carro).
	 */
	public static void main(String[] args) {
		// Criando a pilha
		PilhaV<Integer> estacionamento = new PilhaV<Integer>(10);
		PilhaV<Integer> aux = new PilhaV<Integer>(10);
		Integer numero = 0;
		Integer x;
		Integer cont = 0;

		// Preenchendo o estacionamento
		while (estacionamento.inserir(numero)) {
			System.out.println("Inserido " + numero + "\n");
			numero++;
		}

		System.out.println("-------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe ate qual carro deseja remover: ");
		x = scan.nextInt();

		// Removendo do estacionamento os carros apos ele
		while (numero != x) {
			numero = estacionamento.remover();
			System.out.println("Removendo " + numero + "\n");
			aux.inserir(numero);
			cont++;
			
		}
		System.out.println("O carro " + x + " deu " + cont + " manobras\n");
		System.out.println("-------------------------");

		if (!aux.estaVazia()) {
			aux.remover();
			numero = aux.remover();
			while (estacionamento.inserir(numero)) {

				System.out.println("Inserido carro " + numero + "\n");
				numero = aux.remover();
			}
		}
	}
}
