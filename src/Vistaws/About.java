package Vistaws;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class About extends JPanel {

	/**
	 * Create the panel.
	 */
	public About() {
		setBounds(0, 0, 719, 484);
		setBackground(new Color(255, 0, 0));
setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(205, 193, 46, 14);
		add(lblNewLabel);
	}

}