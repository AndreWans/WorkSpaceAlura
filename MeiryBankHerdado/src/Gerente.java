
public class Gerente extends Funcionario implements Altenticavel{

	private AutenticacaoUtil autenticador;
	
	public double getBonificacao(){
		return super.getSalario();
	}

	public Gerente(){
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
