package br.com.meirybank.banco.test;

import br.com.meirybank.banco.model.ContaCorrente;
import br.com.meirybank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	
		Object[] contas = new Object[5];
		contas[0] = new ContaCorrente(123, 857);
		contas[1] = new ContaPoupanca(193, 187);

		System.out.println(((ContaCorrente) contas[0]).getNumero());
		System.out.println(((ContaPoupanca) contas[1]).getNumero());
		

	}

}
