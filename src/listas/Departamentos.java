package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Departamento;


public class Departamentos {
	
	private List<Departamento> departamentos;

	public Departamentos() {
		departamentos = new ArrayList<Departamento>();
	}
	
	/* Recebe a entrada do usuário através do Scanner na classe program, na camada
	// de CLI, e adiciona um novo departamento na lista de departamentos do	 repositório.*/
	public void addDepartamentoFromUserInput(Scanner scanner) {
		System.out.print("\nDigite o nome do Departamento: ");
		String name = scanner.next();

		Departamento newDepartament = new Departamento(name);
		addDepartamento(newDepartament);

		System.out.println("Departamento adicionado com Sucesso!");
		

		listarDepartamentos();

	}
	
	public Departamento addDepartamento(Departamento departamento) {
		departamentos.add(departamento);
		return departamento;
	}
	
	public void listarDepartamentos() {
		for (Departamento departamento : departamentos) {
			System.out.println(departamento + "\n    • ID Departamento: "+ departamentos.indexOf(departamento));	
		}
	}	
	
	public Departamento getDepartamentosByID(int id) {
		Departamento choiceDepartamento = departamentos.get(id);
		return choiceDepartamento;
	}
	
	
}
