package br.com.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreanPrintWriter {

	public static void main(String[] args) throws IOException{

//		PrintStream ps = new PrintStream("lorem2.txt");
		PrintWriter ps = new PrintWriter("lorem.txt");
		ps.println(" No mundo atual, a expansão dos mercados mundiais deve passar por modificações independentemente do sistema de formação de quadros que corresponde às necessidades. Por outro lado, a complexidade dos estudos efetuados nos obriga à análise do levantamento das variáveis envolvidas. Assim mesmo, a contínua expansão de nossa atividade faz parte de um processo de gerenciamento do retorno esperado a longo prazo. Caros amigos, a valorização de fatores subjetivos não pode mais se dissociar do orçamento setorial.");
		ps.println();
		ps.println("Do mesmo modo, o novo modelo estrutural aqui preconizado maximiza as possibilidades por conta do fluxo de informações. É importante questionar o quanto o julgamento imparcial das eventualidades cumpre um papel essencial na formulação das direções preferenciais no sentido do progresso. As experiências acumuladas demonstram que o acompanhamento das preferências de consumo é uma das consequências das condições financeiras e administrativas exigidas.");
		ps.close();
	}
}
