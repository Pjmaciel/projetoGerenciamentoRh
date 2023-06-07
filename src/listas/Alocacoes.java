package listas;


import java.util.ArrayList;
import java.util.List;

import model.Alocacao;


public class Alocacoes {
	private List<Alocacao> alocacoes;
	
	public Alocacoes() {
		alocacoes = new ArrayList<Alocacao>();
	}
	

	
	public Alocacao addAlocacao(Alocacao alocacao) {
		alocacoes.add(alocacao);
		return alocacao;
	}
	
	public void listarAlocacoes() {
		for (Alocacao alocacao : alocacoes) {
			System.out.println("\n" +alocacao + "\n");
		}
	}
	
	
	

}
