package br.com.meirybank.banco.test;
import br.com.meirybank.banco.model.CalculadorImposto;
import br.com.meirybank.banco.model.ContaCorrente;
import br.com.meirybank.banco.model.SeguroDeVida;

public class TestaTributaveis {

	public static void main(String[] args){
		ContaCorrente contaCorrente = new ContaCorrente(222, 3333);
		contaCorrente.deposita(100.0);
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		calculadorImposto.registra(contaCorrente);
		calculadorImposto.registra(seguroDeVida);
		
		System.out.println(calculadorImposto.getTotalImposto());
	}
}
