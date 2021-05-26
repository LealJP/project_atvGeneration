package aula16_11_05;

public class Cachorro extends Animal{
	private String som = "latir";
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	public void imprimirInfo() {
		System.out.println("Nome do cachorro: "+getNome()+"\nIdade do cachorro: "+getIdade());
		
	}
	public void correr() {
		System.out.println("O cachorro é um animal que corre.");
	}

}
