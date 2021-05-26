package aula17_12_05;

public abstract class Animal2 {
	
	private String nome;
	private int idade, s;
	private String som;
	abstract public void emitirSom(int num);
	abstract public void correr(String c);
	abstract public void imprimirInfo();
	
	public Animal2(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
