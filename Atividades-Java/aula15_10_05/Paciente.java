package aula15_10_05;

import java.util.Scanner;

public class Paciente {
	private String nome;
	private String situacao;
	private int idade, pac;
	private String convenio;
	Scanner leia = new Scanner(System.in);
	
	public Paciente(String nome, int idade, String convenio, String situacao) {
		this.nome = nome;
		this.idade = idade;
		this.convenio = convenio;
		this.situacao = situacao;
	}

	public void realizarAteracao(int pac) {
		this.pac = pac;
		System.out.println("Quais informações deseja alterar: \n1-Nome \n2-Idade \n3-Convênio \n4-Situação");
		int op = leia.nextInt();
		
		leia.nextLine();//limpa buffler
		switch (op) {
		case 1: 
			System.out.println("Digite o novo nome: ");
			this.nome = leia.nextLine();
			imprimirRegistro();
			break;
		case 2: 
			System.out.println("Digite a nova idade: ");
			this.idade = leia.nextInt();
			imprimirRegistro();
			break;
		case 3: 
			System.out.println("Digite o novo convênio: ");
			this.convenio = leia.nextLine();
			imprimirRegistro();
			break;
		case 4: 
			System.out.println("Digite o nova situação: ");
			this.situacao = leia.nextLine();
			imprimirRegistro();
			break;
		default:
			System.out.println("Informação não encontrada!");
		}
	}
	
	public void imprimirRegistro() {
		System.out.println("\n\tNovo registro do paciente " + this.pac);
		System.out.println("\tNome: "+this.nome+"\n\tIdade: "+this.idade+"\n\tConvênio: "+this.convenio+"\n\tSituação: "+this.situacao);
	}
	public String getNome() {
		return nome;
	}
	public String getSituacao() {
		return situacao;
	}
	public int getIdade() {
		return idade;
	}
	public String getConvenio() {
		return convenio;
	}
	
}
