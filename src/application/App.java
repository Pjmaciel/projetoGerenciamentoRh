package application;

import static java.lang.System.out;

import java.util.Scanner;

import model.Alocacao;
import model.Curso;
import model.Departamento;
import model.Professor;

public class App {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		out.print ("Digite o nome do departamento: ");
		String dpnome = input.next();
		Departamento dp = new Departamento(dpnome);
		
		System.out.print("Digite o nome do curso: ");
		String cursoNome = input.next();
		
		Curso curso =  new Curso(cursoNome);
		
		out.print("Digite o nome do professor: ");
		String profNome = input.next();
		out.print("Digite o CPF do Professor: ");
		String profCpf = input.next();
	
		
		Professor prof = new Professor(profNome,profCpf, dp);
		
		out.println("Informe o dia da semana da alocaçao");
		String alocDiaDaSemana = input.next();
		
		out.println("Informe O horario da Alocaçao");
		String alocHora = input.next();

		Alocacao alocacao = new Alocacao(prof, curso, alocDiaDaSemana, alocHora);
        
        System.out.println("Console limpo. Aqui está a nova saída!");
		
		
		System.out.println("=============== Alocaçao ============");
		System.out.println(alocacao);
		
		
		
		input.close();
		
		
		

	}

}
