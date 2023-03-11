package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa {

	private int anoIngresso;
	private int idAluno;

	public Aluno() {

	}

	//////////////////////
	public Aluno(String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso) {
		super(nome, cpf, telefone, endereco, dataNascimento);
		this.setAnoIngresso(anoIngresso);
	}

	//////////////////////
	@Override
	public void imprimirDados() {
		System.out.printf("Nome:" + this.nome + " CPF:" + this.cpf + " Telefone:" + this.telefone + " Endereço:"
				+ this.endereco + " Data de Nascimento:" + this.dataNascimento + " Ano Ingresso:" + this.anoIngresso);
		System.out.println(' ');

	}

	//////////////////////
	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

}
