package aula15_10_05;

import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Paciente pac1 = new Paciente("Juci",30,"Amil","Hipotiroidismo");
		Paciente pac2 = new Paciente("Ana",35,"Unimed","Câncer no útero");
		
		System.out.println(" ..:: Pacientes registrados no sistema ::.. \n");
	    System.out.println("Paciente 1\n"+pac1.getNome()+"\n"+pac1.getIdade()+"\n"+pac1.getConvenio()+"\n"+pac1.getSituacao()+"\n");
	    System.out.println("Paciente 2\n"+pac2.getNome()+"\n"+pac2.getIdade()+"\n"+pac2.getConvenio()+"\n"+pac2.getSituacao());
	    
	    System.out.println("\nDeseja fazer alterações nos cadastros? (y/n): ");
	    String resp = leia.next();
	    
	    if("y".equals(resp)) {
	    	System.out.println("Entre com número do paciente que deseja fazer alterações no"
	    			+ " cadastro: ");
	    	int op = leia.nextInt();
	    	switch (op) {
	    	case 1:
	    		pac1.realizarAteracao(op);
	    		break;
	    	case 2:
	    		pac2.realizarAteracao(op);
	    		break;
	    	default:
	    		System.out.println("Paciente não localizado!!!");
	    	}
	    } else {
	    	System.out.println("Obrigado por acessar o sistema!!!");
	    }
	}
}
