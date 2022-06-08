package br.edu.ifpr.heranca;

public class VeiculoAquatico extends Veiculo {

	private int numeroDeRegistro;

	public VeiculoAquatico() {
		super();
	}

	public VeiculoAquatico(double preco, int anoFabricacao, double peso, int numeroDeRegistro) {
		super(preco, anoFabricacao, peso);
		this.numeroDeRegistro = numeroDeRegistro;
	}

	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	public void setNumeroDeRegistro(int numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

}
