package aula17_12_05;

public class Cavalo2 extends Animal2 {
	private int numSom;
	private String c;
	
	public Cavalo2(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public void imprimirInfo() {
		System.out.println("Nome do Cavalo: "+getNome()+"\nIdade do Cavalo: "+getIdade());
	}
	public void correr() {
		System.out.println("O Cavalo é um animal que corre.");
	}
	@Override
	public void emitirSom(int num) {
		this.numSom = num;
		if (num > 1) {
			System.out.println("Relincha");
		}
	}
	@Override
	public void correr(String c) {
		this.c = c;
		System.out.println("O "+ c + " saiu galopando");
	}

}