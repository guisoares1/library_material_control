package POO;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

@SuppressWarnings("unused")
public class ListagemView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ListagemView(material_bibliografico Material) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText(Material.Todos());
		textArea.setBounds(10, 52, 414, 198);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Listagem");
		lblNewLabel.setBounds(186, 11, 58, 14);
		contentPane.add(lblNewLabel);
	}
}
