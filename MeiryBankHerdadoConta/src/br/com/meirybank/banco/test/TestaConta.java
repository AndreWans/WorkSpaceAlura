package br.com.meirybank.banco.test;
import br.com.meirybank.banco.model.ContaCorrente;
import br.com.meirybank.banco.model.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(1, 111);
		contaCorrente.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(1, 222);
		contaPoupanca.deposita(200.0);
		
		try{
			contaCorrente.transfere(10.0, contaPoupanca);
		}catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		System.out.println("Conta Corrente: " + contaCorrente.GetSaldo());
		System.out.println("Conta Poupan�a: " + contaPoupanca.GetSaldo());

	}

}
