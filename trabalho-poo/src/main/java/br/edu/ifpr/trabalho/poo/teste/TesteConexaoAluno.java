package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class TesteConexaoAluno {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Aluno alunos = leitura.lerDadosAluno();
		insercao.salvarAluno(alunos);
		ArrayList<Aluno> listaDeAlunos = busca.buscarAlunos();
		for (Aluno c : listaDeAlunos) {
			c.imprimirDados();
		}
	}
}