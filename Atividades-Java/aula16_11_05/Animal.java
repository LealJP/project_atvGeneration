package aula16_11_05;

public class Animal {
	private String nome;
	private int idade, s;
	private String som;
	
	public Animal(String nome, int idade) {
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
	
	public void emitirSom(int s) {
		this.s = s;
		if (s==1) {
			System.out.println("Latir");
		} else if (s==2) {
			System.out.println("Relinchar");
		} else if (s==3) {
			System.out.println("Grunhido");
		}

	}
	
}
