package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Professor;

public class TesteConexaoProfessor {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Professor professor = leitura.lerDadosProfessor();
		insercao.salvarProfessor(professor);
		ArrayList<Professor> listaDeProfessores = busca.buscarProfessores();
		for (Professor c : listaDeProfessores) {
			c.imprimirDados();
		}
	}
}