package aula13_06_05;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/**
		 Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		 */
		
		Scanner leia = new Scanner(System.in);
		int num, somaPar = 0, somaImpar = 0;
		
		for (int x = 1; x<=10; x++) {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				somaPar++;
			} else {
				somaImpar++;
			}
		}
		System.out.println("\nQuandidade de n�meros pares digitados: " + somaPar);
		System.out.println("Quandidade de n�meros �mpares digitados: " + somaImpar);
	}

}
