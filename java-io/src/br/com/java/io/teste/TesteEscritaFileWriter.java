package br.com.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException{
		
//		OutputStream file = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(file);		
//		BufferedWriter bw = new BufferedWriter(osw);
		FileWriter fw = new FileWriter("lorem2.txt");
		fw.write(" No mundo atual, a expans�o dos mercados mundiais deve passar por modifica��es independentemente do sistema de forma��o de quadros que corresponde �s necessidades. Por outro lado, a complexidade dos estudos efetuados nos obriga � an�lise do levantamento das vari�veis envolvidas. Assim mesmo, a cont�nua expans�o de nossa atividade faz parte de um processo de gerenciamento do retorno esperado a longo prazo. Caros amigos, a valoriza��o de fatores subjetivos n�o pode mais se dissociar do or�amento setorial.");
		fw.write(System.lineSeparator());
		fw.write("Do mesmo modo, o novo modelo estrutural aqui preconizado maximiza as possibilidades por conta do fluxo de informa��es. � importante questionar o quanto o julgamento imparcial das eventualidades cumpre um papel essencial na formula��o das dire��es preferenciais no sentido do progresso. As experi�ncias acumuladas demonstram que o acompanhamento das prefer�ncias de consumo � uma das consequ�ncias das condi��es financeiras e administrativas exigidas.");
		fw.close();
	}

}
