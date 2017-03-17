package ex1170317;

public class Cliente {
	private int id;
	private String nome;
	private double saldo;
	private int idade;
	
	public Cliente(int id, String nome, double saldo, int idade){
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
		this.idade = idade;
	}
	
	public void removerSaldo(double saldo){
		this.saldo -= saldo;
	}
	public void adicionarSaldo(double saldo){
		this.saldo += saldo;
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

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}
