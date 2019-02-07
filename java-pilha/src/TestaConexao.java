
public class TestaConexao {

	public static void main(String[] args) {
	
		try(Conexao con = new Conexao()){
			con.leDados();
		}catch (IllegalStateException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Connection error!");
//		}finally {
//			if (con != null){
//				con.close();
//			}
//		}

	}

}
