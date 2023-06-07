package listas;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Professor;


public class Professores {
	private List<Professor> professores;
	private Departamentos departamentos;
	
	public Professores() {
		professores = new ArrayList<Professor>();
	}
	
	public void addProfessorFromUserInput(Scanner scanner) {
		
		out.print("\nEnter the Professor`s name: ");
		String name = scanner.next();
		out.print("\nEnter the Professor`s CPF: ");
		String cpf = scanner.next();
		
		departamentos.listarDepartamentos();
		
		out.print("\nEnter the Departaments ID: ");
		int id = scanner.nextInt();
		
		Professor newProfessor = new Professor(name,cpf,departamentos.getDepartamentosByID(id));
		professores.add(newProfessor);
		
		System.out.println("Professor added Successfully");
		
		listarProfessores();
	}
	
	public Professor addProfessor(Professor professor) {
		professores.add(professor);
		return professor;
	}
	
	public void listarProfessores() {
		for (Professor professor : professores) {
			System.out.println(professor + "\n \n→ ID Professor: "+ professores.indexOf(professor));	
		}
	}
	
	public Professor getProfessorByID(int id) {
		Professor choiceProfessor = professores.get(id);
		return choiceProfessor;
	}

}
