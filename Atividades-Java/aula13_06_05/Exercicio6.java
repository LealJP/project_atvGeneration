package aula13_06_05;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. 
		 * Para sair digitar 0(zero).(
		 */
		
		Scanner leia = new Scanner(System.in);
		int num, multiplo3=-1, soma=0;
		float media;
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			if (num % 3 == 0) {
				multiplo3++;
				soma = soma + num;
			}
		} while (num != 0);
		media =  soma/(float) multiplo3; /* Se dividir um inteiro por outro inteiro o Java
		 									ao converter para float (pq média é um float),
		 									pega só a parte inteira da divisão. Por isso
		 									converter umas das partes da divisão para float*/
		System.out.printf("A média dos números múltiplos de 3 é igual a: %2.2f",media);
	}

}
