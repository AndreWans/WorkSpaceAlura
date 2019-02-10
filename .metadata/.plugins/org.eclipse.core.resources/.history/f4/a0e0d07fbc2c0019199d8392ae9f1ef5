
public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try{
			conta.saca(200.);
		}catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println(conta.GetSaldo());
	}

}
