package aula16_11_05;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	public void imprimirInfo() {
		System.out.println("Nome do cavalo: "+getNome()+"\nIdade do cavalo: "+getIdade());
	}
	public void correr() {
		System.out.println("O cavalo é um animal que corre.");
	}

}
