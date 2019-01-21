
public class TestaValores {

	public static void main(String[] args){
		Conta conta = new Conta(2,5);
		Conta conta2 = new Conta(2,5);
		conta.setAgencia(-1);
		conta.setNumero(-2);
		System.out.println(conta.getAgencia());
		conta2.setAgencia(-1);
		conta2.setNumero(-2);
		System.out.println(conta2.getAgencia());
	}
}
