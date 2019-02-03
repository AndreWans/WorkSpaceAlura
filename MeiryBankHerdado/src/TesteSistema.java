
public class TesteSistema {

	public static void main(String[] args){
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		
		Administrador administrador = new Administrador();
		administrador.autentica(2222);
	}
}
