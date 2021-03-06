package br.com.meirybank.banco.test;

import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;
import br.com.meirybank.banco.model.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		ContaCorrente contaCorrente = new ContaCorrente(123, 258);
		ContaCorrente contaCorrente2 = new ContaCorrente(111, 222);
		guardador.adiciona(contaCorrente);
		guardador.adiciona(contaCorrente2);
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta conta = guardador.getReferencia(0);
		System.out.println(conta.getAgencia());
	}

}
