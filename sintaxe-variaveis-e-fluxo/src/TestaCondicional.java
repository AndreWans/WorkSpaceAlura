
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 2;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else{
			if(quantidadePessoas >= 2){
				System.out.println("VocÊ não é maior, mas pode entrar porque está acompanhado");
			}else{
				System.out.println("Você não pode entrar");
			}
		}
	}
}
