
public class CriaConta {

	public static void main(String[] args){
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("A primeira conta tem R$"+ primeiraConta.saldo );
		System.out.println("A segunda conta tem R$"+ segundaConta.saldo );
		
		System.out.println("A primeira conta tem R$"+ primeiraConta.agencia);
		System.out.println("A primeira conta tem R$"+ primeiraConta.numero);
		
		System.out.println("A primeira conta tem R$"+ segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("A primeira conta est� na ag�ncia:"+ primeiraConta.agencia);
		System.out.println("Agora a segunda conta est� na ag�ncia:"+ segundaConta.agencia);
		
		if(primeiraConta == segundaConta){
			System.out.println("S�o iguais!");
		}else{
			System.out.println("S�o contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
