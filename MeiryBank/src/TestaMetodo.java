
public class TestaMetodo {

	public static void main(String[] args){
		Conta contaDaMeiry = new Conta();
		contaDaMeiry.saldo = 100;
		contaDaMeiry.deposita(50);
		System.out.println(contaDaMeiry.saldo);
		
		boolean conseguiuSacar = contaDaMeiry.saca(50);
		
		System.out.println(contaDaMeiry.saldo);
		System.out.println(conseguiuSacar);
		
		Conta contaDestino = new Conta();
		contaDestino.deposita(300);
		System.out.println(contaDestino.saldo);
		
		contaDaMeiry.transfere(50, contaDestino);
		System.out.println(contaDaMeiry.saldo);
		System.out.println(contaDestino.saldo);
		
		if(contaDaMeiry.transfere(50, contaDestino)){
			System.out.println("Transferência realizada com sucesso!");
		}else{
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDestino.saldo);	
		
		contaDaMeiry.titular = "Meiry Wansovicz";
		
		System.out.println(contaDaMeiry);


	}
}
