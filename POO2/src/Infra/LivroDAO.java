package Infra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.Livro;

public class LivroDAO   {
	static Connection conexao = null;

	public static ArrayList <Livro> GetDados() throws Exception {
		ArrayList <Livro> vetLivro = new ArrayList<Livro>();
		
		conexao = Conexao.getInstance();
		
		String sql = "SELECT titulo,autor,ano FROM livro"; 
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultadovet = stmt.executeQuery(); 
		
		Livro retorno = null;
		
		while (resultadovet.next()) { 
			retorno = new Livro(
					resultadovet.getString("titulo"),
					resultadovet.getString("autor"),
					resultadovet.getString("ano") 
					);
			
			vetLivro.add(retorno); 
		}

		resultadovet.close();
		stmt.close();
				
		return vetLivro;
	}


	public static void InsertDados(Livro livro) throws Exception {
		conexao = Conexao.getInstance();
		
		String sql = "INSERT INTO livro(titulo, autor, ano) VALUES (?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, livro.GetTitulo());
		stmt.setString(2, livro.GetAutor());
		stmt.setString(3, livro.GetAno());
		
		stmt.execute();
		stmt.close();

		
	}

}
