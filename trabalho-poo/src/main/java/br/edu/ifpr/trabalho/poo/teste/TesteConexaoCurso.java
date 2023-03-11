package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Curso;

public class TesteConexaoCurso {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Curso curso = leitura.lerDadosCurso();
		insercao.salvarCurso(curso);
		ArrayList<Curso> listaDeCursos = busca.buscarCursos();
		for (Curso c : listaDeCursos) {
			c.imprimirDados();
		}
	}
}