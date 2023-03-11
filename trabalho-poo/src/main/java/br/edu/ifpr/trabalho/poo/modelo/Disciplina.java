package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {

	private int idDisciplina;
	private String nome;
	private Professor professor;
	private Turma turma;

	//////////////////////
	public Disciplina(String nome, Professor professor, Turma turma) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.turma = turma;
	}

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	//////////////////////
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public void imprimirDados() {
		System.out.println("Nome:" + this.nome);

	}
}
