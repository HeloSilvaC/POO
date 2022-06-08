package br.edu.ifpr.heranca;

public class Lancha extends VeiculoAquatico {

	private int capacidadeMaximaDePessoas;

	public Lancha() {
		super();
	}

	public Lancha(double preco, int anoFabricacao, double peso, int numeroDeRegistro, int capacidadeMaximaDePessoas) {
		super(preco, anoFabricacao, peso, numeroDeRegistro);
		this.capacidadeMaximaDePessoas = capacidadeMaximaDePessoas;
	}

	public int getCapacidadeMaximaDePessoas() {
		return capacidadeMaximaDePessoas;
	}

	public void setCapacidadeMaximaDePessoas(int capacidadeMaximaDePessoas) {
		this.capacidadeMaximaDePessoas = capacidadeMaximaDePessoas;
	}

}
