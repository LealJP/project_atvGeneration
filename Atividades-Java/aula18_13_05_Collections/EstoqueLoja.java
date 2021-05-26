package aula18_13_05_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
	
		do
		{
			System.out.println("\n-------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos do estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Atualizar produtos do estoque?");
			System.out.println("\n(4) Mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa?");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto não existe no meu estoque!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe no meu estoque!!!");
				}
				break;
			case 4:
				System.out.println("\nMostrando os produtos do estoque...");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa...");
				
			}
		}while(op!=0);
	}

}
