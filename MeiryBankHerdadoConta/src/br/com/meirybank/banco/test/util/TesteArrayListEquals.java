package br.com.meirybank.banco.test.util;

import java.util.ArrayList;

import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente contaCorrente = new ContaCorrente(123, 111);
		lista.add(contaCorrente);
		ContaCorrente contaCorrente2 = new ContaCorrente(111, 222);
		lista.add(contaCorrente2);
		ContaCorrente contaCorrente3 = new ContaCorrente(111, 222);

		for (Conta conta : lista) {
			if (conta.equals(contaCorrente3)) {
				System.out.println("Essa conta j� existe");
			}
		}
		
		
		System.out.println("J� existe? " + lista.contains(contaCorrente2));
		System.out.println("J� existe? " + lista.contains(contaCorrente3));
	}

}
