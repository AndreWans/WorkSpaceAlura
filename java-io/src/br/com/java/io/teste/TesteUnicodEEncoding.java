package br.com.java.io.teste;

import java.nio.charset.Charset;

public class TesteUnicodEEncoding {

	public static void main(String[] args) {

		String s = "A";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes();
		System.out.println(bytes.length +", " + charset.displayName() );
	}

}
