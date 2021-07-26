package POO;
import java.util.Vector;
public class material_bibliografico {
	Vector<Material> Material_biblio = new Vector<Material>();
	
	public void add(Material material) {
		Material_biblio.add(material);
	}
	
	public String Todos() {
		String ListagemTodos="";
		for(int contador=0; contador<Material_biblio.size();contador++) {
			ListagemTodos += Material_biblio.elementAt(contador).GetListagem();
		}
		return(ListagemTodos);
	}
	
}
