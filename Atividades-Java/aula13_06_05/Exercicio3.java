package aula13_06_05;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		/**
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos 
		 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
		 * idade for =-99
		 */
		
		Scanner leia = new Scanner(System.in);
		int idade = 0, soma21 = 0, soma50 = 0;
				
		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if (idade > 0 && idade < 21) {
				soma21++;
			} else if (idade > 50 ) {
				soma50++;
			}
		}
		System.out.println("\nPessoas com menos de 21 anos: " + soma21);
		System.out.println("\nPessoas com mais de 50 anos: " + soma50);
	} 
}
