package aula14_07_05;

public class Exercicio1 {
	public static void main(String[] args) {
		/**
		 * Faça um programa que possua um vetor denominado A que armazene 6 números 
		 * inteiros. O programa deve executar os seguintes passos: 
		 * 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores 
			das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.

		 */
		int[] vetor = {1, 0, 5, -2, -5, 7};
		int somaValores = 0;
		
		
		for (int i =0; i < vetor.length; i++) {
			if (i == 0 || i == 1 || i == 5) {
				somaValores = somaValores + vetor[i];	
			}
			if ( i == 4) {
				vetor[i] = 100;
			}
			System.out.println("Valor da posição "+i+": "+vetor[i]);
		}
		System.out.println("\nSoma dos valores das posições A[0], A[1] e A[5] :"+somaValores);
	}
}
