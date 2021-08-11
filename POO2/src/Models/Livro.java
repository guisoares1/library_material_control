package Models;

import Infra.LivroDAO;

public class Livro extends Material {
	String Titulo;
	String Autor;
	String Ano;
	
	public Livro(String TituloLivro, String AutorLivro, String AnoLivro) throws Exception {
		if(TituloLivro.isEmpty() || AutorLivro.isEmpty() || AnoLivro.isEmpty())
			throw new Exception("Erro");
		else {
			this.Titulo = TituloLivro;
			this.Autor = AutorLivro;
			this.Ano = AnoLivro;
			}
	}

	public String GetTitulo() {
		return (Titulo);	
		
	}

	public String GetAutor() {
		return (Autor);	
		
	}

	public String GetAno() {
		return (Ano);	
		
	}


	@Override
	String GetListagem() {
		return ("Livro: "+GetTitulo()+" "+GetAutor()+" "+GetAno()+"\n");
	}

	@Override
	public void Insert() throws Exception {
		LivroDAO.InsertDados(new Livro(this.Titulo, this.Autor, this.Ano));
		
	}
	

}
