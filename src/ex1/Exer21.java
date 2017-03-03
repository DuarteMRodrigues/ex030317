package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer21 {
	public Exer21(){
		int op = 0;
		String valor = "";
		
		ArrayList<String> list = new ArrayList<String>(){{
		    add("b");
		    add("3");
		    add("Carruagens");
		    add("8.56");
		    add("caixas de armazenamento");
		}};
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("\n\nEscolha uma opção\n");
			System.out.println("1 - Mostrar Array List");
			System.out.println("2 - Adicionar Valor");
			System.out.println("3 - Sair");
			System.out.print("Escolha: ");
			op = s.nextInt();
			
			switch(op){
				case 1:
					mostraArray(list);
					break;
					
				case 2:
					System.out.print("\n\nInsira um valor para adicionar ao Array: ");
					
					//O primeiro nextLine nao le por isso é necessario 2
					valor = s.nextLine();
					valor = s.nextLine();
					
					list = adicionaValor(list, valor);
					
					break;
				
				case 3:
					System.out.println("Adeus");
					break;
				
				default:
					System.out.println("Inválido");
					break;
			}
			
		}while(op != 3);
		
		s.close();
	}
	
	public void mostraArray(ArrayList<String> list){
		System.out.println(list);
	}
	
	public ArrayList<String> adicionaValor(ArrayList<String> list, String valor){
		list.add(valor);
		
		return list;
	}
}
