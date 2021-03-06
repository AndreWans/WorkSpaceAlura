package br.com.meirybank.banco.test.util;

import java.util.LinkedList;

import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		ContaCorrente contaCorrente = new ContaCorrente(123, 111);
		lista.add(contaCorrente);
		ContaCorrente contaCorrente2 = new ContaCorrente(111, 222);
		lista.add(contaCorrente2);
		
		
		System.out.println(lista.size());
		
		Conta conta = lista.get(0);
		System.out.println(conta.getAgencia());
		

		
		System.out.println(lista.size());
		
		for (Conta contas : lista) {
			System.out.println(contas);
		}
		lista.remove(0);

	} 

}
