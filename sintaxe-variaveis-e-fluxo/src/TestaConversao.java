
public class TestaConversao {
	public static void main(String[] args){
		double salario = 1270.50;
		int valor = (int)salario;
		System.out.println(valor);
		//salario = valor; um integer pode ser promovido a double sem o uso do cast.
		
		//int x = 20000000;
		//long numeroGrande = 32432423523L;
		//short valorPequeno = 2131;
		//byte b = 127;
		//float pontoFlutuante = 3.14f;
		double valor1 = 0.2;
		double valor2 = 0.1;
		double valorTotal = valor1 + valor2;
		System.out.println(valorTotal);
		
	}
}
