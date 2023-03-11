package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TesteConexaoDisciplina {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();

		Professor professor = leitura.lerDadosProfessor();
		Turma turma = leitura.lerDadosTurma();

		Disciplina disciplina = leitura.lerDadosDisciplina(professor, turma);
		insercao.salvarDisciplina(disciplina);
		ArrayList<Disciplina> listaDeDisciplinas = busca.buscarDisciplinas();
		for (Disciplina c : listaDeDisciplinas) {
			c.imprimirDados();
		}
	}
}