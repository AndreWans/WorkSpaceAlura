package br.com.meirybank.banco.test;

public class TesteArrayPrimitivo {

	public static void main(String[] args){
		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * 18;
			System.out.println(idades[i]);
		}
		
	}
}
