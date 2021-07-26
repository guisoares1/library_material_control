package POO;


public class Livro extends Material {
	String Titulo;
	String Autor;
	String Ano;
	
	public Livro(String TituloLivro, String OrgLivro, String VolLivro) throws Exception {
		if(TituloLivro.isEmpty() || OrgLivro.isEmpty() || VolLivro.isEmpty())
			throw new Exception("Erro");
		else {
			this.Titulo = TituloLivro;
			this.Autor = OrgLivro;
			this.Ano = VolLivro;
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
	

}
