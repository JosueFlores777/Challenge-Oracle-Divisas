package Vistaws;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class About extends JPanel {

	/**
	 * Create the panel.
	 */
	public About() {
		setBounds(0, 0, 732, 507);
		setBackground(new Color(40, 34, 44));
setLayout(null);
JLabel lblNewLabel_1 = new JLabel("Informacion");
lblNewLabel_1.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\perfil.png"));
lblNewLabel_1.setForeground(Color.WHITE);
lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
lblNewLabel_1.setBounds(508, 11, 351, 55);
add(lblNewLabel_1);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBackground(new Color(40, 34, 44));
lblNewLabel.setForeground(new Color(40, 34, 44));
lblNewLabel.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\Black Modern Marketing Banner (1).jpg"));
lblNewLabel.setBounds(0, 0, 719, 507);
add(lblNewLabel);
	}
}
