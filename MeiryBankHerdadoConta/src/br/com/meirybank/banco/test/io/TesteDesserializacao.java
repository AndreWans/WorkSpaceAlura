package br.com.meirybank.banco.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.meirybank.banco.model.ContaCorrente;

public class TesteDesserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();
		
		System.out.println(cc.getTitular().getNome() + ", Saldo" + cc.GetSaldo());
		
	}

}
