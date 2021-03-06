package br.com.meirybank.banco.model;

import java.io.Serializable;

/**
 * Classe que representa a abertura de uma conta
 * @author Andr� Wansovicz
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> , Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para iniciar a classe conta a partir da ag�ncia e conta
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero){
		Conta.total++;
		System.out.println("O total de contas � " + Conta.getTotal());
		setAgencia(agencia);
		setNumero(numero);
		System.out.println("Estou criando uma conta!");
	}
	
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException{
		if(saldo < valor){
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		else{
			this.saldo-=valor;
		}
	}
	
	/**
	 * Valor precisa ser maior do que o saldo
	 * @param valor
	 * @param destino
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double GetSaldo(){
		return this.saldo;
	}

	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0){
			System.out.println("N�o pode N�mero <= 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0){
			System.out.println("N�o pode Ag�ncia <= 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	private static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.numero + " Saldo=" + this.saldo;
	}

	@Override
	public boolean equals(Object obj) {
		Conta compara = (Conta) obj;		
		return ((compara.agencia == this.agencia) 
				&& (compara.numero == this.numero));
	}

	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}
}
