package aula17_12_05;

public class Preguica2 extends Animal2 {
	
	private int numSom;
	
	public Preguica2(String nome, int idade) {
		super(nome, idade);
	}
	@Override
	public void imprimirInfo() {
		System.out.println("Nome da preguiça: "+getNome()+"\nIdade da preguiça: "+getIdade());
	}
	public void subirArvores() {
		System.out.println("A preguiça é um animal que sobe em árvores.");
	}
	@Override
	public void emitirSom(int num) {
		this.numSom = num;
		if (num == 2) {
			System.out.println("Grunhiu...");
		}
	}
	@Override
	public void correr(String c) {}

}