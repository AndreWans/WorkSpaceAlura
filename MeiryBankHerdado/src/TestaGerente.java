
public class TestaGerente {

	public static void main(String[] args){
		Gerente gerente = new Gerente();
		gerente.setNome("Meiry");
		gerente.setCpf("058.654.897.35");
		gerente.setSalario(12582.58);
		gerente.setSenha(123);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		boolean autendicou = gerente.autentica(123);

		System.out.println(autendicou);
		System.out.println(gerente.getBonificacao());
	}
}
