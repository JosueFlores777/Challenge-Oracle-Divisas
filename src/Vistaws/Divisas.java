package Vistaws;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class Divisas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Divisas() {
		setBounds(0, 0,719, 484);
		setBackground(new Color(128, 255, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New ");
		lblNewLabel.setBounds(225, 193, 46, 14);
		add(lblNewLabel);
	}

}
