package View;
import java.awt.EventQueue;
import Models.material_bibliografico;

public class Janelas {

	public static void Livro(material_bibliografico material) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LivroView frame = new LivroView(material);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Listagem(material_bibliografico material) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListagemView frame = new ListagemView(material);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Revista(material_bibliografico material) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RevistaView frame = new RevistaView(material);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
