package aula17_12_05;

public class TesteAnimal2 {

	public static void main(String[] args) {
		
		
		Cachorro2 dog1 = new Cachorro2("Bolinha",5);
		dog1.imprimirInfo();
		dog1.correr("cachorro");
		dog1.emitirSom(2);

		System.out.println("\n");
		Cavalo2 cav1 = new Cavalo2("Atreyu", 10);
		cav1.imprimirInfo();
		cav1.correr("cavalo");
		cav1.emitirSom(2);
		
		System.out.println("\n");
		Preguica2 preg1 = new Preguica2("Lola", 3);
		preg1.imprimirInfo();
		preg1.subirArvores();

		
	
		
	}

}
