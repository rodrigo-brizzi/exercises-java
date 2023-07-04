package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql); //Execução com parametro
		stmt.setString(1,  nome);
		//stmt.setInt(2, 100); //Coluna do tipo auto incremento no mysql não impede receber um codigo
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		entrada.close();
	}
}
