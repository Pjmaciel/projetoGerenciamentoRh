package application;


import Model.Alocacao;
import Model.Curso;
import Model.Departamento;
import Model.Professor;

public class App {

	public static void main(String[] args) {
		
		Departamento dp = new Departamento("Biologia");
		Curso curso = new Curso("Ciencias Sociais");
		Professor prof = new Professor("Joaquim", "953.658.289-89",dp);
		Alocacao alocacao = new Alocacao(prof, curso, "Segunda-Feira", "21:00");
		
		Departamento dp2 = new Departamento("exatas");
		Curso curso2 = new Curso("Computaçao");
		Professor prof2 = new Professor("Bill", "953.658.289-89",dp2);
		Alocacao alocacao2 = new Alocacao(prof2, curso2, "terca-Feira", "21:00");
		
		
		
		System.out.println(alocacao);
		System.out.println("===============================");
		System.out.println(alocacao2);
		
		
		

	}

}
