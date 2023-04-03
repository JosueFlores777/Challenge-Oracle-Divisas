package Vistaws;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Logic.Temperat;
import Logic.conversor;
import Logic.datos;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


public class Temperatura extends JPanel  implements ItemListener,ActionListener {
	Temperat t = new Temperat();
	private JTextField txtRespueTemp;
	private JButton btnCalcular;
	private JButton BtnClear;
	private JComboBox<String> CmbTempeEle;
	private JComboBox<String> CmbTempConver;
	private JLabel lblrespuesta;

	/**
	 * Create the panel.
	 */
	public Temperatura() {
		datos d = new datos();
		setBounds(0, 0,746, 519);
		setBackground(new Color(40, 32, 40));
		setLayout(null);
		
	
		RoundedPanel panel = new RoundedPanel(130);
	
		panel.setBackground(new Color(40, 32, 40));
		panel.setBounds(22, 58, 688, 424);
		add(panel);
		panel.setLayout(null);
		

		//Button
		btnCalcular = new JButton("Calcular");
		btnCalcular.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\humedad.png"));
		btnCalcular.setBounds(145, 333, 145, 46);
		btnCalcular.addActionListener(this);
		panel.add(btnCalcular);
		
		BtnClear = new JButton("Limpiar");
		BtnClear.setIcon(new ImageIcon("E:\\Descargar\\ProyectoEclipse\\ConversorDivisas\\src\\Img\\basura.png"));
		BtnClear.setBounds(338, 333, 145, 46);
		BtnClear.addActionListener(this);
		panel.add(BtnClear);
		
		//labels
		JLabel lblNewLabel_1 = new JLabel("Temperatura a.");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(33, 44, 240, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Conversor De Temperaturas");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setIcon(new ImageIcon(Temperatura.class.getResource("/Img/temperatura.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(345, 11, 351, 55);
		add(lblNewLabel);
		
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
		
	
		lblrespuesta = new JLabel("");
		lblrespuesta.setFont(new Font("Tahoma Black", Font.BOLD, 16));
		lblrespuesta.setBounds(437, 207, 220, 46);
		panel.add(lblrespuesta);
		
		//Cmb
		CmbTempeEle = new JComboBox<>(d.getOptionsTemp());
		CmbTempeEle.setFont(new Font("Tahoma Black", Font.PLAIN, 13));
		CmbTempeEle.setBounds(59, 89, 194, 46);
		CmbTempeEle.addItemListener(this);
		panel.add(CmbTempeEle);
		
		CmbTempConver = new JComboBox<>(d.getOptionsTemp());
		CmbTempConver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		CmbTempConver.setBounds(426, 89, 200, 46);
		CmbTempConver.addItemListener(this);
		panel.add(CmbTempConver);
		
		
		// text
		txtRespueTemp = new JTextField();
		txtRespueTemp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					
					JOptionPane.showConfirmDialog(getRootPane(), "Ingrese solo datos numeros");
				}
			}
		});
		
		txtRespueTemp = new JTextField();
		txtRespueTemp.setFont(new Font("SansSerif", Font.PLAIN, 25));
		txtRespueTemp.setBackground(new Color(220, 220, 220));
		txtRespueTemp.setBounds(59, 209, 194, 46);
		panel.add(txtRespueTemp);
		txtRespueTemp.setColumns(10);
	
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		if (e.getSource()==CmbTempConver) {
            String seleccionado=(String)CmbTempConver.getSelectedItem();
    
        }
		if (e.getSource()==CmbTempeEle) {
            String seleccionado=(String)CmbTempeEle.getSelectedItem();
    
        }
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==btnCalcular) {
				double number= Double.parseDouble(txtRespueTemp.getText());
				String tempeOringe=(String) CmbTempConver.getSelectedItem();
				String tempeDestuno= (String)  CmbTempeEle.getSelectedItem();
					if(tempeDestuno.equals("Elija opcion" )|| tempeDestuno.equals("Elija opcion")) {
						
						JOptionPane.showConfirmDialog(this, "No puedes mandar datos vacios, elija una option de conversion", "Lo siento!!!", JOptionPane.WARNING_MESSAGE);
						 
					}else {
							 String respuesta=""+Temperat.ConverTempe(number, "Celsius", "Fahrenheit");
						     lblrespuesta.setText(respuesta+" "+tempeOringe);
						
					}
					
			}
			if(e.getSource()==BtnClear) {
				txtRespueTemp.setText("");
				lblrespuesta.setText("");
				CmbTempConver.setSelectedIndex(0);
				CmbTempeEle.setSelectedIndex(0);
			}
			
		}catch (Exception ex) {
			JOptionPane.showConfirmDialog(this, "No puedes mandar datos vacios", "Lo siento!!!", JOptionPane.WARNING_MESSAGE);
			
		}
	}	
	
}
