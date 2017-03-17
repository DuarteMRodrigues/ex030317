package ex1170317;

import java.util.ArrayList;
import java.util.Scanner;

public class Listagem {
	public Listagem(ArrayList<Cliente> clientes, ArrayList<Produto> produtos, int totCli, int totProd){
		int escolha = 0;
		Scanner s = new Scanner(System.in);
	
		do{
			System.out.println("\n\n0 - Sair");
			System.out.println("1 - Listar Clientes");
			System.out.println("2 - Listar Produtos");
			System.out.print("\nEscolha: ");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 0:
					break;
					
				case 1:
					listarClientes(clientes, totCli);
					break;
					
				case 2:
					listarProdutos(produtos, totProd);
					break;
				
				default:
					System.out.print("Invalido: ");
					break;			
			}
			
		}while(escolha != 0);
	}
	
	public void listarClientes(ArrayList<Cliente> clientes, int totCli){
		for(int i = 0; i < totCli; i++){
			System.out.print("\n\nID: " + clientes.get(i).getId());
			System.out.print(" || Nome: " + clientes.get(i).getNome());
			System.out.print(" || Idade: " + clientes.get(i).getIdade());
			System.out.println(" || Saldo: " + clientes.get(i).getSaldo());
		}
	}
	
	public void listarProdutos(ArrayList<Produto> produtos, int totProd){
		for(int i = 0; i < totProd; i++){
			System.out.print("\n\nID: " + produtos.get(i).getId());
			System.out.print(" || Nome: " + produtos.get(i).getNome());
			System.out.print(" || Idade requirida: " + produtos.get(i).getIdadeReq());
			System.out.print(" || Preco: " + produtos.get(i).getPreco());
			System.out.println(" || Stock: " + produtos.get(i).getStock());
		}
	}
}
