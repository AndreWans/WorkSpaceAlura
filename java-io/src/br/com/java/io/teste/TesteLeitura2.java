package br.com.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = Double.parseDouble(linhaScanner.next());
			
			System.out.println(String.format(
				new Locale("pt","BR"), "Tipo da Conta:%s Ag�ncia: %04d N�mero:%08d Nome: %s Saldo: R$%10.2f %n", 
				tipoConta,agencia, numero, titular, saldo)
			);
			
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(valores[1]);
		}
		scanner.close();
	}

}
