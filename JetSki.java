package br.edu.ifpr.heranca;

public class JetSki extends VeiculoAquatico {

	private int cilindradas;

	public JetSki() {
		super();
	}

	public JetSki(double preco, int anoFabricacao, double peso, int numeroDeRegistro, int cilindradas) {
		super(preco, anoFabricacao, peso, numeroDeRegistro);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
