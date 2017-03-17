package ex1170317;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	@SuppressWarnings("unchecked")
	public Menu(){
		/*
		 * Exercicio 1:
		 * 
		 * Faça um programa no qual, utilizando duas ArrayList diferentes, consiga verificar se um cliente tem saldo e/ou idade suficiente para comprar um produto.
		 * Os produtos têm uma certa quantidade de stock, o qual deve diminuir consoante o numero de quantidade comprada.
		 * O cliente deve poder comprar mais do que 1 quantidade do mesmo produto de uma so vez (por ex: comprar 3 maças).
		 * Quando um produto nao houver em stock, nao pode ser comprado, e um cliente nao pode ficar com saldo negativo.
		 * Para comprar o produto deve-se inserir o id do cliente e o id do produto. 
		 * 
		 * O programa deve conter um menu, e so deve sair do programa se o utilizador inserir o valor 0.
		 * As opções para o menu têm de incluir, mas não se limitam a:
		 * 0 - Sair;
		 * 1 - Inserir Clientes;
		 * 2 - Inserir Produtos;
		 * 3 - Comprar Produtos;
		 * 4 - Adicionar Saldo;
		 * 5 - Adicionar Stock;
		 * 6 - Listar Clientes;
		 * 7 - Listar Produtos;
		 * 
		 * (Nao tem que ser necessáriamente por esta ordem).
		 * 
		 * Os atributos de cada Classe têm que ser privados.
		 * 
		 * Crie a classe Cliente. Os seus atributos devem ser: 
		 * - id : int
		 * - nome : String
		 * - saldo : double
		 * - idade : int
		 * 
		 * Crie a classe Produto. Os seus atributos devem ser:
		 * - id int
		 * - nome : String
		 * - preco : double
		 * - stock : int
		 * - idadeReq : int
		 * 
		 * Crie os metodos que achar necessário.
		 * 
		 * OPCIONAL
		 * Criar um historico de compras para cada cliente e produto.
		 * Adicionar as opçoes: 
		 * - Apagar produto.
		 * - Apagar Cliente.
		 * - Consultar historico Cliente.
		 * - Consultar historico Produto.
		 * - Alterar dados sobre o Cliente.
		 * - Alterar dados sobre Produto.
		 * Criar classes diferentes para cada operacao (So para o programa ficar mais organizado).
		 */
		
		int escolha = 0, totCli = 0, totProd = 0;
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<ArrayList<?>> list = new ArrayList<ArrayList<?>>();
		Scanner s = new Scanner(System.in);
		AdicionarCampos campos = new AdicionarCampos();
		
		do{
			System.out.println("\n\n0 - Sair");
			System.out.println("1 - Inserir Clientes");
			System.out.println("2 - Inserir Produtos");
			System.out.println("3 - Comprar Produtos");
			System.out.println("4 - Adicionar Saldo");
			System.out.println("5 - Adicionar Stock");
			System.out.println("6 - Listagem");
			System.out.print("\nEscolha: ");
			escolha = s.nextInt();
			s.nextLine();
			
			switch(escolha){
				case 0:
					System.out.println("Adeus");
					break;
				
				case 1:
					totCli++;
					clientes = inserirClientes(clientes, totCli, s);
					System.out.println("Cliente inserido com sucesso.");
					break;
					
				case 2:
					totProd ++;
					produtos = inserirProdutos(produtos, totProd, s);
					System.out.println("Produto inserido com sucesso.");
					break;
					
				case 3:
					list = comprarProduto(clientes, produtos, totCli, totProd, s);
					clientes = (ArrayList<Cliente>) list.get(0);
					produtos = (ArrayList<Produto>) list.get(1);
					System.out.println("Compra efetuada com sucesso");
					break;
					
				case 4:
					clientes = campos.adicionarSaldo(clientes, s);
					break;
				
				case 5:
					produtos = campos.adicionarStock(produtos, s);
					break;
					
				case 6:
					new Listagem(clientes, produtos, totCli, totProd);
					break;
				
				default:
					System.out.println("Opcao invalida");
					break;
			}
			
			System.out.print("\n\nPressione a tecla enter para continuar...");
			s.nextLine();
		}while(escolha != 0);
	}
	
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
	
	public ArrayList<ArrayList<?>> comprarProduto(ArrayList<Cliente> clientes, ArrayList<Produto> produtos, int totCli, int totProd, Scanner s){
		int idCli = 0, idProd = 0, stock = 0;
		double preco = 0.0;
		
		if(totCli == 0){
			System.out.println("Nao existem clientes para efetuar uma compra.");
		}
		
		if(totProd == 0){
			System.out.println("Nao existem Produtos para comprar.");
		}
		
		System.out.print("\n\nInsira o id do Cliente: ");
		idCli = s.nextInt();
		idCli -= 1;
		
		System.out.print("\n\nInsira o id do Produto: ");
		idProd = s.nextInt();
		idProd -= 1;
		
		if(clientes.get(idCli).getIdade() < produtos.get(idProd).getIdadeReq()){
			System.out.println("O cliente nao tem idade suficiente para comprar este produto.");
		}
		
		System.out.print("\n\nInsira a quantidade que quer Comprar: ");
		stock = s.nextInt();
		s.nextLine();
		
		if(stock > produtos.get(idProd).getStock()){
			System.out.println("Nao existe stock suficiente para executar esta compra.");
		}
		
		preco = produtos.get(idProd).getPreco() * stock;
		
		if(preco > clientes.get(idCli).getSaldo()){
			System.out.println("O cliente nao tem saldo suficiente para executar esta compra.");
		}
		
		clientes.get(idCli).removerSaldo(preco);
		produtos.get(idProd).removerStock(stock);
		
		ArrayList<ArrayList<?>> list = new ArrayList<ArrayList<?>>();
		list.add(clientes);
		list.add(produtos);
		return list;
	}
}