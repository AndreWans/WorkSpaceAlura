
public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Altenticavel funcionario){
		if(funcionario.autentica(this.senha)){
			System.out.println("Pode entrar no sistema!");
		}else{
			System.out.println("N�o pode entrar no sistema!");
		}
	}

}