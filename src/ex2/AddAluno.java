package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddAluno {
	public AddAluno(){
		ArrayList<Aluno> list = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("Ze", 17, 919849343);
		list.add(a);
		
		a = new Aluno("Manel", 20, 975939823);
		list.add(a);
		
		a = new Aluno("Andre", 8, 927649953);
		list.add(a);
		
		a = new Aluno("Rui", 0, 923538975);
		list.add(a);
		
		a = new Aluno("Joao", 13, 928374656);
		list.add(a);
		
		ordenaAluno(list);
	}
	
	public void ordenaAluno(ArrayList<Aluno> list){
		
		Collections.sort(list, new Comparator<Aluno>(){
			public int compare(Aluno banana, Aluno batata){
				return banana.getNota() - batata.getNota();
			}
		});
		
		for(int i=0; i<5; i++){
			System.out.print("Nome: " + list.get(i).getNome());
			System.out.print(" || Nota: " + list.get(i).getNota());
			System.out.println(" || Contato: " + list.get(i).getContato());
		}
	}
}
