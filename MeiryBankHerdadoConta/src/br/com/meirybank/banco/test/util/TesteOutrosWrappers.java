package br.com.meirybank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(27); //AutoBoxing
		System.out.println(idadeRef.intValue()); //unboxinf
		

		Double doubleRef = Double.valueOf(27); //AutoBoxing
		System.out.println(doubleRef.intValue()); //unboxinf
		

		Boolean booleanRef = Boolean.FALSE; //AutoBoxing
		System.out.println(booleanRef.booleanValue()); //unboxinf

		Number numero = Integer.valueOf(27);
		Number numero2 = Double.valueOf(27.0);
		
		List<Number> lista = new ArrayList<>();
		lista.add(1);
	}

}
