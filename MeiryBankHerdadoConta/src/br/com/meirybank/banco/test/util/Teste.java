package br.com.meirybank.banco.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.meirybank.banco.model.Cliente;
import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22,33);
		cc1.deposita(333.0);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Meiryane");
		cc1.setTitular(clienteCC1);
		
		Conta cc2 = new ContaCorrente(22,44);
		cc2.deposita(444.0);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Andr�");
		cc2.setTitular(clienteCC2);
		
		Conta cc3 = new ContaCorrente(22,11);
		cc3.deposita(111.0);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Jo�o");
		cc3.setTitular(clienteCC3);
		
		Conta cc4 = new ContaCorrente(22,22);
		cc4.deposita(222.0);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Pedro");
		cc4.setTitular(clienteCC4);
		
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		lista.sort(null);
		
		lista.sort( (conta1, conta2) -> Integer.compare(conta1.getNumero(), conta2.getNumero()));
		
		System.out.println("");
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
				
		lista.sort(new TitularDaContaComparator());
		
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
		
		Collections.sort(lista, new TitularDaContaComparator());
		
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
		
		Collections.reverse(lista);
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
		
		Collections.sort(lista);
		
		lista.forEach( (conta) -> System.out.println(conta + "  " + conta.getTitular().getNome()) );
		
		for (Conta conta : lista) {
			System.out.println(conta + "  " + conta.getTitular().getNome());
		}
			

	}

}
