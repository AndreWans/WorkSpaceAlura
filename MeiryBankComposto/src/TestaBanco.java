
public class TestaBanco {
	public static void main(String[] args){
		Cliente meiry = new Cliente();
		meiry.nome = "Meiry G. Wansovicz";
		meiry.cpf = "014.459.658-57";
		meiry.profissao = "Fono";
		
		Conta contaDaMeiry = new Conta();
		contaDaMeiry.titular = meiry;
		contaDaMeiry.deposita(100);
		System.out.println("Saldo da conta � R$ " + contaDaMeiry.GetSaldo());
		System.out.println(contaDaMeiry.titular.nome);
	}
}
