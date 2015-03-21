package Classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {
	public static List<Aluno> listaAlunos = new ArrayList<Aluno>();

	public void salvar(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public List<Aluno> getAlunos(){
		return listaAlunos;
	}
	
}
