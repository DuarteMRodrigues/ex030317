package ex1170317;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int stock;
	private int idadeReq;
	
	public Produto(int id, String nome, double preco, int stock, int idadeReq){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.stock = stock;
		this.idadeReq = idadeReq;
	}

	public void removerStock(int stock){
		this.stock -= stock;
	}
	
	public void adicionarStock(double stock){
		this.stock += stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getIdadeReq() {
		return idadeReq;
	}
	public void setIdadeReq(int idadeReq) {
		this.idadeReq = idadeReq;
	}
}
