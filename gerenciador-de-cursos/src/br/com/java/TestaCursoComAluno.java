package br.com.java;

public class TestaCursoComAluno {

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

		javaColecoes.getAlunos().forEach(alunos -> {
			System.out.println(alunos);
		});
		
		System.out.println("O aluno " + a1 + "est� matriculado?\n" + javaColecoes.estaMatricula(a1));
	
		Aluno meiryane = new Aluno("Meiryane Wansovicz", 123258);
		System.out.println(javaColecoes.estaMatricula(meiryane));
	}

}
