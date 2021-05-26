package aula17_12_05;

public class Cachorro2 extends Animal2{
	
	private int quantSom;
	private String c;
	
	public Cachorro2(String nome, int idade) {
		super(nome, idade);
		
	}
	@Override
	public void imprimirInfo() {
		System.out.println("Nome do Cachorro: "+getNome()+"\nIdade do Cachorro: "+getIdade());
		
	}
	@Override
	public void emitirSom(int num) {
		this.quantSom = num;
		for (int i =0 ; i < quantSom; i++) {
			System.out.println("Au au au...");
		}

	}
	@Override
	public void correr(String c) {
		this.c = c;
		System.out.println("O"+ c + " é um animal que corre.");
	}

}