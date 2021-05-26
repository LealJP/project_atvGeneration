package aula15_10_05;

import java.util.Scanner;

public class GerenciaFuncionario {
	public static void main(String[] args) {
		String nome;
		String cargo;
		int idade, aumento;
		float salario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome funcionário: ");
		nome = leia.nextLine();
		System.out.println("Cargo: ");
		cargo = leia.nextLine();
		System.out.println("Idade funcionário: ");
		idade = leia.nextInt();
		System.out.println("Salario funcionário: ");
		salario = leia.nextFloat();
		
		Funcionario funcionario = new Funcionario(nome, cargo, idade, salario);
		
		System.out.println("Deseja aumentar o salário do funcionário? (y/n)");
		String resp = leia.next();
		if("y".equals(resp)) {
			System.out.println("Valor do aumento em %: ");
			aumento = leia.nextInt();
			System.out.println("Novo salário: "+ funcionario.getAumento(aumento));
		} else {
			System.out.println(" ..:: Dados cadastrados do funcionário ::.. ");
			System.out.println("Nome: "+funcionario.getNome());
			System.out.println("Cargo: "+funcionario.getCargo());
			System.out.println("Idade: "+funcionario.getIdade());
			System.out.println("Salario: "+funcionario.getSalario());
		}
	}

}
