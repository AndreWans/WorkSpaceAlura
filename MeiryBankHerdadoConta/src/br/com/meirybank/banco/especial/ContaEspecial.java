package br.com.meirybank.banco.especial;

import br.com.meirybank.banco.model.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero){
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
