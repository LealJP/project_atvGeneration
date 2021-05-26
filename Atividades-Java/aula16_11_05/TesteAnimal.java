package aula16_11_05;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro dog1 = new Cachorro("Bolinha",5);
		dog1.imprimirInfo();
		dog1.correr();
		dog1.emitirSom(1);
		
		
		System.out.println("\n");
		Cavalo cav1 = new Cavalo("Atreyu", 10);
		cav1.imprimirInfo();
		cav1.correr();
		cav1.emitirSom(2);
		
		System.out.println("\n");
		Preguica preg1 = new Preguica("Lola", 3);
		preg1.imprimirInfo();
		preg1.subirArvores();
		cav1.emitirSom(3);
		
	}

}
