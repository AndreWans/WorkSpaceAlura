
public class TestaReferencias {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSalario(5000.0);
			
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0); 
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorVideo);
		System.out.println(controle.getSoma());


	}

}
