package br.edu.ifpr.trabalho.poo.modelo;

public final class Professor extends Pessoa {

	private String siape;
	private int idProfessor;

	public Professor() {

	}

	//////////////////////
	public Professor(String nome, String cpf, String telefone, String endereco, String dataNascimento, String siape) {
		super(nome, cpf, telefone, endereco, dataNascimento);
		this.siape = siape;
	}

	//////////////////////
	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	//////////////////////
	@Override
	public void imprimirDados() {
		System.out.printf("Nome:" + this.getNome() + " CPF:" + this.getCpf() + " Telefone:" + this.getTelefone()
				+ " Endereço:" + this.getEndereco() + " Data de Nascimento:" + this.getDataNascimento() + " Siape:"
				+ this.getSiape());
		System.out.println(' ');
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

}
