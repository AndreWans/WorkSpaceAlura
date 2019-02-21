package br.com.java;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Funcionario {
	
	public static void main(String[] args){

		Funcionario f1 = new Funcionario("Matusa",105);
		Funcionario f2 = new Funcionario("Kid",2);
		Funcionario f3 = new Funcionario("OldBoy",35);
	
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterator = funcionarios.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next().getNome());
		}
	}

	private String nome;
	private int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}

class OrdenaPorIdade implements Comparator<Funcionario> {
	
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}

}
