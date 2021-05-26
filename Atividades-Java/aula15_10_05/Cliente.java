package aula15_10_05;

import java.util.Scanner;

public class Cliente {
	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta 
	 * classe, em seguida crie um objeto cliente, defina as instancias deste objeto 
	 * e apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private String endereco;
	private String cidade;
	private int telefone;
	private int idade;
	private double cpf;
	Scanner leia = new Scanner(System.in);
	
	public Cliente (String nome, String endereco,String cidade, int telefone, int idade, double cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
	}

	public void imprimirCadastroCliente() {
		System.out.println("\n");
		System.out.println("..:: Confirme as informações cadastradas ::.. ");
		System.out.println("Nome cadastrado: "+this.getNome());
		System.out.println("Endereço cadastrado: "+this.getEndereco());
		System.out.println("Cidade cadastrado: "+this.getCidade());
		System.out.println("Telefone cadastrado: "+this.getTelefone());
		System.out.println("Idade cadastrado: "+this.getIdade());
		System.out.println("CPF cadastrado: "+this.getCpf());
	}
	

	//Métodos Getters e Setters para todos os atributos
	public String getNome() {
		return nome;
	}
	//quando chamado esse método irá alterar o nome 
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
}
