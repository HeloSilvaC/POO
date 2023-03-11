package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class TesteConexaoCampus {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Campus campus = leitura.lerDadosCampus();
		insercao.salvarCampus(campus);
		ArrayList<Campus> listaDeCampus = busca.buscarCampi();
		for (Campus c : listaDeCampus) {
			c.imprimirDados();
		}
	}
}