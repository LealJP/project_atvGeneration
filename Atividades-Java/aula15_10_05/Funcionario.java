package aula15_10_05;

public class Funcionario {
	
	/*
	 * Crie uma classe funcionário e apresente os atributos e métodos referentes esta 
	 * classe, em seguida crie um objeto funcionário, defina as instancias deste objeto 
	 * e apresente as informações deste objeto no console.
	 */
	
	private String nome;
	private String cargo;
	private int idade;
	private float salario;
	
	//método construtor da classe
	public Funcionario(String nome, String cargo, int idade, float salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
	}
	public float getAumento(int aumento) {
		salario = salario + salario*(float)(aumento)/100;
		return salario;
	}
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
}
