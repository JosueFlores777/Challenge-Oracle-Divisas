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
		setBounds(0, 0,711, 508);
		setBackground(new Color(40, 38, 44));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomePn.class.getResource("/Img/alura.jpg")));
		lblNewLabel.setBounds(-64, -13, 834, 537);
		add(lblNewLabel);
	}
}
