
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 2;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else{
			if(quantidadePessoas >= 2){
				System.out.println("Voc� n�o � maior, mas pode entrar porque est� acompanhado");
			}else{
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}
