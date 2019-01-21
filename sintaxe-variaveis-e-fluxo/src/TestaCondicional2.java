
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidade = 3;
		boolean acompanhado = quantidade >=2;
		
		System.out.println("valor de acompanhado = " +acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
	}
}
