package br.edu.ifpr.heranca;

public class Carro extends VeiculoTerrestre {

	private int numeroDePortas;

	public Carro() {
		super();
	}

	public Carro(double preco, int anoFabricacao, double peso, String placa, int renavam, int numeroDePortas) {
		super(preco, anoFabricacao, peso, placa, renavam);
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

}
