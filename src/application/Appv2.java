package application;

import static java.lang.System.out;

import java.util.Scanner;

import listas.Alocacoes;
import listas.Cursos;
import listas.Departamentos;
import listas.Professores;
import model.Alocacao;
import model.Professor;



public class Appv2 {
	static Scanner input = new Scanner(System.in);
	private static Departamentos listaDepartamentos = new Departamentos();
	private static Professores listaProfessores = new Professores();
	private static Cursos listaCursos = new Cursos();
	private static Alocacoes listaAlocacoes = new Alocacoes();

	public static void main(String[] args) {
		try {
			allocationApp();
		} finally {
			input.close();
		}
		
	}

	public static void allocationApp() {
		
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("------Bem Vindos ao GerenciamentoRH APP v0.2 -------");
		System.out.println("----------------------------------------------------");
		System.out.println("******** Escolha o numero da operação *******");
		System.out.println("----------------------------------------------------");
		System.out.println("|             Option 1 - Registro                   |");
		System.out.println("|             Option 2 - Mostrar Registros          |");
		System.out.println("|             Option 3 - Sair                       |");
		System.out.println("");
		System.out.print("Choice: ");

		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			register();
		}
			break;

		case 2: {
			showRegister();
		}
			break;

		case 3: {
			System.out.println("------------- Programa Encerrado ---------- ");
			System.exit(0);
		}

		default:
			System.out.println("Opção Invalida, Tente Novamente...");
			allocationApp();
			break;

		}

	}

	public static void register() {
		

		System.out.println("-----------------------------------------------");
		System.out.println("********* Digite o numero da Opecação *********");
		System.out.println("-----------------------------------------------");
		System.out.println("|   Option 1 - Registrar Departamento           |");
		System.out.println("|   Option 2 - Registrar Professor              |");
		System.out.println("|   Option 3 - Registrar curso                  |");
		System.out.println("|   Option 4 - Registrar Alocação               |");
		System.out.println("|   Option 5 - Back To Menu                     |");
		System.out.println("");
		System.out.print("Choice: ");

		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			listaDepartamentos.addDepartamentoFromUserInput(input);
			register();

		}
			break;

		case 2: {
			out.print("\nDigite o nome do Professor: ");
			String name = input.next();
			out.print("\nDigite o CPF do professor: ");
			String cpf = input.next();

			listaDepartamentos.listarDepartamentos();

			out.print("\nDigite o numero do ID do Departamento:  ");
			int id = input.nextInt();

			Professor newProfessor = new Professor(name, 
					                               cpf, 
					                               listaDepartamentos.getDepartamentosByID(id));
			listaProfessores.addProfessor(newProfessor);

			System.out.println("Professor Adicionado com Sucesso");

			listaProfessores.listarProfessores();
			register();

		}
			break;

		case 3: {
			listaCursos.addDepartamentoFromUserInput(input);
			register();

		}
			break;

		case 4: {
			listaProfessores.listarProfessores();
			out.print("\nDigite o numero do ID do Professor Correspondente: ");
			int idCurso = input.nextInt();

			listaCursos.listarCursos();

			out.print("\n Digite o numero do ID do Curso Correspondente: ");
			int idProfessor = input.nextInt();
			out.print("\n Digite o dia da Semana para essa alocação:  ");
			String diaDaSemana = input.next();
			out.print("\n Digite o horario da alocação ");
			String hora = input.next();

			Alocacao newAlocacao = new Alocacao(listaProfessores.getProfessorByID(idProfessor),
					                            listaCursos.getCursosByID(idCurso),
					                            diaDaSemana, 
					                            hora);
			listaAlocacoes.addAlocacao(newAlocacao);

			System.out.println("Alocação Adicionada com Sucesso");

			listaAlocacoes.listarAlocacoes();

			register();

		}
			break;

		case 5: {
			allocationApp();
		}
			break;

		default:
			System.out.println("Opção Invalida, Tente Novamente...");
			register();
			break;

		}

	}

	public static void showRegister() {

		System.out.println("-----------------------------------------------");
		System.out.println("******** Selecione o numero da Operação *******");
		System.out.println("-----------------------------------------------");
		System.out.println("|   Option 1 - Exibir Departamentos registrados |");
		System.out.println("|   Option 2 - Exibir Professores registrados   |");
		System.out.println("|   Option 3 - Exibir Cursos registrados        |");
		System.out.println("|   Option 4 - Exibir Alocações registradas     |");
		System.out.println("|   Option 5 - Voltar para o menu principal     |");
		System.out.println("");
		System.out.print("Choice: ");

		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			listaDepartamentos.listarDepartamentos();
			showRegister();

		}
			break;

		case 2: {
			listaProfessores.listarProfessores();
			showRegister();

		}
			break;

		case 3: {
			listaCursos.listarCursos();
			showRegister();

		}
			break;

		case 4: {
			listaAlocacoes.listarAlocacoes();
			showRegister();

		}
			break;

		case 5: {
			allocationApp();
		}
			break;

		default:
			System.out.println("Opção Invalida, Tente Novamente...");
			showRegister();
			break;
		}  
		
	}

}
