
public class TestaGetESet {

	public static void main(String[] args){
		Conta conta = new Conta(1,5);
		conta.setNumero(19);
		conta.setAgencia(4);
		conta.deposita(15);;
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		System.out.println(conta.GetSaldo());
		
		Cliente Meiry = new Cliente();
		conta.setTitular(Meiry);
		Meiry.setNome("Meiry");
		Meiry.setCpf("074.525.478-85");
		Meiry.setProfissao("Fono");
		
		System.out.println(conta.getTitular().getNome());
	}
}
