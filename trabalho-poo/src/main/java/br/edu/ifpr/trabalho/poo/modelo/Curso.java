package br.edu.ifpr.trabalho.poo.modelo;

public class Curso {

	private int idCurso;
	private String nome;
	private String duracao;
	private String modalidade;
	private Campus campus;

	//////////////////////
	public Curso(String nome, String duracao, String modalidade, Campus campus) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}

	public Curso() {

	}

	//////////////////////
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public void imprimirDados() {
		System.out.printf("Nome:" + this.nome + " Duração:" + this.getDuracao() + " Modalidade:" + this.getModalidade()
				+ " Campus:" + this.getCampus().getIdCampus());
		System.out.println(' ');

	}

}
