package model;

public class Alocacao {

	private Professor professor;
	private Curso curso;
	private String diaDaSemana;
	private String horario;

	public Alocacao(Professor professor, Curso curso, String diaDaSemana, String horario) {
		this.professor = professor;
		this.curso = curso;
		this.diaDaSemana = diaDaSemana;
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Alocacao \n" + professor + "\n" + curso + "\nDia da Semana: " + diaDaSemana + "\nHorario: " + horario;
	}

}
