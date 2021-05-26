package aula16_11_05;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	public void imprimirInfo() {
		System.out.println("Nome da preguiça: "+getNome()+"\nIdade da preguiça: "+getIdade());
	}
	public void subirArvores() {
		System.out.println("A preguiça é um animal que sobe em árvores.");
	}

}
