package br.com.meirybank;

import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 456);
		conta.deposita(123.5);
		
		System.out.println(conta.GetSaldo());
	}

}
