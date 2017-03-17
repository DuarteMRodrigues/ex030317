package ex1170317;

import java.util.ArrayList;
import java.util.Scanner;

public class ComprarProduto {
	public ArrayList<ArrayList<?>> comprarProduto(ArrayList<Cliente> clientes, ArrayList<Produto> produtos, int totCli, int totProd, Scanner s){
		int idCli = 0, idProd = 0, stock = 0;
		double preco = 0.0;
		ArrayList<ArrayList<?>> list = new ArrayList<ArrayList<?>>();

		if(totCli == 0){
			System.out.println("Nao existem clientes para efetuar uma compra.");
			return list;
		}
		
		if(totProd == 0){
			System.out.println("Nao existem Produtos para comprar.");
			return list;
		}
		
		System.out.print("\n\nInsira o id do Cliente: ");
		idCli = s.nextInt();
		idCli -= 1;
		
		System.out.print("\n\nInsira o id do Produto: ");
		idProd = s.nextInt();
		idProd -= 1;
		
		if(clientes.get(idCli).getIdade() < produtos.get(idProd).getIdadeReq()){
			System.out.println("O cliente nao tem idade suficiente para comprar este produto.");
			return list;
		}
		
		System.out.print("\n\nInsira a quantidade que quer Comprar: ");
		stock = s.nextInt();
		s.nextLine();
		
		if(stock > produtos.get(idProd).getStock()){
			System.out.println("Nao existe stock suficiente para executar esta compra.");
			return list;
		}
		
		preco = produtos.get(idProd).getPreco() * stock;
		
		if(preco > clientes.get(idCli).getSaldo()){
			System.out.println("O cliente nao tem saldo suficiente para executar esta compra.");
			return list;
		}
		
		clientes.get(idCli).removerSaldo(preco);
		produtos.get(idProd).removerStock(stock);
		
		list.add(clientes);
		list.add(produtos);
		return list;
	}
}
