
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta conta = new Conta();
		try{
			conta.deposita();
		}catch(MinhaException exception){
			System.out.println("tratamento...");
		}
	}

}
