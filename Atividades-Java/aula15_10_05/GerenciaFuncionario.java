package aula15_10_05;

import java.util.Scanner;

public class GerenciaFuncionario {
	public static void main(String[] args) {
		String nome;
		String cargo;
		int idade, aumento;
		float salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome funcion�rio: ");
		nome = leia.nextLine();
		System.out.println("Cargo: ");
		cargo = leia.nextLine();
		System.out.println("Idade funcion�rio: ");
		idade = leia.nextInt();
		System.out.println("Salario funcion�rio: ");
		salario = leia.nextFloat();
		
		Funcionario funcionario = new Funcionario(nome, cargo, idade, salario);
		
		System.out.println("Deseja aumentar o sal�rio do funcion�rio? (y/n)");
		String resp = leia.next();
		if("y".equals(resp)) {
			System.out.println("Valor do aumento em %: ");
			aumento = leia.nextInt();
			System.out.println("Novo sal�rio: "+ funcionario.getAumento(aumento));
		} else {
			System.out.println(" ..:: Dados cadastrados do funcion�rio ::.. ");
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println("Cargo: "+funcionario.getCargo());
			System.out.println("Idade: "+funcionario.getIdade());
			System.out.println("Salario: "+funcionario.getSalario());
		}
	}

}
