package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class Leitura implements ILeituraDeDados {

	Scanner teclado = new Scanner(System.in);

	public Aluno lerDadosAluno() {
		System.out.println("Informe o nome do aluno:");
		String nome = teclado.nextLine();
		System.out.println("Informe o CPF do aluno:");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do aluno:");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do aluno:");
		String endereco = teclado.nextLine();
		System.out.println("Informe o data de nascimento do aluno:");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe o ano ingresso do aluno:");
		int anoIngresso = teclado.nextInt();
		Aluno aluno = new Aluno(nome, cpf, telefone, endereco, dataNascimento, anoIngresso);
		return aluno;
	}

	public Professor lerDadosProfessor() {
		System.out.println("Informe o nome do professor:");
		String nome = teclado.nextLine();
		System.out.println("Informe o CPF do professor:");
		String cpf = teclado.nextLine();
		System.out.println("Informe o telefone do professor:");
		String telefone = teclado.nextLine();
		System.out.println("Informe o endereço do professor:");
		String endereco = teclado.nextLine();
		System.out.println("Informe o data de nascimento do professor:");
		String dataNascimento = teclado.nextLine();
		System.out.println("Informe o siape do professor:");
		String siape = teclado.nextLine();
		Professor professor = new Professor(nome, cpf, telefone, endereco, dataNascimento, siape);
		return professor;
	}

	public Curso lerDadosCurso() {
		System.out.println("Informe o nome do curso:");
		String nome = teclado.nextLine();
		System.out.println("Informe a duração do curso:");
		String duracao = teclado.nextLine();
		System.out.println("Informe a modalidade do curso:");
		String modalidade = teclado.nextLine();
		System.out.println("Informe o id do campus do curso:");
		int idCampus = teclado.nextInt();
		Campus campus = new Campus();
		campus.setIdCampus(idCampus);
		Curso curso = new Curso(nome, duracao, modalidade, campus);
		return curso;
	}

	public Turma lerDadosTurma() {
		System.out.println("Informe o nome da turma:");
		String nome = teclado.nextLine();
		System.out.println("Informe o número mínimo de alunos necessários:");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano ingresso:");
		int anoIngresso = teclado.nextInt();
		System.out.println("Informe o id do curso do curso:");
		int idCurso = teclado.nextInt();
		Curso curso = new Curso();
		curso.setIdCurso(idCurso);
		Turma turma = new Turma(nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public Turma lerDadosTurma(Curso curso) {
		System.out.println("Informe o nome da turma:");
		String nome = teclado.nextLine();
		System.out.println("Informe o número mínimo de alunos necessários:");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Informe o ano ingresso:");
		int anoIngresso = teclado.nextInt();
		Turma turma = new Turma(nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		System.out.println("Informe o nome da disciplina:");
		String nome = teclado.nextLine();
		Disciplina disciplina = new Disciplina(nome, professor, turma);
		return disciplina;
	}

	public Matricula lerDadosMatricula() {
		System.out.println("Informe o RA:");
		String ra = teclado.nextLine();
		System.out.println("Informe a data:");
		String data = teclado.nextLine();
		System.out.println("Informe a situação:");
		boolean situacao = teclado.nextBoolean();
		System.out.println("Informe o id do aluno:");
		int idAluno = teclado.nextInt();
		Aluno aluno = new Aluno();
		aluno.setIdAluno(idAluno);
		System.out.println("Informe o id da turma:");
		int idTurma = teclado.nextInt();
		Turma turma = new Turma();
		turma.setIdTurma(idTurma);
		Matricula matricula = new Matricula(ra, data, situacao, aluno, turma);
		return matricula;

	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		System.out.println("Informe o RA:");
		String ra = teclado.nextLine();
		System.out.println("Informe a data:");
		String data = teclado.nextLine();
		System.out.println("Informe a situação:");
		boolean situacao = teclado.nextBoolean();
		System.out.println("Informe o aluno:");
		Matricula matricula = new Matricula(ra, data, situacao, aluno, turma);
		return matricula;
	}

	public Campus lerDadosCampus() {
		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);
		return campus;

	}
}
