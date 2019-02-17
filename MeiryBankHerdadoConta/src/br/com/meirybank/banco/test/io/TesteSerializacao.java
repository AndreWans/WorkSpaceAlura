package br.com.meirybank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.meirybank.banco.model.Cliente;
import br.com.meirybank.banco.model.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new Cliente();
		cliente.setNome("Meiryane");
		cliente.setProfissao("Fonoaudiologa");
		cliente.setCpf("123.456.789-98");
		
		
		ContaCorrente cc = new ContaCorrente(123, 014);
		cc.deposita(123.65);
		cc.setTitular(cliente);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
