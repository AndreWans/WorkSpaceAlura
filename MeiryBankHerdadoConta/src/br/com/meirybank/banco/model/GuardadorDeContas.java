package br.com.meirybank.banco.model;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLibre;
	
	public GuardadorDeContas(){
		this.referencias = new Conta[10];
	}
	
	public void adiciona(Conta conta){
		this.referencias[this.posicaoLibre] = conta;
		this.posicaoLibre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLibre;
	}

	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
	}
}
