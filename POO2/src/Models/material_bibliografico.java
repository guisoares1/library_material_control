package Models;
import java.util.ArrayList;
import Infra.LivroDAO;
import Infra.ResvistaDAO;
public class material_bibliografico {
	
	public void add(Material material) throws Exception {
		// adicionar banco
		material.Insert();
	}
	
	public String Todos() throws Exception {
		String ListagemTodos="";
		// percorrer banco
		ArrayList<Revista> Revistas = new ArrayList<Revista>();
		Revistas = ResvistaDAO.GetDados();
		
		ArrayList<Livro> Livros = new ArrayList<Livro>();
		Livros = LivroDAO.GetDados();
		
		for(Revista r : Revistas) {
			ListagemTodos += r.GetListagem();
		}
		for(Livro l : Livros) {
			ListagemTodos += l.GetListagem();
		}
		
		return(ListagemTodos);
	}
	
}
