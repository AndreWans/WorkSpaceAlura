
public class TestaLacos2 {

	public static void main(String[] args) {
		for(int linha = 0; linha <=10; linha++){
			for(int coluna = 0; coluna <=linha; coluna++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int numero = 1; numero <=100; numero++){
			if(numero % 3 == 0){
				System.out.println(numero);
			}
		}
		for(int i=3; i < 100; i+=3){
			System.out.println(i);
		}
	}
}
