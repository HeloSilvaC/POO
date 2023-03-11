package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.implementacao.Busca;
import br.edu.ifpr.trabalho.poo.implementacao.Insercao;
import br.edu.ifpr.trabalho.poo.implementacao.Leitura;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;

public class TesteConexaoMatricula {
	public static void main(String[] args) {
		Leitura leitura = new Leitura();
		Busca busca = new Busca();
		Insercao insercao = new Insercao();
		Matricula matricula = leitura.lerDadosMatricula();
		insercao.salvarMatricula(matricula);
		ArrayList<Matricula> listaDeMatriculas = busca.buscarMatriculasAtivas();
		for (Matricula c : listaDeMatriculas) {
			c.imprimirDados();
		}
	}
}