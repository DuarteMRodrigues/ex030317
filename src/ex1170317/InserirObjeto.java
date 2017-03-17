package ex1170317;

import java.util.ArrayList;
import java.util.Scanner;

public class InserirObjeto {
	public ArrayList<Cliente> inserirClientes(ArrayList<Cliente> clientes, int totCli, Scanner s){
		int idade = 0;
		double saldo = 0.0;
		String nome = "";
		
		System.out.print("\n\nInsira o nome do cliente: ");
		nome = s.nextLine();
		
		System.out.print("\n\nInsira a idade do cliente: ");
		idade = s.nextInt();
		
		System.out.print("\n\nInsira o saldo inicial do cliente: ");
		saldo = s.nextDouble();
		s.nextLine();

		Cliente cli = new Cliente(totCli, nome, saldo, idade);
		clientes.add(cli);
		
		return clientes;
	}
	
	public ArrayList<Produto> inserirProdutos(ArrayList<Produto> produtos, int totProd, Scanner s){
		int idadeReq = 0, stock = 0;
		double preco = 0.0;
		String nome = "";
		
		System.out.print("\n\nInsira o nome do produto: ");
		nome = s.nextLine();
		
		System.out.print("\n\nInsira a idade requirida para comprar o produto: ");
		idadeReq = s.nextInt();
		
		System.out.print("\n\nInsira o preco do produto: ");
		preco = s.nextDouble();
		
		System.out.print("\n\nInsira o stock inicial do produto: ");
		stock = s.nextInt();
		s.nextLine();

		Produto prod = new Produto(totProd, nome, preco, stock, idadeReq);
		produtos.add(prod);
		
		return produtos;
	}
}
