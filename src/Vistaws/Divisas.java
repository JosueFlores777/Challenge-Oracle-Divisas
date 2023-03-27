package Vistaws;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Divisas extends JPanel {
	private JTextField txtCantidad;
	private JTextField txtRespuesta;

	public Divisas() {
		setBounds(0, 0, 737, 517);
		setBackground(new Color(40, 32, 40));
		setLayout(null);
		RoundedPanel panel = new RoundedPanel(130);
		 
		JLabel lblNewLabel = new JLabel("Conversor De Divisas");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setIcon(new ImageIcon(Divisas.class.getResource("/Img/divisas.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(425, 11, 294, 55);
		add(lblNewLabel);
		
		//JPanel panel = new JPanel();
		panel.setBackground(new Color(40, 32, 40));
		panel.setBounds(22, 64, 687, 410);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Desde La Divisa");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 44, 624, 34);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\presupuesto.png"));
		btnNewButton.setBounds(145, 331, 145, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\basura.png"));
		btnNewButton_1.setBounds(331, 331, 145, 46);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("A la Divisa");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_2.setBounds(389, 54, 268, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese Cantidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_3.setBounds(37, 162, 620, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Respuesta De La Conversion");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_4.setBounds(389, 162, 268, 34);
		panel.add(lblNewLabel_4);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char validar= evt.getKeyChar();
				
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					evt.consume();
					
					JOptionPane.showConfirmDialog(getRootPane(), "Ingresar Solo numero");
				}
			}
		});
		txtCantidad.setFont(new Font("SansSerif", Font.PLAIN, 25));
		txtCantidad.setBackground(new Color(220, 220, 220));
		txtCantidad.setBounds(59, 209, 194, 46);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtRespuesta = new JTextField();
		txtRespuesta.setEditable(false);
		txtRespuesta.setEnabled(false);
		txtRespuesta.setFont(new Font("SansSerif", Font.PLAIN, 25));
		txtRespuesta.setBackground(new Color(220, 220, 220));
		txtRespuesta.setBounds(426, 208, 194, 46);
		panel.add(txtRespuesta);
		txtRespuesta.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 89, 194, 46);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(426, 89, 200, 46);
		panel.add(comboBox_1);
		
		JLabel lblMessgeError = new JLabel("");
		lblMessgeError.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMessgeError.setForeground(new Color(255, 0, 0));
		lblMessgeError.setBounds(255, 266, 187, 31);
		panel.add(lblMessgeError);
	}
}
