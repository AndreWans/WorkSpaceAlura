package br.com.meirybank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		int idade = 27;
		
		Integer idadeRef = Integer.valueOf(27);
		int valor = idadeRef.intValue();
		
		String s = args[0];
		
		int valor2 = Integer.parseInt(s);
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);
	}

}
