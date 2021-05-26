package aula15_10_05;

import java.util.Scanner;

public class CadastraCliente {
	public static void main(String[] args) {
		
		String nome, endereco, cidade;
		int telefone, idade;
		double cpf;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t::.. CADASTRO DE CLIENTES ..::");
		System.out.println("Nome: ");
		nome = leia.nextLine();
		System.out.println("Endereço: ");
		endereco = leia.nextLine();
		System.out.println("Cidade: ");
		cidade = leia.next();
		
		leia.nextLine(); //limpando o buffler da memória do objeto leia
		System.out.print("Telefone: ");
		telefone = leia.nextInt();
		System.out.print("Idade: ");
		idade= leia.nextInt();
		System.out.print("CPF: ");
		cpf = leia.nextDouble();
		
		
		Cliente cliente = new Cliente(nome, endereco, cidade, telefone, idade, cpf);
		cliente.imprimirCadastroCliente();
	
		leia.nextLine(); //limpando novamente o buffler
		
		System.out.println("\n");
		System.out.println("Deseja alterar alguma informação? (y/n):");
	    String resp = leia.next();
	    if ("y".equals(resp)) {    	
	    	do {
		    	System.out.println("\n\tQual informação deseja alterar: \n\t1-Nome \n\t2-Endereço \n\t3-Cidade \n\t4-Telefone \n\t5-Idade \n\t6-CPF ");
		    	int op = leia.nextInt();
		    	switch (op) {
		    	case 1:
		    		leia.nextLine();
		    		System.out.println("Digite o novo nome do cliente: ");
		    		nome = leia.nextLine();
		    		cliente.setNome(nome);
		    		break;
		    	case 2:
		    		leia.nextLine();
		    		System.out.println("Digite o novo endereço do cliente: ");
		    		endereco = leia.nextLine();
		    		cliente.setEndereco(endereco);
		    		break;
		    	case 3:
		    		leia.nextLine();
		    		System.out.println("Digite o novo cidade do cliente: ");
		    		cidade = leia.nextLine();
		    		cliente.setCidade(cidade);
		    		break;
		    	case 4:
		    		leia.nextLine();
		    		System.out.println("Digite o novo telefone do cliente: ");
		    		telefone = leia.nextInt();
		    		cliente.setTelefone(telefone);
		    		break;
		    	case 5:
		    		leia.nextLine();
		    		System.out.println("Digite a nova idade do cliente: ");
		    		idade = leia.nextInt();
		    		cliente.setIdade(idade);
		    		break; 	
		    	case 6:
	    		leia.nextLine();
	    		System.out.println("Digite o novo CPF do cliente: ");
	    		cpf = leia.nextInt();
	    		cliente.setCpf(cpf);
	    		break;
		    }	    	
		    	cliente.imprimirCadastroCliente();
		    	System.out.println("\n");
				System.out.println("Deseja alterar alguma informação? (y/n):");
			    resp = leia.next();	
	    	} while("y".equals(resp));
	    }
	}
}
