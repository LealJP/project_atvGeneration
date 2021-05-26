package aula13_06_05;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		/**
		 Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 */
		
		Scanner leia = new Scanner(System.in);
		int num, somaPar = 0, somaImpar = 0;
		
		for (int x = 1; x<=10; x++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if (num % 2 == 0) {
				somaPar++;
			} else {
				somaImpar++;
			}
		}
		System.out.println("\nQuandidade de números pares digitados: " + somaPar);
		System.out.println("Quandidade de números ímpares digitados: " + somaImpar);
	}

}
