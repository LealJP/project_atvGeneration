package aula12_05_05;

import java.util.Scanner;

public class Exerccio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Entre com valor para a: ");
		a = leia.nextInt();
		System.out.print("Entre com valor para b: ");
		b = leia.nextInt();
		System.out.print("Entre com valor para c: ");
		c = leia.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println("\nO maior valor � o n�mero: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("\nO maior valor � o n�mero: " + b);
		} else {
			System.out.println("\nO mairo valor � o n�mero: " + c);
		}
		
		//c�digo alternativo
		//else if (c >= a && c >= b) {
			//System.out.println("\nO maior valor � o n�mero: " + c);
		//}

	}

}
