
public class TestaContaSemCliente {

	public static void main(String[] args){
		Conta contaDaMeiry = new Conta();
		System.out.println(contaDaMeiry.GetSaldo());
		contaDaMeiry.titular = new Cliente();
		
		
		contaDaMeiry.titular.nome = "Meiryane";
		System.out.println(contaDaMeiry.titular.nome);
	}
}
