package br.edu.ifpr.heranca;

public class Moto extends VeiculoTerrestre {

	private int cilindradas;

	public Moto() {
		super();
	}

	public Moto(double preco, int anoFabricacao, double peso, String placa, int renavam, int cilindradas) {
		super(preco, anoFabricacao, peso, placa, renavam);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
