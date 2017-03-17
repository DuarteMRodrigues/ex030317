package ex1170317;

import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarCampos {
	
	public ArrayList<Cliente> adicionarSaldo(ArrayList<Cliente> clientes, Scanner s){
		int idCli = 0;
		double preco = 0.0;
		
		System.out.print("Insira o ID do cliente: ");
		idCli = s.nextInt();
		idCli -= 1;
		
		System.out.print("Insira a quantidade de saldo que quer inserir: ");
		preco = s.nextDouble();
		s.nextLine();
		
		clientes.get(idCli).adicionarSaldo(preco);
		return clientes;
	}
	
	public ArrayList<Produto> adicionarStock(ArrayList<Produto> produtos, Scanner s){
		int idProd = 0, stock = 0;
		
		System.out.print("Insira o ID do produto: ");
		idProd = s.nextInt();
		idProd -=1;
		
		System.out.print("Insira a quantidade de stock que quer inserir: ");
		stock = s.nextInt();
		s.nextLine();
		
		produtos.get(idProd).adicionarStock(stock);
		return produtos;
	}
}
