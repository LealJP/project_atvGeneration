package aula14_07_05;

import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/*
		 *Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 */
		Random numAleatorio = new Random();
		int [][]matriz = new int[3][3];
		int cont = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = numAleatorio.nextInt(20);
				
				if(matriz[i][j] > 10 ) {
					cont++;
				}
				System.out.println("matriz["+i+"]["+j+"]: "+matriz[i][j]);
			}
		}
		System.out.println("\n\tQuantidade de números maiores que 10: "+cont);
	}
	
}
