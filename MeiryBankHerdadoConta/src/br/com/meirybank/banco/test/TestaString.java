package br.com.meirybank.banco.test;

public class TestaString {

	public static void main(String[] args) {
		
		String nome = "Teste";//object literal
//		String nome = new String("Teste");
		
		String nome2 = nome.replace('T', 't');
		String nome3 = nome.toLowerCase();
		String nome4 = nome.toUpperCase();
		String nome5 = nome.replace("Te", "te");
		char caractere = nome.charAt(2);
		int index = nome.indexOf("te");
		String nome8 = nome.substring(0, 2);
			
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(nome4);
		System.out.println(nome5);
		System.out.println(caractere);
		System.out.println(index);
		System.out.println(nome8);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		System.out.println(nome.isEmpty());
		String nome9 = "    teste";
		String nome10 = nome9.trim();
		System.out.println(nome10);
		System.out.println(nome10.contains("tes"));
		
	}

}
