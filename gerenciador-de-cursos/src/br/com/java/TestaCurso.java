package br.com.java;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas == javaColecoes.getAulas());
//		javaColecoes.getAulas().add(new Aula("Traalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Traalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		System.out.println(javaColecoes.getAulas());
	}

}
