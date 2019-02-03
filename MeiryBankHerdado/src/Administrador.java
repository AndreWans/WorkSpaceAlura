
public class Administrador extends Funcionario implements Altenticavel{
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	
	private AutenticacaoUtil autenticador;
	
	public Administrador(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
