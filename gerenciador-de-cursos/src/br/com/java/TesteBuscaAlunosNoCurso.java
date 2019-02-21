package br.com.java;

public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Traalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		Aluno a1 = new Aluno("Meiryane Wansovicz", 123258);
		Aluno a2 = new Aluno("André Wansovicz", 148512);
		Aluno a3 = new Aluno("Joãozinho das Couves", 325887);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Quem é o aluno 148512?");
		Aluno aluno = javaColecoes.buscaMatriculado(14812);

		System.out.println(aluno);
		
	}

}
