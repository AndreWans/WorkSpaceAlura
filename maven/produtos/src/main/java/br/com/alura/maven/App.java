package br.com.alura.maven;

public class App {
    public static void main( String[] args ){
		
    	Produto produto = new Produto("Fanta laranja", 3.25);
        System.out.println( "Produto:" + produto.getNome() + ", " + produto.getPreco());
		
    }
}
