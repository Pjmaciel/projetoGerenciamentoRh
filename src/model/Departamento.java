package model;

public class Departamento {

	private String nome;
	private String sigla;

	public Departamento(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento : " + this.nome;
	}
}
