package br.com.java;

public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Traalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));

		Aluno a1 = new Aluno("Meiryane Wansovicz", 123258);
		Aluno a2 = new Aluno("Andr� Wansovicz", 148512);
		Aluno a3 = new Aluno("Jo�ozinho das Couves", 325887);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Quem � o aluno 148512?");
		Aluno aluno = javaColecoes.buscaMatriculado(14812);

		System.out.println(aluno);
		
	}

}
