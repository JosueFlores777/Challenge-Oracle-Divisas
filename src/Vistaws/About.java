package Vistaws;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class About extends JPanel {

	/**
	 * Create the panel.
	 */
	public About() {
		setBounds(0, 0, 719, 484);
		setBackground(new Color(40, 34, 44));
setLayout(null);
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBackground(new Color(40, 34, 44));
lblNewLabel.setForeground(new Color(40, 34, 44));
lblNewLabel.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\Black Modern Marketing Banner (1).jpg"));
lblNewLabel.setBounds(0, 0, 719, 484);
add(lblNewLabel);
	}

}
