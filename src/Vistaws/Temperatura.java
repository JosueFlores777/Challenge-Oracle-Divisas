package Vistaws;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class Temperatura extends JPanel {
	private JTextField TxtCantiTempe;
	private JTextField txtRespueTemp;

	/**
	 * Create the panel.
	 */
	public Temperatura() {
		setBounds(0, 0,719, 484);
		setBackground(new Color(40, 32, 40));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor De Temperaturas");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setIcon(new ImageIcon(Temperatura.class.getResource("/Img/temperatura.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(345, 11, 351, 55);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 58, 687, 396);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Temperatura a.");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 44, 240, 34);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\humedad.png"));
		btnNewButton.setBounds(145, 308, 145, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\basura.png"));
		btnNewButton_1.setBounds(331, 308, 145, 46);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Temperatura ");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_2.setBounds(389, 54, 268, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese Cantidad\r\n");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_3.setBounds(37, 162, 194, 34);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Respuesta De La Conversion");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_4.setBounds(389, 162, 268, 34);
		panel.add(lblNewLabel_4);
		

		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(59, 89, 194, 46);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(426, 89, 200, 46);
		panel.add(comboBox_1);
		
		TxtCantiTempe = new JTextField();
		TxtCantiTempe.setFont(new Font("SansSerif", Font.PLAIN, 25));
		TxtCantiTempe.setBackground(new Color(175, 238, 238));
		TxtCantiTempe.setBounds(426, 208, 194, 46);
		panel.add(TxtCantiTempe);
		TxtCantiTempe.setColumns(10);
		
		txtRespueTemp = new JTextField();
		txtRespueTemp.setFont(new Font("SansSerif", Font.PLAIN, 25));
		txtRespueTemp.setBackground(new Color(220, 220, 220));
		txtRespueTemp.setBounds(59, 209, 194, 46);
		panel.add(txtRespueTemp);
		txtRespueTemp.setColumns(10);
	}

}
