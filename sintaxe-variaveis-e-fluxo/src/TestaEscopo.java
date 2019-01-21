
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoa = 3;
		//boolean acompanhado = quantidadePessoa >=2;
		boolean acompanhado;
		
		if(quantidadePessoa >= 2){
			acompanhado = true;
		}else{
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " +acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Você não pode entrar");
		}
	}
}
