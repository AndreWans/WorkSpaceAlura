package br.com.meirybank.banco.model;

public class GuardadorDeReferencias {
	private Object[] referencias;
	private int posicaoLibre;
	
	public GuardadorDeReferencias(){
		this.referencias = new Object[10];
	}
	
	public void adiciona(Object conta){
		this.referencias[this.posicaoLibre] = conta;
		this.posicaoLibre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLibre;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}
}
