package Infra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Models.Revista;

public class ResvistaDAO {
	static Connection conexao = null;

	public static ArrayList <Revista> GetDados() throws Exception {
		ArrayList <Revista> vetRevista = new ArrayList<Revista>();
		
		conexao = Conexao.getInstance();
		
		String sql = "SELECT titulo,org,nro,vol,ano FROM revista"; 
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultadovet = stmt.executeQuery(); 
		
		Revista retorno = null;
		
		while (resultadovet.next()) { 
			retorno = new Revista(
					resultadovet.getString("titulo"),
					resultadovet.getString("org"),
					resultadovet.getString("nro"),
					resultadovet.getString("vol"),
					resultadovet.getString("ano") 
					);
			
			vetRevista.add(retorno); 
		}

		resultadovet.close();
		stmt.close();
				
		return vetRevista;
	}


	public static void InsertDados(Revista revista) throws Exception {
		conexao = Conexao.getInstance();
		
		String sql = "INSERT INTO revista(titulo, org, nro, vol, ano) VALUES (?,?,?,?,?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, revista.GetTitulo());
		stmt.setString(2, revista.GetOrg());
		stmt.setString(3, revista.GetNro());
		stmt.setString(4, revista.GetVol());
		stmt.setString(5, revista.GetAno());
		
		stmt.execute();
		stmt.close();

		
	}

}
