
public class TestaFatorial {

	public static void main(String[] args) {
		
		for(int n = 1; n <= 10; n++){
			int fatorial = 1;
			for(int n2= 1; n2 <=n; n2++){
				fatorial = fatorial *= n2;
			}
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
		
		int fatorial = 1;
		for(int i = 1; i <11; i++){
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
