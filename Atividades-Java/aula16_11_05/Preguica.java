package aula16_11_05;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	public void imprimirInfo() {
		System.out.println("Nome da pregui�a: "+getNome()+"\nIdade da pregui�a: "+getIdade());
	}
	public void subirArvores() {
		System.out.println("A pregui�a � um animal que sobe em �rvores.");
	}

}
