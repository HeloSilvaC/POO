package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TesteConexaoTurma {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Turma turma = leitura.lerDadosTurma();
		insercao.salvarTurma(turma);
		ArrayList<Turma> listaDeTurmas = busca.buscarTurmas();
		for (Turma c : listaDeTurmas) {
			c.imprimirDados();
		}
	}
}