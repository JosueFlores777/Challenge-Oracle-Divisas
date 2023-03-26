package Vistaws;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class HomePn extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePn() {
		setBounds(0, 0, 719, 484);
		setBackground(new Color(0, 255, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePn.class.getResource("/Img/alura.jpg")));
		lblNewLabel.setBounds(-61, 0, 811, 484);
		add(lblNewLabel);
	}
}
