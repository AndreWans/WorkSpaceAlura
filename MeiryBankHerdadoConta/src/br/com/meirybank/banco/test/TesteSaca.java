package br.com.meirybank.banco.test;
import br.com.meirybank.banco.model.Conta;
import br.com.meirybank.banco.model.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try{
			conta.saca(200.);
		}catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println(conta.GetSaldo());
	}

}
