package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Curso;



public class Cursos {
	private List<Curso> cursos;

	public Cursos() {
		cursos =  new ArrayList<Curso>();
	}
	
	public void addDepartamentoFromUserInput(Scanner scanner) {
		System.out.print("\n Digite o nome do curso ");
		String name = scanner.next();
		
		Curso newCurso = new Curso(name);
		addCurso(newCurso);
		
		System.out.println("\n Curso Adicionado com sucesso");
		
		listarCursos();
		
	}
	
	public Curso addCurso(Curso curso) {
		cursos.add(curso);
		return curso;
	}
	
	public void listarCursos() {
		for (Curso curso : cursos) {
			System.out.println(curso + "\n    • ID Curso:"+ cursos.indexOf(curso));
			
		}
	}
	
	public Curso getCursosByID(int id) {
		Curso choiceCurso = cursos.get(id);
		return choiceCurso;
	}
	
	

}
