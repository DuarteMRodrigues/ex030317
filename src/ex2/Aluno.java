package ex2;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int nota;
	private int contato;
	
	public Aluno(String nome, int nota, int contato) {
		this.nome = nome;
		this.nota = nota;
		this.contato = contato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}
}
