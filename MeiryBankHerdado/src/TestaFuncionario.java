
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Meiryane");
		funcionario.setCpf("058849685-90");
		funcionario.setSalario(26555.80);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		

	}

}
