package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Models.material_bibliografico;
import Models.Revista;
@SuppressWarnings("unused")
public class RevistaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public RevistaView(material_bibliografico Material) {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Incluir");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try
					{
						Material.add(new Revista(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText()));
						JOptionPane.showMessageDialog(null, "adicionado com sucesso!");
					}
					catch(Exception ex)
					{
						JOptionPane.showMessageDialog(null, "Digite corretamente todos os campos!");
					
					}
				}
			});
			btnNewButton.setBounds(45, 227, 89, 23);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Livro");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Janelas.Livro(Material);
					setVisible(false);
					}
			});
			
			btnNewButton_1.setBounds(166, 227, 89, 23);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Listagem");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Janelas.Listagem(Material);	
					setVisible(false);
				}
			});
			btnNewButton_2.setBounds(294, 227, 89, 23);
			contentPane.add(btnNewButton_2);
			
			textField = new JTextField();
			textField.setBounds(80, 41, 240, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel = new JLabel("T\u00EDtulo:");
			lblNewLabel.setBounds(45, 44, 46, 14);
			contentPane.add(lblNewLabel);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(80, 72, 240, 20);
			contentPane.add(textField_1);
			
			JLabel lblNewLabel_1 = new JLabel("ORG :");
			lblNewLabel_1.setBounds(45, 75, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(80, 103, 70, 20);
			contentPane.add(textField_2);
			
			JLabel lblNewLabel_1_1 = new JLabel("Vol    : ");
			lblNewLabel_1_1.setBounds(45, 106, 105, 14);
			contentPane.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_2 = new JLabel("Revista");
			lblNewLabel_2.setBounds(185, 16, 46, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_1_1_1 = new JLabel("Nro :");
			lblNewLabel_1_1_1.setBounds(166, 106, 105, 14);
			contentPane.add(lblNewLabel_1_1_1);
			
			JLabel lblNewLabel_1_1_2 = new JLabel("Ano  :");
			lblNewLabel_1_1_2.setBounds(291, 106, 105, 14);
			contentPane.add(lblNewLabel_1_1_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(201, 103, 70, 20);
			contentPane.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(326, 103, 70, 20);
			contentPane.add(textField_4);
		}
}
